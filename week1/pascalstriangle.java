package week1;

public class pascalstriangle {

        public static int factorial(int n) {

        int fact = 1;

        for(int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args) {
        
          int n = 5;

        for(int i = 0; i < n; i++) {

            // spaces
            for(int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            // numbers
            for(int j = 0; j <= i; j++) {

                int value =
                    factorial(i) /
                    (factorial(j) * factorial(i - j));

                System.out.print(value + " ");
            }

            System.out.println();
        }
    }
    
}
