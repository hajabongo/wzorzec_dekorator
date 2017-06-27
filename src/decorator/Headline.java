package decorator;

import message.Message;

public class Headline extends Decorator {
	
	private Message message;
	private String headline;

	public Headline(Message message, String headline) {
		this.message = message;
		this.headline = headline;
	}
	
	public String getMessage() {
		return this.headline + "\n" + message.getMessage();
	}
}
