

//carmen52
import java.util.Scanner;

public class Carmen52
{
public static void main(String[] args) 
{
Scanner Keyboard = new Scanner(System.in);

System.out.println("Enter X"); 

int x = Keyboard.nextInt();

System.out.println("Enter Y"); 

int y = Keyboard.nextInt(); 

double ans = 0; 

while (x<=y) 
{
	 ans = ans + 1/(Math.sqrt(x)); 
	 x++; 

}
System.out.println(ans); 
} 
} 
