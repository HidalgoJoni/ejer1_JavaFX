module ejer1_JavaFX {
	requires javafx.controls;
	
	opens application to javafx.graphics, javafx.fxml;
}
