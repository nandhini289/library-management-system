import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagement {

    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("----- Library Menu -----");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {

                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();

                    books.add(new Book(id, title, author));
                    System.out.println("Book Added Successfully!");
                    break;

                case 2:
                    if (books.isEmpty()) {
                        System.out.println("No books available.");
                    } else {
                        for (Book b : books) {
                            b.displayBook();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Book ID to search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;

                    for (Book b : books) {
                        if (b.getId() == searchId) {
                            b.displayBook();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
    }
