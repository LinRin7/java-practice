package functionEX;

interface LengthValidator{
	public boolean checkLength(String str);
}

public class ex1 {

	public static void main(String[] args) {
		
		boolean res=new LengthValidator(){
			public boolean checkLength(String str){
				return str.length()>5 && str.length()<10;
			}
		}.checkLength("Hellou");		
		System.out.println(res);
		
		boolean res2=get().checkLength("Hel");
		System.out.println(res2);

	}

	static LengthValidator get()
	{
		return new LengthValidator() {

			@Override
			public boolean checkLength(String str) {
				// TODO Auto-generated method stub
				return str.length()>5 && str.length()<10;
			}};
	}
}
