package ListConcept;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashTableConcept {
    public static void main(String[] args) {

        //It is simmilar to hashmap but its is synchrnonized
        //Stores the values on the basis of key and value
        //key--> Object -- HashCode ---> value
        //HashCode=>Java Object Number=>32 bit sign Integer Number
        //Test t1=new Test(); t1 will give a unique number by java is called HashCode
        //Synchronized => Thread Safe one thread at a time one thread after the other

        Hashtable<Integer,String> ht1=new Hashtable<Integer,String>();
        ht1.put(1,"University of Moratuwa");
        ht1.put(2,"University of Colombo");
        ht1.put(3,"University of Peradeniya");
        ht1.put(4,"University of Jaffna");

        //create a clone copy/shallow copy
        Hashtable<Integer,String> ht2=new Hashtable<Integer, String>();

        ht2=(Hashtable)ht1.clone();
        System.out.println("**********Print Values After Cloning from ht1**********");
        System.out.println(" Value from Ht1 "+ht1);
        System.out.println(" Value from Ht2 "+ht2);

        System.out.println("**********Print Values After ht1 clear**********");
        ht1.clear();

        System.out.println(" Value from Ht1 "+ht1);
        System.out.println(" Value from Ht2 "+ht2);

        //contains value
        System.out.println("**********Contains Check**********");
        Hashtable ht3=new Hashtable();
        ht3.put("A","Niroshan1");
        ht3.put("B","Niroshan2");
        ht3.put("C","Niroshan3");
        ht3.put("D","Niroshan4");

        if(ht3.containsValue("Niroshan5")){
            System.out.println(" Yeah You have him");
        }
        else{
            System.out.println(" Sorry You dont have him");

        }

        //Print all the value from hashtable using --enumerator -- elements

        Enumeration enum1= ht3.elements();
        System.out.println("**********Print Values**********");

        while(enum1.hasMoreElements()){
            System.out.println(enum1.nextElement());
        }

        System.out.println("**********Get all the values using entry set**********");

        Set s=ht3.entrySet();
        System.out.println(s);

        System.out.println("**********Usage of Equals method//chack both the hash tables are equal or not**********");

        Hashtable ht4=new Hashtable();
        ht4.put("A","Niroshan1");
        ht4.put("B","Niroshan2");
        ht4.put("C","Niroshan3");
        ht4.put("D","Niroshan4");
        if(ht3.equals(ht4)){
            System.out.println("ht3 and ht4 Both are equal");
        }
            else{
            System.out.println("ht3 and ht4 Both are  Not equal");
            }

        System.out.println(ht4.get("A"));
        System.out.println("**********Get the hash code of hashtable**********");
        System.out.println("The hashcode of ht4 : " +ht4.hashCode());

        System.out.println("**********HashTable prints only Unique values**********");

        //Hashtable contain only unique values duplicates are ignored
        Hashtable ht5=new Hashtable();
        ht5.put(1,"Srilanka");
        ht5.put(1,"Srilanka");
        ht5.put(3,"India");
        ht5.put(2,"Newzeland");
        ht5.put(4,"Australia");
        ht5.put(5,"SouthAfrica");


        System.out.println(ht5);

        System.out.println("No null key or null value is allowd but in hash map its allowed");



    }
        }

        /*
        * **********Print Values After Cloning from ht1**********
 Value from Ht1 {4=University of Jaffna, 3=University of Peradeniya, 2=University of Colombo, 1=University of Moratuwa}
 Value from Ht2 {4=University of Jaffna, 3=University of Peradeniya, 2=University of Colombo, 1=University of Moratuwa}
**********Print Values After ht1 clear**********
 Value from Ht1 {}
 Value from Ht2 {4=University of Jaffna, 3=University of Peradeniya, 2=University of Colombo, 1=University of Moratuwa}
**********Contains Check**********
 Sorry You dont have him
**********Print Values**********
Niroshan1
Niroshan4
Niroshan3
Niroshan2
**********Get all the values using entry set**********
[A=Niroshan1, D=Niroshan4, C=Niroshan3, B=Niroshan2]
**********Usage of Equals method//chack both the hash tables are equal or not**********
ht3 and ht4 Both are equal
Niroshan1
**********Get the hash code of hashtable**********
The hashcode of ht4 : 1789616744
**********HashTable prints only Unique values**********
{5=SouthAfrica, 4=Australia, 3=India, 2=Newzeland, 1=Srilanka}
No null key or null value is allowd but in hash map its allowed
        *
        * */










