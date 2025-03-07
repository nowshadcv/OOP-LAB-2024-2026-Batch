package MODULE2;

public class StringManipulation {

	public static void main(String[] args) {
		char arrSample[] = {'R','O','S','E'};
		String strSample1 = new String (arrSample);
		System.out.println(strSample1+"\t");
		System.out.println("Length of "+strSample1+" is "+strSample1.length());
		System.out.println();
		byte ascii[] = {65,66,67,68,69,70};
		String strSample2 = new String (ascii);
		System.out.println(strSample2+"\t");
		String strSampel3 = strSample1.concat(strSample2);
		System.out.println(strSampel3+"\t");
		String strSample4 = strSample1 + strSample2;
		System.out.println(strSample4+"\t");
		System.out.println("3rd char of "+strSample4+" is "+strSample4.charAt(2));
		char byt[] = new char[3];
		strSample4.getChars(2, 5, byt, 0);
		System.out.println("Extracted chars "+strSample4+" "+new String(byt));
		String strSample = "RockStar";
		System.out.println(strSample.compareTo("ROCKSTAR")+"\t");
		System.out.println(strSample.compareTo("rockstar")+"\t");
		System.out.println(strSample.equals("ROCKSTAR"));
		System.out.println(strSample.equalsIgnoreCase("ROCKSTAR"));
		System.out.println("RockStar starts with 'RO "+strSample.startsWith("RO"));
		System.out.println("RockStar contains 'ta'"+strSample.contains("ta"));
		System.out.println("RockStar ends with 'star'"+strSample.endsWith("star"));
		System.out.println("Index of 't' in RockStar: "+strSample.indexOf("t"));
		System.out.println("All caps-RockStar: "+strSample.toUpperCase());
		System.out.println("All lowcase-RockStar: "+strSample.toLowerCase());
		System.out.println("Replace Star with et: "+strSample.replace("Star", "et"));
		String dVal = "3.456";
		String iVal = "6";
		System.out.println("Double value of dVal is: "+Double.valueOf(dVal));
		System.out.println("Integer value of iVal is: "+Integer.valueOf(iVal));
		double a = Double.valueOf(dVal);
		int b = Integer.valueOf(iVal);
		System.out.println(a+b);
	}

}