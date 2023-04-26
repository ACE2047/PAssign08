
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
		this.getChildren().clear();
		int counter = 0;
		super.copyListButtons = (ArrayList<Button>)listButtons.clone();
		super.copyListButtons.set(copyListButtons.size() - 3, btnAsterisk);
		super.copyListButtons.set(copyListButtons.size() - 1, btnPound);
		for (int i = 0; i < copyListButtons.size() / 3; i++) {
			for (int j = 0; j < 3; j++) {
				this.add(copyListButtons.get(counter++), j, i);
			}
		}

		this.add(btnCall, 3, 0);
		this.add(btnHangUp, 3, 1);
		
		super.copyListButtons.get(copyListButtons.size() - 3).setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Button was clicked: " + ((Button)event.getSource()).getText());
            }
        });
		super.copyListButtons.get(copyListButtons.size() - 1).setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Button was clicked: " + ((Button)event.getSource()).getText());
            }
        });
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

	
	}
