package TestVagrantClasses;



public class TestExecution {

	public static void main(String[] args) {
	    Recentlyplayedsongs store = new Recentlyplayedsongs(3);

	    store.addSong("Abhi", "Song A");
	    store.addSong("Bobby", "Song B");
	    store.addSong("Bobby", "Song C");
	    store.addSong("Bobby", "Song D");
	    store.addSong("Bobby", "Song E");
	    store.addSong("Abhi", "Song H");
	    System.out.println(store.getRecentlyPlayedSongs("Abhi")); // [Song H, Song A]
	    System.out.println(store.getRecentlyPlayedSongs("Bobby"));   // [Song E, Song D, Song C]
	}
}

