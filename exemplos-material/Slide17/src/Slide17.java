
public class Slide17 {
	public static void main (String[] args) {
		
		String str = "Isto � uma String do Java"; //
		
		
		String[] palavras = str.split (" "); //
	
		
		int i = str.indexOf("uma"); //
		System.out.println(str.indexOf(str));
		
		if (str.startsWith ("Ol�") || str.endsWith("Mundo!")) {
			
	} //
		
		str = str.trim();//
		
		
		//str = str.replace('a', '@');//
			
			
		str = str.replaceAll ("String", "Cadeia de caracteres");//
		
		
	  }
 }



