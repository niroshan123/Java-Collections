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
        ll.removeLast();
        ll.remove(2);

        System.out.println("Content of LinkedList "+ll);

        //how to print all the values of linkedlist how to iterate
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


    }


}
