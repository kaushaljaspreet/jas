interface Rbi{
    void interestRate() ;
    void loanAmount() ;
}
class Axis implements Rbi{
	
	
   public void interestRate() {
		
       System.out.println("6%");

    }
	public void loanAmount() {
		
       System.out.println("6000");

    }

}
class Pnb {

    public static void main(String...s) {

        Axis ob = new Axis();
        ob.interestRate();
		ob.loanAmount();
    }
}
