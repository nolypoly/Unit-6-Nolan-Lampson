public class MusicLibrary {

  private Album[] library;

  public MusicLibrary(Album[] library){
    library = new Album[10];
  }

  public boolean add(Album album){
    for (i = 0, i < library.length, i++)
      if (library[i] = null);
      return true;
    else
      return false;
  }

  public boolean remove(Album album){
    for (i = 0, i < library.length, i++)
      library[i] = null
      return System.out.println("Removed track");
    else
      return false;
  }

  public boolean remove(int index){
    if (library[index] != null){
      library[index] = null;
      return true;
      }
    return false;
  }

  public String toString(){
    String result = "";
    for (Album a : library){
      result += a.toString() + "/n";
    }
    return result;
  }

  public void sortByTitle(){
    Album temp;
    int min;
    for( int i = 0; i < library.length - 1; i++){
      min = i;
        for(int scan = i + 1; scan < library.length; scan++){
          if(library[scan].getTitle().compareTo(library[min].getTitle()) < 0) {
            min = scan;
        }
        temp = library[min];
        library[min] = library[i];
        library[i] = temp;
    }
  }










}
