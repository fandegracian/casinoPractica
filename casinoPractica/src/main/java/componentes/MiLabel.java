package componentes;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class MiLabel extends JLabel{

	public MiLabel(String txt) {
		super(txt);
		this.setHorizontalAlignment(SwingConstants.CENTER);
		this.setForeground(new Color(128, 0, 128));
		this.setFont(new Font("Algerian", Font.PLAIN, 23));
	}

}
