	package _05_vault;

import java.util.Random;

public class Vault {
		 Random r = new Random();
private int code = r.nextInt(1000000);
boolean tryCode(int codecracker){
	if(codecracker==code){
		return true;
	}
	
		return false;
			
		}


	 
	}

