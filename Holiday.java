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
