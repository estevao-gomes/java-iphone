package iphone;

public class Main {
	public static void main(String[] args) {
		IPhone iphone = new IPhone();
		
		System.out.println("Testando Iphone:");
		iphone.selectMusic("Let It Go");
		iphone.play();
		iphone.pause();
		iphone.answer();
		iphone.call("(22)99298-8821");
		iphone.callVoiceMail();
		iphone.addNewTab();
		iphone.showWebPage("www.apple.com");
		iphone.refreshPage();
		;
	}
}
