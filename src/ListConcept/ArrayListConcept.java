package ListConcept;





import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

    public static <E> void main(String[] args) {
        //Ststic Array -Size is fixed
        /*int a[]=new int[5];
        a[0] = 15;
        a[1] =20;*/

        //Dynamic Array --Array List;
//          1.can contain duplicate values
//          2.Maintain Insertion order
//          3.Sysnchronized
//          4.allows random access to fetch the elements bcoz it stores the values on the basis of indexs

        ArrayList ar = new ArrayList();//non generic array list
        ar.add(10);
        ar.add(20);
        ar.add(30);
        ar.add("Niroshan");
        System.out.println("size of the array list");
        System.out.println(ar.size());//size of the array list
        System.out.println("get the value from the index");
        System.out.println(ar.get(1));//to get the value from the index


        //to print all the value from the array list
        //1.for loop
        //2.using iterator
        System.out.println("to print all the value from the array list USING FOR LOOP");
        for (int i=0;i<ar.size();i++){
            System.out.println(ar.get(i));
        }

        //non generic vs generic
        System.out.println("ARRAY LIST AS GENERICS To specify the type of the values string or integer");
        ArrayList<Integer> ar1=new ArrayList<Integer>();//allows only Integer(Calls this as generics in java)
        ar1.add(100);
        ar1.add(200);

        ArrayList<String> ar2=new ArrayList<String>();
        ar2.add("Niroshan Ratnayake");

        System.out.println("ARRAY LIST AS GENERICS When the type is not known");

        ArrayList<E> ar3=new ArrayList<E>();
        System.out.println("======================Very Important Making a object and using it in Array List=========================");
        Employee e1=new Employee("Niroshan1",25,"IT");
        Employee e2=new Employee("Niroshan2",26,"ITM");
        Employee e3=new Employee("Niroshan3",27,"IT");

        ArrayList<Employee> emp1 = new ArrayList<Employee>();

        emp1.add(e1);
        emp1.add(e2);
        emp1.add(e3);

        System.out.println("to print all the value from the array list USING Iterator");

        Iterator<Employee> it1=emp1.iterator();

        while(it1.hasNext()) {
           Employee emp= it1.next();
           System.out.println(emp.name);
           System.out.println(emp.age);
           System.out.println(emp.department);


        }
        System.out.println("=====================Array List Operations==========================");
        //addAll();
        System.out.println("addAll()");
        ArrayList<String> new1= new ArrayList<String>();
        new1.add("test1");
        new1.add("test2");

        System.out.println("values of new1 "+new1);

        ArrayList<String> new2= new ArrayList<String>();
        new2.add("test3");
        new2.add("test4");

        System.out.println("values of new2 "+new1);

        System.out.println("Now add new2 in to new1");
        System.out.println("Using for loop");

        new1.addAll(new2);

        for(int j=0;j<new1.size();j++){

            System.out.println(new1.get(j));

        }
        System.out.println("Same thing using Enhanced for loop");
        for(String str:new1){

            System.out.println(str);

        }
        System.out.println("Now values in the new1: " +new1);
        System.out.println("Now values in the new2: " +new2);

        System.out.println("====================removeAll()new1 eka thiyna ewalin new2 ewa ain karnawa===========================");
        //removeAll();
        new1.removeAll(new2);
        for(int j=0;j<new1.size();j++){

            System.out.println(new1.get(j));

        }
        System.out.println("====================retainAll();samana ewa wtrak enwa===========================");
        //retainAll(); samana ewa wtrak enwa

        ArrayList<String> new3 =new  ArrayList<String>();
        new3.add("Niroshan");
        new3.add("Ratnayake");
        System.out.println("values of new3 :"+new3);

        ArrayList<String> new4 =new  ArrayList<String>();
        new4.add("Jayashantha");
        new4.add("Ratnayake");

        System.out.println("values of new4 :"+new4);

        System.out.println("Now get the values which are simmilar in new3 and new4");
        new3.retainAll(new4);

        for(int k=0;k<new3.size();k++){
            System.out.println(new3.get(k));
        }

        /*size of the array list
4
get the value from the index
20
to print all the value from the array list USING FOR LOOP
10
20
30
Niroshan
ARRAY LIST AS GENERICS To specify the type of the values string or integer
ARRAY LIST AS GENERICS When the type is not known
======================Very Important Making a object and using it in Array List=========================
to print all the value from the array list USING Iterator
Niroshan1
25
IT
Niroshan2
26
ITM
Niroshan3
27
IT
=====================Array List Operations==========================
addAll()
values of new1 [test1, test2]
values of new2 [test1, test2]
Now add new2 in to new1
test1
test2
test3
test4
Now values in the new1: [test1, test2, test3, test4]
Now values in the new2: [test3, test4]
====================removeAll()new1 eka thiyna ewalin new2 ewa ain karnawa===========================
test1
test2
====================retainAll();samana ewa wtrak enwa===========================
values of new3 :[Niroshan, Ratnayake]
values of new4 :[Jayashantha, Ratnayake]
Now get the values which are simmilar in new3 and new4
Ratnayake*/




    }


}
