package SayıBulmak;

import java.util.Scanner;

public class sayiBulma {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		int num;
		System.out.println("Bulunacak sayıyı girin: ");
		num=input.nextInt();
		boolean varMi=false;
		int numbers[]=new int[] {1,2,3,4,5,6,7,8};
		
		for(int findingNum:numbers) {
			if(findingNum==num) {
				varMi=true;
				break;
			}
			
		}
		if(varMi) {
			System.out.println("Sayı bulundu");
		}else {
			System.out.println("Sayı bulunamadı");
		}
		
		
		
	}

}
