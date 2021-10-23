class Print {
    static String s1;
    static void printString(String s) {
        s1=s;
		System.out.println(s1);
    }
    public static void main(String...s) {
        //Print p1 = new p1();
		Print.printString("HelloWorld");

    }

}
