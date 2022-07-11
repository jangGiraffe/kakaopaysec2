package kakaopaysec2;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//3. 마지막 남는 자리
public class LastSeat {
	public static void main(String[] args) {
		
		//변수 셋팅
		Scanner scanner = new Scanner(System.in);	
		String lastSeat="";
		int moveD;
		int peopleNum;
		int tmp = 0;
		
		//변수 입력(사람 수)
		System.out.print("> 사람 수  \t:");
		peopleNum = Integer.parseInt(scanner.next());
		
		//변수 입력(이동 거리)
		System.out.print("> 이동 거리  \t:");
		moveD = Integer.parseInt(scanner.next());
		
		if(peopleNum<10) {
			for(int i=1;i<=peopleNum;i++) {
				lastSeat += i;
			}
			
			//마지막 남는 자리 찾기
			for(int i=0;i<peopleNum-1;i++) {
				tmp = moveD%(peopleNum-i);
				if(tmp==0) tmp=peopleNum-i;			
				lastSeat= lastSeat.substring(tmp,lastSeat.length())+lastSeat.substring(0,tmp-1);
			}
		}
		System.out.println("마지막 남는 자리는 " + lastSeat + "입니다.");
		
	}
}