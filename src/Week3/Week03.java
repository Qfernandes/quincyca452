package Week3;

import java.util.ArrayList;
public class Week03 
{
    public static final String CONSOLE_CLEAR = "\033[H\033[2J";
    public static void main(String[] args)
    {
        System.out.println(CONSOLE_CLEAR);

        System.out.println("==================================");
        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println(" Week 3 Classes, Objects, Constructors ");
        System.out.println();
        System.out.println(" by Nicholas Day and Derek Peacock");
        System.out.println();

        Student nick = new Student(22212789, " " + "Nick");
        //nick.print();

        Student jerry = new Student(22222789, " " + "Jerry");
        //jerry.print();

        Student sarah = new Student(22222889, " " + "Sarah");
        //sarah.print();

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(nick);
        students.add(jerry);
        students.add(sarah);

        for (Student student : students)
        {
            student.print();
        }


    }     
    
}
