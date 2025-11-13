import java.sql.SQLOutput;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static Map<EnumaClass.Operation, OperationExecut> operations =
            Map.<EnumaClass.Operation, OperationExecut>of(
                    EnumaClass.Operation.ADD, new Addition(),
                    EnumaClass.Operation.SUBTRACT, new Subtraction(),
                    EnumaClass.Operation.DIVIDE, new Division(),
                    EnumaClass.Operation.MULTIPLY, new Multiplication()
    );
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice = 1;
        double number_1=0;
        double number_2=0;
        double result = 0;

        while (choice <5){
            System.out.println("Select an operation:");
            for (EnumaClass.Operation op : EnumaClass.Operation.values()) {
                System.out.println(op); // afișează frumos: "1. Addition", "2. Subtraction", etc.
            }
            choice = sc.nextInt();
            EnumaClass.Operation selected = EnumaClass.Operation.fromCode(choice); // salvarea Label-ul selectat de la tastatura
            if (choice == 5){
                break;
            }
            System.out.println("Need first number: ");
            number_1 = sc.nextDouble();
            System.out.println("Need last number: ");
            number_2 = sc.nextDouble();
            result = operations.get(selected).execute(number_1,number_2);
            System.out.println("Result is: "+ result);

        }

        System.out.println("Bye bye!!");
    }

}
