package org.yjj.chapter.s097;


public class Main extends Application {

	@Override
	 public void start(Stage primaryStage) {
	  try {
		primaryStage.setTitle("Billboard Chart 2018");
		BorderPane root = (BorderPane)FXMLLoader.load(getClass().
				                       getResource("Billboardfx2.fxml"));
		Scene scene = new Scene(root,1400,800);
		scene.getStylesheets().add(getClass().
				getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.getIcons().add(
				new Image(getClass().getResourceAsStream("logo.png")));
		primaryStage.setResizable(false);
		primaryStage.show();
		
	  } catch(Exception e) {
		e.printStackTrace();
	  }
	 } 
	 public static void main(String[] args) {
		launch(args);
	 }
}
