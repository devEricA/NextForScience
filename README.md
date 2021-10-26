# NextForScience
This lab tests whether or not file.next() factors in whitespace

# Problem
A question that came in during one of my programming challenges was with the functionality of java's Scanner.next(). 
The interviewer asked if Scanner.next() factors in any whitespaces between strings. 
This lab is designed to put that question to the test. 

# Approach
A file, data.txt, was created with strings seperated by various numbers of spaces. 
The file was parsed with Scanner.next() and with a while loop. 
Each string was printed in one line. 

The idea was that if Scanner.next() didn't factor in whitespace input, each word would be printed in one line. 

# Results
As shown in output.txt, Scanner.next() grabs each indiviual word, without factoring in whitespace. 

# Additonal notes
Program was developed in Visual Studio Code in a Linux mint environment. 
The program was ran with the terminal commands <code>$ javac NextForScience.java</code> followed by <code>$ java NextForScience</code>.
Using version 15.0.2.
