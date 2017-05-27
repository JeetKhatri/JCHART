
public class Date {

	public static void main(String[] args) {
		java.util.Date date=new java.util.Date();
		
		System.out.println(date.getMonth()+1+" / "+date.getDate()+" / "+(date.getYear()+1900));
	}
	
}
