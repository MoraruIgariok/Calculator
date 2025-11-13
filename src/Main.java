import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice = 1;
        double number_1=0;
        double number_2=0;
        double result = 0;
        OperationFabric operationFabric = new OperationFabric();

        while (choice <5){
            System.out.println("Select an operation:");
            for (EnumaClass.Operation op : EnumaClass.Operation.values()) {
                System.out.println(op); // afișează frumos: "1. Addition", "2. Subtraction", etc.
            }
            choice = sc.nextInt();

            if (choice == 5 ){
                System.out.println("Bye bye!!");
                break;
            } else if (choice >5 || choice <=0) {
                System.out.println("Sorry but this value isn't to menu");
                break;
            }

            EnumaClass.Operation selected = EnumaClass.Operation.fromCode(choice); // salvarea Label-ul selectat de la tastatura
            System.out.println("Need first number: ");
            number_1 = sc.nextDouble();
            System.out.println("Need last number: ");
            number_2 = sc.nextDouble();

            OperationExecut operationExecutor = operationFabric.CreateExecutor(selected);

            result = operationExecutor.execute(number_1,number_2);
            System.out.println("Result is: "+ result);

        }


    }

}
