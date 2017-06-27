package decorator;

import message.Message;

/*
 * Klasa dekoruje message podpisem
 */
public class Signature extends Decorator {

	private Message message;
	private String signature;
	
	public Signature(Message message, String signature) {
		this.message = message;
		this.signature = signature;
	}

	@Override
	public String getMessage() {
		return message.getMessage() + this.signature + "\n";
	}
}
