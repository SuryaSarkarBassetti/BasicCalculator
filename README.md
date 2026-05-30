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
