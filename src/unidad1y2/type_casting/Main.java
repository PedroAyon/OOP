package unidad1y2.type_casting;

/**
 * @author Pedro Ayon
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Integer to float: " + convertToFloat(100));
        System.out.println("Integer to double: " +convertToDouble(200));
        System.out.println("Double to integer: " + convertToInteger(300.5));
        System.out.println();
        System.out.println("String to integer: " + convertToInteger("10"));
        System.out.println("Integer to string: " + convertToString(10));
        System.out.println();
        System.out.println("String to float: " + convertToFloat("20"));
        System.out.println("Float to string: " + convertToString((float) 20.0));
        System.out.println();
        System.out.println("String to double: " + convertToDouble("30.5"));
        System.out.println("Double to string: " + convertToString(30.5));
    }

    public static String convertToString(Object type) {
        return type.toString();
    }

    public static Float convertToFloat(Object type) {
        if (type instanceof String) return Float.valueOf(((String) type));
        else if (type instanceof Integer) return Float.valueOf((Integer) type);
        else if (type instanceof Float) return (Float) type;
        else return (float) 0;
    }

    public static Double convertToDouble(Object type) {
        if (type instanceof String) return Double.valueOf(((String) type));
        else if (type instanceof Integer) return Double.valueOf((Integer) type);
        else if (type instanceof Double) return (Double) type;
        else return 0.0;
    }

    public static Integer convertToInteger(Object type) {
        if (type instanceof String) return Integer.valueOf(((String) type));
        else if (type instanceof Double) return ((Double) type).intValue();
        else if (type instanceof Integer) return (Integer) type;
        else return 0;
    }

}
