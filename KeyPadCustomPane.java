package ch14;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import java.util.ArrayList;
import java.util.Arrays;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class KeyPadCustomPane extends KeyPadPane {

	// private Buttons
	private Button btnCall = new Button("Call");
	private Button btnHangUp = new Button("Hang Up");

	/**
	 * Create a default KeyPadCustomPane with numbers in order, includes 2 blanks around 0
	 */
	public KeyPadCustomPane() {
		super();
		this.add(btnCall, 3, 0);
		this.add(btnHangUp, 3, 1);
	}

	/**
	 * Create a KeyPadCustomPane with phone order buttons
	 * 
	 * @param phoneOrder specify that the user wants phone keypad layout of buttons, 
	 * 			if they use true here, use default layout
	 */
	public KeyPadCustomPane(boolean phoneOrder) {
		super(phoneOrder);
		this.add(btnCall, 3, 0);
		this.add(btnHangUp, 3, 1);
	}

	/**
	 * Register a custom action for all Buttons
	 */
	@Override
	protected void registerEventHandlers() {
		super.registerEventHandlers();
		
		btnCall.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				btnCall.setStyle("-fx-background-color: white;");
			}
		});

		btnHangUp.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				btnHangUp.setStyle("-fx-background-color: white;");
			}
		});
	}
}
