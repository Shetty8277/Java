public class ProductDetails{
	public static void main(String args[]){
		String productname = "laptop";
		float  price = 15000.0f;
		char brand = 'A';
		float discount = 5;
		float gst = 18;
		float donation = 10;
		float delivery_fee = 50;
		float platform_fee = 5;
		float sum = price + gst + donation + delivery_fee + platform_fee ;
		float sub = sum - discount ;
		float ggst = price + donation + delivery_fee + platform_fee - (price *(gst/100)) - (price*(discount/100)) ;

		System.out.println("product name is " + productname);
		System.out.println("price is " + price);
		System.out.println("brand is " + brand);
		System.out.println("discount is " + discount);
		System.out.println("gst is " + gst);
		System.out.println("donation is " + donation);
		System.out.println("delivery fee is " + delivery_fee);
		System.out.println("platform_fee is " + platform_fee);
		System.out.println("total sum without discount with gst is " + sum);
		System.out.println("total sum with discount is " + sub);
		System.out.println("total sum without gst & with discount is " + ggst);
		



	}
}