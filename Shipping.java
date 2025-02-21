public class Shipping{
	public static void main(String[] args){
		float  price = 60.0f;
		float discount = 5;
		float gst = 8.56f;
		float donation = 10;
		float delivery_fee = 50;
		float platform_fee = 5;
		float sum = price + gst + donation + delivery_fee + platform_fee ;

		if(sum >= 50){
			float gt = sum - delivery_fee ;
			System.out.println("the total price and is eligble for free delivery " + gt);
		}
		else{
			System.out.println(" the total price is " + sum );

		}
	}
}