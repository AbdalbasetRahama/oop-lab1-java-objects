Lab5 - Exceptions and CSV Persistence

*Difference between throw and catch: Throw starts exceptional control flow.
catch: matches by exception type; makes a recovery or report decision.

*Path.of(...) identifies file destination and one method used is (file.getParent()), on Files method is (Files.readAllLines()).

*Difference between Unchecked NumberFormatException and IOException:
Unchecked NumberFormatException: it can be prevented and the complier does not require to handle the exception. 
IOException: cannot be ignored and the compiler makes sure the code handles the exception.

*Difference between Path and Files:
Path:identifies file destination.
Files: contact the file system to perform the operation.

*CSV columns:
title, author, PageCount, status
Dune, Frank Herbert, 412, AVAILABLE
Clean Code, Robert C.Martin, 464, AVAILABLE