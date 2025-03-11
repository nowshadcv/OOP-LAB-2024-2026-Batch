package MODULE2;

public class StringManipulation {

	public static void main(String[] args) {
		char arrsample[]= {'R','O','S','E'};
		String strsample1=new String (arrsample);
		System.out.print(strsample1 +"\t");
		System.out.println("length of "+ strsample1 + " is : " + strsample1.length());
		byte ascii[]= {65,66,67,68,69,70};
		String strsample2=new String(ascii);
		System.out.print(strsample2+"\t");
		String strsample3=strsample1.concat(strsample2);
		System.out.print(strsample3+"\t");
		String strsample4=strsample1+strsample2;
		System.out.print(strsample4+"\t");
		System.out.println("3rd char of "+ strsample4 + " is: "+strsample4.charAt(2));
		char buf[]=new char[3];
		strsample4.getChars(2,5,buf,0);
		System.out.println("Extracted chars:"+strsample4+""+new String(buf));
		String strsample="RockStar";
		System.out.print(strsample.compareTo("ROCKSTAR")+ "\t");
		System.out.print(strsample.compareToIgnoreCase("ROCKSTAR")+"\t");
		System.out.print(strsample.equals("ROCKSTAR")+"\t");
		System.out.print(strsample.equalsIgnoreCase("ROCKSTAR") + "\t");
		System.out.println("RockStar starts with 'Ro':"+strsample.startsWith("Ro"));
		System.out.println("RockStar ends with 'Star':"+strsample.endsWith("Star"));
		System.out.println("RockStar contains 'tar':"+strsample.contains("t"));
		System.out.println("index of 't' in RockStar:"+ strsample.indexOf("t"));
		System.out.println("index of 'Star' in RockStar:"+ strsample.indexOf("Star"));
		System.out.println("all caps - RockStar:"+ strsample.toUpperCase());
		System.out.println("all small - RockStar:"+ strsample.toLowerCase());
		System.out.println("Replace Star with et: "+strsample.replace("Star" , "et"));
		String dVal="3.456";
		String iVal="6";
		System.out.println("Double value of dVal is:" + Double.valueOf(dVal));
		System.out.println("integer value of iVal is:" + Integer.valueOf(iVal));
		double a = Double.valueOf(dVal);
		int b = Integer.valueOf(iVal);
		System.out.println(a+b);
	}
}
