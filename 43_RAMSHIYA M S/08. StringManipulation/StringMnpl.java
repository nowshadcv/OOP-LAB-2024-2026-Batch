package MODULE1;

public class StringMnpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arrsample[]= {'R','O','S','E'};
		String strsample1=new String(arrsample);
		System.out.println(strsample1+"\t");
		System.out.println("length of"+strsample1+"is:"+strsample1.length());
		byte ascii[]= {65,66,67,68,69,70};
		String strsample2=new String(ascii);
		System.out.println(strsample2+"\t");
		String strsample3=strsample1.concat(strsample2);
		System.out.println(strsample3+"\t");
		String strsample4=strsample1+strsample2;
		System.out.println(strsample4+"\t");
		System.out.println("3rd char of"+strsample4+"is:"+strsample4.charAt(2));
		char buf[]=new char[3];
		strsample4.getChars(2,5, buf, 0);	
		System.out.println("Extracted chars:"+strsample4+"is:"+strsample4.charAt(2));
		String strsample="RockStar";
		System.out.println(strsample.compareTo("ROCKSTAR")+"\t");
		System.out.println(strsample.compareToIgnoreCase("ROCKSTAR")+"\t");
		System.out.println(strsample.equals("ROCKSTAR")+"\t");
		System.out.println(strsample.equalsIgnoreCase("ROCKSTAR")+"\t");
		System.out.println("RockStar start with 'RO'"+strsample.startsWith("Ro"));
		System.out.println("RockStar start with 'star'"+strsample.endsWith("Star"));
		System.out.println("RockStar contain 'tar':"+strsample.contains("tar"));
		System.out.println("index of 't' in rockstar:"+strsample.indexOf("t"));
		System.out.println("index of 'star' in rockstar"+strsample.indexOf("star"));
		System.out.println("all caps-rockstar"+ strsample.toUpperCase());
		System.out.println("all samll-rockstar:"+strsample.toLowerCase());
		System.out.println("Replace 'star' with 'et'"+strsample.replace("Star","et"));
		String dVal="3.456";
		String iVal="6";
		System.out.println("Double value of dval is"+Double.valueOf(dVal));
		System.out.println("Integer value of iVal is"+Integer.valueOf(iVal));
		

		

		
		
		

	}

}
