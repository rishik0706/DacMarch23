package Assignment;
import java.util.Scanner;

class Book{
    private String title;
    private String author;
    private String publisher;
    private String isbn;
    private int year;
    private double price;
    private int quantity;

    public Book(){
        this.title=null;
        this.author=null;
        this.publisher=null;
        this.isbn=null;
        this.year=0;
        this.price=0.0f;
        this.quantity=0;
    }

    //setter methods
    public void setTitle(String title){
        this.title=title;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public void setPublisher(String publisher){
        this.publisher=publisher;
    }
    public void setIsbn(String isbn){
        this.isbn=isbn;
    }
    public void setYear(int year){
        this.year=year;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }

    //getter methods
    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public String getPublisher(){
        return this.publisher;
    }
    public String getIsbn(){
        return this.isbn;
    }
    public int getYear(){
        
        return this.year;
    }
    public double getPrice(){
        return this.price;
    }
    public int getQuantity(){
        return this.quantity;
    }
}

class BookTest{
    private static Scanner sc = new Scanner(System.in);
    private Book b = new Book();
    public int increaseQuantity(){
        b.setQuantity(b.getQuantity() + sc.nextInt());
        return b.getQuantity();
    }
    public int decreaseQuantity(){
        b.setQuantity(b.getQuantity() - sc.nextInt());
        return b.getQuantity();
    }
    public double getInventoryValue(){
        return b.getQuantity() * b.getPrice();
    }
    public void printBook(){
        System.out.println("Title : "+b.getTitle());
        System.out.println("Autor : "+b.getAuthor());
        System.out.println("Publisher : "+b.getPublisher());
        System.out.println("ISBN : "+b.getIsbn());
        System.out.println("Year : "+b.getYear());
        System.out.println("Price : "+b.getPrice());
        System.out.println("Quantity : "+b.getQuantity());
    }
    public void acceptBook( ){
        
        System.out.println("Title : ");
        b.setTitle(sc.nextLine());
        b.setTitle(sc.nextLine());

        System.out.println("Author : ");
        b.setAuthor(sc.nextLine());

        System.out.println("Publisher : ");
        b.setPublisher(sc.nextLine());

        System.out.println("ISBN : ");
        b.setIsbn(sc.nextLine());

        System.out.println("Year : ");
        b.setYear(sc.nextInt());

        System.out.println("Price : ");
        b.setPrice(sc.nextDouble());

        System.out.println("Quantity : ");
        b.setQuantity(sc.nextInt());

    }
    public int menuList(){
        System.out.println("Enter your choice : ");
        System.out.println("1. Enter Book details : ");
        System.out.println("2. Print Book details : ");
        System.out.println("3. Increase Quantity : ");
        System.out.println("4. Decrease Quantity : ");
        System.out.println("5. Calculate Inventory Value : ");
        System.out.println("6. Exit");
        return sc.nextInt();

    }
}

public class Q3 {
    public static void main(String args[]){
        BookTest bt = new BookTest();
        int choice;
        while((choice=bt.menuList())!=6){
            switch(choice){
            case 1:
                System.out.println("Enter details of book to add in Inventory ");
                bt.acceptBook();
                break;
            case 2:
                System.out.println("Books in Inventory: ");
                bt.printBook();
                break;
            case 3:
                System.out.println("Enter no. of quantity to add  : ");
                System.out.println("Total quantity after adding  : "+bt.increaseQuantity());
                break;
            case 4:
                System.out.println("Enter no. of quantity to subtract : ");
                System.out.println("Total quantity after subtracting  : "+bt.decreaseQuantity());
                break;
            case 5:
                System.out.println("Total inventory value: "+bt.getInventoryValue());
                break;
            }
        }
        


    }
}