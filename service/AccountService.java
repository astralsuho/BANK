package service;

import java.util.ArrayList;

import domain.AccountBean;
import domain.MemberBean;

public interface AccountService {
	// CRAETE
	public void createAccount(int money);
	public String createAccountNum(); // 계좌번호생성
	// READ
	public ArrayList<AccountBean> findAll();
	public AccountBean findByAccountNum(String accountNum);
	public int countAccount();
	public boolean existAccount(String accountNum);
	public String findDate(); // 날짜반환
	// UPDATE
	public void depositMoney(int money);
	public void withdrawMoney(int money);
	// DELETE
	public void deleteAccountNum(String accountNum);
	
	
}




