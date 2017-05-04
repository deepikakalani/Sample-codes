package iterator;
import java.util.ArrayList;
import java.util.Iterator;

public class Song90s implements SongIterator {

	ArrayList<SongInfo> bestSongs;
	
	public Song90s() {
		// TODO Auto-generated constructor stub
		bestSongs = new ArrayList<SongInfo>();
		
		addSong("I believe");
		addSong("Damn you ");
	}
	
	public void addSong(String songName){
		SongInfo songInfo = new SongInfo(songName);
		bestSongs.add(songInfo);
	}
	
	/*public ArrayList<SongInfo> getSong(){
		return bestSongs;
	}*/

	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return bestSongs.iterator();
	}
	
	

}
