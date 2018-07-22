
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Project extends JFrame {
	JLabel pic;
	Timer tm;
	int x = 0;

	// Images Path In Array
	String[] list = { "E:/IMAGE/jv1.png", // 0
			"E:/IMAGE/jv2.png", // 1
			"E:/IMAGE/jv3.png", // 2
			"E:/IMAGE/jv4.png", // 3
			"E:/IMAGE/jv5.png", // 4
			"E:/IMAGE/jv6.png", // 5
			"E:/IMAGE/jv7.png", // 6
			"E:/IMAGE/jv8.png", // 7
			"E:/IMAGE/jv9.png", // 8
			
	};

	public Project() {
		super("Java SlideShow");
		pic = new JLabel();
		pic.setBounds(40, 30, 700, 300);

		// Call The Function SetImageSize
		SetImageSize(8);

		// set a timer
		tm = new Timer(900, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				SetImageSize(x);
				x += 1;
				if (x >= list.length)
					x = 0;
			}
		});
		add(pic);
		
		tm.start();
		setLayout(null);
		setSize(800, 400);
		getContentPane().setBackground(Color.decode("#bfc596"));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	// create a function to resize the image
	public void SetImageSize(int i) {
		ImageIcon icon = new ImageIcon(list[i]);
		Image img = icon.getImage();
		Image newImg = img.getScaledInstance(pic.getWidth(), pic.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon newImc = new ImageIcon(newImg);
		pic.setIcon(newImc);
		int i1=i;
		System.out.println(i1+":Slide is Playing");
		
	}

	public static void main(String[] args) {

		new Project();
	}
}