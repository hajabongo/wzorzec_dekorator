package decorator;

import message.Message;

public class Attachment extends Decorator {
	
	private Message message;
	private String attachment;
	
	public Attachment(Message message, String attachment) {
		this.message = message;
		this.attachment = attachment;
	}
	
	public String getMessage() {
		return message.getMessage() + this.attachment + "\n";
	}
		
}
