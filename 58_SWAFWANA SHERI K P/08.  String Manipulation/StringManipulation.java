package MODULE1;

public class StringManipulation {

	public static void main(String[] args) {
		char arrSample[]= {'R','O','S','E'};
		String strSample1=new String(arrSample);
		System.out.println(strSample1+"\t");
		System.out.println("Length of ROSE: "+strSample1.length());
		byte ascii[]= {65,66,67,68,69,70};
		String strSample2=new String(ascii);
		System.out.println(strSample2+"\t");
		String strSample3=strSample1.concat(strSample2);
		System.out.println(strSample3+"\t");
		String strSample4=strSample1+strSample2;
		System.out.println(strSample4+"\t");
		System.out.println("3rd Char of "+strSample4+" is: "+strSample4.charAt(2));
		char buf[]=new char[3];
		strSample4.getChars(2, 5, buf, 0);
		System.out.println("Extracted chars: "+strSample4+ " "+new String(buf));
		String strSample="RockStar";
		System.out.println(strSample.compareTo("ROCKSTAR")+"\t");
		System.out.println(strSample.compareToIgnoreCase("ROCKSTAR")+"\t");
		System.out.println(strSample.equals("ROCKSTAR")+"\t");
		System.out.println(strSample.equalsIgnoreCase("ROCKSTAR")+"\t");
		System.out.println("Rockstar starts with 'Ro': "+strSample.startsWith("Ro"));
		System.out.println("Rockstar starts ends with 'Star': "+strSample.endsWith("Star"));
		System.out.println("Rockstar contains 'tar': "+strSample.contains("tar"));
		System.out.println("Index of 't'in RockStar: "+strSample.indexOf("t"));
		System.out.println("Index of 'Star'in RockStar: "+strSample.indexOf("Star"));
		System.out.println("All caps-RockStar: "+strSample.toUpperCase());
		System.out.println("All small-RockStar: "+strSample.toLowerCase());
		System.out.println("Replace Star with et: "+strSample.replace("Star", "et"));
		String dVal="3.456";
		String iVal="6";
		System.out.println("Double value of dVal: "+Double.valueOf(dVal));
		System.out.println("Integer value of iVal: " +Integer.valueOf(iVal));
		double a=Double.valueOf(dVal);
		int b=Integer.valueOf(iVal);
		System.out.println(a+b);
		
	}

}
