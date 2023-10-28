public class kain {
    public static void main(String[] args) {
        int number = 0;
        try {
            number = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
// Handle exception if the input is not a number
        }
        if (number < 0) { System.out.println("Число является отрицательным"); } else if (number > 0) {
            System.out.println("Число не является отрицательным");
        } else {
            System.out.println("Число равно нулю");
        }
    }
}