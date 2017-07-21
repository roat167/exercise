package io.kapp.algo.implementation;

public class GradingStudent {
	
	static int[] solve(int[] grades) {
		int n = grades.length;
		int[] scores = new int[n];
		
		for(int i = 0; i < n; i++) {
			int sc = grades[i];
			if (sc >= 38) {
				int r = sc % 5;
				if (r >=3 ) {
					sc += 5 - r;
				}				
			}
			scores[i] = sc;
		}
		return scores;
	}

	public static void main(String[] args) {
		/** Problem statement from Hackerrank
		Every student receives a  in the inclusive range from 0 to 100.
		Any  less than 40 is a failing grade.
		Sam is a professor at the university and likes to round each student's  according to these rules:

		If the difference between the  and the next multiple of 5  is less than 3 , round  up to the next multiple of 5.
		If the value of  is less than 38 , no rounding occurs as the result will still be a failing grade.
		For example, grade = 84  will be rounded to 85  but grade=29  will not be rounded 
		because the rounding would result in a number that is less than 40.

		Given the initial value of grades for each of Sam's  students, write code to automate the rounding process. 
		For each grade of i , round it according to the rules above and print the result on a new line.
		*/
		
        int[] grades = {73, 67, 38, 33};
        
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        //Expected output: 75 67 40 33
    }
}

