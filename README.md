Book tracker application 
Added Book Class
Added helper method....add details on what you did
In the seven day-call the debugger check in the libraryService class the loanDays if they are less than 1 or greater than 14 and as it 7 days it skipped it and reach Book.borrowBook() and print ON_LOAN.
For the fifteen days does not do the same because it is greater than 14.
The first book shows available before reaching the fifteen days because returnBook() function for the first book which was ON_LOAN is called in main before getting the status which is AVAILABLE now.