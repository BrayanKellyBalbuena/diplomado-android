import java.io.IOException;
import java.lang.reflect.Method;

class Printer
{
  public <T> void printArray(T[] array){
      for (T value: array){
          System.out.println(value);
      }
  }
}