package Sport;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class RandomSportExercise {

	public static void main(String[] args) {
				Starter();
			}
		
	private static void Starter() {
		System.out.println("=============\nSport Main Menu\nPress 1 for generate exercise\nPress 0 for exit.\n=============");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();	
		switch (num){
		case 0:
			System.exit(0);
		case 1:
			GenerateExercisesAndCount();
			break;
		default:
			System.out.println("Wrong number, back to main..");
			Starter();
		}
		input.close();
	}
	
	private static void GenerateExercisesAndCount() {
		HashMap<Integer, String> diceSport = new HashMap<Integer, String>();
		HashMap<Integer, String> count = new HashMap<Integer, String>();
		Scanner input = new Scanner(System.in);
		diceSport.put(1, "Push_Up");
		diceSport.put(2, "Crunches");
		diceSport.put(3, "Squat");
		diceSport.put(4, "Walking_Lunge");
		diceSport.put(5, "Jumping_Jacks");
		diceSport.put(6, "Free_Style");
		
		count.put(1, "10_Repeat");
		count.put(2, "20_Repeat");
		count.put(3, "30_Repeat");
		count.put(4, "30_Seconds");
		count.put(5, "60_Seconds");
		count.put(6, "90_Seconds");
		
		System.out.print("Number: ");
		int num = input.nextInt();
		input.close();
		for(int i=1; i<=num; i++) {
			Random random = new Random();
			int number = random.nextInt((6-1)+1)+1;
			Random random1 = new Random();
			int number1 = random1.nextInt((6-1)+1)+1;
			System.out.println(diceSport.get(number) + "->" + count.get(number1));
		}
	}
}
