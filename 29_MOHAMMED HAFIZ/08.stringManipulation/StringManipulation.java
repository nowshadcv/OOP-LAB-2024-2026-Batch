package MODULE1;

public class StringManipulation {
	public static void main(String[] args) {
		char arrSample[]= {'R','O','S','E'};
		String strSample1=new String(arrSample);
		System.out.print(strSample1 + "\t");
		System.out.println("Length of "+strSample1+ "is:" + strSample1.length());
		byte ascii[]= {65,66,67,68,69,70};
		String strSample2=new String (ascii);
		System.out.print(strSample2+"\t");
		String strSample3=strSample1.concat(strSample2);
		System.out.print(strSample3+"\t");
		String strSample4=strSample1+strSample2;
		System.out.print(strSample4+"\t");
		System.out.println("3rd Char of "+strSample4+"is:"+strSample4.charAt(2));
		char buf[]=new char[3];
		strSample4.getChars(2,5,buf,0);
		System.out.println("Extracted Chars: "+strSample4 +"" + new String(buf));
		String strSample="RockStar";
		System.out.print(strSample.compareTo("ROCKSTAR")+"\t");
		System.out.print(strSample.compareToIgnoreCase("ROCKSTAR")+"\t");
		System.out.print(strSample.equals("ROCKSTAR")+ "\t");
		System.out.print(strSample.equalsIgnoreCase("ROCKSTAR")+"\t");
		System.out.println("Rockstar starts with 'Ro':"+strSample.startsWith("Ro"));
		System.out.println("Rockstar ends with 'star':"+strSample.endsWith("Star"));
		System.out.println("Rockstar Contains 'tar':"+strSample.contains("tar"));
		System.out.println("Index of 't' in Rockstar:"+strSample.indexOf("t"));
		System.out.println("Index of 'Star' in Rockstar: "+strSample.indexOf("Star"));
		System.out.println("All caps-Rockstar:"+strSample.toUpperCase());
		System.out.println("All small-Rockstar: "+strSample.toLowerCase());
		System.out.println("Replace Star with et:"+strSample.replace("Star","et"));
		String dVal="3.456";
		String iVal="6";
		System.out.println("Double value of dVal is:"+Double.valueOf(dVal));
		System.out.println("Integer value if iVal is:"+Integer.valueOf(iVal));
		double a=Double.valueOf(dVal);
		int b=Integer.valueOf(iVal);
		System.out.println(a+b);
		
		
		}
	}

