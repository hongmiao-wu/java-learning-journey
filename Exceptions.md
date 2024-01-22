1. Error: ConcurrentModificationException

java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)

java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)

The error typically occurs when you try to modify a collection (like an ArrayList) while iterating over it. 
This can happen when you add or remove elements from the collection directly, instead of using the iterator's methods.

Use a copy, a snapshot instead of modifiying it directly 
