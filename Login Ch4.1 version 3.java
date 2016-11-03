
import javax.swing.JOptionPane;
import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class Loginx extends Application {
	
public enum AccountType {Administrator, Faculty, Staff, Student, Guest}
	
	@Override
	public void start(Stage primaryStage) {
		String username = "Robert";
		String password = "xxx";
		String login = JOptionPane.showInputDialog("Enter username");
		if(username.equals(login)) {
		String input = JOptionPane.showInputDialog("Enter password");
		if(input.equals(password)) {
		
		AccountType[] choices = { AccountType.Administrator, AccountType.Faculty, AccountType.Staff, AccountType.Student, AccountType.Guest };
		AccountType select = (AccountType) JOptionPane.showInputDialog(null,"Select account type.", "List of accounts", JOptionPane.INFORMATION_MESSAGE, null, choices, choices[3]);
		
		while (select!=null) {
			switch (select) {
			case Administrator:
				JOptionPane.showMessageDialog(null, "Select correct account type.");
				break;
			case Faculty:
				JOptionPane.showMessageDialog(null, "Select correct account type.");
				break;
			case Staff:
				JOptionPane.showMessageDialog(null, "Select correct account type.");
				break;
			case Student:
				JOptionPane.showMessageDialog(null, "Welcome " + username + ".");
				break;
			case Guest:
				JOptionPane.showMessageDialog(null, "Select correct account type.");
				break;
			}
			select = (AccountType) JOptionPane.showInputDialog(null,"Select account type.", "List of accounts", JOptionPane.INFORMATION_MESSAGE, null, choices, choices[3]);
			}
			
		} else {
			String login2 = JOptionPane.showInputDialog("Enter username");
			if(username.equals(login2)) {
			String input2 = JOptionPane.showInputDialog("Enter password");
			if(input2.equals(password)) {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setContentText("Welcome Robert");
			alert.showAndWait();
				
		} else {
			String login3 = JOptionPane.showInputDialog("Enter username");
			if(username.equals(login3)) {
			String input3 = JOptionPane.showInputDialog("Enter password");
			if(input3.equals(password)) {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setContentText("Welcome Robert");
			alert.showAndWait();
			
		} else {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setContentText("Please contact your administrator to unlock your account");
			alert.showAndWait();
						
			}
			
		}}}}} else {
			String input4 = JOptionPane.showInputDialog("Enter password");
			if(input4.equals(password)) {
			String login4 = JOptionPane.showInputDialog("Enter username");
			if(username.equals(login4)) {
			String input5 = JOptionPane.showInputDialog("Enter password");
			if(input5.equals(password)) {
			Alert alert3 = new Alert(AlertType.INFORMATION);
			alert3.setContentText("Welcome Robert");
			alert3.showAndWait();
			
		} else {
			String login6 = JOptionPane.showInputDialog("Enter username");
			if(username.equals(login6)) {
			String input9 = JOptionPane.showInputDialog("Enter password");
			if(input9.equals(password)) {
			Alert alert3 = new Alert(AlertType.INFORMATION);
			alert3.setContentText("Welcome Robert");
			alert3.showAndWait();
				
			}
				
		} else {
			String input6 = JOptionPane.showInputDialog("Enter password");
			if(input6.equals(password)) {
			
			String login5 = JOptionPane.showInputDialog("Enter username");
			if(username.equals(login5)) {
			String input7 = JOptionPane.showInputDialog("Enter password");
			if(input7.equals(password)) {
			Alert alert5 = new Alert(AlertType.INFORMATION);
			alert5.setContentText("Welcome Robert");
			alert5.showAndWait();
				
			}
				
		} else {
			String input8 = JOptionPane.showInputDialog("Enter password");
			if(input8.equals(password)) {
			Alert alert7 = new Alert(AlertType.INFORMATION);
			alert7.setContentText("Please contact your administrator to unlock your account");
			alert7.showAndWait();
			
			}}}}}
				
		} else {
			String input5 = JOptionPane.showInputDialog("Enter password");
			if(input5.equals(password)) {
					
			String login5 = JOptionPane.showInputDialog("Enter username");
			if(username.equals(login5)) {
			String input7 = JOptionPane.showInputDialog("Enter password");
			if(input7.equals(password)) {
			Alert alert5 = new Alert(AlertType.INFORMATION);
			alert5.setContentText("Welcome Robert");
			alert5.showAndWait();
				
			}
					
		} else {
			String input10 = JOptionPane.showInputDialog("Enter password");
			if(input10.equals(password)) {
			Alert alert7 = new Alert(AlertType.INFORMATION);				
			alert7.setContentText("Please contact your administrator to unlock your account");
			alert7.showAndWait();
					
			}}}}
			
		} else {
			String login4 = JOptionPane.showInputDialog("Enter username");
			if(username.equals(login4)) {
			String input5 = JOptionPane.showInputDialog("Enter password");
			if(input5.equals(password)) {
			Alert alert3 = new Alert(AlertType.INFORMATION);
			alert3.setContentText("Welcome Robert");
			alert3.showAndWait();
				
			}
				
		} else {
			String input11 = JOptionPane.showInputDialog("Enter password");
			if(input11.equals(password)) {
					
		} else {
			String login7 = JOptionPane.showInputDialog("Enter username");
			if(username.equals(login7)) {
			String input5 = JOptionPane.showInputDialog("Enter password");
			if(input5.equals(password)) {				
			Alert alert3 = new Alert(AlertType.INFORMATION);
			alert3.setContentText("Welcome Robert");
			alert3.showAndWait();
				
			}
					
		} else {
			String input12 = JOptionPane.showInputDialog("Enter password");
			if(input12.equals(password)) {
						
		} else {
			Alert alert7 = new Alert(AlertType.INFORMATION);
			alert7.setContentText("Please contact your administrator to unlock your account");
			alert7.showAndWait();
					
		}}}}}}}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
