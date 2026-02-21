# Pin-Security-Simulator
A short program that allows a user to check how secure their chosen password is based on how fast it could be hacked. 
# PIN Security Simulator (Java)

This project is a simple cybersecurity simulation tool that estimates how quickly a 4-character password (PIN) could be cracked based on its complexity.

## Author
Arlette Torres  
Lamar University – Computer Information Science  

## Description
The program analyzes a user-entered password and determines whether it includes:
- Lowercase letters
- Uppercase letters
- Digits

It then estimates how long it would take to brute-force the password based on its complexity.

## How It Works
- Numbers-only passwords are cracked very quickly
- Passwords that mix letters and numbers take longer to crack
- The program outputs the estimated time in milliseconds

## How to Run
1. Open the project in Eclipse or any Java IDE
2. Compile and run the `PinSecuritySimulator.java` file
3. Enter a 4-character password when prompted

## Example Output
Enter a 4-character password: A3b7  
Your password could be cracked in 404 ms

## Concepts Demonstrated
- Java input handling (Scanner)
- String and character analysis
- Conditional logic
- Basic cybersecurity concept: brute-force attack timing

## Future Improvements
- Increase password length options
- Add special character detection
- Provide stronger password recommendations
