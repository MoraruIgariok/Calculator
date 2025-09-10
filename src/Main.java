import java.util.Scanner;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculator obj = new Calculator();
        Scanner sc = new Scanner(System.in);
        int menu = 1;

        while (menu != 0) {
            System.out.println("Selectati una din operatiuni");
            System.out.println("1.Adunarea \n2.Scaderea\n3.Inmultirea\n4.Impoartire\n5.Iesire(0).");
            menu = sc.nextInt();

            if (menu == 0 || menu > 4) {
                System.out.println("O zi buna, mai intrati pe la noi");
            } else {
                System.out.println("Introduceti primul numar");
                int number1 = sc.nextInt();
                System.out.println("Intorduceti al doilea numar: ");
                int number2 = sc.nextInt();

                switch (menu) {
                    case 1:
                        obj.Adunare(number1, number2);
                        break;
                    case 2:
                        obj.Scadere(number1, number2);
                        break;
                    case 3:
                        obj.Inmultire(number1, number2);
                        break;
                    case 4:
                        obj.Impartire(number1, number2);
                        break;
                    default:
                        System.out.println("Ati seletat valoare incorecta");
                }


            }
        }


    }

}

class Calculator {

    public int a;
    public int b;

    public void Adunare(int a, int b) {
        System.out.println("Suma numerelor este: " + (a + b));
    }

    public void Scadere(int a, int b) {
        System.out.println("Diferena dintre " + a + " si " + b + " este: " + (a - b));
    }

    public void Inmultire(int a, int b) {
        System.out.println("Produs numerelor " + a + " si " + b + " este: " + (a * b));
    }

    public void Impartire(int a, int b) {
        if (b > 0) {
            System.out.println("Citul impartirii dintre " + a + " si " + b + " este: " + (a / b));
        } else {
            System.out.println("Numarul la care se impoarte, adica " + b + "trebuie sa fie mai mare si diferit de 0");

        }
    }

}