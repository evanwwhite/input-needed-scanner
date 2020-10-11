import java.util.Scanner;
class scanner {
    public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Print Full Name: ");
String name = input.nextLine();

System.out.println("Print Age: ");
String age = input.next();
input.nextLine();

System.out.println("Print Your Town: ");
String town = input.nextLine();

System.out.println(name + " is " + age + " years old and lives in " + town + ".");
    }
}
