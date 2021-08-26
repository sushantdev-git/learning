package oops;

public class This_keyword {
	
	private String mood="dead";
	
	public void set_mood(String mood) {
		this.mood = mood;
		//"this" will refer to object who called this function
		//and mood of that object will be change
		System.out.println("this "+this);
	}
	
	public String get_mood() {
		System.out.println("class "+mood+" this "+this.mood);
		return this.mood;
		//this is refering to local variable of class
	}
}

