package ListConcept;

import java.util.LinkedList;

public class LinkedListConcept {

    public static void main(String[] args) {
        LinkedList<String> ll=new LinkedList<String>();
        //add
        ll.add("Player1");
        ll.add("Player2");
        ll.add("Player3");
        ll.add("Player4");

        //print
        System.out.println("Content of LinkedList "+ll);

        //addFirst
        ll.addFirst("PlayerFirst_Added");

        //addLast
        ll.addLast("PlayerLast_Added");

        //print
        System.out.println("Content of LinkedList "+ll);

        //getThe value
        System.out.println(ll.get(0));
        System.out.println(ll.get(1));

        //set The value to a peticular location
        ll.set(0,"Newly Added");

        System.out.println("Content of LinkedList "+ll);

        //remove an element
        ll.removeFirst();
        ll.remove(0);

        System.out.println("Content of LinkedList "+ll);

    }


}
