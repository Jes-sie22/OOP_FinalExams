package No1;
import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        int choice = 0;

        // creates an object of Scanner
        Scanner input = new Scanner(System.in);

        Book[] bookstore = new Book[100];
        int idx = 0;
        while (choice != 4){
            System.out.println("BOOKSTORE MENU:\n " +
                    "1.add new book \n" +


                    "2.check availability \n" +
                    "3. make book sale" +
                    "4. exit");
            // takes input
            choice = input.nextInt();

            switch (choice){
                case 1:
                    // declare variables to store inputs
                    String title;
                    double price;
                    int year;
                    String Author;
                    int stock;

                    // get user inputs
                    System.out.println("enter book title: ");
                    title = input.nextLine();

                    System.out.println("enter book price: ");
                    price = input.nextDouble();

                    System.out.println("enter book year: ");
                    year = input.nextInt();

                    System.out.println("enter book author: ");
                    Author = input.nextLine();

                    System.out.println("enter book stock: ");
                    stock = input.nextInt();

                    // instantiate new Book
                    bookstore[idx] = new Book(title,price,year,Author, stock);

                    break;
                case 2:

                    System.out.println("enter book title to search : ");
                    title = input.nextLine();

                    for (int i = 0; i <= idx;i++){
                        if(title == bookstore[i].getTitle()){
                            System.out.println("stock: "+  bookstore[i].getStock());
                            break;
                        }
                        System.out.println("book not found");

                    }
                case 3:
                    System.out.println("enter book title to sell : ");
                    title = input.nextLine();

                    for (int i = 0; i <= idx;i++){
                        if(title == bookstore[i].getTitle()){
                            bookstore[i].setStock(bookstore[i].getStock()--);
                            System.out.println("stock updated");
                            break;
                        }
                        System.out.println("book not found");

                    }
                    break;
                case 4:
                    break;





            }
        }



    }
}
