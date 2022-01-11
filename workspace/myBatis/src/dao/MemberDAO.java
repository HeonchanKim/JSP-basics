package dao;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import config.MyBatisConfig;
import vo.MemberVO;

public class MemberDAO {
	SqlSessionFactory sqlSession_f = MyBatisConfig.getSqlSession_f();
	SqlSession sqlSession;

	public MemberDAO() {
		sqlSession = sqlSession_f.openSession(true);
	}
	
	//아이디중복검사
	public boolean checkId(String id) {
		//제네릭 타입을 parseInt()에 전달하면 문자열이 아닌 값을 전달했기 때문에 오류가 발생한다.
		//이럴 떄에는 Down Casting을 사용하여 Integer타입으로 강제 형변환 해준다.
		return (Integer)(sqlSession.selectOne("Member.checkId", id)) == 1;
	}
	
	//회원가입
	public void join(MemberVO member) {
		sqlSession.insert("Member.join", member);
	}
	//로그인
	public boolean login(String id, String pw) {
		HashMap<String, String> loginMap = new HashMap<>();
		loginMap.put("id", id);
		loginMap.put("pw", pw);
		
		return (Integer)(sqlSession.selectOne("Member.login", loginMap)) == 1;
	}
	//아이디 조회
	//나이 조희
	
	
}
