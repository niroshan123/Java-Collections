package ListConcept;




import javafx.scene.layout.Border;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

    public static <E> void main(String[] args) {
        int a[]=new int[5];//Ststic Array -Size is fixed
        a[0] = 15;
        a[1] =20;
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
        System.out.println(ar.size());//size of the array list
        System.out.println(ar.get(1));//to get the value from the index
        System.out.println("Hello");

        //to print all the value from the array list
        //1.for loop
        //2.using iterator
        for (int i=0;i<ar.size();i++){
            System.out.println(ar.get(i));
        }

        //non generic vs generic

        ArrayList<Integer> ar1=new ArrayList<Integer>();//allows only Integer(Calls this as generics in java)
        ar1.add(100);
        ar1.add(200);

        ArrayList<String> ar2=new ArrayList<String>();
        ar2.add("Niroshan Ratnayake");

        ArrayList<E> ar3=new ArrayList<E>();
        System.out.println("===============================================");
        Employee e1=new Employee("Niroshan1",25,"IT");
        Employee e2=new Employee("Niroshan2",26,"ITM");
        Employee e3=new Employee("Niroshan3",27,"IT");

        ArrayList<Employee> emp1 = new ArrayList<Employee>();

        emp1.add(e1);
        emp1.add(e2);
        emp1.add(e3);


        Iterator<Employee> it1=emp1.iterator();

        while(it1.hasNext()) {
           Employee emp= it1.next();
           System.out.println(emp.name);
           System.out.println(emp.age);
           System.out.println(emp.department);


        }
        System.out.println("===============================================");
        //addAll();
        ArrayList<String> new1= new ArrayList<String>();
        new1.add("test1");
        new1.add("test2");

        ArrayList<String> new2= new ArrayList<String>();
        new2.add("test3");
        new2.add("test4");

        new1.addAll(new2);

        for(int j=0;j<new1.size();j++){

            System.out.println(new1.get(j));

        }
        System.out.println("===============================================");
        //removeAll();
        new1.removeAll(new2);
        for(int j=0;j<new1.size();j++){

            System.out.println(new1.get(j));

        }
        System.out.println("===============================================");
        //retainAll(); samana ewa wtrak enwa

        ArrayList<String> new3 =new  ArrayList<String>();
        new3.add("Niroshan");
        new3.add("Ratnayake");

        ArrayList<String> new4 =new  ArrayList<String>();
        new4.add("Jayashantha");
        new4.add("Ratnayake");

        new3.retainAll(new4);

        for(int k=0;k<new3.size();k++){
            System.out.println(new3.get(k));
        }




    }


}
