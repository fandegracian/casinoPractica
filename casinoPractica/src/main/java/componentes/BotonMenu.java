package componentes;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

public class BotonMenu extends JButton{

	public BotonMenu(String txt) {
		super(txt);
		this.setForeground(Color.BLACK);
		this.setFont(new Font("Script MT Bold", Font.PLAIN, 20));
		this.setBackground(Color.magenta);
		this.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseEntered(MouseEvent arg0) {
			setBackground(Color.magenta);				
		}
		@Override
		public void mouseExited(MouseEvent e) {
			setBackground(Color.magenta);	
		}
	});
	}

}
