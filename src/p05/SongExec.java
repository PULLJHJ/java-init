package p05;

public class SongExec {

	public static void main(String[] args) {
		
		Song[] songs = new Song[5];
		songs[0] = new Song();
		songs[0].name = "바람기억";
		songs[0].singer = "나얼";
		songs[0].rank = 1;
		
		songs[1] = new Song();
		songs[1].name = "어디에도";
		songs[1].singer = "엠씨더맥스";
		songs[1].rank = 2;
		
		songs[2] = new Song();
		songs[2].name = "if you";
		songs[2].singer = "빅뱅";
		songs[2].rank = 3;
		
		songs[3] = new Song();
		songs[3].name = "촛불하나";
		songs[3].singer = "god";
		songs[3].rank = 4;
		
		songs[4] = new Song();
		songs[4].name = "아버지";
		songs[4].singer = "인순이";
		songs[4].rank = 5;
		
		Song fSong = songs[0];
		Song lSong = songs[0];
		
		for (int i=1; i<songs.length; i++) {
			if(fSong.rank > songs[i].rank) {
				fSong = songs[i];
			}
			if(lSong.rank < songs[i].rank) {
				lSong = songs[i];
			}
		}
		
		int count = 0;
		int maxRank = songs[0].rank;
		int count1 = 0;
		int minRank = songs[0].rank;
		
		for(int i=1; i<songs.length; i++) {
			if(minRank>songs[i].rank) {
				minRank = songs[i].rank;
				count1 = i;
			}
			if(maxRank<songs[i].rank) {
				maxRank = songs[i].rank;
				count = i;
			}
		}
		System.out.println("꼴등 " + songs[count].singer + songs[count].name);
		System.out.println("일등 " + songs[count1].singer + songs[count1].name);
	}
}
	
