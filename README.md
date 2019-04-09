# helloworld
Hello World -- classic intro to programming, implemented in Java

Eclipse Java project consisting of four files:  
    HelloAll.java
    HelloEveryone.java
    HelloWorld.java
    HelloYou.java
These four files introduce very basic concepts to the new Java programmer.  They are meant to 
be looked at in order, since one file builds on the next.  The files are listed below in the 
proper sequential orer.  They are each standalone classes and there are instructions to 
build and run the classes on the command line.

1.  HelloWorld.java

    Hello World is the traditional first program written in a programming
    language.  It is a simple, introductory program that prints a line to the
    terminal.  Here it is implemented in Java.

    This header comment uses the block style which starts with a slash+asterick
    and is closed with an asterick+slash.  In the method main() there is an
    inline comment, which starts with a slash+slash.

    Java is an object-oriented language, and its objects are called classes.
    In this example, the class is HelloWorld.  If the class is to be executed
    there will need to be a method called main().

    compile:  javac HelloWorld.java
    execute:  java HelloWorld
    output:   $ Hello World!

2.  HelloYou.java

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

3.  HelloEveryone.java

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

4.  HelloAll.java

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
