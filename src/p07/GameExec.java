package p07;

public class GameExec {

	public static void runGame(Game g) {
		g.start();
		g.playing();
		g.stop();
	}
	public static void main(String[] args) {
		Game Starcraft = new Game();
		Starcraft.name = "스타크래프트";
		Game LeagueOfLegends = new Game();
		LeagueOfLegends.name = "롤";
		
		runGame(Starcraft);
		runGame(LeagueOfLegends);
	}
}
		/*
		Game[] game = new Game[2];
		game[0] = Starcraft;
		game[1] = LeagueOfLegends;
		
		for(int i=0; i<game.length; i++) {
			System.out.println(game[i].name);    
			if(game[i] instanceof Starcraft) {
				Starcraft st = (Starcraft)game[i];
				st.genre = "rts";
				st.map = "python";
				System.out.println("스타크래프트 장른는 " + st.genre + "스타크래프트 맵은" + st.map);
			}else if(game[i] instanceof LeagueOfLegends) {
				LeagueOfLegends le = (LeagueOfLegends)game[i];
				le.characters = "ezreal";
				le.spell = "flash";
				System.out.println("해당 챔피언은" + le.characters + "스펠은 " + le.spell);
			}else {
				System.out.println();
			}
		}
	}
}
		*/