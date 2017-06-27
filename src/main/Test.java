package main;

import decorator.Attachment;
import decorator.Headline;
import decorator.Signature;
import message.Message;
import message.MessageExercise;

public class Test {

	public static void main(String args[]) {
		
		Message message = new MessageExercise();
		System.out.println(message.getMessage());
		
		message = new Signature(message, "Daniel Rejsz");
		System.out.println(message.getMessage());
		
		Message message2 = new MessageExercise();
		message2 = new Signature(new Attachment(message2, "-Za³¹cznik-"), "Daniel Rejsz");
		System.out.println(message2.getMessage());
		
		Message message3 = new MessageExercise();
		message3 = new Headline(new Attachment(new Signature(message3, "Daniel Rejsz"), "-Za³¹cznik-"), "Zadanie 1.");
		System.out.println(message3.getMessage());
		
	}
}
