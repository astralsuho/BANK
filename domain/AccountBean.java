package domain;


/**
 * @author SUHO_LEE
 * @date 2018. 12. 26.\
 * @desc 은행계좌 구현객체
 */
public class AccountBean {
	private String accountNum,today;
	private int money;
	// Alt Shfift S
	public String getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public String getToday() {
		return today;
	}
	public void setToday(String today) {
		this.today = today;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return String.format("[회원정보]\n"
				+ "계좌번호: %s\n"
				+ "날짜: %s\n"
				+ "출금: %d\n"
				+ "입금: %d", accountNum,today,money);
	}
}
