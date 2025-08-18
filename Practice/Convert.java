import java.util.*;
class Convert{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter temperature in Celcius: ");
        int Celcius = sc.nextInt();
        int Fahrenheit = (Celcius*9/5)+32;
        System.out.println(Celcius+" degree celcius equals "+Fahrenheit+" degree Fahrenheit");
    }
}