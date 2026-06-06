# BasicCalculator

A simple Java console application that performs arithmetic and math helper operations.

## Features

- Addition, subtraction, multiplication, division
- Modulus and percentage calculations
- Square and cube
- Average, maximum, minimum
- Absolute value
- Even/odd check
- Positive/negative check

## Operation Logic

- `+`, `add`: returns `a + b`
- `-`, `subtract`: returns `a - b`
- `*`, `multiply`: returns `a * b`
- `/`, `divide`: returns `a / b` (error if second number is 0)
- `%`, `modulus`: returns `a % b` (error if second number is 0)
- `average`, `avg`: returns `(a + b) / 2`
- `maximum`, `max`: returns the larger of `a` and `b`
- `minimum`, `min`: returns the smaller of `a` and `b`
- `percentage`, `percent`: returns `(value / total) * 100` (error if total is 0)
- `square`: returns `a * a`
- `cube`: returns `a * a * a`
- `abs`, `absolute`: returns the absolute value of `a`
- `even`: returns true if `a` is an integer and divisible by 2
- `odd`: returns true if `a` is an integer and not divisible by 2
- `positive`: returns true if `a > 0`
- `negative`: returns true if `a < 0`

## Run the application

1. Open a terminal in the project root.
2. Compile the application:

```powershell
javac src\BasicCalculator.java src\CalculatorOperation.java
```

3. Run the application:

```powershell
java -cp src BasicCalculator
```

## Usage

At the prompt, enter one of the supported operations and then provide numbers as requested.

- Unary operations use one number: `square`, `cube`, `abs`, `even`, `odd`, `positive`, `negative`
- Binary operations use two numbers: `add`, `subtract`, `multiply`, `divide`, `modulus`, `average`, `maximum`, `minimum`, `percentage`

Type `exit` at any prompt to quit.

## Expense Tracker

A simple Java expense tracker that supports multiple categories, search, filters, validation, notes, and expense reports.

### Features

- Add expenses in the categories: `Food`, `Travel`, `Shopping`, `Medical`, `Entertainment`, `Other`
- Validate category names before adding expenses
- Search expenses by category or note text
- Filter expenses by category and amount range
- Count total expenses and calculate total amount
- Identify highest and lowest expenses
- Print an expense report with category counts

### Run the Expense Tracker

1. Open a terminal in the project root.
2. Compile the application:

```powershell
javac expense-tracker\Expense.java expense-tracker\Category.java expense-tracker\ExpenseTracker.java
```

3. Run the application:

```powershell
java -cp expense-tracker ExpenseTracker
```

### Notes

- Notes are optional when adding an expense.
- The tracker supports adding multiple expenses per category and reporting on all saved entries.
Expense Tracker - Feature Development Tasks
Project Overview

The Expense Tracker application currently supports:

Add Expense
View Expenses
View Total Expenses

Each candidate has been assigned one feature to implement.

Feature Hints
Add Food Expense

Hint:

Create a method to add expenses under the "Food" category.
Store amount using the existing expense structure.
Add Travel Expense

Hint:

Create a method to record travel-related expenses.
Use category name "Travel".
Add Shopping Expense

Hint:

Add support for shopping expenses.
Ensure data is stored in the expense collection.
Add Medical Expense

Hint:

Add a category named "Medical".
Record medical-related spending.
Add Entertainment Expense

Hint:

Add a category named "Entertainment".
Store expense amount under this category.
Add Other Expense

Hint:

Create a generic category called "Other".
Allow storing expenses that do not belong to predefined categories.
Add Expense Search

Hint:

Search expense information using category name.
Return matching expense details.
Add Expense Filter

Hint:

Display expenses for a selected category only.
Example: Show only Food expenses.
Add Category Validation

Hint:

Allow only approved categories.
Reject invalid category names.
Add Expense Count

Hint:

Count the number of expense entries.
Return total records available.
Add Highest Expense

Hint:

Find the expense with the maximum amount.
Display category and amount.
Add Lowest Expense

Hint:

Find the expense with the minimum amount.
Display category and amount.
Add Expense Notes

Hint:

Allow storing notes/comments for an expense.
Example: "Team Lunch", "Cab Booking".
Add Expense Report

Hint:

Generate a summary report.
Include:
Total Expenses
Expense Count
Category-wise Details