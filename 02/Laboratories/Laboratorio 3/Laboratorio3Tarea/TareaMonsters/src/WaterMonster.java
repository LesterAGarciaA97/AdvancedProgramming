public class WaterMonster implements Monster {
	private String Name;
	
	public WaterMonster(String Name) {
		this.Name = "Blue";
	}
	
	public String Attack() {
		return	"I am a water monster, and I am attacking. My name is " + this.Name;
	}
}
