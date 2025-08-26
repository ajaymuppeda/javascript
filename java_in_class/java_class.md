# Common Methods in String Class with Code

- Length()- returns an integer value
- charAT()- return a char
- Equals()- returns a Boolean value
- substring()- returns a String
- toUpperCase()- returns a String
- trim()- returns a String
- replace()- returns a String
- split()- return a String



#  Example for Strings 
String s = " Java Programming ";   
System.out.println(s.length());  
System.out.println(s.trim());  
System.out.println(s.toUpperCase());  
System.out.println(s.charAt(5));



# Arrays
- Arrays store multiple values of the same type.   
- Fixed in size and indexed starting at 0.   
- Each element is accessible via an index.  
- Improves data organization and performance.  
- Arrays are basic but powerful data structures.   
- Easy access using indices.  
- Useful for fixed-size collections.  
- Base for more complex structures.  

### Declaring Arrays

Syntax: `type[] arrayName;`.  
Can also use: `int numbers[];`.   
Example: `int[] numbers;`.  

### Initializing Arrays
int[] arr = {10, 20, 30};   
System.out.println(arr[0]);   
Output - 10.      
arr[1] = 25;   
System.out.println(arr[1]);   
Output -  25.   