
public class Player {

	private int money;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	private String token;
	// private int location;
	// private int[] property;

	

	public Player(int money, String token) {
		this.money = money;
		this.token = token;
	}
	
	public boolean checkTransaction(int transaction) {
		
		if (this.money >= transaction)
			return true;
		return false;
	}
	public int updateMoney(int transaction) throws Exception {
		
		if(checkTransaction(transaction)) {
			return this.money += transaction;
		}
		else {
			return -1;
		}
		
		//if(this.money < 0){
		// throw PlayerBankRupted
	//}
	}
}
