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
    System.out.println("Find By fullName: " + NameRepository.find("mehrdad javan"));
    boolean result = NameRepository.add("Macrus Gugmonsson");
    System.out.println(result);
    System.out.println("Print Array Data: " + Arrays.toString(NameRepository.findAll()));


    boolean result2 = NameRepository.add("Mehrdad Javan");
    if (result2){
      System.out.println("Print Array Data: " + Arrays.toString(NameRepository.findAll()));
    } else {
      System.out.println("Data is duplicate.");
    }

    NameRepository.add("Test Testsoon1");
    NameRepository.add("Test Testsson2");
    System.out.println("Print Array Data: " + Arrays.toString(NameRepository.findAll()));

    System.out.println(Arrays.toString(NameRepository.findByFirstName("test")));

  }

}
