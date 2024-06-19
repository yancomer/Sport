package sport;

import java.util.Scanner;

public class RandomSportExercise {
	public static void main(String[] args) {
				Starter();
	}
		
	private static void Starter() {
		System.out.println("=============\nSport Main Menu\nPress 1 for generate exercise\nPress 0 for exit.\n=============");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		GenerateSport gen = new GenerateSport();
		switch (num){
		case 0:
			System.exit(0);
		case 1:
			gen.GenerateExercisesAndCount();
			break;
		default:
			System.out.println("Wrong number, back to main..");
			Starter();
		}
		input.close();
	}
}

