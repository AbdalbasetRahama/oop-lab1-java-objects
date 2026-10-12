Book tracker application 
Added Book Class
Added helper method....add details on what you did
In the seven day-call the debugger check in the libraryService class the loanDays if they are less than 1 or greater than 14 and as it 7 days it skipped it and reach Book.borrowBook() and print ON_LOAN.
For the fifteen days does not do the same because it is greater than 14.
The first book shows available before reaching the fifteen days because returnBook() function for the first book which was ON_LOAN is called in main before getting the status which is AVAILABLE now.

Lab4 changes LibraryService from working with a single supplied book to owning a List<Book>.

*list<Book> tells the compiler to store elements and these elements can be accessed by their index.
*Why final does not prevent books.add(): the word final prevents object to be reassigned but elements still can be added to it.
*Enhanced for loop represents instead of manually managing loop counters and index variables, Java automatically retrieves each element from the collection or array during iteration.
*For findBookByTitle if title is known it returns true if not returns false.
*The benefits from using findBookByTitle when removeBook is the method will be called and then apply for loop in this method to look for the each book till find the title.
*The responsibility of Main.java is to create variable for the objects and add them and also print any statement by calling the method from other classes.
 for Book.java the class creates attributes for the object.
 for LibraryService.java creates list and methods for the object. 

*Sources:
     https://www.geeksforgeeks.org/java/list-interface-java-examples/
     https://www.javaspring.net/blog/what-does-it-mean-for-a-collection-to-be-final-in-java/
     https://www.golinuxcloud.com/enhanced-for-loop-java/

