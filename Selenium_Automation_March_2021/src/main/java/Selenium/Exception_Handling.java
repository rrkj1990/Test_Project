package Selenium;

public class Exception_Handling {

	public static void main(String[] args) {
		
		
		try {
		System.out.println("Hello World");
		int i = 1/0;
		System.out.println("it is completed");
		} catch(Throwable T ) {
			
			System.out.println("Catch block has executed");
			System.out.println("Meaasgae is"+ T.getMessage());
			System.out.println("Cause is "+ T.getCause());
			T.printStackTrace();
		}
		
		
	}

}
