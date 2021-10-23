class FindCurrency{
	public static void main(String...s){
		currency(96);
	}
	static void currency (int amount){
		int hq=0;
		int fq=0;
		int tq=0;
		int tenQ=0;
		int fiveq=0;
		int twoQ=0;
		int oneQ=0;

		int notes[] ={100, 50, 20, 10, 5, 2, 1};

		int number;
		while(amount!=0)
		{
			for(int i=0;i<notes.length;i++)
			{
				
				if (amount>=notes[i])
				{
					int tmp=amount/notes[i];
					amount=amount%notes[i];
					
					switch(notes[i]){
						case 100:
						hq=tmp;
						break;
						case 50:
						fq=tmp;
						break;
						case 20:
						tq=tmp;
						break;
						case 10:
						tenQ=tmp;
						break;
						case 5:
						fiveq=tmp;
						break;
						case 2:
						twoQ=tmp;
						break;
						case 1:
						oneQ=tmp;
						break;
						default:
						System.out.println("Someting wrnt wrong");
						
						
						
					}
				}	

			}
		}
		System.out.println("100s : "+hq+", 50s : "+fq+", 20s : "+tq+", 10s : "+tenQ+", 5 : "+fiveq+", 2 : "+twoQ+", one : "+oneQ);


	}

}