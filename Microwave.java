import java.util.Scanner;

class Microwave {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    
    System.out.print("What food item are you microwaving: ");
    String foodItem = myObj.nextLine();
    
    System.out.print("How many " + (foodItem) + " are you microwaving: ");
    String quantity = myObj.nextLine();
    
    double time = 0.0d;
    if (foodItem.equals("pizza")) {
      time = 45;
    } else if (foodItem.equals("sub")) {
      time = 60;
    } else if (foodItem.equals("soup")) {
      time = 105;
    }

    if (quantity.equals("1")) {
      time = time;
    } else if (quantity.equals("2")) {
      time = time * 1.5;
    } else if (quantity.equals("3")) {
      time = time * 2;
    }
    
    int minutes = (int) time / 60;

    System.out.println("It will take " + minutes + " minute and " + (time % 60) + " seconds "
        + "to cook " + quantity + " " + foodItem);
  }
}

