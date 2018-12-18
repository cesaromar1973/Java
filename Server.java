import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Server extends JFrame {

	private JPanel contentPane;
	private JTextField name1;
	private JTextField name2;

	/**
	 * Student - Cesar Omar Sanchez
	 * == Shared drawing ==
Implement and use multiple classes (5%)
    Java file:             Lines: 
Design GUI interfaces (5%)
    Java file:             Lines: 
Load & show images from file/socket (5%)
    Java file:             Lines: 
Use mouse to draw images on panels (5%)
    Java file:             Lines: 
Use multithread (5%)
    Java file:             Lines: 
Use synchronized objects (5%)
    Java file:             Lines: 
Show animated images (continuously redraw images) (5%)
    Java file:             Lines: 
Send and receive text from peer (5%)
    Java file:             Lines: 
Send and receive images from peer(5%)
    Java file:             Lines: 
Show continuously drawn images from peer (5%)
    Java file:             Lines: 
Use exception handling (5%)
    Java file:             Lines: 
Code quality  & project presentation (5%)

	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Server frame = new Server();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Server() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 385);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblstUsername = new JLabel("1st username");
		lblstUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblstUsername.setBounds(10, 11, 410, 23);
		contentPane.add(lblstUsername);
		
		name1 = new JTextField();
		name1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createRoom();
				
			}
		});
		name1.setBounds(10, 41, 410, 67);
		contentPane.add(name1);
		name1.setColumns(10);
		
		JLabel lblndUsername = new JLabel("2nd username");
		lblndUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblndUsername.setBounds(10, 142, 410, 14);
		contentPane.add(lblndUsername);
		
		name2 = new JTextField();
		name2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createRoom();
			}
		});
		name2.setBounds(10, 166, 410, 67);
		contentPane.add(name2);
		name2.setColumns(10);
		
		JButton btnNewButton = new JButton("JOIN CHAT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createRoom();
			}
		});
		btnNewButton.setBounds(126, 281, 177, 54);
		contentPane.add(btnNewButton);
	}
	
	private void createRoom() {
		String p1, p2; //this will act as the usernames
		
		p1 = name1.getText();
		p2 = name2.getText();
		//lines below will tell the server the names of the users. Musti fill out the text field otherwise an error will prompt user to enter name
		if(p1.equals("") || p2.equals("")) { 
			JOptionPane.showMessageDialog(null, "Please enter a valid username!");
			return;
		}
		
		Window_1.username1 = name1.getText();
		Window_2.username2 = name2.getText();
		ChatRoom.createRoom();
		
	}
}
