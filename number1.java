import java.util.Scanner;

public class number1 {
	public static void main(String[] args) {
		Scanner st = new Scanner(System.in);
		
		System.out.print("���� �� �ݾ��� �Է��ϼ��� : ");
		int nmoney = st.nextInt();
		
		Mart nonmember = new Mart(nmoney);
		System.out.println("���� �������� " + nonmember.Sale() + "�� �Դϴ�.");
	
		System.out.print("ȸ����ȣ�� �ݾ��� �Է��ϼ��� : ");
		String mname = st.next();
		int mmoney = st.nextInt();
		
		boolean flag = mname.length() > 0;
		Mart member = new Mart(flag, mmoney);
		
		System.out.println("ȸ�� ID : "+ mname + "�� ���� �������� " + member.Sale() + "�� �Դϴ�.");
		
		st.close();
	}
}
