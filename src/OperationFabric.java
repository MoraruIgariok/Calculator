import java.util.Map;

public class OperationFabric {
    public OperationExecut CreateExecutor(EnumaClass.Operation selected) {

        return operations.get(selected);
    }
    static Map<EnumaClass.Operation, OperationExecut> operations =
            Map.<EnumaClass.Operation, OperationExecut>of(
                    EnumaClass.Operation.ADD, new Addition(),
                    EnumaClass.Operation.SUBTRACT, new Subtraction(),
                    EnumaClass.Operation.DIVIDE, new Division(),
                    EnumaClass.Operation.MULTIPLY, new Multiplication()
            );
}
