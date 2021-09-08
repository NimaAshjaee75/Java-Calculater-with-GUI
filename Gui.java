import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Gui extends JFrame{
	private JTextField answerfield;
	private JButton one, two, three, four, five, six, seven, eight, nine, zero, add, sub, multiply, div, equals, clear, decimal, negative; 
	private String strngtemp1, strngtemp2, strnganswer;
	private double answer = 0.0;
	private JPanel contentPanel;
	private boolean equalsClicked = false, opChosen = false;
	char operation = ' ';
	public Gui(){
		super("Nima's Calculator");
		
		answerfield = new JTextField(null, 20);
		answerfield.setEditable(false);
		
		one = new JButton("1");
		two = new JButton("2");
		three = new JButton("3");
		four = new JButton("4");
		five = new JButton("5");
		six = new JButton("6");
		seven = new JButton("7");
		eight = new JButton("8");
		nine = new JButton("9");
		zero = new JButton("0");
		add = new JButton("+");
		sub = new JButton("-");
		multiply = new JButton("*");
		div = new JButton("/");
		equals = new JButton("=");
		clear = new JButton("C");
		decimal = new JButton(".");
		negative = new JButton("+/-");
		
		Dimension dim = new Dimension (75, 25);
		
		one.setPreferredSize(dim);
		two.setPreferredSize(dim);
		three.setPreferredSize(dim);
		four.setPreferredSize(dim);
		five.setPreferredSize(dim);
		six.setPreferredSize(dim);
		seven.setPreferredSize(dim);
		eight.setPreferredSize(dim);
		nine.setPreferredSize(dim);
		zero.setPreferredSize(dim);
		decimal.setPreferredSize(dim);
		negative.setPreferredSize(dim);
		add.setPreferredSize(new Dimension(113, 25));
		sub.setPreferredSize(new Dimension(113, 25));
		multiply.setPreferredSize(new Dimension(113, 25));
		div.setPreferredSize(new Dimension(113, 25));
		equals.setPreferredSize(new Dimension(225, 25));
		
		Numbers n = new Numbers();
		Calc c = new Calc ();
		
		one.addActionListener(n); two.addActionListener(n); three.addActionListener(n); four.addActionListener(n);
		five.addActionListener(n); six.addActionListener(n); seven.addActionListener(n); eight.addActionListener(n);
		nine.addActionListener(n); zero.addActionListener(n); decimal.addActionListener(n); negative.addActionListener(n);
	
		add.addActionListener(c); sub.addActionListener(c); multiply.addActionListener(c); div.addActionListener(c);
		equals.addActionListener(c); clear.addActionListener(c);
		
		
		contentPanel = new JPanel();
		contentPanel.setBackground(Color.BLUE);
		contentPanel.setLayout(new FlowLayout());
		
		contentPanel.add(answerfield, BorderLayout.NORTH);
		contentPanel.add(seven); contentPanel.add(eight); contentPanel.add(nine); contentPanel.add(four);
		contentPanel.add(five); contentPanel.add(six); contentPanel.add(one); contentPanel.add(two);
		contentPanel.add(three); contentPanel.add(zero); contentPanel.add(decimal); contentPanel.add(negative);  contentPanel.add(add); contentPanel.add(sub);
		contentPanel.add(multiply); contentPanel.add(div); contentPanel.add(equals); contentPanel.add(clear);
		
		
		this.setContentPane(contentPanel);
	}
	
	private class Numbers implements ActionListener{
		public void actionPerformed(ActionEvent event){
			JButton src = (JButton) event.getSource();
			
			if(src.equals(one)){
				if(opChosen==false){
					if(strngtemp1==null){
						strngtemp1 = "1";
					}else{
						strngtemp1 = strngtemp1 + "1";
					}
				}else{
					if(strngtemp2==null){
						strngtemp2 = "1";
					}else{
						strngtemp2 = strngtemp2 + "1";
					}	
				}
			}
			
			if(src.equals(two)){
				if(opChosen==false){
					if(strngtemp1==null){
						strngtemp1 = "2";
					}else{
						strngtemp1 = strngtemp1 + "2";
					}
				}else{
					if(strngtemp2==null){
						strngtemp2 = "2";
					}else{
						strngtemp2 = strngtemp2 + "2";
					}	
				}
			}
			
			if(src.equals(three)){
				if(opChosen==false){
					if(strngtemp1==null){
						strngtemp1 = "3";
					}else{
						strngtemp1 = strngtemp1 + "3";
					}
				}else{
					if(strngtemp2==null){
						strngtemp2 = "3";
					}else{
						strngtemp2 = strngtemp2 + "3";
					}	
				}
			}
			
			if(src.equals(four)){
				if(opChosen==false){
					if(strngtemp1==null){
						strngtemp1 = "4";
					}else{
						strngtemp1 = strngtemp1 + "4";
					}
				}else{
					if(strngtemp2==null){
						strngtemp2 = "4";
					}else{
						strngtemp2 = strngtemp2 + "4";
					}	
				}
			}
			
			if(src.equals(five)){
				if(opChosen==false){
					if(strngtemp1==null){
						strngtemp1 = "5";
					}else{
						strngtemp1 = strngtemp1 + "5";
					}
				}else{
					if(strngtemp2==null){
						strngtemp2 = "5";
					}else{
						strngtemp2 = strngtemp2 + "5";
					}	
				}
			}
			
			if(src.equals(six)){
				if(opChosen==false){
					if(strngtemp1==null){
						strngtemp1 = "6";
					}else{
						strngtemp1 = strngtemp1 + "6";
					}
				}else{
					if(strngtemp2==null){
						strngtemp2 = "6";
					}else{
						strngtemp2 = strngtemp2 + "6";
					}	
				}
			}
			
			if(src.equals(seven)){
				if(opChosen==false){
					if(strngtemp1==null){
						strngtemp1 = "7";
					}else{
						strngtemp1 = strngtemp1 + "7";
					}
				}else{
					if(strngtemp2==null){
						strngtemp2 = "7";
					}else{
						strngtemp2 = strngtemp2 + "7";
					}	
				}
			}
			
			if(src.equals(eight)){
				if(opChosen==false){
					if(strngtemp1==null){
						strngtemp1 = "8";
					}else{
						strngtemp1 = strngtemp1 + "8";
					}
				}else{
					if(strngtemp2==null){
						strngtemp2 = "8";
					}else{
						strngtemp2 = strngtemp2 + "8";
					}	
				}
			}
			
			if(src.equals(nine)){
				if(opChosen==false){
					if(strngtemp1==null){
						strngtemp1 = "9";
					}else{
						strngtemp1 = strngtemp1 + "9";
					}
				}else{
					if(strngtemp2==null){
						strngtemp2 = "9";
					}else{
						strngtemp2 = strngtemp2 + "9";
					}	
				}
			}
			
			if(src.equals(zero)){
				if(opChosen==false){
					if(strngtemp1==null){
						strngtemp1 = "0";
					}else{
						strngtemp1 = strngtemp1 + "0";
					}
				}else{
					if(strngtemp2==null){
						strngtemp2 = "0";
					}else{
						strngtemp2 = strngtemp2 + "0";
					}	
				}
			}
			if(src.equals(decimal)){
				if(opChosen==false){
					if(strngtemp1==null){
						strngtemp1 = "0.";
					}else
						if(strngtemp1 !=null){
							if(strngtemp1.contains(".")){
								System.out.println("Already a decimal");
							}else{
								strngtemp1 +=".";
							}
					}
					}else{
					if(strngtemp2==null){
						strngtemp2 = "0.";
					}else{
						if(strngtemp2 != null){
							if(strngtemp2.contains(".")){
								System.out.println("Already a decimal point");
							}else{
								strngtemp2 +=".";
							}
							
						}
					}	
				}
			}
			
			if(src.equals(negative)){
				if(opChosen==false){
					if(strngtemp1==null){
						strngtemp1 = "-";
					}else
						if(strngtemp1 != null && strngtemp1.startsWith("-")){
						strngtemp1 = strngtemp1.substring(1);
					}else{
						strngtemp1 = "-" + strngtemp1;
					}
				}else{
					if(strngtemp2==null){
						strngtemp2 = "-";
					}else
						if(strngtemp2 != null && strngtemp2.startsWith("-")){
						strngtemp2 = strngtemp2.substring(1);
						}else{
							strngtemp2 = "-" + strngtemp2;
					}	
				}
			}
			
		if(equalsClicked==false){
			if(opChosen==false){
				answerfield.setText(strngtemp1);
			}else{
				answerfield.setText(strngtemp2);
				
		     	}
		    }
    }

	}
	private class Calc implements ActionListener{
		public void actionPerformed(ActionEvent event){
			JButton src = (JButton) event.getSource();
			
			if(src.equals(add)){
				if(strngtemp1==null){
					System.out.println("choose the first number");
				}else
					if(strngtemp1 != null && strngtemp2 ==null){
						opChosen = true;
						operation = '+';
					}else
						if(strngtemp1 !=null && strngtemp2 !=null){
							System.out.println("two operation");
				}
			}
			if(src.equals(sub)){
				if(strngtemp1==null){
					System.out.println("choose the first number");
				}else
					if(strngtemp1 != null && strngtemp2 ==null){
						opChosen = true;
						operation = '-';
					}else
						if(strngtemp1 !=null && strngtemp2 !=null){
							System.out.println("two operation");
				}
			}
			if(src.equals(multiply)){
				if(strngtemp1==null){
					System.out.println("choose the first number");
				}else
					if(strngtemp1 != null && strngtemp2 ==null){
						opChosen = true;
						operation = '*';
					}else
						if(strngtemp1 !=null && strngtemp2 !=null){
							System.out.println("two operation");
				}
			}
			if(src.equals(div)){
				if(strngtemp1==null){
					System.out.println("choose the first number");
				}else
					if(strngtemp1 != null && strngtemp2 ==null){
						opChosen = true;
						operation = '/';
					}else
						if(strngtemp1 !=null && strngtemp2 !=null){
							System.out.println("two operation");
				}
			}
			
			if(src.equals(equals)){
				if(strngtemp1==null){
					System.out.println("choose the first number");
				}else
					if(strngtemp1 != null && strngtemp2 ==null){
						System.out.println("choose the number and operation first");
				}
			
			if(strngtemp1 != null && strngtemp2 != null){
				double d1 = 0.0, d2 = 0.0;
				
				d1 = Double.parseDouble(strngtemp1);
				d2 = Double.parseDouble(strngtemp2);
				
				switch(operation){
				case '+':
					answer = d1 + d2;
					break;
				case '-':
					answer = d1 - d2;
					break;
				case '*':
					answer = d1 * d2;
					break;
				case'/':
					answer = d1 / d2;
					break;
					}
				
					strnganswer = Double.toString(answer);
					answerfield.setText(strnganswer);
					if(operation == '/' && d2 == 0.0){
						answerfield.setText("You cannot divide a number by zero");
					}
				}
			}
			
			if(src.equals(clear)){
				strngtemp1 = null;
				strngtemp2 = null;
				equalsClicked = false;
				opChosen = false;
				operation = ' ';
				answerfield.setText(null);
				strnganswer = null;
		}
	}
	}
}
	

	
