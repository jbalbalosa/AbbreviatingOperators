public class Main {
    public static void main(String[] args) {
        System.out.println("Udemy: Java Programming Masterclass");
        System.out.println("Abbreviating Operators");

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println(previousResult);
        result = result -1;
        System.out.println(result);

        result = result * 10;
        System.out.println("2 * 10 = " + result);

        result = result / 5;
        System.out.println("20 / 5 = " + result);

        result = result % 3; //the remainder of (4 % 3) = 1
        System.out.println(result);


        //Abbreviating Operators
        result++;
        System.out.println("1 + 1 = " + result);

        result--;
        System.out.println("2 -1 = " + result);

        result += 2;
        System.out.println("1 + 2 = " + result);

        //result = result * 10;
        result *= 10;
        System.out.println("3 * 10 = "  + result);

        //result = result / 5;
        result /= 5;
        System.out.println("30 / 5 = " + result);

        //result = result - 2
        result -= 2;
        System.out.println("6 - 2 = " + result);


    }
}