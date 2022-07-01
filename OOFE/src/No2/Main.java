package No2;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        int choice = 0;

        // creates an object of Scanner
        Scanner input = new Scanner(System.in);

        // array for animals and number of each one 
        Lion[] lions = new Lion[9];
        int countL = 0; // aka index
        Monkey[] monkeys = new Monkey[9];
        int countM = 0;
        Snake[] snakes = new Snake[9];
        int countS = 0;
        
        while (choice != 4){
            System.out.println("ZOO MENU:\n" +
                    "1.ADD NEW ANIMAL \n" +

                    "2.GET ANIMAL INFORMATION \n" +
                    
                    "4. EXIT");

            // takes input
            choice = input.nextInt();

            int x;
            switch (choice) {
                case 1:
                    System.out.println("ANIMALS: \n" +
                            "1.LION\n" +
                            "2.Monkey\n" +
                            "3.Snake\n");
                    x = input.nextInt();

                    System.out.println("Enter name:");
                    String name;
                    name = input.nextLine();

                    System.out.println("Enter weight:");
                    int weight;
                    weight = input.nextInt();

                    switch (x){
                        case 1:
                            System.out.println("Enter meat comsuption:");
                            int meat;
                            meat = input.nextInt();

                            // initialize lion object
                            Lion mylion = new Lion(name,weight,meat);
                            lions[countL] = mylion;
                            countL++;
                            break;
                            

                        case 2:
                            System.out.println("Enter fav food:");
                            String fav;
                            fav = input.nextLine();

                            Monkey myMonkey = new Monkey(name,weight,fav);
                            monkeys[countM] = myMonkey;
                            countM++;
                            break;
                        case 3:
                            System.out.println("Enter meat length:");
                            int length;
                            length = input.nextInt();

                            Snake mySnake = new Snake(name,weight,length);
                            snakes[countS] = mySnake;
                            countS++;
                            break;
                    }
                    break;
                case 2: // get animal info (meat, length, fav food)
                    System.out.println("ANIMALS: \n" +
                            "1.LION\n" +
                            "2.Monkey\n" +
                            "3.Snake\n");
                    x = input.nextInt();

                    int index;
                    switch (x){
                        case 1://lion
                            System.out.println("enter lion index: ");

                            index = input.nextInt();
                            System.out.println(lions[index].getMeatConsumption());
                            break;


                        case 2:
                            System.out.println("enter monkey index: ");
                            index = input.nextInt();
                            System.out.println(monkeys[index].getFavFood());
                            break;
                        case 3:
                            System.out.println("enter snake index: ");
                            index = input.nextInt();
                            System.out.println(snakes[index].getLength());
                            break;
                    }
                    
                    break;
            }
        }
    }
}
