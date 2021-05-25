package _07_binary_converter;


	import java.awt.event.MouseEvent;
	import java.awt.event.MouseListener;

	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;
	import javax.swing.JPanel;
	import javax.swing.JTextField;

	public class BinaryConverter implements MouseListener {
	JFrame frame = new JFrame();
	JPanel pan = new JPanel();
	JTextField text = new JTextField(20);
	JLabel lab = new JLabel();

	JButton button = new JButton("convert");
		public static void  main(String[] args) {
		BinaryConverter bc = new BinaryConverter();
	bc.converter();
	
		}
		private void converter() {
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setTitle("Convert 8 bits of binary to ASCII");
			frame.add(pan);
			pan.add(text);
			pan.add(lab);
			pan.add(button);
			frame.pack();
			button.addMouseListener(this);
			
		}
		
		   String convert(String input) {
		          if(input.length() != 8){
		               JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
		               return "-";
		          }
		          String binary = "[0-1]+";    //must contain numbers in the given range
		          if (!input.matches(binary)) {
		               JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
		               return "-";
		          }
		          try {
		               int asciiValue = Integer.parseInt(input, 2);
		               char theLetter = (char) asciiValue;
		               return "" + theLetter;
		          } catch (Exception e) {
		               JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
		               return "-";
		          }
		     }
		
		
		
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
				
		}
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			String s = convert(text.getText());
			lab.setText(s);
			frame.pack();
			frame.repaint();
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	

