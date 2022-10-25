package org.myapp;

import org.myapp.utils.InputScanner;



public class InputScannerApp {


  private static InputScanner scanner = new InputScanner();

  static String info = "Type: (use enter after input)\n\n";

  public void startApp(String[] args) {
    
  
    try {
      if (args.length == 0) {
        //args = scanner.scanArguments(1);
        


      } else {
        System.out.println("Nothing selected.");
      }
      System.out.println("Application ended successfully.");
    } catch (Exception e) {
      System.out.println("Error! " + e.getMessage());
    }
  }

  
}