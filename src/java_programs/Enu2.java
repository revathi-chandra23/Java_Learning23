package java_programs;

// enum using the switch case

enum season
{
	winter,summer,spring ,rainy;
	}
public class Enu2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		season s=season.rainy;
		switch(s)
		{
		case winter:
			System.out.println("winter");
			break;
		case summer:
			System.out.println("summer");
			break;
		case spring:
			System.out.println("spring");
			break;
		default:
			System.out.println("rainy");
			break;
		}

	}

}
