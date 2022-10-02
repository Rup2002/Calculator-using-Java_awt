package awt1;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator extends Frame implements ActionListener {
	
	TextField tf1,tf2,tf3;
	Button b1,b2,b3;
	
	Frame f1=new Frame();
	Frame f2=new Frame();
	
	calculator(){
		
		f1.setTitle("Calculator");
		f1.setBackground(Color.CYAN);
		
		
		tf1=new TextField();
		tf1.setBounds(50, 50, 150, 20);
		tf1.setBackground(Color.WHITE);
		
		tf2=new TextField();
		tf2.setBounds(50, 100, 150, 20);
		tf2.setBackground(Color.WHITE);
		
		tf3=new TextField();
		tf3.setBounds(50, 150, 150, 20);
		tf3.setBackground(Color.WHITE);
		
		
		b1=new Button("-");
		b1.setBounds(50, 200, 50, 50);
		
		b2=new Button("+");
		b2.setBounds(120, 200, 50, 50);
		
		b3=new Button("Submit");
		b3.setBounds(200, 200, 50, 50);
		
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		
		b1.setBackground(Color.white);
		b2.setBackground(Color.white);
		b3.setBackground(Color.blue);
		
		f1.add(tf1);
		f1.add(tf2);
		f1.add(tf3);
		f1.add(b1);
		f1.add(b2);
		f1.add(b3);
		f1.setSize(600,600);
		f1.setLayout(null);
		f1.setVisible(true);
		f1.setLocationRelativeTo(null);
	}
	
	public void actionPerformed(ActionEvent e) {
		String s1=tf1.getText();
		String s2=tf2.getText();
		int a=Integer.parseInt(s1);
		int b=Integer.parseInt(s2);
		int c=0;
		
		if(e.getSource()==b1) {
			c=a-b;
		}
		else if(e.getSource()==b2) {
			c=a+b;
		}
		else if(e.getSource()==b3) {
			f1.setVisible(false);
			f2.setVisible(true);
			f2.setTitle("New Page");
			Label l1=new Label("Thank You");
			l1.setBounds(20, 50, 100, 20);
			f2.add(l1);
			f2.setSize(300, 300);
			f2.setLayout(null);
			f2.setLocationRelativeTo(null);
		}
		
		String result=String.valueOf(c);
		tf3.setText(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new calculator();

	}

}
