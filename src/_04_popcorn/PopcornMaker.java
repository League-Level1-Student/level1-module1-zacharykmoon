package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main(String[] args) {
		String poptype = JOptionPane.showInputDialog("What type of Popcorn do you want");
		String cookMins = JOptionPane.showInputDialog("How many minutes would you ");
		    int minsCooked = Integer.parseInt(cookMins);
		    Popcorn jiffy = new Popcorn(poptype);
		    		
		    Microwave funHeat =  new Microwave();
		    funHeat.putInMicrowave(jiffy);
		    funHeat.setTime(minsCooked);
		    funHeat.startMicrowave();
	}
}
