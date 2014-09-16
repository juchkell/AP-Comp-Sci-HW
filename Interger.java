package Chapter2reading;
import java.util.Scanner;

public class Interger {
	public static void main(String[] args)
	{
Scanner kboard = new Scanner(System.in);
System.out.print("What is your interger: ");
int number = kboard.nextInt();
int dubint = number * 2;
System.out.println("2 * " + number + " = " + dubint);

}}
