import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class ScientificCalc extends JFrame implements ActionListener
{
	double num1, num2, res;
	int calc;

	JLabel l1;
	JTextField tf1;
	JRadioButton rb1, rb2;
	ButtonGroup grp;
	JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bdot, bequal, badd, bsub, bmul, bdiv,
	bsqrt, blog, bexp, bclr, bsin, bcos, btan, bsinh, bcosh, btanh, bdel, bperc, bx2, bx3, bxy, 	bx, bfact, bopen, bclose, bsign;
	
	ScientificCalc()
	{
		super("Scientific Calculator");

		//Object creation
		l1 = new JLabel("");
		tf1 = new JTextField();
		rb1 = new JRadioButton("ON");
		rb2 = new JRadioButton("OFF");
		grp = new ButtonGroup();
		b0 = new JButton("0");
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		bdot = new JButton(".");
		bequal = new JButton("=");
		badd = new JButton("+");
		bsub = new JButton("-");
		bmul = new JButton("*");
		bdiv = new JButton("/");
		bsqrt = new JButton("sqrt");
		bexp = new JButton("e^x");
		bclr = new JButton("Clr");
		bsin = new JButton("sin");
		bcos = new JButton("cos");
		btan = new JButton("tan");
		bsinh = new JButton("sinh");
		bcosh = new JButton("csh");
		btanh = new JButton("tanh");
		bdel = new JButton("Del");
		bperc = new JButton("%");
		bx = new JButton("1/x");
		bx2 = new JButton("x^2");
		bx3 = new JButton("x^3");
		bxy = new JButton("x^y");
		bfact = new JButton("n!");
		blog = new JButton("log");
		bopen = new JButton("(");
		bclose = new JButton(")");
		bsign = new JButton("+/-");

		//Component addition
		add(tf1);
		add(rb1);
		add(rb2);
		grp.add(rb1);
		grp.add(rb2);
		add(l1);

		add(bsin);
		add(bsqrt);
		add(blog);
		add(bxy);
		add(bx2);
		add(bx3);
		add(bcos);
		add(bfact);
		add(bx);
		add(bperc);
		add(bopen);
		add(bclose);
		add(btan);
		add(b7);
		add(b8);
		add(b9);
		add(bdel);
		add(bclr);
		add(bsinh);
		add(b4);
		add(b5);
		add(b6);
		add(bmul);
		add(bdiv);
		add(bcosh);
		add(b1);
		add(b2);
		add(b3);
		add(badd);
		add(bsub);
		add(btanh);
		add(bsign);
		add(b0);
		add(bdot);
		add(bexp);
		add(bequal);

		//Calc screen arrangement
		setResizable(false);
		setSize(440, 500);
		setLocation(200, 40);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Component arrangement
		setLayout(null);
		tf1.setBounds(40, 40, 340, 40);
		rb1.setBounds(40, 100, 50, 30);
		rb2.setBounds(120, 100, 50, 30);
		l1.setBounds(200, 100, 80, 30);

		bsin.setBounds(20, 140, 60, 40);
		bsqrt.setBounds(85, 140, 60, 40);
		blog.setBounds(150, 140, 60, 40);
		bxy.setBounds(215, 140, 60, 40);
		bx2.setBounds(280, 140, 60, 40);
		bx3.setBounds(345, 140, 60, 40);
	
		bcos.setBounds(20, 185, 60, 40);
		bfact.setBounds(85, 185, 60, 40);
		bx.setBounds(150, 185, 60, 40);	
		bperc.setBounds(215, 185, 60, 40);
		bopen.setBounds(280, 185, 60, 40);
		bclose.setBounds(345, 185, 60, 40);

		btan.setBounds(20, 230, 60, 40);
		b7.setBounds(85, 230, 60, 40);
		b8.setBounds(150, 230, 60, 40);
		b9.setBounds(215, 230, 60, 40);
		bdel.setBounds(280, 230, 60, 40);
		bclr.setBounds(345, 230, 60, 40);

		bsinh.setBounds(20, 275, 60, 40);
		b4.setBounds(85, 275, 60, 40);
		b5.setBounds(150, 275, 60, 40);
		b6.setBounds(215, 275, 60, 40);
		bmul.setBounds(280, 275, 60, 40);
		bdiv.setBounds(345, 275, 60, 40);

		bcosh.setBounds(20, 320, 60, 40);
		b1.setBounds(85, 320, 60, 40);
		b2.setBounds(150, 320, 60, 40);
		b3.setBounds(215, 320, 60, 40);
		badd.setBounds(280, 320, 60, 40);
		bsub.setBounds(345, 320, 60, 40);

		btanh.setBounds(20, 365, 60, 40);
		bsign.setBounds(85, 365, 60, 40);
		b0.setBounds(150, 365, 60, 40);
		bdot.setBounds(215, 365, 60, 40);
		bexp.setBounds(280, 365, 60, 40);
		bequal.setBounds(345, 365, 60, 40);

		//Adding ActionListener
		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		bdot.addActionListener(this);
		bopen.addActionListener(this);
		bclose.addActionListener(this);
		bdel.addActionListener(this);
		bclr.addActionListener(this);
		bsin.addActionListener(this);
		bcos.addActionListener(this);
		btan.addActionListener(this);
		bsinh.addActionListener(this);
		bcosh.addActionListener(this);
		btanh.addActionListener(this);
		bperc.addActionListener(this);
		bsqrt.addActionListener(this);
		blog.addActionListener(this);
		bxy.addActionListener(this);
		bx2.addActionListener(this);
		bx3.addActionListener(this);
		bfact.addActionListener(this);
		bexp.addActionListener(this);
		bx.addActionListener(this);
		bsign.addActionListener(this);
		badd.addActionListener(this);
		bsub.addActionListener(this);
		bmul.addActionListener(this);
		bdiv.addActionListener(this);
		bequal.addActionListener(this);
		rb1.addActionListener(this);
		rb2.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == b0){
			tf1.setText(tf1.getText() + "0");
		}
		else if(e.getSource() == b1){
			tf1.setText(tf1.getText() + "1");
		}
		else if(e.getSource() == b2){
			tf1.setText(tf1.getText() + "2");
		}
		else if(e.getSource() == b3){
			tf1.setText(tf1.getText() + "3");
		}
		else if(e.getSource() == b4){
			tf1.setText(tf1.getText() + "4");
		}
		else if(e.getSource() == b5){
			tf1.setText(tf1.getText() + "5");
		}
		else if(e.getSource() == b6){
			tf1.setText(tf1.getText() + "6");
		}
		else if(e.getSource() == b7){
			tf1.setText(tf1.getText() + "7");
		}
		else if(e.getSource() == b8){
			tf1.setText(tf1.getText() + "8");
		}
		else if(e.getSource() == b9){
			tf1.setText(tf1.getText() + "9");
		}
		else if(e.getSource() == bdot){
			tf1.setText(tf1.getText() + ".");
		}
		else if(e.getSource() == bopen){
			tf1.setText(tf1.getText() + "(");
		}
		else if(e.getSource() == bclose){
			tf1.setText(tf1.getText() + ")");
		}
		else if(e.getSource() == bclr){
			tf1.setText("");
			l1.setText("");
		}
		else if(e.getSource() == badd){
			num1 = Double.parseDouble(tf1.getText());
			calc = 1;
			tf1.setText("");
			l1.setText(num1 + "+");
		}
		else if(e.getSource() == bsub){
			num1 = Double.parseDouble(tf1.getText());
			calc = 2;
			tf1.setText("");
			l1.setText(num1 + "-");
		}
		else if(e.getSource() == bmul){
			num1 = Double.parseDouble(tf1.getText());
			calc = 3;
			tf1.setText("");
			l1.setText(num1 + "*");
		}
		else if(e.getSource() == bdiv){
			num1 = Double.parseDouble(tf1.getText());
			calc = 4;
			tf1.setText("");
			l1.setText(num1 + "/");
		}
		else if(e.getSource() == bequal){
			Calculations();
		}
		else if(e.getSource() == bsqrt){
			num1 = Double.parseDouble(tf1.getText());
			res = Math.sqrt(num1);
			tf1.setText(Double.toString(res));
		}
		else if(e.getSource() == bsin){
			num1 = Double.parseDouble(tf1.getText());
			res = Math.sin(num1);
			tf1.setText(Double.toString(res));
		}
		else if(e.getSource() == bsinh){
			num1 = Double.parseDouble(tf1.getText());
			res = Math.sinh(num1);
			tf1.setText(Double.toString(res));
		}
		else if(e.getSource() == bcos){
			num1 = Double.parseDouble(tf1.getText());
			res = Math.cos(num1);
			tf1.setText(Double.toString(res));
		}
		else if(e.getSource() == bcosh){
			num1 = Double.parseDouble(tf1.getText());
			res = Math.cosh(num1);
			tf1.setText(Double.toString(res));
		}
		else if(e.getSource() == btan){
			num1 = Double.parseDouble(tf1.getText());
			res = Math.tan(num1);
			tf1.setText(Double.toString(res));
		}
		else if(e.getSource() == btanh){
			num1 = Double.parseDouble(tf1.getText());
			res = Math.tanh(num1);
			tf1.setText(Double.toString(res));
		}
		else if(e.getSource() == blog){
			num1 = Double.parseDouble(tf1.getText());
			res = Math.log(num1);
			tf1.setText(Double.toString(res));
		}
		else if(e.getSource() == bfact){
			num1 = Double.parseDouble(tf1.getText());
			res = 1;
			for(int i = 2 ; i <= num1 ; i++)
				res = res * i;
 			tf1.setText(Double.toString(res));
		}
		else if(e.getSource() == bx){
			num1 = Double.parseDouble(tf1.getText());
			res = (1 / num1);
			tf1.setText(Double.toString(res));
		}
		else if(e.getSource() == bxy){
			num1 = Double.parseDouble(tf1.getText());
			calc = 5;
			tf1.setText("");
			l1.setText(num1 + "^");
		}
		else if(e.getSource() == bx2){
			num1 = Double.parseDouble(tf1.getText());
			res = (num1 *num1);
			tf1.setText(Double.toString(res));
		}
		else if(e.getSource() == bx3){
			num1 = Double.parseDouble(tf1.getText());
			res = (num1 * num1 * num1);
			tf1.setText(Double.toString(res));
		}
		else if(e.getSource() == bperc){
			num1 = Double.parseDouble(tf1.getText());
			res = (num1 * 100);
			tf1.setText(Double.toString(res));
		}
		else if(e.getSource() == bexp){
			num1 = Double.parseDouble(tf1.getText());
			res = Math.exp(num1);
			tf1.setText(Double.toString(res));
		}
		else if(e.getSource() == bdel){
			num1 = Double.parseDouble(tf1.getText());
			int i = (int)Math.round(num1);
			i = i / 10;
			tf1.setText(Integer.toString(i));
		}
		else if(e.getSource() == bsign){
			num1 = Double.parseDouble(tf1.getText());
			res = (num1 * (-1));
			tf1.setText(Double.toString(res));
		}
		else if(e.getSource() == rb1){
			enable();
		}
		else if(e.getSource() == rb2){
			disable();
		}
	}

	public void Calculations()
	{
		switch(calc)
		{
			case 1:		//add
				res = num1 + Double.parseDouble(tf1.getText());
				tf1.setText(Double.toString(res));
			break;
			case 2:		//sub
				res = num1 - Double.parseDouble(tf1.getText());
				tf1.setText(Double.toString(res));
			break;
			case 3:		//mul
				res = num1 * Double.parseDouble(tf1.getText());
				tf1.setText(Double.toString(res));
			break;
			case 4:		//div
				res = num1 / Double.parseDouble(tf1.getText());
				tf1.setText(Double.toString(res));
			break;
			case 5:		//x ^ y
				num2 = Double.parseDouble(tf1.getText());
				res = 1;
				for(int i = 1 ; i < num2 ; i++)
					res *= num1;
				tf1.setText(Double.toString(res));
			break;
		}
	}

	public void enable()
	{
		tf1.setEditable(true);
		b0.setEnabled(true);
		b1.setEnabled(true);
		b2.setEnabled(true);
		b3.setEnabled(true);
		b4.setEnabled(true);
		b5.setEnabled(true);
		b6.setEnabled(true);
		b7.setEnabled(true);
		b8.setEnabled(true);
		b9.setEnabled(true);
		bsin.setEnabled(true);
		bcos.setEnabled(true);
		btan.setEnabled(true);
		bsinh.setEnabled(true);
		bcosh.setEnabled(true);
		btanh.setEnabled(true);
		bequal.setEnabled(true);
		badd.setEnabled(true);
		bsub.setEnabled(true);
		bmul.setEnabled(true);
		bdiv.setEnabled(true);
		bclr.setEnabled(true);
		bdel.setEnabled(true);
		bdot.setEnabled(true);
		bsign.setEnabled(true);
		bopen.setEnabled(true);
		bclose.setEnabled(true);
		bsqrt.setEnabled(true);
		blog.setEnabled(true);
		bfact.setEnabled(true);
		bx.setEnabled(true);
		bx2.setEnabled(true);
		bx3.setEnabled(true);
		bxy.setEnabled(true);
		bperc.setEnabled(true);
		bexp.setEnabled(true);
	}

	public void disable()
	{
		tf1.setEditable(false);
		b0.setEnabled(false);
		b1.setEnabled(false);
		b2.setEnabled(false);
		b3.setEnabled(false);
		b4.setEnabled(false);
		b5.setEnabled(false);
		b6.setEnabled(false);
		b7.setEnabled(false);
		b8.setEnabled(false);
		b9.setEnabled(false);
		bsin.setEnabled(false);
		bcos.setEnabled(false);
		btan.setEnabled(false);
		bsinh.setEnabled(false);
		bcosh.setEnabled(false);
		btanh.setEnabled(false);
		bequal.setEnabled(false);
		badd.setEnabled(false);
		bsub.setEnabled(false);
		bmul.setEnabled(false);
		bdiv.setEnabled(false);
		bclr.setEnabled(false);
		bdel.setEnabled(false);
		bdot.setEnabled(false);
		bsign.setEnabled(false);
		bopen.setEnabled(false);
		bclose.setEnabled(false);
		bsqrt.setEnabled(false);
		blog.setEnabled(false);
		bfact.setEnabled(false);
		bx.setEnabled(false);
		bx2.setEnabled(false);
		bx3.setEnabled(false);
		bxy.setEnabled(false);
		bperc.setEnabled(false);
		bexp.setEnabled(false);
	}

	public static void main(String args[])
	{
		System.out.println("NAME : KAUSHIKI TARU");
		System.out.println("ROLL : 18103053");
		new ScientificCalc();
	}
}