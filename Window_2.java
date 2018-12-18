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

public class Window_2 extends JFrame {

	static String username2;
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
					Window_2 frame = new Window_2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Window_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 487, 490);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		display2 = new JTextArea();
		display2.setBackground(Color.CYAN);
		display2.setBounds(24, 72, 413, 247);
		contentPane.add(display2);
		
		text2 = new JTextArea();
		text2.setBounds(24, 330, 255, 64);
		contentPane.add(text2);
		
		send2 = new JButton("SEND");
		send2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = text2.getText();
				if(s.equals("")){
					return;
				}
				display2.append(username2 + ":" + s + "\n");
				Window_1.sendText();
				text2.setText("");
			}
		});
		send2.setBounds(328, 330, 109, 64);
		contentPane.add(send2);
		
		label2 = new JLabel("Chat window for:" + username2);
		label2.setBounds(24, 39, 304, 22);
		contentPane.add(label2);
		
		JButton clear = new JButton("CLEAR");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display2.setText("");
			}
		});
		clear.setBounds(359, 38, 89, 23);
		contentPane.add(clear);
	}

	public static void sendText() {
		String s = Window_1.text1.getText(); //This line gets the message from the type section from the window 2 and displays it here
		if(s.equals("")) {
			return;
		}
		display2.append(Window_1.username1 + ":" + s + "\n");
	}
	
	
	private javax.swing.JLabel label2;
	private static javax.swing.JTextArea display2;
	private javax.swing.JButton send2;
	public static javax.swing.JTextArea text2;

}
