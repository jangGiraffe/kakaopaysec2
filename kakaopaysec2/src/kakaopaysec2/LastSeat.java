package kakaopaysec2;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//3. ������ ���� �ڸ�
public class LastSeat {
	public static void main(String[] args) {
		
		//���� ����
		Scanner scanner = new Scanner(System.in);	
		String lastSeat="";
		int moveD;
		int peopleNum;
		int tmp = 0;
		
		//���� �Է�(��� ��)
		System.out.print("> ��� ��  \t:");
		peopleNum = Integer.parseInt(scanner.next());
		
		//���� �Է�(�̵� �Ÿ�)
		System.out.print("> �̵� �Ÿ�  \t:");
		moveD = Integer.parseInt(scanner.next());
		
		if(peopleNum<10) {
			for(int i=1;i<=peopleNum;i++) {
				lastSeat += i;
			}
			
			//������ ���� �ڸ� ã��
			for(int i=0;i<peopleNum-1;i++) {
				tmp = moveD%(peopleNum-i);
				if(tmp==0) tmp=peopleNum-i;			
				lastSeat= lastSeat.substring(tmp,lastSeat.length())+lastSeat.substring(0,tmp-1);
			}
		}
		System.out.println("������ ���� �ڸ��� " + lastSeat + "�Դϴ�.");
		
	}
}