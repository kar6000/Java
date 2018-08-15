package july24;

public class FindNegativeNumbersFromArray {

	public static void main(String[] args) {
		
		int n[] = {1,-2,-3,0,-9,9,9,-90,6,7,8};
		for(int i=0; i<n.length;i++) {
			if(n[i]<0) {
				System.out.println("negative number is "+n[i]);
			}
		}

	}

}
