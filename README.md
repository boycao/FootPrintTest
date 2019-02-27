# FootPrintTest

# Producing tests:

The goal of this test is to measure the preprocessing time it takes for Chronon and FootPrint to record/prepare data for user interaction. For Chronon, this means we will measure the recording time. For FootPrint, we will set a breakpoint at the end of the program and measure how long it takes for FootPrint to collect and display the variable histories. Since FootPrint will set breakpoints under the hood in order to get a full record of variable history (in addition to user breakpoints), measuring this preprocessing time is analogous to Chronon’s recording time since both processes have to be complete before the user can begin debugging. The plugin that takes the least amount of time to preprocess will be the one with better runtime. Since our project is aimed towards students, we chose a simple HelloWorld example program that would appear in an intro CSE class here at UW to most accurately reflect what our target audience will use FootPrint on.	 

## Requirements:
You will need: 
[IntelliJ Ultimate Edition](https://www.jetbrains.com/idea/)

You will also need the following plugins installed into IntelliJ. 

Follow these two links to find out how:

[FootPrint](https://github.com/cnhguy/FootPrint)

[Chronon](https://blog.jetbrains.com/idea/2014/03/try-chronon-debugger-with-intellij-idea-13-1-eap/) * Requires IntelliJ Ultimate Edition *

## Cloning The Repository:

1) On the repository page, select Clone or download and copy the link provided
2) On the Intellij start page, select Checkout from Version Control and Git
3) Paste the URL from step 1 into the URL field and choose your desired directory and hit Clone

## Conducting the test: 
### To test FootPrint:

Open src/Main.java in IntelliJ and set a breakpoint at the very bottom (line 75). 

Change the file name on line 74 to FootPrint.txt

Click on the FootPrint icon and the pre-processing time will print to a file in your current directory called FootPrint.txt. Repeat several times as you conduct more trials. The results will be appended to FootPrint.txt. 

### To test Chronon:

Open src/Main.java in IntelliJ. 

Change the file name on line 74 to Chronon.txt

Click on the Chronon icon and the pre-processing time will print to a file in your current directory called Chronon.txt.
Repeat several times as you conduct more trials. The results will be appended to Chronon.txt. 

## Running scripts:
