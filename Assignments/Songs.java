//package Assignments;

public class Songs {
    private String songname;
    private String artistname ;
    private int playcount ;

    public Songs(String songname, String artistname, int playcount ) {
        this.songname = songname;
        this.artistname = artistname;
        this.playcount = playcount;
    }

    public void print() {
        System.out.println("Song name: " + this.songname + "\tArtist Name: " + this.artistname + "\tPlaycount: " + this.playcount);
    }
    public String getsongname()
    {
        return this.songname;
    }
    public String getartistname()
    {
        return this.artistname;
    }
    public int getplaycount()
    {
        return this.playcount;
    }
    

}

