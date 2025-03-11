package MODULE2;

public class StringManipulation 
{
	public static void main(String[] args) 
	{
		char arrSample[]= {'R','O','S','E'};
		String strSample1=new String(arrSample);
		System.out.print(strSample1+"\t");
		System.out.println("Length of" + strSample1+" is :"+ strSample1.length());
		byte ascii[]= {65,66,67,68,69,70};
		String strSample2=new String(ascii);
		System.out.print(strSample2+"\t");
		String strSample3=(strSample1.concat(strSample2));
		System.out.print(strSample3+"\t");
		String strSample4=strSample1+strSample2;
		System.out.println("3rd char of "+strSample4+" is:"+strSample4.charAt(2));
		char buff[]=new char[3];
		strSample4.getChars(2,5,buff,0);
		System.out.println("Extracted chars:"+strSample4+" "+new String(buff));
		String strSample="Rockstar";
		System.out.print(strSample.compareTo("ROCKSTAR")+"\t");
		System.out.print(strSample.compareToIgnoreCase("Rocksatr")+"\t");
		System.out.print(strSample.equals("ROCKSTAR")+"\t");
		System.out.print(strSample.equalsIgnoreCase("ROCKSTAR")+"\t");
		System.out.println("Rockstar starts with 'Ro':"+strSample.startsWith("Ro"));
		System.out.println("Rockstar ends with 'star':"+strSample.endsWith("star"));
		System.out.println("Rockstar contains 'tar':"+strSample.contains("tar"));
		System.out.println("Index of 't' in Rockstar:"+strSample.indexOf("t"));
		System.out.println("Index of 'star' in Rockstar:"+strSample.indexOf("star"));
		System.out.println("All caps-Rockstar:"+strSample.toUpperCase());
		System.out.println("All small-Rockstar:"+strSample.toLowerCase());
		System.out.println("Replace star with et:"+strSample.replace("star","et"));
		String dval="3.456";
		String ival="6";
		System.out.println("Inter value of ivalue is :"+Double.valueOf(dval));
		System.out.println("Inter value of ival is:"+Integer.valueOf(ival));
		double a=Double.valueOf(dval);
		int b=Integer.valueOf(ival);
		System.out.println(a+b);
		
		}

}
