import java.util.ArrayList;

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

    public static double average(int[] numbers){
        int sum = 0;
        for(int number : numbers){
            sum += number;
        }
        return (double) sum / numbers.length;
    }

    public static ArrayList<User> capitalizeRecords(ArrayList<User> users){
        for (User user : users){
            user.setFirstName(user.getFirstName().substring(0, 1).toUpperCase() + user.getFirstName().substring(1));
            user.setLastName(user.getLastName().substring(0, 1).toUpperCase() + user.getLastName().substring(1));
        }
        return users;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        ArrayList<User> user = new ArrayList<>();
        user.add(new User("cory","imel",true));
        System.out.println(user.get(0).sayHello());
        capitalizeRecords(user);
        System.out.println(user.get(0).sayHello());
        System.out.println(square(5));
        System.out.println(sum(2,2));
        System.out.println(sum(2.3,2.2));
        System.out.println(average(array));

    }


}
