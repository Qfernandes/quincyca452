//package Assignments;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("==================================");
        System.out.println("Quincy's Music Lists");
        System.out.println();

        //All the songs in the playlist

        Songs friends = new Songs("Friends","Anne Marie", 22222889);
        //friends.print();

        Songs song2 = new Songs("Don't Start Now","Dua Lipa",6070228 );
        //song2.print();

        Songs song3 = new Songs("Calm Down","Ed Sheeran",291554201 );
        //song3.print();

        Songs song4 = new Songs("Physcho","Anne Marie",517191452 );
        //song4.print();

        Songs song5 = new Songs("Anti-hero","Taylor Swift",957123 );
        //song5.print();

        Songs song6 = new Songs("As it was","Harry Styles",432178954 );
        //song6.print();

        Songs song7 = new Songs("Dandelions","Ruth B",77754632 );
        //song7.print();

        Songs song8 = new Songs("Our Song","Anne Marie",673245624 );
        //song8.print();

        Songs song9 = new Songs("Location","Dave",96549778 );
        //song9.print();

        Songs song10 = new Songs("Danza Kuduro","Don Omar",890432156 );

        //song10.print();
        Songs song11 = new Songs("Beautiful","Ed Sheeran",890500156 );
        //song10.print();

        //song10.print();
        Songs song12 = new Songs("Savage Love","Jason Durelo",890500200 );
        //song10.print();

        //adding the songs
        ArrayList<Songs> songlist = new ArrayList<Songs>();
        songlist.add(friends);
        songlist.add(song2);
        songlist.add(song3);
        songlist.add(song4);
        songlist.add(song5);
        songlist.add(song6);
        songlist.add(song7);
        songlist.add(song8);
        songlist.add(song9);
        songlist.add(song10);
        songlist.add(song11);
        songlist.add(song12);

        //removing the songs
        songlist.remove(song12,song11);

        for (Songs song : songlist)
        {
            song.print();
        }

    }
}
