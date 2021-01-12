package org.yjj.chapter.s097;

public class BillboardfxController {

	@FXML
	private TableView<Billbaord> billobardTable;
    @FXML
    private TableColumn<Billbaord, String> song;
    @FXML
    private TableColumn<Billbaord, String> artist;
    @FXML
    private TableColumn<Billbaord, Integer> lastweek;
    @FXML
    private TableColumn<Billbaord, Integer> rank;
    @FXML
    private TableColumn<Billbaord, String> imagesrc;
    @FXML
    private WebView billwebview;
    @FXML
    private Button btnAf;
    @FXML
    private Button btnBf;
    @FXML
    private Label lbbill;

    @FXML
    void onClickBtnBf(ActionEvent event) {}
    @FXML
    void onClickBtnAf(ActionEvent event) {}
    @FXML
    void initialize() {}
}
