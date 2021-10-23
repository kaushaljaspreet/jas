class PalindromeString{  
public static void palindromeOrNot(String n){
	
	

	String reverseString=new StringBuilder(n).reverse().toString();
	System.out.println(reverseString);
   
}
public static void main(String...s){ 
PalindromeString.palindromeOrNot("Shubham");
PalindromeString.palindromeOrNot("MADAM");
  
}  
}
