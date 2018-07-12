
public class drive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] sequence_I = {1,7,4,9,2,5};
        int[] sequence_II = {2,4,5,7,5,5,7,1,2,3};
        int[] sequence_III = {5,4,3,2,1};
        
        Dynamic_solution method = new Dynamic_solution();
        int num1, num2, num3 = 0;
        num1 = method.dynamic_swingSubsequenceLength(sequence_I);
        num2 = method.dynamic_swingSubsequenceLength(sequence_II);
        num3 = method.dynamic_swingSubsequenceLength(sequence_III);
        System.out.println("The total number swing subsequence of sequence I is: " + num1);
        System.out.println("The total number swing subsequence of sequence II is: " + num2);
        System.out.println("The total number swing subsequence of sequence III is: " + num3);
        System.out.println();
        
        Greedy_Solution method_II = new Greedy_Solution();
        num1 = method_II.greedy_swingSubsequenceLength(sequence_I);
        num2 = method_II.greedy_swingSubsequenceLength(sequence_II);
        num3 = method_II.greedy_swingSubsequenceLength(sequence_III);
        System.out.println("The total number swing subsequence of sequence I is: " + num1);
        System.out.println("The total number swing subsequence of sequence II is: " + num2);
        System.out.println("The total number swing subsequence of sequence III is: " + num3);
	}

}
