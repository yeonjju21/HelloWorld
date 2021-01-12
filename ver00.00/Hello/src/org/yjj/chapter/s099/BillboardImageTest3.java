package org.yjj.chapter.s099;

import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.text.html.ImageView;

import org.graalvm.compiler.phases.common.NodeCounterPhase.Stage;
import org.yjj.chapter.s098.ImageFXListRequest;
import org.yjj.chapter.s098.RequestFromWikipedai;
import org.yjj.chapter.s098.SovereignFlag;

public class BillboardImageTest3 extends Application {


    public static void main(String[] args) {
        launch(args);
    }
    ImageFXListRequest  request=new ImageFXListRequest();
    RequestFromWikipedai rfw=new RequestFromWikipedai();
    
    @Override
    public void start(Stage primaryStage) {
    	String a="https://ko.wikipedia.org/wiki/ISO_3166-1";
    	String msg="srcset=\"//upload.wikimedia.org/wikipedia";
    	rfw.getAllHtml(a);   
    	
    	rfw.getSevereign(msg);
    
    	ArrayList<SovereignFlag> flags=rfw.getFlags();
    	request.getAllImages(flags);  
    	int col=25; 

		request.getAllImages(flags); 
		ImageView nimageView = new ImageView();
		nimageView.setFitWidth(250);
		nimageView.setFitHeight(250);
		VBox root = new VBox(25);
 
        int row=flags.size()/col;
        for(int i=0; i<row; i++){
        	HBox hbox = new HBox(10);       
            hbox.setPadding(new Insets(5));
            hbox.setAlignment(Pos.CENTER);
        	for (int j = 0; j < col; j++) {      
        		SovereignFlag b=flags.get(i*col+j);  
            	ImageView imageView = new ImageView(request.loadImage(b.getFlag()));
            	imageView.setFitWidth(50);
            	imageView.setFitHeight(50);
            	imageView.setOnMouseClicked(ee->{
            		nimageView.setImage(request.loadImage(b.getFlag()));
            	});
            	hbox.getChildren().add(imageView);
			}
        	root.getChildren().add(hbox);       
        }
        
        HBox hbox2 = new HBox(10);        
        hbox2.setPadding(new Insets(5));
        hbox2.setAlignment(Pos.CENTER);
        hbox2.getChildren().add(nimageView);
        root.getChildren().add(hbox2);
        
        primaryStage.setScene(new Scene(root, 55*col, 65*col+260));
        primaryStage.setTitle("Billboard Image");
        primaryStage.show();
    }
    
}
