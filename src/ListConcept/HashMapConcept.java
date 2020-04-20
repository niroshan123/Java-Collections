package ListConcept;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {
    public static void main(String[] args) {
        //HashMap is a class implements Map Interface
        //extends AbstractMap
        //it contains only unique elements
        //stores the values as -key and value pair
        //it may have one null key and multiple null values
        //it maintains no order
        //Hash map is non-synchronized(Can handddle multiple threads at a time) Used in fast performace programe--not thread safe
        //disadvantage of HashMap=>fail fast condition
        //concurrent modification exception=>fail fast condition(When one thread is adding or removing the value and at the same
        // -time T2 and T3 also trying to accessbut  that perticular value is gone from the object ,immidieatly it will give you
        // -concurrent modification exception
        //Sysnchronization=>one by one, if T1 is attacking this object, it means if once the T1 is not realeased,T2 and T3 cannont be
        //accessd
        //non synchronization=> All the threads can access from that perticular object
        HashMap<Integer,String> hm= new HashMap<Integer, String>();
        hm.put(1,"Niroshan");
        hm.put(2,"Brayan");
        hm.put(3,"Ratnayake");
        hm.put(4,"Jayashantha");
        hm.put(5,"Jayaweera");

        System.out.println("Get the Value with providing key");
        System.out.println(hm.get(1));
        System.out.println("Get the Value with providing key");
        System.out.println(hm.get(4));

        //print all in the hashmap
        System.out.println("print all in the hashmap");
        for(Map.Entry m :hm.entrySet()){
            System.out.println(m.getKey() + " "+ m.getValue());
        }
        System.out.println(hm);

        //remove from hashmap
        System.out.println("remove from hashmap");
        hm.remove(4);
        System.out.println(hm);

        System.out.println("Creating employee to hashmap");
        HashMap<Integer,Employee> emp1 = new HashMap<Integer,Employee>();

        Employee e4=new Employee("niro1",25,"admin");
        Employee e5=new Employee("niro2",26,"QA");
        Employee e6=new Employee("niro3",27,"SE");

        emp1.put(1,e4);
        emp1.put(2,e5);
        emp1.put(3,e6);

        System.out.println("All the Employee detaails are prined ");
        for(Map.Entry<Integer,Employee> m1 :emp1.entrySet()){
            int key= m1.getKey();
            Employee e=m1.getValue();
            System.out.println("==>Employee " +key + " Infor");
            System.out.println(e.name+ " "+e.age  +" "+e.department  );

        }
        /*
1 Niroshan
2 Brayan
3 Ratnayake
4 Jayashantha
5 Jayaweera
{1=Niroshan, 2=Brayan, 3=Ratnayake, 4=Jayashantha, 5=Jayaweera}
remove from hashmap
{1=Niroshan, 2=Brayan, 3=Ratnayake, 5=Jayaweera}
Creating employee to hashmap
All the Employee detaails are prined
==>Employee 1 Infor
niro1 25 admin
==>Employee 2 Infor
niro2 26 QA
==>Employee 3 Infor
niro3 27 SE
        * */
    }

}
