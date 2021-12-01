package sec10.exam02.wordg;

import java.util.Scanner;

public class WordGame {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
		 int num;
		 int n=0;
		 String word ="ũ�ι�";//���α׷� ù �ܾ� ����
		 String lastWord, newWord;
		 Player []player;
		 
		 System.out.println("-----------------------------------------");
		 System.out.println("************The Word Game****************");
		 System.out.println("-----------------------------------------");
		 System.out.println();
		 System.out.print("���ӿ� �����ϴ� �ο��� ����Դϱ�?  >> ");
		 num = input.nextInt();//������ �ο� �� �Է¹��� �� num�� ����
		 player=new Player[num];//������ �ο� ��(num) ��ŭ �迭 ���� 
		 
		 for(int i =0; i<player.length; i++) {//������ �ο� �� ���� 1�� �����Ͽ� �Ʒ� ����
		  System.out.print("�������� �̸��� �Է��ϼ��� >>");
		  player[i] = new Player(input.next()); //������ �̸��� name�� �־���
		 }
		 
		 lastWord = word;
		 System.out.println("�����ϴ� �ܾ��  "+ lastWord + "�Դϴ�.");
		 
		 while(true) {//while ���� 
		  System.out.print(player[n].name + ">> ");
		  newWord = player[n].sayWord(input.next());//player ������ �´� �����ڰ� �Է��� �ܾ
//		                                              newWord�� ����.
		  if(player[n].succeed(lastWord)) { //lastWord �� ������ PlayerŬ���� �Ҹ� �޼ҵ� ����
		   lastWord = newWord; //newWord�� lastWord�� ����
		   n++; //������ �迭 ���� ������ ����
		    if(n==num) //n�� �Է¹��� ������ ���� ������ 0���� �ʱ�ȭ.
		     n=0;
		     continue; //continue ������ �ٽ� �ݺ� ����. 
		  }
		   else {//Player Ŭ���� �Ҹ� �޼ҵ� ����� false�� �� ����.
		    System.out.println(player[n].name + "���� �����ϴ�.");
		       break;//break������ while ���� ��������.
		   }
		  }
		  input.close();//��ĳ�� �Է� ����.
		  System.out.println("----------------------------------------");
		  System.out.println("Maker: �ֽ���");
		  
		  
		}//main

	}//class


