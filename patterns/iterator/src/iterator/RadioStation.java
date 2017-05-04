package iterator;

public class RadioStation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Song80s song80s = new Song80s();
		Song90s song90s = new Song90s();
		
		DiskJockey dj = new DiskJockey(song80s, song90s);
		dj.showSongs();
	}

}
