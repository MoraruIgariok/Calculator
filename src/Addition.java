public class Addition implements OperationExecut {

    @Override
    public double execute(double a, double b) {
        System.out.println("Processing Sum operation of values: " + a + " and " + b);
        return a + b;
    }
}
