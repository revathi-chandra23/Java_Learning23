package java_programs;

enum laptop
{
	HP(3000),Lenovo(4000),Macbook(100000),Asus(20000);
	private int price;

	private laptop(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
}



public class Enuclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(laptop lap:laptop.values())
		{
			System.out.println(lap + ": " +lap.getPrice());
		}

	}

}
