package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {
    public static void main(String[] args) {
        ArrayList<String> tvSeries = new ArrayList<>();
        tvSeries.add("Game of Thrones");
        tvSeries.add("Breaking Bad");
        tvSeries.add("Two and Half Men");
        tvSeries.add("The Walking Dead");
        tvSeries.add("Prison Break");
        tvSeries.add("The Ship");
        tvSeries.add("The Sea");

        //Ways to Itearaions
        //1.Using java8 with for each loop and Labda expressions
        System.out.println("*****************1)Using java8 with for each loop and Labda expressions*********************");

        tvSeries.forEach(shows->{
            System.out.println(shows);
        });

        System.out.println("*****************2)Using Iterator*********************");
        //2.Iterator

        Iterator<String> tvShows=tvSeries.iterator();
        while(tvShows.hasNext()){
            System.out.println(tvShows.next());
        }

        System.out.println("*****************3)Using Iterator and Java 8 Lamba and forEachRemaining() method*********************");
        //Using Iterator and Java 8 forEachRemaining() method

        tvShows=tvSeries.iterator();
        tvShows.forEachRemaining(x->{
            System.out.println(x);

        });

        System.out.println("*****************4)Using Simple for each loop*********************");

        for (String str1:tvSeries) {
            System.out.println(str1);

        }

        System.out.println("*****************5)Using  for loop with index/order*********************");
        for (int i=0;i<tvSeries.size();i++){
            System.out.println(tvSeries.get(i));
        }

        System.out.println("*****************6)Using List Iterator to traverse in both the directions*********************");

        ListIterator<String> tvSeriesListIterator=tvSeries.listIterator(tvSeries.size());
        while(tvSeriesListIterator.hasPrevious()){
            System.out.println(tvSeriesListIterator.previous());
        }




/******************1)Using java8 with for each loop and Labda expressions*********************
 Game of Thrones
 Breaking Bad
 Two and Half Men
 The Walking Dead
 Prison Break
 The Ship
 The Sea
 *****************2)Using Iterator*********************
 Game of Thrones
 Breaking Bad
 Two and Half Men
 The Walking Dead
 Prison Break
 The Ship
 The Sea
 *****************3)Using Iterator and Java 8 Lamba and forEachRemaining() method*********************
 Game of Thrones
 Breaking Bad
 Two and Half Men
 The Walking Dead
 Prison Break
 The Ship
 The Sea
 *****************4)Using Simple for each loop*********************
 Game of Thrones
 Breaking Bad
 Two and Half Men
 The Walking Dead
 Prison Break
 The Ship
 The Sea
 *****************5)Using  for loop with index/order*********************
 Game of Thrones
 Breaking Bad
 Two and Half Men
 The Walking Dead
 Prison Break
 The Ship
 The Sea
 *****************6)Using List Iterator to traverse in both the directions*********************
 The Sea
 The Ship
 Prison Break
 The Walking Dead
 Two and Half Men
 Breaking Bad
 Game of Thrones

 */






    }
}
