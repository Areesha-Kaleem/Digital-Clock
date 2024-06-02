# Digital-Clock
 This Java code implements a digital timer with separate counters for hours, minutes, and seconds, updating the time every second and displaying it in the console. It includes classes for managing the timer and its counters, and a driver class to run the timer based on user input.
Components:
W_DigitalTimer Class:

Represents a digital timer.
Uses three counters: hours (hr), minutes (min), and seconds (sec).
Contains constructors to initialize the counters and methods to set and update the time.
W_Counter Class:

Represents a counter with a limit.
Keeps track of the current value (CValue) and the upper limit (Limit).
Contains methods to increment (tick), set, reset, and get the current value and limit.
Driver Class:

Contains the main method to run the program.
Prompts the user to input the duration in seconds for which the timer should run.
Initializes a W_DigitalTimer object and starts the timer.
How It Works:
Initialization:

The W_DigitalTimer class has two constructors: one initializes all counters to zero, and the other allows setting the initial time.
The W_Counter class initializes the counter with a limit (default is 60 for minutes and seconds, and 24 for hours).
Setting and Updating Time:

The setvalue method in W_DigitalTimer sets the initial values for hours, minutes, and seconds.
The tick method updates the time every second. It increments the seconds counter (s) and checks if it reaches its limit. If so, it resets the seconds counter and increments the minutes counter (m). The same logic applies to minutes and hours.
Displaying Time:

The tick method prints the current time in the format HH:MM:SS, updating every second.
Running the Timer:

In the Driver class, the user is prompted to enter the number of seconds the timer should run.
The W_DigitalTimer object is created, the initial time is set to zero, and the tick method runs for the specified duration.
Example Usage:
The program starts and asks the user for the number of seconds to run the timer.
The timer starts at 00:00:00 and updates every second, displaying the current time in the console.
The timer stops after the specified duration.
This code demonstrates the use of classes, objects, and methods in Java to create a functioning digital timer.
