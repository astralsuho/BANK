package controller;

import javax.swing.JOptionPane;

public class BankController {
	public  void start() {
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료\n"
					+ "1.회원가입\n"
					+ "2.계좌생성\n"
					+ "3.계좌확인\n")) {
					case "0":
						JOptionPane.showMessageDialog(null,
								"종료 ");
					case "1":
						JOptionPane.showInputDialog("아이디를 입력해주세요");
						JOptionPane.showInputDialog("이름을 입력해주세요");
						JOptionPane.showInputDialog("주민번호를 입력해주세요");
						JOptionPane.showInputDialog("패스워드를 입력해주세요");
						break;
					case "2":
						break;
					
			}
		}
	}
}
