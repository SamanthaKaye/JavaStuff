import java.applet.*;
import java.awt.*;
import javax.swing.*;
import java.awt.image.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Checkbox;

public class SamanthaSmith extends Applet implements ActionListener{
	Image flag;
	Label colorLabel;
	Button click, click1, click2, click3; 
	Checkbox pink; Checkbox blue; 
	Label result;
	// Display
public void paint(Graphics g) {
super.paint(g);
g.setColor(Color.red); // color text
g.drawImage(flag, 5, 5, this); // image
}
// 
public void init()
{
	// insert inmage
flag  = getImage(getDocumentBase(), "flag.jpg");
//Label to change colors
colorLabel = new Label("Hello, Java Applet!!!  Pick a color!!"); 
click = new Button("Pink");
click1 = new Button("Blue");
click2 = new Button("Green");
click3 = new Button("Red");
Checkbox pink = new Checkbox("Pink");
Checkbox blue = new Checkbox("Blue");
Checkbox green = new Checkbox("Green");
Checkbox red = new Checkbox("Red");

click.addActionListener(this);
click1.addActionListener(this);
click2.addActionListener(this);
click3.addActionListener(this);
add(colorLabel);
add(click); add(click1);
add(click2); add(click3);
add(pink); add(blue); add(green); add(red);
}
@Override
public void actionPerformed(ActionEvent arg0) {
	if(arg0.getSource() == click)colorLabel.setForeground(Color.pink);
	else if(arg0.getSource() == click1)colorLabel.setForeground(Color.blue);
	else if(arg0.getSource() == click2)colorLabel.setForeground(Color.green);
	else if(arg0.getSource() == click3)colorLabel.setForeground(Color.red);
}
}

