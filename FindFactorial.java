class FindFactorial {
    public static void main(String...s) {
        factorial(5);
    }
    static void factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            if (num == 0) {
                fact = 1;
            } else {
                fact = fact * i;
            }
        }
        System.out.println("Factorial is: " + fact);

    }

}
