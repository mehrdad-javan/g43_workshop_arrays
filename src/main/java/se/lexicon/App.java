package se.lexicon;


import java.lang.reflect.Array;
import java.util.Arrays;

public class App {

  public static void main(String[] args) {
    System.out.println("Array Length: " + NameRepository.getSize());

    String data[] = {"Mehrdad Javan", "Simon Elbrink", "Aso Jonsson"};
    Arrays.sort(data, String.CASE_INSENSITIVE_ORDER);
    NameRepository.setNames(data);
    System.out.println("Array Length: " + NameRepository.getSize());
    System.out.println("Print Array Data: " + Arrays.toString(NameRepository.findAll()));

  }

}
