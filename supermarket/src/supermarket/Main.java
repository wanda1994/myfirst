package supermarket;

import java.awt.*;

import javax.swing.*;

public class Main {
	boolean packFrame = false;
	public Main() {
		MainFrame frame = new MainFrame();
		if(packFrame) {
			frame.pack();
		}
		else {
			frame.validate();
		}
		Dimension scSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension fSize = frame.getSize();
		if(fSize.height>scSize.height) {
			fSize.height = scSize.height;
		}
		if(fSize.width>scSize.width) {
			fSize.width = scSize.width;
		}
		frame.setLocation((scSize.width-fSize.width)/2, (scSize.height-fSize.height)/2);
		frame.setVisible(false);
		
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());	
				}catch(Exception e) {
					e.printStackTrace();
				}
				new Main();
				sale vendition = new sale();
				vendition.setVisible(true);
				vendition.setTitle(null);
	
				
			}
			
		});
	}
}
