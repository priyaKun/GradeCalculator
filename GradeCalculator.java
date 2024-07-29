import java.util.Scanner;
import java.util.ArrayList;

class GradeCalculator{
 public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Please specify the number of subjects you wish to enter");
	int n =sc.nextInt();

	int totalMarks = 0;

	ArrayList<String> Subjects = new ArrayList<String>(n);
	ArrayList<Integer> Marks = new ArrayList<Integer>(n);
	
        for (int i = 0; i<n; i++) {
		System.out.println("Enter Subject name");
		Subjects.add(sc.next());

		System.out.println("Enter " +Subjects.get(i)+ " Marks out of 100");
			int marks = sc.nextInt();

		if (marks<=100) {
			Marks.add(marks);
		} else {
			System.out.println("Maximum Marks exceeded.Please check!");
			i--;
		}
	}
	
	for(int j=0; j<n; j++) {
		totalMarks = totalMarks + Marks.get(j);
	}
	System.out.println("Total subject marks = " + totalMarks);

	float avgPercent = totalMarks/n;
	System.out.println("Average percent = "+ avgPercent);

	if (avgPercent <= 100 || avgPercent >=90) {
		System.out.println("A grade");
	}else if (avgPercent <90 || avgPercent >70) {
		System.out.println("B grade");
	}else if (avgPercent <70 || avgPercent >40) {
		System.out.println("C grade");
	}else if (avgPercent <40 || avgPercent >20) {
		System.out.println("D grade");
	}else {
		System.out.println("Failed");
	}
	
   }
}