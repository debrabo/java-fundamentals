package nl.debrabo.java.fundamentals.generics.ch04_generics_on_methods;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person>
{
  @Override
  public int compare(Person left, Person right)
  {
    return Integer.compare(left.getAge(), right.getAge());
  }
}
