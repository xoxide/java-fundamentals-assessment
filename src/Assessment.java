public class Assessment {
    public static int square (int number){
        return number * number;
    }

    public static int sum (int a, int b){
        return a + b;
    }

    public static double sum (double a, double b){
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(square(5));
        System.out.println(sum(2,2));
        System.out.println(sum(2.3,2.2));
    }
}
