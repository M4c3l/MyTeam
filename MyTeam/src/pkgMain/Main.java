package pkgMain;

import pkgData.Player;

public class Main {

	public static void main(String[] args) {
		Player player = new Player(2, "Dragovic", "Defense");
		System.out.println("== " + player);
		
		Player player = new Player(4, "Hinteregger", "Defense");
		System.out.println("== " + player);
	}

}
