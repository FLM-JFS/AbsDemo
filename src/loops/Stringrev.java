package loops;

public class Stringrev {

	public static void main(String[] args) {

		String name = "ABCDE";
		char[] namee = name.toCharArray();
		
		int start=0;
		int end=namee.length-1;
		
		while(start <= end) {
			char temp=namee[start];
			namee[start]=namee[end];
			namee[end]=temp;
			start++;
			end--;
		}
		
		for (char c : namee) {
			System.out.print(c);
		}
	}
	}
		

