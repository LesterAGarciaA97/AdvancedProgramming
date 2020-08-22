public class FireMonster implements Monster {
	private String Name;
	
	public FireMonster(String Name) {
		this.Name = "Red";
	}
	
	public String Attack() {
		return	"I am a fire monster, and I am attacking. My name is " + this.Name;
	}
}
