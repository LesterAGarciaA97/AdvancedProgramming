public class StoneMonster implements Monster {
	private String Name;
	
	public StoneMonster(String Name) {
		this.Name = "Rocky";
	}
	
	public String Attack() {
		return	"I am a stone monster, and I am attacking. My name is " + this.Name;
	}
}
