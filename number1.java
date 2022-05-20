import java.util.Scanner;

public class number1 {
	public static void main(String[] args) {
		Scanner st = new Scanner(System.in);
		
		System.out.print("구매 할 금액을 입력하세요 : ");
		int nmoney = st.nextInt();
		
		Mart nonmember = new Mart(nmoney);
		System.out.println("최종 결제액은 " + nonmember.Sale() + "원 입니다.");
	
		System.out.print("회원번호와 금액을 입력하세요 : ");
		String mname = st.next();
		int mmoney = st.nextInt();
		
		boolean flag = mname.length() > 0;
		Mart member = new Mart(flag, mmoney);
		
		System.out.println("회원 ID : "+ mname + "의 최종 결제액은 " + member.Sale() + "원 입니다.");
		
		st.close();
	}
}
