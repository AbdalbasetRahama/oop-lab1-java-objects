package ie.atu.oop.week1;


public class Main {


    public static void main(String[] args) {

        Book mybook = new Book("Dune", "Frank", 412);
        mybook.borrowBook();
        mybook.returnBook();

        try {
            mybook.returnBook();

        } catch(IllegalStateException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(mybook.getStatus());
    }

}