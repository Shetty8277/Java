public class Prime{
	public static void main(String[] args){
		int num = 4;

		if (num<2){
			System.out.println("not a Prime Number");
		}

		for(int i=2;i <= Math.sqrt(num);i++){
			if (num%2 == 0){
				System.out.println("It is a Prime Number");
			}
		} 

	}
}