package Template.Helper;

public abstract class AbstGameConnectHelper {

	/* 보안 작업 -> 암호화 된 문자열을 복호화 */
	protected abstract String doSecurity(String s);

	//
	protected abstract boolean authentication(String id, String pw);

	protected abstract int authorization(String userName);

	protected abstract String connection(String info);

	// 템플릿 메소드
	public String requestConnection(String encodedInfo) {
		/* 가상의 ID,PW */
		String id = "aaa";
		String pw = "bbb";

		/* 프로세스 시작 */
		String decodedInfo = doSecurity(encodedInfo);

		if (!authentication(id, pw)) {
			throw new Error("아이디 혹은 비밀번호가 불일치 합니다.");
		}

		String userName = "userName";

		switch (authorization(userName)) {
		case -1:
			throw new Error("셧다운");
		case 0://게임 매니저
			
			break;
		case 1://유료 회원
			
			break;
		case 2://무료 회원
			
			break;
		case 3://권한 없음
			
			break;
			default://기타
				
				break;
		}

		return connection(decodedInfo);
	}
}
