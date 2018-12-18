import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Window_1 extends JFrame {

	static String username1; 
	private JPanel contentPane;

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
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				try {
					Window_1 frame = new Window_1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Window_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 460, 416);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		display1 = new JTextArea();
		display1.setBackground(Color.CYAN);
		display1.setBounds(10, 44, 413, 247);
		contentPane.add(display1);
		
		text1 = new JTextArea();
		text1.setBounds(10, 302, 255, 64);
		contentPane.add(text1);
		
		send1 = new JButton("SEND");
		send1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s = text1.getText();
				if(s.equals("")){
					return;
				}
				display1.append(username1 + ":" + s + "\n");
				Window_2.sendText();
				text1.setText("");
				
			}
		});
		send1.setBounds(314, 302, 109, 64);
		contentPane.add(send1);
		
		label1 = new JLabel("Chat window for:" + username1);
		label1.setBounds(10, 11, 304, 22);
		contentPane.add(label1);
		
		JButton clear = new JButton("CLEAR");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display1.setText("");
			}
		});
		clear.setBounds(345, 10, 89, 23);
		contentPane.add(clear);
	}

	public static void sendText() {
		String s = Window_2.text2.getText(); //This line gets the message from the type section from the window 2 and displays it here
		if(s.equals("")) {
			return;
		}
		display1.append(Window_2.username2 + ":" + s + "\n");
	}
	
	
	private javax.swing.JLabel label1;
	private static javax.swing.JTextArea display1;
	private javax.swing.JButton send1;
	public static javax.swing.JTextArea text1;
	
}
