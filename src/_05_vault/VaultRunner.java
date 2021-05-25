package _05_vault;

public class VaultRunner {
public static <V_JamesBond> void main(String[] args) {
	Vault coded = new Vault();
	JamesBond spy = new JamesBond();
	
	System.out.println("the code is"+ spy.findCode(coded));
}
}
