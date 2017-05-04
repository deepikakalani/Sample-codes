package iterator;

import java.util.Arrays;
import java.util.Iterator;

public class Song80s implements SongIterator {

	SongInfo[] bestSongs;
	int value = 0;
	
	public Song80s() {
		// TODO Auto-generated constructor stub
		bestSongs = new SongInfo[2];
		
		addSong("wohoooo");
		addSong("Na na na ...");
	}
	
	public void addSong(String songName){
		SongInfo songInfo = new SongInfo(songName);
		bestSongs[value] =songInfo;
		value ++;
	}
	/*
	public SongInfo[] getSong(){
		return bestSongs;
	}
	*/
	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return Arrays.asList(bestSongs).iterator();
	}
	
}
