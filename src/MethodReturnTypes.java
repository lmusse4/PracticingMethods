public class MethodReturnTypes {
    public static void main(String[] args) {
        System.out.println(myString());
        System.out.println(myInteger());
        System.out.println(myBoolean());
    }
    public static String myString() {
        return "String of text";
    }
    public static int myInteger() {
        return 5;
    }
    public static boolean myBoolean() {
        return false;
    }
}
