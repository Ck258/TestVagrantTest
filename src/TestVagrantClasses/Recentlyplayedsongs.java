package TestVagrantClasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Recentlyplayedsongs {
	    
	    private int capacity;
	    private Map<String, LinkedList<String>> songsByUser;

	    public Recentlyplayedsongs(int capacity) {
	        this.capacity = capacity;
	        this.songsByUser = new HashMap<>();
	    }

	    public void addSong(String user, String song) {
	        LinkedList<String> songs = songsByUser.get(user);
	        if (songs == null) {
	            songs = new LinkedList<>();
	            songsByUser.put(user, songs);
	        }
	        songs.addFirst(song);
	        if (songs.size() > capacity) {
	            songs.removeLast();
	        }
	    }

	    public List<String> getRecentlyPlayedSongs(String user) {
	        LinkedList<String> songs = songsByUser.get(user);
	        if (songs == null) {
	            return Collections.emptyList();
	        }
	        return new ArrayList<>(songs);
	    }
	}
