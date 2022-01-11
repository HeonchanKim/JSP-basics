package test;

import dao.MemberDAO;
import vo.MemberVO;

public class Test {
	public static void main(String[] args) {
		MemberVO vo = new MemberVO();
		MemberDAO dao = new MemberDAO();
		
		vo.setId("khc1234");
		vo.setPw("1234");
		vo.setName("김헌찬");
		vo.setAge(20);
		
		if(!dao.checkId(vo.getId())) {
			dao.join(vo);
		}
		
		if(dao.login("khc1234", "1234")) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
		
	}
}
