//package Assignments;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("==================================");
        System.out.println("Quincy's Music Lists");
        System.out.println();

        Songs friends = new Songs("Friends","Anne Marie", 22222889);
        //friends.print();

        ArrayList<Songs> songlist = new ArrayList<Songs>();
        songlist.add(friends);

        for (Songs song : songlist)
        {
            song.print();
        }
    }
}
