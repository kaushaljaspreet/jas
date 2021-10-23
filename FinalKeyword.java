class FinalKeyword {
    final int a;
	FinalKeyword()
	{
		a=10;
	}
    void updateValue() {
        System.out.println(a);
		//a=15;
    }
    public static void main(String...s) {
		FinalKeyword f= new FinalKeyword();
		f.updateValue();
	}
}
