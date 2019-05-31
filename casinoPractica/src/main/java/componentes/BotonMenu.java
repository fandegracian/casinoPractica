package componentes;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

public class BotonMenu extends JButton{

	public BotonMenu(String txt) {
		super(txt);
		this.setForeground(Color.RED);
		this.setFont(new Font("Script MT Bold", Font.PLAIN, 20));
		this.setBackground(new Color(30, 144, 255));
		this.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseEntered(MouseEvent arg0) {
			setBackground(new Color(90, 204, 255));				
		}
		@Override
		public void mouseExited(MouseEvent e) {
			setBackground(new Color(30, 144, 255));	
		}
	});
	}

}
