/**
 * Java Programming with Professor Chen
 * Student: Cesar Omar Sanchez
 * ID: 0307118
 * 
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

 * 
 * **/
public class ChatRoom {
	static Window_1 win1;
	static Window_2 win2;
	static Server server;
	
	public ChatRoom () {
		server = new Server();
		server.setLocationRelativeTo(null);
		server.setVisible(true);
	}
	
	public static void createRoom() {
		win1 = new Window_1();
		win2 = new Window_2();
		win1.setLocation(500, 200);
		win2.setLocation(900, 200);
		win1.setVisible(true);
		win2.setVisible(true);
		server.setVisible(false);
	}
	
	public static void main(String[] args) {
		ChatRoom chatRoom = new ChatRoom();
	}
}
