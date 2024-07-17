/*convert celcius to fahrenheit*/
import java.util.Scanner;
public class celciusToF
{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter the temperature in celcius :");
float c=s.nextFloat();
float f=(c*9/5)+32;
System.out.println("The temperature in Fahrenheit is :"+f);
}
}
