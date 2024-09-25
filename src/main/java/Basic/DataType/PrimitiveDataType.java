package Basic.DataType;

public class PrimitiveDataType {
    public static void main(String[] args) {
        // Primitive Data Types
        byte var1;   // Byte
        short var2;  // short
        char var3;   // Character
        int var4;    // Integer
        long var5;   // Long
        float var6;  // Float
        double var7; // Double
        boolean var8; // Boolean

        /*
         Each primitive data type has a corresponding wrapper class in the java.lang package,
         which allows primitives to be used as objects.
         */

        // Manual Boxing (Converting Primitive to Object)
        int primitiveInt1 = 5;
        Integer wrapperInt1 = Integer.valueOf(primitiveInt1);
        // Manual Unboxing (Converting Object to Primitive)
        Integer wrapperInt2 = Integer.valueOf(10);
        int primitiveInt2 = wrapperInt2.intValue();

        int primitiveInt = 100;
        // Autoboxing
        Integer wrapperInt = primitiveInt;
        // Auto-unboxing
        int newPrimitiveInt = wrapperInt;

        // Convert String to others
        String str = "123";
        int num = Integer.parseInt(str);
        // Convert others to String
        String s = Integer.toString(num);
    }
}
