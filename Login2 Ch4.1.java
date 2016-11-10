
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javax.swing.JOptionPane;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Login extends Application {
	
	private int attempt = 0;
	public enum AccountType {Administrator, Faculty, Staff, Student, Guest};
	
	public void start(Stage primaryStage) {
	Alert alert = new Alert(AlertType.INFORMATION);
	final int limit = 3;
	primaryStage.setTitle("Authentication");
	GridPane grid = new GridPane();
	Scene scene = new Scene(grid, 200 , 200);
	primaryStage.setScene(scene);
	primaryStage.show();
	primaryStage.setWidth(375);
	primaryStage.setHeight(375);
	primaryStage.centerOnScreen();
	grid.setAlignment(Pos.CENTER);
	grid.setHgap(10);
	grid.setVgap(10);
	grid.setPadding(new Insets(25, 25, 25, 25));

	//Text scenetitle = new Text("Welcome");
	//grid.add(scenetitle, 0, 0, 2, 1);

	Label userName = new Label("User Name:");
	grid.add(userName, 0, 1);

	TextField userTextField = new TextField();
	grid.add(userTextField, 1, 1);

	Label pw = new Label("Password:");
	grid.add(pw, 0, 2);

	PasswordField pwBox = new PasswordField();
	grid.add(pwBox, 1, 2);

	Button button = new Button("Log in");
	grid.add(button, 0, 3);
	button.setOnAction(new EventHandler<ActionEvent>() {

	@Override
	public void handle(ActionEvent event) {
		
	if(userTextField.getText().equals("Robert") & pwBox.getText().equals("xxx") & attempt<=limit) {
		
	ComboBox <AccountType>comboBox = new ComboBox<>();
	comboBox.getItems().addAll(AccountType.Administrator, AccountType.Faculty, AccountType.Staff, AccountType.Student, AccountType.Guest);
	comboBox.setValue(AccountType.Student);
	comboBox.setVisible(true);
	Button submitBtn = new Button("Submit");
	
	submitBtn.setOnAction(e->{
	AccountType correctAcType = AccountType.Student;
	if(comboBox.getValue().equals(correctAcType)) {	
	String correctUName = "Robert";
	alert.setContentText("Welcome " + correctUName + ".");
	alert.showAndWait();
	} else if(!comboBox.getValue().equals(AccountType.Student)) {
	alert.setContentText("Wrong account type, please select the account type again.");
	alert.showAndWait();
	}
	});

	Text scenetitle2 = new Text("Select account type");
	Text Dialog = new Text("");
	Text Dialog2 = new Text("");
	VBox pane = new VBox();
	pane.getChildren().addAll(scenetitle2, Dialog, comboBox, Dialog2, submitBtn);
	Scene scene = new Scene(pane);
	pane.setAlignment(Pos.CENTER);
	primaryStage.setScene(scene);
	
	} else if(attempt<limit) {
	JOptionPane.showMessageDialog(null, "Username or password is incorrect.");
	attempt++;
	} else if(attempt>=limit) {
	JOptionPane.showMessageDialog(null, "Please contact your adminstrator to unlock your account");
	
	}}});}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
