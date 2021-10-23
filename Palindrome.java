class Palindrome{  
public static void palindromeOrNot(int n){
 int r,sum=0,temp;    
    temp=n;    
  while(n>0){    
   r=n%10;  //getting remainder  
   sum=(sum*10)+r;    
   n=n/10;    
  }  
  System.out.println(sum);
  if(temp==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
}
public static void main(String...s){ 
Palindrome.palindromeOrNot(454);
Palindrome.palindromeOrNot(12345);
  
}  
}