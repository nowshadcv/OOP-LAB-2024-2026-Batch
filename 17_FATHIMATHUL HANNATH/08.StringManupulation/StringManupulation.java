package MODULE_2;

public class StringManupulation {

	public StringManupulation() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		char arrsample[] = {'R','O','S','E'};
		String strsample1 = new String(arrsample);
		System.out.println(strsample1);
		System.out.println("length of" + strsample1+ "is : " + strsample1.length());
		byte ascii[] = {65,66,67,68,69,70};
		String strsample2= new String(ascii);
		System.out.println(strsample2);
		String strsample3= strsample1.concat(strsample2);
		System.out.println(strsample3);
		String strsample4= strsample1 + strsample2;
		System.out.println(strsample4);
		System.out.println("3rd char of "+ strsample4 + "is : " + strsample4.charAt(2));
		char buf[]= new char[3];
		strsample4.getChars(2,5,buf,0);
		System.out.println("Extracted chars: "+ strsample4+" "+new String(buf));
		String strsample = "Rockstar";
		System.out.println(strsample.compareTo("ROCKSTAR"));
		System.out.println(strsample.compareToIgnoreCase("ROCKSTAR"+"\t"));
		System.out.println(strsample.equals("ROCKSTAR"));
		System.out.println(strsample.equalsIgnoreCase("ROCKSTAR"));
		System.out.println("Rockstar starts with 'Ro': "+ strsample.startsWith("Ro"));
		System.out.println("Rockstar starts with 'Star': "+ strsample.endsWith("star"));
		System.out.println("Rockstar starts with 'tar': "+ strsample.contains("tar"));
		System.out.println("Index of 't' in Rockstar: "+ strsample.indexOf("t"));
		System.out.println("Index of 'star' in Rockstar: "+ strsample.indexOf("star"));
		System.out.println("All caps of Rockstar "+ strsample.toUpperCase());
		System.out.println("All small of Rockstar "+ strsample.toLowerCase());
		System.out.println("Replace star with et: "+ strsample.replace("star", "et"));
		
		String dval = "3.456";
		String ival = "6";
		System.out.println("Double value of dval is : "+ Double.valueOf(dval));
		System.out.println("Double value of ival is : "+ Integer.valueOf(ival));
		double a = Double.valueOf(dval);
		int b = Integer.valueOf(ival);
		System.out.println(a+b);
		
	}

}