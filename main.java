import java.util.*;
import java.io.*;

public class Main{

  static BankDataBase db = new BankDataBase();                  //creates an instance of the database

  static MyFileReader input = new MyFileReader("input.txt");    //creates an instance of the file reader
  static MyFileWriter log = new MyFileWriter("log.txt");
  
  static MyFileWriter output = new MyFileWriter("output.txt");
  

  public static void main (String[] args) {
    
        try{
          String line = input.readLine();
          while(line != null){
            String[] tokens = combineString(line.split(" "));
            operations(tokens);
            line = input.readLine();
          }

          // outputStream = new PrintWriter(new FileOutputStream("output.txt"), true);
          db.outputStateCred(output);
          db.outputStateCheck(output);

          //loggin = new PrintWriter(new FileOutputStream("log.txt"), true);
        // } catch (FileNotFoundException e){
        //   e.printStackTrace();
        //   }
        } catch (Exception e){
          System.out.println(e.getMessage());
        }
    log.close();
    output.close();
  }//end of main

  static String[] combineString(String[] input) {
	String[] output = new String[input.length];
	boolean open = false;
	String temp = "";
	int index = 0;
	for (int i = 0; i < input.length; i++) {
		if (!open) {
