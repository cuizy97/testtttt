import java.util.ArrayList;
import java.util.Random;
class Main {
  public static String getCandy() {
    System.out.print("Trick or Treat!");
    String candyname = "";

    Random r = new Random();
    int rNum= r.nextInt(100) + 1;
    if (rNum < 6){         // 1-5, 5%
      candyname = "Kit Kat"; 
    } 
    else if (rNum < 16){   // 6-15, 10%
      candyname = "M&Ms"; 
    } 
    else if (rNum < 36){   // 16-35, 20%
      candyname = "Pink Starburst"; 
    }
    else if (rNum < 51){   // 36-50, 15%
      candyname = "Hershey's Bar"; 
    }
    else if (rNum < 61){   //51-60, 10%
      candyname = "Milky Way"; 
    }
    else if (rNum < 76){   //61-75, 15%
      candyname = "Twix"; 
    }
    else {                 //76-100, 25%
      candyname = "Reese's"; 
    }

    System.out.print(" We got " + candyname + "!");

    return candyname;
    
  }

  public static void main(String[] args)
  {for (int c = 0; c < 6; c++) {  // # of columns
    gC();
    c++;
  }}




public static String gC() {
    System.out.print("Trick or Treat!");

    Random r = new Random();
    int rNum= r.nextInt(100) + 1;
    if (rNum < 6){         // 1-5, 5%
      System.out.println("We got Kit Kat!");
      return "Kit Kat"; 
    } 
    else if (rNum < 16){   // 6-15, 10%
      System.out.println("We got M&Ms!");
      return "M&Ms"; 
    } 
    else if (rNum < 36){   // 16-35, 20%
      System.out.println("We got Pink Starburst!");
      return "Pink Starburst"; 
    }
    else if (rNum < 51){   // 36-50, 15%
      System.out.println("We got Hershey's Bar!");
      return "Hershey's Bar"; 
    }
    else if (rNum < 61){   //51-60, 10%
      System.out.println("We got Milky Way!");
      return "Milky Way"; 
    }
    else if (rNum < 76){   //61-75, 15%
      System.out.println("We got Twix!");
      return "Twix"; 
    }
    else {                 //76-100, 25%
      System.out.println("We got Reese's!");
      return "Reese's"; 
    }

    
  }










}