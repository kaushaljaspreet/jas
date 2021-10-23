class PrintFibbonacciSeries{
    public static void main(String...s) {
		fibonacci(10);
	}
    static void fibonacci(int num) {
        int a = 0,
        b = 1,
        sum = 0;
        while (a <= num) {
            System.out.println(a);
            sum = a + b;
            a = b;
            b = sum;

        }
    }
}
