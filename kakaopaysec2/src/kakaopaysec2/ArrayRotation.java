package kakaopaysec2;

import java.util.Scanner;

//2. �迭 ȸ��
public class ArrayRotation {
	public static void main(String[] args) {
		//���� ����
		Scanner scanner = new Scanner(System.in);		
		int x=0;
		int y=0;
		String [] tmpArray;
		int [][] array=null;
		
		
		//���� �Է�(���ο�)
		System.out.print(">���� ��\t\t\t : ");
		y = Integer.parseInt(scanner.next());
		//���� �Է�(���ο�)
		System.out.print(">���� ��\t\t\t : ");
		x = Integer.parseInt(scanner.next());
		//�迭 ������ �Է�
		System.out.print(">�迭 ������ (,) �� ���� \t : ");
		tmpArray = scanner.next().split(",");
		array = new int[x][y];
		for(int i=0;i<x;i++) {
			for (int j=0;j<y;j++) {
				array[i][j]=Integer.parseInt(tmpArray[i*y+j]);
			}
		}
		
		//�迭 ȸ�� ����
		System.out.print(">ȸ�� ��ɾ� \t : ");
		tmpArray = scanner.next().split("");
		for(int i=0;i<tmpArray.length;i++) {
			switch(tmpArray[i]){
			case "L" :
				array = turnLeft(array);
				break;
			case "R" : 
				array = turnRight(array);
				break;
			case "T" :
				array = flipArray(array);
				break;
			}
		}
		//���� ���
		System.out.print(">����� �迭 ��ġ: ");
		tmpArray = scanner.next().split(",");
		
		x = Integer.parseInt(tmpArray[1])-1;
		y = Integer.parseInt(tmpArray[0])-1;

		System.out.println("��� : " + array[x][y]);		
	}
	
	public static int [][] turnRight(int [][] array){
		int x = array[0].length;
		int y = array.length;
		int[][] array2 = new int[x][y];
		
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				array2[i][j] = array[y - 1 - j][i];
			}
		}
		return array2;
	}
	
	public static int [][] turnLeft(int [][] array){
		int x = array[0].length;
		int y = array.length;
		int[][] array2 = new int[x][y];
		
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				array2[i][j] = array[j][x-1-i];
			}
		}
		return array2;
	}
	
	public static int [][] flipArray(int [][]array){
		int x = array.length;
		int y = array[0].length;
		
		int[][] array2 = new int[x][y];
				
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				array2[i][j] = array[i][y-1-j];
			}
		}
		return array2;
	}
	
	public static void printArray(int [][]array){
		System.out.println("---------------");
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}
}
