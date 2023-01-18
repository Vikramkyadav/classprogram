//1. The Java class called Holiday is started below. An object of class Holiday
//represents aholiday during the year. This class has three instance variables:
//● name, which is a String representing the name of the holiday
//● day, which is an int representing the day of the month of the holiday
//● month, which is a String representing the month the holiday is in
//a) Write a constructor for the class Holiday, which takes a String representing the name,
//an int representing the day, and a String representing the month as its arguments, and
//sets the class variables to these values.
//b) Write a piece of code that creates a Holiday instance with the name “Independence
//Day”,with the day “4”, and with the month “July”.
class Holiday
{
	String holidayname;
	int holiday;
	String  holidaymonth;
public Holiday()
{
  		holidayname=name;
		holiday= day;
		holidaymonth=month
}
	public Holiday(String name,int day,String month)
	{
		holidayname=name;
		holiday= day;
		holidaymonth=month;
	}
	public static void main(String args[])
	{
		Holiday Test= new Holiday("Ugadi",20,"March");
		System.out.println(Test.holidayname+" ");
		System.out.println(Test.holiday+" ");
		System.out.println(Test.holidaymonth+"  ");
	}
}
