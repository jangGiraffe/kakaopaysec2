package kakaopaysec2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
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
		}else {
			List<String> seatList = new LinkedList<String>();
			int index=0;
			for(int i=0;i<peopleNum;i++) {
				seatList.add(i+"");
			}
			ListIterator<String> iterator = seatList.listIterator();
			//������ ���� �ڸ� ã��
			for(int i=0;i<peopleNum-1;i++) {
				for(int j=0;j<moveD;j++) {
					if(iterator.hasNext()) {
						index = iterator.nextIndex();
						iterator.next();
					}
					else {
						iterator = seatList.listIterator();
						index = iterator.nextIndex();
						iterator.next();
					}
				}
				lastSeat = (String) seatList.get(index);
				seatList.remove(index);
				iterator = seatList.listIterator(index);
			}
			tmp = Integer.parseInt(seatList.get(0))+1;
			lastSeat = tmp+"";
		}
		//��� ���
		System.out.println("> ���  \t\t:" + lastSeat);
		
	}
}