import java.util.Scanner;

public class Mmain {
	void case1(String name,int num,double price,int day1)
	{
		double totalprice=0.0;
		System.out.println(name);
		System.out.println("Day No.of items available Price");
		if(day1>=0)
		totalprice=price*day1;
		System.out.println("Day1" +num+ " "+price);
		System.out.println(totalprice);
	}
	void case2(String name,int num,double price,int day1,int day2)
	{ double day2price=0.0,totalprice2,totalprice;
		System.out.println(name);
   	System.out.println("Day No.of items available Price");
   	if(day1>=0);
   		 totalprice=price*day1;
   		System.out.println("Day1  "+num+"  "+price);
   		 if(day2>=0)
		   		day2price=price*0.07;
		   		price=price-day2price;
		   		totalprice2=price*day2;
		   		int a=num-day1;
		   		System.out.println("Day2 " +a+" "+price);
		   		double sum=totalprice+totalprice2;
	   			System.out.println("Total amount of sales:"+sum);
	}
	
	void case3(String name,int num,double price,int day1,int day2,int day3)
	{ double day2price=0.0,totalprice2,totalprice,day3price,totalprice3,totprice;
		System.out.println(name);
   	System.out.println("Day No.of items available Price");
   	if(day1>=0);
   		 totalprice=price*day1;
   		System.out.println("Day1  "+num+"  "+price);
   		 if(day2>=0)
		   		day2price=price*0.07;
		   		price=price-day2price;
		   		totalprice2=price*day2;
		   		int a=num-day1;
		   		System.out.println("Day2 " +a+" "+price);
		   		double sum=totalprice+totalprice2;
	   			/*System.out.println("Total amount of sales:"+sum);	*/				if(day3>=0){
	 					day3price=price*0.07;
	 					price=price-day3price;
	 					totalprice3=price*day3;
	 					int b=a-day2;
	 					System.out.println("Day3 " +b+ " "+price);
	 					totprice=totalprice+totalprice2+totalprice3;
	 					System.out.println("Total amount of sales=Rs." +totprice);}
	}
	
	void case4(String name,int num,double price,int day1,int day2,int day3,int day4)
	{ double day2price=0.0,totalprice2,totalprice,day3price,totalprice3,totprice,totalprice4;
	int a,b=0,c;
		System.out.println(name);
   	System.out.println("Day No.of items available Price");
   	if(day1>=0);
   		 totalprice=price*day1;
   		System.out.println("Day1  "+num+"  "+price);
   		 if(day2>=0)
		   		day2price=price*0.07;
		   		price=price-day2price;
		   		totalprice2=price*day2;
		   		a=num-day1;
		   		System.out.println("Day2 " +a+" "+price);
		   		double sum=totalprice+totalprice2;
	   			/*System.out.println("Total amount of sales:"+sum);	*/				if(day3>=0)
	   			              {
	 					day3price=price*0.07;
	 					price=price-day3price;
	 					totalprice3=price*day3;
	 					b=a-day2;
	 					System.out.println("Day3 " +b+ " "+price);
	 					totprice=totalprice+totalprice2+totalprice3;
	 					if(day4>=0)
	 					{
	 							double day4price=price*0.07;
									price=price-day4price;
									totalprice4=price*day4;
									c=b-day3;
									System.out.println("Day4 " +c+" "+price);
									totprice=totalprice+totalprice2+totalprice3+totalprice4;
									System.out.println("Total amount of sales=Rs." +totprice);
	 					}
	}}
	
	public static void main(String[] args)
	 { int day2=0,day4=0;
	    int day1=0,day3=0;
	 Mmain a=new Mmain();
	 Scanner in=new Scanner(System.in);
	 System.out.println("Enter the name of the item:");
	 String name=in.nextLine();
	 
	 Scanner i=new Scanner(System.in);
	 System.out.println("Enter the price of the item");
	 double price=i.nextInt();
	 
	 Scanner ni=new Scanner(System.in);
	 System.out.println("Enter the number of items to be sold");
	 int num=ni.nextInt();
      
     Scanner n=new Scanner(System.in);
	 System.out.println("Enter the sales made on day1:");
	 day1=n.nextInt();
	 
	 if(num==day1)
	 a.case1(name,num,price,day1);
	 
	 if(num!=day1)
	 {
	 Scanner nn=new Scanner(System.in);
	 System.out.println("Enter the sales made on day2:");
	 day2=nn.nextInt();	 
	 if(num==day1+day2)
	 a.case2(name,num,price,day1,day2);
	 }
	 if(num!=day1 && num!=day1+day2)
	 {
	 Scanner day=new Scanner(System.in);
	 System.out.println("Enter the sales made on day3:");
	 day3=day.nextInt();	 
	 if(num==day1+day2+day3)
	 {
	 a.case3(name,num,price,day1,day2,day3);
	 }
	 }
	 if(num!=day2 && num!=(day1+day2+day3))
	 {
	 Scanner day=new Scanner(System.in);
	 System.out.println("Enter the sales made on day4:");
	 day4=day.nextInt();
	 a.case4(name,num,price,day1,day2,day3,day4);
	 }
	 
	  
	 
      
     
      

	}
}