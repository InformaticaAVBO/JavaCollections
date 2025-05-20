import java.io.*;
import java.util.Scanner;

public class SortTextFile {

  public SortTextFile(){

  }
  
  public void leggiFile() {
    ListaOrdinata<String> l = new ListaOrdinata<>();

    try {
      File myObj = new File("./src/input.txt");
      Scanner scn = new Scanner(myObj);
      while (scn.hasNextLine()) {
        String data = scn.nextLine();
        l.add(data);
        ;
      }
      scn.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    System.out.println(l);
    try {
      FileWriter myWriter = new FileWriter("./src/output.txt");
      myWriter.write(l.toString());
      myWriter.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
