import java.util.Scanner;
import java.text.DecimalFormat;


public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("CALCULATOR");
System.out.print("Please Enter The First Number : ");
Scanner scan = new Scanner(System.in);
DecimalFormat df = new DecimalFormat("#,###,###.##");
double num1 = scan.nextDouble();
System.out.print("Please Enter The Second Number : ");
double num2 = scan.nextDouble();

System.out.println("Select An Operator: 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division");
int opscan = scan.nextInt();
double result = 0;

switch(opscan) {
case 1:
	result = num1 + num2;
	break;
case 2:
	result = num1 - num2;
	break;
case 3:
	result = num1 * num2;
	break;
case 4:
	result = num1 / num2;
	break;
default:
	System.out.println("Invalid");
}
String fr = df.format(result);
System.out.println(fr);
	}

}
