/*******************************************************************************
    Building on HelloWorld, this class introduces command line arguments and
    the if-then-else conditional.  In all Java programs, the argument to the 
    main() method is a String array called args.  If the array is greater than
    0, then the contents of the first array element are printed.  Else an error
    message is printed.

    Note:  it would be possible to pass in more than one argument from the 
    command line.  But for this example all other elements of the array will 
    be ignored.

    compile:  javac HelloYou.java
    execute:  java HelloYou myName
    output:   $ Hello myName!
*******************************************************************************/
public class HelloYou {
    public static void main(String[] args) {
        // if the args array is greater than 0, then an arg was passed in
        if (args.length > 0) {
            // prints Hello and the String passed in as the first argument
            System.out.println("Hello " + args[0] + "!");
        } else {
            // print out a message to the user that they need an argument
            System.err.println("ERROR:  Need to pass in an argument...");
        }
    }
}

