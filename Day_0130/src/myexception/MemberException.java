// 사용자 정의 exception 만들기
package myexception;

//@SuppressWarnings("serial") // 시리얼 번호가 없어도 warning 띄우지 마세용
public class MemberException extends Exception {

	/** serial넘버 자동생성
	 * 시리얼 넘버 : 객체 직렬화시 필요
	 */
	private static final long serialVersionUID = 1L;
	
	// 기본 생성자 - 익셉션 메시지를 받아서 부모 클래스(Exception)에게 전달 
	public MemberException(String message) {
		super(message);
	}
	
}
