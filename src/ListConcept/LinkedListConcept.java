package ListConcept;

import java.util.Iterator;
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
        System.out.println("*************Print the LinkedList***************");
        System.out.println("Content of LinkedList "+ll);

        //addFirst
        System.out.println("*************addFirst to the LinkedList***************");

        ll.addFirst("PlayerFirst_Added");

        //addLast
        System.out.println("*************addLast to the LinkedList***************");

        ll.addLast("PlayerLast_Added");

        //print

        System.out.println("*************Print the LinkedList***************");

        System.out.println("Content of LinkedList "+ll);

        //getThe value
        System.out.println("*************Get the value from specific node in the LinkedList***************");

        System.out.println(ll.get(0));
        System.out.println(ll.get(1));

        //set The value to a peticular location
        System.out.println("*************set The value to a peticular node/location***************");

        ll.set(0,"Newly Added");

        System.out.println("*************Print the LinkedList***************");

        System.out.println("Content of LinkedList "+ll);

        //remove an element

        System.out.println("*************remove an element from the LinkedList***************");

        ll.removeFirst();
        ll.removeLast();
        ll.remove(2);

        System.out.println("*************Print the LinkedList***************");

        System.out.println("Content of LinkedList "+ll);

        //how to print all the values of linkedlist how to iterate
        System.out.println("*************Print all the values in LinkedList as one***************");

        //forloop
        System.out.println("***Using Simple For loop***");
        for(int i=0;i<ll.size();i++){
            System.out.println(ll.get(i));
        }
        System.out.println("***Using Simple For Each loop***");
        //advanced for loop
        for(String str:ll){
            System.out.println(str);
        }


        //iterator
        System.out.println("***Using Iterartor***");

        Iterator<String> it1= ll.iterator();
        while(it1.hasNext()){
            String x=it1.next();
            System.out.println(x);

        }
        ////while loop-----
        System.out.println("***Using While Loop***");
        int num=0;
        while(ll.size()>num){
            System.out.println(ll.get(num));
            num++;
        }

/*
*************Print the LinkedList***************
Content of LinkedList [Player1, Player2, Player3, Player4]
*************addFirst to the LinkedList***************
*************addLast to the LinkedList***************
*************Print the LinkedList***************
Content of LinkedList [PlayerFirst_Added, Player1, Player2, Player3, Player4, PlayerLast_Added]
*************Get the value from specific node in the LinkedList***************
PlayerFirst_Added
Player1
*************set The value to a peticular node/location***************
*************Print the LinkedList***************
Content of LinkedList [Newly Added, Player1, Player2, Player3, Player4, PlayerLast_Added]
*************remove an element from the LinkedList***************
*************Print the LinkedList***************
Content of LinkedList [Player1, Player2, Player4]
*************Print all the values in LinkedList as one***************
***Using Simple For loop***
Player1
Player2
Player4
***Using Simple For Each loop***
Player1
Player2
Player4
***Using Iterartor***
Player1
Player2
Player4
***Using While Loop***
Player1
Player2
Player4
*/
    }


}
