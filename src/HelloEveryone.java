/******************************************************************************
    Building on HelloYou, this class introduces looping, in this case the for 
    loop.  If the args array is greater than 0, then the contents of all the 
    array elements are printed.  Else an error message is printed.  A for loop
    is used to iterate through the array elements.  The first array element in
    Java is element 0 (zero).  An int (i) is used to iterate through the array,
    and it is initialized to 0.  The iterator is checked to ensure that it is
    less than the length of the array.  Then it is incremented (the ++ means
    to add 1 to the int variable i).  Eventually the iterator i will not be
    less than the length of the array, and the for loop will be finished.

    compile:  javac HelloEveryone.java
    execute:  java HelloEveryone name1 name2 name3 name4
    output:   $ Hello name1!
              $ Hello name2!
              $ Hello name3!
              $ Hello name4!
******************************************************************************/
public class HelloEveryone {
    public static void main(String[] args) {
        // if args array is greater than 0, then at least 1 arg was passed in
        if (args.length > 0) {
            // use an iterator (i) to loop through the arguments
            for (int i = 0; i < args.length; i++) {
                // prints Hello and the String passed in as the argument
                System.out.println("Hello " + args[i] + "!");
            }
        } else {
            // print out a message to the user that they need an argument
            System.err.println("ERROR:  Need to pass in arguments...");
        }
    }
}

