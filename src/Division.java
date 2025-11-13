public class Division implements  OperationExecut{
    public double execute(double a, double b) {
        if(b!=0){
            System.out.println("Processing Division operation of values: " + a + " and " + b);
            return a / b;
        }
        return 0;

    }

}
