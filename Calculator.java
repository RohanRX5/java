import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends Applet implements ActionListener{

	Label l1,l2;

	TextField t1,t2,t3;

	Button b1;

	public void init(){

		l1= new Label("First no");

		add(l1);


		t1= new TextField(10);

		add(t2);

		l2= new Label("Second no");

		add(l2);

		t2= new TextField(10);

		add(t2);


		b1= new Button("+");

		add(b1);

		b1.addActionListener(this);

		t3= new TextField(10);

		add(t3);
	}


	public void actionPerformed(ActionEvent e){

		if(e.getSource()==b1){

			int sum =Integer.parseInt(t1.getText())+Integer.parseInt(t2.getText());

			t3.setText(String.valueOf(sum));
		}
	}
}