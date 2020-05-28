import java.util.LinkedList;

public class LinkedListe 
{ 
    public static void main(String args[]) 
    { 
        // Creating object of class linked list 
        LinkedList<String> object = new LinkedList<String>(); 
  
        final long timeStart = System.nanoTime();
        
        // Adding elements to the linked list 
        object.add("1"); 
        object.add("2"); 
        object.addLast("3"); 
        object.addFirst("4"); 
        object.add(2, "5"); 
        object.add("6"); 
        object.add("7"); 
        System.out.println("Linked list : " + object); 
        
        // Removing elements from the linked list 
        object.remove("2"); 
        object.remove(3); 
        object.removeFirst(); 
        object.removeLast(); 
        System.out.println("Linked list after deletion: " + object); 
  
        // Finding elements in the linked list 
        boolean status = object.contains("5"); 
  
        if(status) 
            System.out.println("List contains the element '5' "); 
        else
            System.out.println("List doesn't contain the element '5'"); 
  
        // Number of elements in the linked list 
        int size = object.size(); 
        System.out.println("Size of linked list = " + size); 
  
        // Get and set elements from linked list 
        Object element = object.get(2); 
        System.out.println("Element returned by get() : " + element); 
        object.set(1, "25"); 
        System.out.println("Linked list after change : " + object); 
        
		final long timeEnd = System.nanoTime();
		System.out.println("Zeit die für sämtliche Operationen benötigt wird: " + (timeEnd - timeStart) + " ns");
    } 
} 