package se.lexicon;

import java.util.Arrays;

public class NameRepository {

  private static String[] names = new String[0];



  public static int getSize() {
    return names.length;
  }

  public static void setNames(String[] names) {
    NameRepository.names = names;
  }

  public static void clear() {
    names = new String[0];
  }

  public static String[] findAll() {
    return Arrays.copyOf(names, names.length);
  }

  public static String find(final String fullName) {
    // step1: traverse on array
    for (String element : names) {
      // step2: write a condition to compare element of array with the method param(fullName)
      if (element.equalsIgnoreCase(fullName)) {
        return element;
      }
    }
    return null;
  }

  public static boolean add(final String fullName) {
    // step1: find by full name
    // step2: check if data exist return false, else
    // step3: make a copy of array with a new element
    // step4: add the method parameter to the last index of the copied array
    // step5: replace the copied array with current names array
    // step6: return true
    String result = find(fullName);
    if (result != null) {
      return false;
    }

    names = addToArray(names, fullName);
    return true;
  }

  private static  String[] addToArray(String[] source, String newElement){
    String[] newArray = Arrays.copyOf(source, source.length + 1);
    newArray[newArray.length - 1] = newElement;
    return newArray;
  }




}
