package message;

public class MessageExercise extends Message {

	private String exercise = "Dynamiczne generowanie zawarto�ci wiadomo�ci e-mail. "
			+ "\nMo�liwo�� utworzenia wiadomo�ci w zale�no�ci od potrzeb, np. dodanie podpisu, "
			+ "\ndodanie za��cznika, dodanie tre�ci z �yczeniami, dodanie oficjalnego nag��wka, itp.\n";
	
	@Override
	public String getMessage() {
		return exercise;
	}

}
