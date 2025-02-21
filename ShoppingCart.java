public class ShoppingCart{
	public static void main(String[] args){
		String productname = "laptop";
		float  p1 = 80.0f;
		float p2 = 10.58f;
		float p3 = 50.89f;
		float p4 = 5.56f;
		float discount = 10;
		float sum = p1 + p2 + p3 + p4  ;
		if(sum >= 100){
			float gt = sum - (price*(discount/100)) ;
			System.out.println("the total price after the discount is " + gt);
		}
		else{
			System.out.println(" the total price is " + sum );

		}
		
	}
}