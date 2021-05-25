package _05_vault;

public class JamesBond {
	int findCode(Vault coded) {
		for(int i=1000000;i>-1;i--) {
			if(coded.tryCode(i)) {
				return i;
			}
			
		}
		return -1;
	}

}
