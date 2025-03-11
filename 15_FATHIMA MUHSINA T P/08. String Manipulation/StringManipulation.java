package MODULE2;

public class StringManipulation 
{
	public static void main(String[] args)
	{
		char arrsample[]= {'R','O','S','E'};
		String strsample1=new String(arrsample);
		System.out.println("length of " + strsample1 + " is " + strsample1.length());
		byte ascii[]= {65,66,67,68,69,70};
		String strsample2=new String(ascii);
		System.out.println(strsample2 + "\t");
		String strsample3=strsample1.concat(strsample2);
		System.out.println(strsample3 + "\t");
		String strsample4=strsample1+strsample2;
		System.out.println(strsample4 + "\t");
		System.out.println("Third character of " + strsample4 + " is " + strsample4.charAt(2));
		char buf[]=new char[3];
		strsample4.getChars(2, 5, buf, 0);
		System.out.println("Extracted Characters " + strsample4 + " " + new String(buf));
		String strsample="RockStar";
		System.out.println(strsample.compareTo("ROCKSTAR") + " ");
		System.out.println(strsample.compareToIgnoreCase("ROCKSTAR") + " ");
		System.out.println(strsample.equals("ROCKSTAR") + " ");
		System.out.println(strsample.equalsIgnoreCase("ROCKSTAR") + " ");
		System.out.println("RoskStar starts with 'Ro' :" + strsample.startsWith("Ro") + " ");
		System.out.println("RoskStar ends with 'Star' :" + strsample.endsWith("Star") + " ");
		System.out.println("RoskStar contains 'tar' :" + strsample.contains("tar") + " ");
		System.out.println("Index of 't' in RoskStar :" + strsample.indexOf("t") + " ");
		System.out.println("Index of 'Star' in RoskStar :" + strsample.indexOf("Star") + " ");
		System.out.println("RoskStar in All caps :" + strsample.toUpperCase());
		System.out.println("RoskStar in All small : " + strsample.toLowerCase());
		System.out.println("Replace 'Star' with 'et' :" + strsample.replace("Star","et"));
		String dval="3.456";
		String ival="6";
		double a=Double.valueOf(dval);
		int b=Integer.valueOf(ival);
		System.out.println("Double value of " +dval + "=" +a);
		System.out.println("Integer value of " +ival + "=" +b);
		System.out.println(dval + "+" +ival + "=" +(a+b));
	}
	
}
