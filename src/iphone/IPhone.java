package iphone;

public class IPhone implements MusicPlayer, CellPhone, WebBrowser {
	public String music;
	
	public IPhone() {// TODO Auto-generated constructor stub
	}
	
	@Override
	public void selectMusic(String music) {
		this.music = music;
	}
	
	@Override
	public void play() {
		System.out.println("Tocando música" + this.music);
	}
	
	@Override
	public void pause() {
		System.out.println("Música pausada.");
	}
	
	@Override
	public void call(String number) {
		System.out.println("Ligando número" + number);
	}

	@Override
	public void answer() {
		System.out.println("Respondendo chamada.");
	}
	
	@Override
	public void callVoiceMail() {
		System.out.println("Chamando correio de voz.");
	}
	
	@Override
	public void addNewTab() {
		System.out.println("Nova aba aberta.");
	}
	
	@Override
	public void refreshPage() {
		System.out.println("Página atualizada.");
	}
	
	@Override
	public void showWebPage(String url) {
		System.out.println("Exibindo pagina: " + url);
	}
}
