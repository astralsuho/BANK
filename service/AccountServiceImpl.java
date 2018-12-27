package service;

import java.util.ArrayList;

import domain.AccountBean;

/**
 * @author Park Jung-Kwan
 * @date 2018. 12. 26.
 * @desc 은행계좌 구현객체
 */
public class AccountServiceImpl implements AccountService{
	private ArrayList<AccountBean> list;
	
	public AccountServiceImpl() {
		list = new ArrayList<>();
	}
	/***************************
	 * CRATE
	 ***************************/
	@Override
	public void createAccount(int money) {
		AccountBean account = new AccountBean();
		account.setAccountNum(createAccountNum());
		account.setMoney(money);
		account.setToday(findDate());
		list.add(account);
		
	}
	@Override
	public String createAccountNum() {
		// TODO Auto-generated method stub
		return null;
	}
	/***************************
	 * READ
	 ***************************/
	@Override
	public ArrayList<AccountBean> findAll() {
		
		return list;
	}

	@Override
	public AccountBean findByAccountNum(String accountNum) {
		AccountBean account = new AccountBean();
		for(int i=0;i < list.size();i++) {
			if(list.get(i).getAccountNum().equals(accountNum)) {
				account = list.get(i);
			}
		}
		return account;
	}

	@Override
	public int countAccount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public boolean existAccount(String accountNum) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public String findDate() {
		// TODO Auto-generated method stub
		return null;
	}
	/***************************
	 * UPDATE
	 ***************************/
	@Override
	public void depositMoney(int money) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdrawMoney(int money) {
		// TODO Auto-generated method stub
		
	}
	/***************************
	 * DELETE
	 ***************************/
	@Override
	public void deleteAccountNum(String accountNum) {
		// TODO Auto-generated method stub
		
	}

	


	
}