
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.io.File;
import java.lang.Runtime;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class PasswordGUI extends Main implements ActionListener {
	
	public static JLabel userLabel;
	public static JTextField userText;
	public static JLabel passwordLabel;
	public static JPasswordField passwordText;
	public static JButton button;
	public static JLabel success;

	public static void PGUI() {
		
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setSize(350, 200);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.add(panel);
		
		panel.setLayout(null);
		
		userLabel = new JLabel("User");
		userLabel.setBounds(10, 20, 80, 25);
		panel.add(userLabel);
		
		userText = new JTextField(20);
		userText.setBounds(100, 20, 165, 25);
		panel.add(userText);
		
		passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10, 50, 80, 25);
		panel.add(passwordLabel);
		
		passwordText = new JPasswordField();
		passwordText.setBounds(100, 50, 165, 25);
		panel.add(passwordText);
		
		button = new JButton("Login");
		button.setBounds(100, 85, 65, 25);
		button.addActionListener(new PasswordGUI());
		panel.add(button);
		
		success = new JLabel("");
		success.setBounds(10, 110, 300, 25);
		panel.add(success);
		
		frame.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		String user = userText.getText();
		String password = passwordText.getText();
		try {
			if(user.equals("asdf") && password.equals("asdf")) {
				success.setText("Login Successful!");
				Runtime.getRuntime().exec("taskmgr.exe");
			}
			else {
				success.setText("Login Failed...");
			}
		}
		catch (IOException e1) {
			System.out.println(e1);
		}

		
	}

}
