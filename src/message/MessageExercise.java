package message;

public class MessageExercise extends Message {

	private String exercise = "Dynamiczne generowanie zawartoœci wiadomoœci e-mail. "
			+ "\nMo¿liwoœæ utworzenia wiadomoœci w zale¿noœci od potrzeb, np. dodanie podpisu, "
			+ "\ndodanie za³¹cznika, dodanie treœci z ¿yczeniami, dodanie oficjalnego nag³ówka, itp.\n";
	
	@Override
	public String getMessage() {
		return exercise;
	}

}
