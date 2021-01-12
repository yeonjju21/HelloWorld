package org.yjj.chapter.s101;

import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.security.auth.callback.Callback;
import javax.swing.table.TableColumn;
import javax.swing.text.TableView;
import javax.swing.text.TableView.TableCell;
import javax.swing.text.html.ImageView;

public class BillboardfxController {

	@FXML
	 private TableView<BillbaordProperty> billobardTable;
	 @FXML
	 private TableColumn<BillbaordProperty, String> song;
	 @FXML
	 private TableColumn<BillbaordProperty, String> artist;
	 @FXML
	 private TableColumn<BillbaordProperty, Integer> lastweek;
	 @FXML
	 private TableColumn<BillbaordProperty, Integer> rank;
	 @FXML
	 private TableColumn<BillbaordProperty, String> imagesrc;
	 @FXML
	 private WebView billwebview;
	 @FXML
	 private Button btnAf;
	 @FXML
	 private Button btnBf;
	 @FXML
	 private Label lbbill;
	 ImageFXListRequest  request=new ImageFXListRequest();
	 int count=0;
	 @FXML
	 void onClickBtnBf(ActionEvent event) {
		count++;
		getAllBillboard();
	 }
	 @FXML
	 void onClickBtnAf(ActionEvent event) {
		count=0;
		getAllBillboard();
	 }
	 @FXML
	 void initialize() {
	  rank.setCellValueFactory(cellData -> cellData.getValue().rankProperty().asObject());
	  artist.setCellValueFactory(cellData -> cellData.getValue().artistProperty());
	  song.setCellValueFactory(cellData -> cellData.getValue().songProperty());
	  imagesrc.setCellValueFactory(cellData -> cellData.getValue().imagesrcProperty());
	  lastweek.setCellValueFactory(cellData -> cellData.getValue().lastweekProperty().asObject());
		rank.setStyle("-fx-alignment: CENTER");     
		lastweek.setStyle("-fx-alignment: CENTER");  
		imagesrc.setCellFactory(new Callback<TableColumn<
		                 BillbaordProperty, String>,TableCell<BillbaordProperty, String>>(){        
			@Override
			public TableCell<BillbaordProperty, String> 
			                            call(TableColumn<BillbaordProperty, String> param) {                
				TableCell<BillbaordProperty, String> cell =
						new TableCell<BillbaordProperty, String>(){
					final ImageView imageview = new ImageView();
					@Override
					public void updateItem(String item, boolean empty) {                        
						if(item!=null){                            
							imageview.setFitHeight(100);
							imageview.setImage(request.loadImage(item));
							setGraphic(imageview);
						}
					}
				};            
				return cell;
			}
		});
		final WebEngine webEngine = billwebview.getEngine();
		billobardTable.setOnMouseClicked(e ->{
	    	if(billobardTable.getSelectionModel().getSelectedItem()!=null ){
	    		BillbaordProperty billboard = 
	    		   (BillbaordProperty)billobardTable.getSelectionModel().getSelectedItem();
	    		webEngine.load(
	    		   "https://www.youtube.com/results?search_query="+toP(billboard.getSong()));
	    	}
	      }
	    );
		getAllBillboard();
	 }
	 public String toP(String msg){
	    String ss=msg;
	    ss=ss.replaceAll(" ", "+");
	    return ss.trim();
	 }
	 public void getAllBillboard(){
		RequestFromBillboardHot rfw=new RequestFromBillboardHot();
		String a="https://www.billboard.com/charts/hot-100/";
		String rs=rfw.getTimeDate(a);
		rs=RestDay.toWantedDay(rs, count); 
		rfw.getBillboardData(a+rs);
		
		ArrayList<Billbaord> bills=rfw.getBillboards();
		
		request.getAllImages(bills); 
		ObservableList<BillbaordProperty> obsbills=
				                     BillboardConvert.toObservBill(bills);
		populateEmployees(obsbills);
		lbbill.setText("Billboard Chat HOT 100 "+rs);
	 }
	 public void populateEmployees (ObservableList<BillbaordProperty> bills)  {
		billobardTable.setItems(bills);
	 }
}
