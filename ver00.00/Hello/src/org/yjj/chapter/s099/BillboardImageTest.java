package org.yjj.chapter.s099;

public class BillboardImageTest extends Application{

	public static void main(String[] args) {
        launch(args);
    }
     
    @Override
    public void start(Stage primaryStage) {

        Group root = new Group();
        String imageSource=  "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c3/Flag_of_France.svg/99px-Flag_of_France.svg.png";       
       
        ImageView imageView = new ImageView(new Image(imageSource));
       
        Group myGroup = new Group();
        myGroup.getChildren().add(imageView);
        root.getChildren().add(myGroup);
   
        primaryStage.setScene(new Scene(root, 150, 150));
        primaryStage.setTitle("Billboard Image");
        primaryStage.show();
    }
}
