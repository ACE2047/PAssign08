package ch14;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class KeyPadCustomPane extends KeyPadPane {
	private final Button callButton;
	private final Button hangUpButton;
	private final Button[] buttonsList;

	public KeyPadCustomPane() {
		super();
		buttonsList = new Button[10];
		for (int i = 0; i < 10; i++) {
			Button button = new Button(String.valueOf(i));
			button.setPrefSize(80, 50);
			button.setOnMouseClicked(new EventHandler<MouseEvent>() {
				@Override
				public void handle(MouseEvent mouseEvent) {
					if (mouseEvent.getButton().equals(MouseButton.PRIMARY)) {
						Button clickedButton = (Button) mouseEvent.getSource();
						switch (clickedButton.getText()) {
						case "0":
							clickedButton.setStyle("-fx-background-color: #FF0000; -fx-text-fill: red;");
							break;
						case "1":
							clickedButton.setStyle("-fx-background-color: #0000FF; -fx-text-fill: blue;");
							break;
						case "2":
							clickedButton.setStyle("-fx-background-color: #7E3424; -fx-text-fill: white;");
							break;
						case "3":
							clickedButton.setStyle("-fx-background-color: #808080; -fx-text-fill: grey;");
							break;
						case "4":
							clickedButton.setStyle("-fx-background-color: #008000; -fx-text-fill: green;");
							break;
						case "5":
							clickedButton.setStyle("-fx-background-color: #800080; -fx-text-fill: purple;");
							break;
						case "6":
							clickedButton.setStyle("-fx-background-color: #FD5719; -fx-text-fill: orange;");
							break;
						case "7":
							clickedButton.setStyle("-fx-background-color: #FFFF00; -fx-text-fill: yellow;");
							break;
						case "8":
							clickedButton.setStyle("-fx-background-color: #00FFFF; -fx-text-fill: cyan;");
							break;
						case "9":
							clickedButton.setStyle("-fx-background-color: #000000; -fx-text-fill: white;");
							break;
						default:
							break;
						}
					}
				}
			});
			buttonsList[i] = button;
		}
		callButton = new Button("Call");
		callButton.setPrefSize(80, 50);
		callButton.setStyle(
				"-fx-border-width:3;-fx-border-color: white;-fx-background-color: green;-fx-text-fill: white ");
		callButton.setAlignment(Pos.CENTER);

		hangUpButton = new Button("Hang up");
		hangUpButton.setStyle("-fx-border-width:3;-fx-border-color: black;-fx-background-color: red; ");
		hangUpButton.setPrefSize(80, 50);
		hangUpButton.setAlignment(Pos.CENTER);

		registerEventHandlers();
	}

	@Override
	protected void registerEventHandlers() {
		super.registerEventHandlers();
		callButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System VariableDeclarators;

			}
		});
	};
}
