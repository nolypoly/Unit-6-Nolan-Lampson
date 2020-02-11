public class Album {
  private String title;
  private String artist;
  private int numTracks;
  private double playTime;

  public Album (String title, String artist, int tracks, double time){
    this.title = title;
    this.artist = artist;
    numTracks = tracks;
    playTime = time;
  }

  public String toString(){
    String result = "";
    result += title + "by" + artist + "|" + numTracks + "tracks";
    result += "Time:" + playTime + "min";
    return result;
  }

  public int findTitle(String title){
    for (int i = 0; i < library.length; i++){
      if (library[i].getTitle() == title) {
        return i;
      }
        return -1;
    }
  }

  public int findArtist (String artist){

  }

  public Album getAlbum(int index){
    if (index >= 0 && index < library.length)
      return library[index];
    else
      System.out.println("Index out of bounds");
      return null;
  }
}
