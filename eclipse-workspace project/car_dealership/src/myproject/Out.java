package myproject;

public class Out {

	public static void main(String[] args) {

		
	String a = "FRANKLINEMMANUEL";	
	System.out.println(a.length()*2);
	
	String b = "FRANKLINEMMANUEL";
	String bu = b.substring(8);
	System.out.println(bu);
	
	String c = "FRANKLINEMMANUEL";
	System.out.println(c.charAt(8));
	
	String d = "her is maria primary in poland and she is in primary five";
	int su = d.indexOf("primary");
	System.out.println(su);
	
	for(int i = 1; i <= 2; i++) {
		System.out.println("i : " + i);
		
		int count = 0;
			for(int dxt = 0; dxt < 2; dxt++) {
				System.out.println(dxt);
				for(int j = 0; j < 2; j++) {
					System.out.println("the value of dxt was " + dxt + ".."
							+ "" + j);
				
				
					System.out.println("count:" + count );
				}
			}
	}
	
		
	}	
		
	}

