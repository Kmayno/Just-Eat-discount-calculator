# JustEat discount calculator

## Description
This Java project calculates how much each person should pay in a group order on Just Eat, applying a percentage discount to the total. Each person has an initial amount spent, and the program calculates their final share after the discount, distributing the discount proportionally.

## Features
- Input for people with their original amounts spent.
- Application of a percentage discount on the entire order.
- Calculation of each person’s amount to pay after the discount.

## Project Structure
- **User.java**: represents a person and their spending.
- **OrderLogic.java**: contains the list of people, manages the discount, and calculates the final shares.
- **Main.java**: contains the `main` method to run the program and interact with the user.

## How to Use
1. Run the program.
2. Enter each person’s name and their amount spent.
3. Enter the discount percentage to apply to the whole order.
4. The program will output how much each person owes after the discount.

## Example Usage

Enter the name of the person: Person 1
Enter the amount spent by Person 1: 30
Enter the name of the person: Person 2
Enter the amount spent by Person 2: 12
Do you want to add another person? (y/n): n
Enter the discount percentage to apply: 10

Result:
Person 1 owes: €27.00
Person 2 owes: €10.80
