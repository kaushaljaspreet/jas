class Frequency {

    public static void main(String...s) {
        int[] a = new int[]{
            1,
            2,
            3,
            4,
            5,
            1,
            2,
            3,
            4,
            5,
            2,
            3,
            4,
            3,
            4,
            5
        };

        int[] b = new int[a.length];
       
        
        for (int i = 0; i < a.length; i++) {
            int c = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {

                    c++;
                  
					
                }
            }
        
                b[i] = c;

        }
        for (int i = 0; i <a.length; i++) {
           // if (b[i] != visited) {
			   if(i>=1 && a[i-1]<a[i])
			   {
                System.out.println(a[i] + " || " + b[i]+"   "+a[i-1]+"  "+a[i]);
			   }
			else if(i==0)
			{
				 System.out.println(a[i] + " || " + b[i]);
			}else{
				 System.out.println("i am coming here");
			break;
			}
			
            //}
        }
    }

}
