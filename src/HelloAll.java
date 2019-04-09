/******************************************************************************
    Building on HelloEveryone, this class introduces methods.  If the args
    array is greater than 0, then the contents of all the array elements are
    printed.  Else the default Hello World message is printed.  A for loop
    is used to iterate through the array elements.  The first array element in
    Java is element 0 (zero).  An int (i) is used to iterate through the array,
    and it is initialized to 0.  The iterator is checked to ensure that it is
    less than the length of the array.  Then it is incremented (the ++ means
    to add 1 to the int variable i).  Eventually the iterator i will not be
    less than the length of the array, and the for loop will be finished.

    Note:  if only one argument is passed in, the for loop will only execute
    one time.

    To print out the messages, a separate method was created called printArg.
    Note that it has argument called theArg, and it is a String, not a String
    array.  The contents of each individual array element are a String.

    compile:  javac HelloAll.java
    execute:  java HelloAll [name1|name2|name3|etc.]
    output:   $ Hello World!
                     or
              $ Hello name1!
              $ Hello name2!
              $ Hello name3!
              $ Hello etc.!
******************************************************************************/
public class HelloAll {
    public static void printArg(String theArg) {
        // prints Hello and the String passed in as the argument
        System.out.println("Hello " + theArg + "!");
    }

    public static void main(String[] args) {
        // if args array is greater than 0, then at least 1 arg was passed in
        if (args.length > 0) {
            // use an iterator (i) to loop through the arguments
            for (int i = 0; i < args.length; i++) {
                // call printArg method
                printArg(args[i]);
            }
        } else {
            // if no arguments, simply print out Hello World!
            System.out.println("Hello World!");
        }
    }
}
