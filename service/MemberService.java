package service;
import domain.MemberBean;
public interface MemberService {

	public void join(String id,String name,String pass,String ssn);//계좌생성 회원정보
	public MemberBean[] findAll();
	public MemberBean[] findByName(String name);
	public MemberBean findById(String id);
	public int countMember();
	public boolean existMember(String id, String pw);
	public void updatePass(String id, String pass,String newPass);
	public void deleteMember(String id,String pass);
	
}
