package service;

import domain.MemberBean;

/**
 * @author Park Jung-Kwan
 * @date 2018. 12. 26.
 * @desc 멤버기능구현
 */
public class MemberServiceImpl implements MemberService{
	private int count;
	private MemberBean[] members; //둘은 이퀄스 관계
	public MemberServiceImpl() {
		members = new MemberBean[10];
		count =0;
	}
	@Override
	public void join(String id, String pass, String name, String ssn) {
		MemberBean bean = new MemberBean();
		bean.setId(id);
		bean.setName(name);
		bean.setPass(pass);
		bean.setSsn(ssn);
		members[count] = bean;
		count++;
	}

	@Override
	public MemberBean[] findAll() {
		return members;
	}

	@Override
	public MemberBean[] findByName(String name) {
		int j = 0;
		for(int i = 0;i<count;i++) {
			if(members[i].getName().equals(name)) {
				j++;
			}
		}
		MemberBean[] beans = new MemberBean[j];
		j = 0; // 만약 동명이인이 3명이라면
		// j = 0 으로 초기화 하지 않으면
		// 아래 부분에서 j 는 3부터 시작하기 때문
		for(int i = 0;i<count;i++) {
			if(members[i].getName().equals(name)) {
				beans[j] = members[i];
				j++;
				if(j==beans.length) {
					break;
				}
			}
		}
		return beans;
	}

	@Override
	public MemberBean findById(String id) {
		MemberBean bean = new MemberBean();
		for(int i =0;i<count;i++) {
			if(members[i].getId().equals(id)) {
				bean = members[i];
				break;
			}
		}
		return bean;
	}

	@Override
	public int countMember() {
		return count;
	}

	@Override
	public boolean existMember(String id, String pass) {
		boolean ok = false;
		for(int i =0;i<count;i++) {
			if(members[i].getId().equals(id)&&
					members[i].getPass().equals(pass)) {
				ok= true;
				break;
			}
		}
		return ok;
	}

	@Override
	public void updatePass(String id, String pass, String newPass) {
		
		for(int i = 0;i<count;i++) {
			if(existMember(id, pass)) {
				members[i].setPass(newPass);
			}
		}
		
	}

	@Override
	public void deleteMember(String id, String pass) {
		for(int i=0;i<count;i++) {
			if(existMember(id, pass)) {
				members[i] = members[count-1];
				members[count-1] = null;
				count--;
				break;
			}
		}
		
	}
	
}






