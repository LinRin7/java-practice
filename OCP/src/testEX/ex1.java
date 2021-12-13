package testEX;



public class ex1 {

		
		public static void doStuff(String s) {
			try{
				if(s==null){
					//System.out.println(s+"=null");
					throw new NullPointerException();	
					
				}
			
			}
			catch(Exception e)
			{
				System.out.println("-doStuff1--");	
				
			} finally{
				System.out.println("-finally-");		
			
			}
			System.out.println("-doStuff2--");	
		}
		public static void main(String[] args) {
			try{
				doStuff(null);
			} catch(NullPointerException npe) {
				System.out.println("-catch-");		
			}
	}
}
