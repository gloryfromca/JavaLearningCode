package functionPractice;

public class VariableArguments {
	static int SumVariableArgs(int... args){
		int sumVaRArgs = 0;
		for (int s:args) {
			sumVaRArgs = sumVaRArgs + s;
		}
		return sumVaRArgs;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumVarArgs = SumVariableArgs(new int[] {1,2,2,3,3,3});
		System.out.println("Sum of VariableArguments:"+sumVarArgs );
	}

}
