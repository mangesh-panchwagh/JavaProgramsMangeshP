package tta.june27thTask;

import java.util.Scanner;

public class WebsiteType {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Domain of website : ");
		String domain = scan.nextLine();
		
		if(domain.contains(".com")) {
			
			System.out.println("The web site type is  : commercial Website");
		}else if(domain.contains(".org")) {
			
			System.out.println("The web site type is  : Non-Profit organization");
		}else if(domain.contains(".edu")) {
			
			System.out.println("The web site type is  : Educational Institution");
		}else if(domain.contains(".gov")) {
			
			System.out.println("The web site type is  : Government Website");
		}else if(domain.contains(".net")) {
			
			System.out.println("The web site type is  : Network Related website");
		}else if(domain.contains(".info")) {
			
			System.out.println("The web site type is  : Informational website");
		}else {
			System.out.println("The web site type is  : Unknown or Other Types of website");
		}
	}
}
