class Calculation {
    int z;

    void addition(int x, int y) {
        z = x + y;
        System.out.println("The sum of the given numbers =" + z);
    }

    void Subtraction(int x, int y) {
        z = x - y;
        System.out.println("The difference between the given numbers =" + z);
    }
}

class My_Calculation extends Calculation {
    void multiplication(int x, int y) {
        z = x * y;
        System.out.println("The product of the given numbers =" + z);
    }

    public static void main(String...s) {
        
        My_Calculation obj = new My_Calculation();
        obj.addition(30, 20);
        obj.Subtraction(30, 20);
        obj.multiplication(30, 20);
    }
}
