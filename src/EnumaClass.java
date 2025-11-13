public class EnumaClass {
   public enum Operation {
        ADD(1, "Addition"),
        SUBTRACT(2, "Subtraction"),
        MULTIPLY(3, "Multiplication"),
        DIVIDE(4, "Division"),
        EXIT(5,"QUIT");

        private final int code;
        private final String label;

        Operation(int code, String label) {
            this.code = code;
            this.label = label;
        }

        public int getCode() {
            return code;
        }

        public String getLabel() {
            return label;
        }

        // caută enum-ul după codul introdus
        public static Operation fromCode(int code) {
            for (Operation op : Operation.values()) {
                if (op.getCode() == code) {
                    return op;
                }
            }
            return null; // sau poți arunca excepție
        }

        @Override
        public String toString() {
            return code + ". " + label;
        }
    }
}
