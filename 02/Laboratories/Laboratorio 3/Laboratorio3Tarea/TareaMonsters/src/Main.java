public class Main {
	public static void main (String[] args) {
		Monster F, W, S;
		F = new FireMonster("Red");
		System.out.println(F.Attack());
		W = new WaterMonster("Blue");
		System.out.println(W.Attack());
		S = new StoneMonster("Rocky");
		System.out.println(S.Attack());
	}
}
