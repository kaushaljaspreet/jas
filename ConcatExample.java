public class ConcatExample{    
public static void main(String...s){    
String s1="java "; 
String s2="is a programming language"; 
s1=s1.concat(s2);    
//s1.concat("is immutable");    
//System.out.println(s1);    
//s1=s1.concat(" is immutable so assign it explicitly");    
System.out.println(s1);  
boolean a= s2.contains("java1");
System.out.println(a);  
  boolean b= s2.endsWith("java1");
System.out.println(b);
 boolean c= s2.endsWith("language");
System.out.println(c);  
  
}}    