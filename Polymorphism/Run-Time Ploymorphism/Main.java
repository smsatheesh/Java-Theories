public class Main
{

	public static void main( String[] args ) {
	
		Media mediaObjForInstagram = new Instagram();
		System.out.print( "Instagram : " );
		mediaObjForInstagram.func();
		
		Media mediaObjForFacebook = new Facebook();
		System.out.print( "Facebook  : " );
		mediaObjForFacebook.func();
		
		Media mediaObjForWhatsApp = new WhatsApp();
		System.out.print( "WhatsApp  : " );
		mediaObjForWhatsApp.func();
	}
}