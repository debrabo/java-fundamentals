package nl.debrabo.java.fundamentals.generics.ch06_raw_types_and_compatibility.c_implications_of_erasure;

import java.util.List;

public class Overloading
{

  public void print(String param)
  {

  }

  public void print(Integer param)
  {

  }

  public void print(List<String> param)
  {

  }

    /*
    public void print(List<Integer> param)
    {

    }
    */

}
