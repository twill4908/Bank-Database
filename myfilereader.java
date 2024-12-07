import java.io.IOException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class MyFileReader {
  BufferedReader in;
  String fileName;
  public MyFileReader(String fileName) {
    try {
      in = new BufferedReader(new FileReader(fileName));
      this.fileName = fileName;
    } catch (IOException e) {
      System.out.println("Failed to open file " + fileName);
    }    
  }
  String tempLine;
  public String readLine() {

    //using recursion skips if line has a *
    //skips if line is empty
    //stops if line is null
    int counter = 0;
    String[] words = new String[100];
      try {
      tempLine = in.readLine();
      while(tempLine != null){
        if (tempLine.contains("*")){
          return this.readLine();
        }
        else{
          return this.tempLine;
        }
      }

    } catch (IOException e) {
      System.out.println("Must first initiate the file reader");
    }
      return tempLine;
  }

  public void close() {
    try {
      in.close(); //Properlly close the file and release control
    } catch (IOException e) {
      System.out.println("Must first initiate the file reader");
    }
  }
}
