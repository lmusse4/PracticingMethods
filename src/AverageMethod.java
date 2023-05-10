public class AverageMethod {
    public static void main(String[] args) {
        double num1 = 2;
        double num2 = 5;
        double num3 = 8;
        double avg = average(num1, num2, num3);
        System.out.println("The average is: " + avg);
    }
    public static double sum(double num1, double num2, double num3){
        return num1 + num2 + num3;
    }
    public static double average(double num1, double num2, double num3){
        double sum = sum(num1, num2, num3);
        return sum / 3.0;
    }
}
