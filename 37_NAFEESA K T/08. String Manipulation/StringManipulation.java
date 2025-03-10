package MODULE_1;

public class StringManipulation {

	
	public static void main(String[] args)
	{
		char arrsample[] = {'R','O','S','E'};
		String strsample1 = new String(arrsample);
		System.out.println(strsample1 + "\t");
		System.out.println("Length of" + strsample1 + "is : " + strsample1.length());
		byte ascii[] = {65,66,67,68,69,70};
		String strsample2 = new String(ascii);
		System.out.println(strsample2 +"\t");
		String strsample3 = strsample1.concat(strsample2);
		System.out.println(strsample3 + "\t");
		String strsample4 = strsample1 + strsample2;
		System.out.println(strsample4 +"\t");
		System.out.println("3rd char of " + strsample4 + "is" + strsample4.charAt(2));
		char buf[] = new char[3];
		strsample4.getChars(2,5,buf,0);
		System.out.println("Extracted chars:" +strsample4 +""+new String(buf));
		
		String strsample = "ROCKSTAR";
		
		System.out.print(strsample.compareTo("ROCKSTAR")+"\t");
		System.out.print(strsample.compareToIgnoreCase("ROCKSTAR")+"\t");
		System.out.print(strsample.equals("ROCKSTAR")+"\t");
		System.out.print(strsample.equalsIgnoreCase("ROCKSTAR")+"\t");
		
		
		System.out.println("Rockstar starts with 'Ro' : " + strsample.startsWith("Ro"));
		System.out.println("Rockstar ends with 'star' : " + strsample.endsWith("star"));
		System.out.println("Rockstar contain 'tar' : " + strsample.contains("tar"));
		System.out.println("Index of 't' in Rockstar : " + strsample.indexOf("t"));
		System.out.println("Index of 'star' in rockstar : " + strsample.indexOf("star"));
		System.out.println("All caps-Rockstar : " + strsample.toUpperCase());
		System.out.println("All small-Rockstar : " + strsample.toLowerCase());
		System.out.println("Replace 'star' with 'et' : " + strsample.replace("star", "et"));
		
		String dval = "3.456";
		String ival = "6";
		
		System.out.println("Double value of dval is : " + Double.valueOf(dval));
		System.out.println("Integer value of ival is : " + Integer.valueOf(ival));
		
		double a = Double.valueOf(dval);
		int b = Integer.valueOf(ival);
		
		System.out.println(a+b);
		
		
		

		
				
		}
	

	

}
