package algo.implementation.easy;

/**
 * Initially, there is a Robot at position (0, 0). Given a sequence of its
 * moves, judge if this robot makes a circle, which means it moves back to the
 * original place.
 * 
 * The move sequence is represented by a string. And each move is represent by a
 * character. The valid robot moves are R (Right), L (Left), U (Up) and D
 * (down). The output should be true or false representing whether the robot
 * makes a circle
 * 
 */
public class JudgeRouteCircle {
	
	public boolean judgeCircle(String moves) {
		int r = 0, u = 0;

		for (int i = 0; i < moves.length(); i++) {
			switch (moves.charAt(i)) {
			case 'U':
				u++;
				break;
			case 'D':
				u--;
				break;
			case 'R':
				r++;
				break;
			case 'L':
				r--;
				break;
			}
		}
		return (r == 0 && u == 0);
	}

	public static void main(String[] args) {
		// Input: "UD" Output: true		
		System.out.println(new JudgeRouteCircle().judgeCircle("UD"));
		System.out.println(new JudgeRouteCircle().judgeCircle("LL"));
	}
}
