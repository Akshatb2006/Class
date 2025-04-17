/*Q3: Write a Java program that demonstrates encapsulation by creating a class Book
with private fields title, author, and price. Implement getter and setter methods for
these fields and write a method applyDiscount(double discount) that applies a
discount to the book price. Display the updated price after applying the discount.
 */

 public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String Author, double price){
            this.title = title;
            this.author = Author;
            this.price = price;
    }

    public String getTitle(){
      return title;
    }
    public String getAuthor(){
      return author;
    }
    public double getPrice(){
            return price;
          }
      
         private void applyDiscount(double d) {
            price = price * (1 - d);
         }

         public static void main(String[] args) {
            Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99);
            book.applyDiscount(0.2);
            System.out.println("Book Title: " + book.getTitle());
            System.out.println("Book Author: " + book.getAuthor());
            System.out.println("Book Price: $" + book.getPrice());
         }
    }