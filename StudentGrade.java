package projects1;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Student Marks :");
		marks = sc.nextInt();
		
		if(marks>=90 && marks<=100) {
			System.out.println("Grade A");
		}
		else if(marks>=70 && marks<=89) {
			System.out.println("Grade B");
		}
		else if(marks>=40 && marks<=69) {
			System.out.println("Grade C");
		}
		else if(marks>=0 && marks<=39) {
			System.out.println("Grade D");
		}
		else{
			System.out.println("Invalid");
		}

	}

}
