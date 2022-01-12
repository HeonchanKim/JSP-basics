package test;

import dao.MemberDAO;
import vo.MemberVO;

public class Test {
	public static void main(String[] args) {
		MemberVO vo = new MemberVO();
		MemberDAO dao = new MemberDAO();
		
		dao.findMember().forEach(member -> {
			System.out.print(member.getId() + ",");
			System.out.print(member.getName() + ",");
			System.out.print(member.getPw() + ",");
			System.out.println(member.getAge());
		});
		
		
//		System.out.println(dao.findId("홍길동", "1234"));	
	
//		vo.setId("khc2222");
//		vo.setPw("1234");
//		vo.setName("이순신");
//		vo.setAge(21);
		
//		if(dao.delete("khc1234")) {
//			System.out.println("회원탈퇴 성공");
//		}
		
		
//		if(dao.update(vo)) {
//			System.out.println("수정 성공");
//		}
		
//		if(!dao.checkId(vo.getId())) {
//			dao.join(vo);
//		}
//		
//		if(dao.login("khc1234", "1234")) {
//			System.out.println("로그인 성공");
//		}else {
//			System.out.println("로그인 실패");
//		}
		
	}
}
