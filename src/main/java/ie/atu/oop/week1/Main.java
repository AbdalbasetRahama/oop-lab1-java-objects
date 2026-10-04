package ie.atu.oop.week1;


public class Main {


    public static void main(String[] args) {

        Book first = new Book("Dune", "Frank", 412);
        Book second = new Book("Clean code", "Robert C.Martin", 464);
        LibraryService service = new LibraryService();

        System.out.println(first.getStatus());
        service.loanBook(first,7);
        System.out.println(first.getStatus());
        first.returnBook();
        System.out.println(first.getStatus());
        System.out.println(second.getStatus());


        try {
           service.loanBook(first,14);

        } catch(IllegalStateException ex)
        {
            System.out.println(ex.getMessage());
        }
        System.out.println(first.getStatus());
    }

}