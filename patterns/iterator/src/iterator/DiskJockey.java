package iterator;
import java.util.Iterator;

public class DiskJockey {

	SongIterator iter80s;
	SongIterator iter90s;
	
	public DiskJockey(SongIterator newiter80s, SongIterator newiter90s ){
		iter80s = newiter80s;
		iter90s = newiter90s;
	}

	public void showSongs(){
		Iterator songs80s = iter80s.createIterator();
		Iterator songs90s = iter90s.createIterator();
		System.out.println("songs of 80s");
		printSongInfo(songs80s);
		System.out.println("songs of 90s");
		printSongInfo(songs90s);
	}
	
	public void printSongInfo(Iterator iterator){
		
		while(iterator.hasNext()){
			
			SongInfo songInfo = (SongInfo) iterator.next();
			
			System.out.println(songInfo.getSongName());
		}
	}
}
