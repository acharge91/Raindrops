# Raindrops

Raindrops is an algorithmic program that takes in an integer and returns a string dependent on the given numbers' factors.

---

### Outputs:

- *Pling* - if the given number has a factor of 3.
- *Plang* - if the given number has a factor of 5.
- *Plong* - if the given number has a factor of 7.
- If the given numbers' factors do not include any of the above then the program wll output the given number.

**Examples:**

Given the integer: 28 \
Factors of 28 are 1, 2, 4, 7, 14 and 28. As the factors of 28 include 7, the program would output '*Plong*'.

Given the integer: 30 \
Factors of 30 are 1, 2, 3, 5, 6, 10, 15 and 30. As the factors of 28 includes 7 and 5, the program would output '*PlingPlang*'.

Given the integer: 34 \
Factors of 34 are 1, 2, 17, and 34. As the factors of 34 do not include 3, 5 or 7, the program would output '*34*'

---

### Functionality:

*factorCalculator* method takes the given number and recursively checks if that number is divisible by each sequential number down to 0. If the two numbers are divisible with no remainder then that number is added to the array of factors.

```java
    public static void factorCalculator(int numToFactor, int numIncrements, ArrayList<Integer> factorArray) {
        if (numIncrements == 0) return;
        if (numToFactor % numIncrements == 0 ) factorArray.add(numIncrements);

        numIncrements--;
        factorCalculator(numToFactor, numIncrements, factorArray);
    }
```

*raindropsStringBuilder* method takes the given number and parses it to the *factorCalculator*, only if it is greater than 0. It then checks the resulting array of factors for the relevant numbers and builds a string based on the corresponding words. If the given number is 0 or less, the program will output 'Cannot factor this number'.

```java
public static String raindropsStringBuilder(int numToFactor) {

        if (numToFactor > 0) {
            ArrayList<Integer> factorArray = new ArrayList<>();
            factorCalculator(numToFactor, numToFactor, factorArray);

            String returnString = "";
            if (factorArray.contains(3)) returnString += "Pling";
            if (factorArray.contains(5)) returnString += "Plang";
            if (factorArray.contains(7)) returnString += "Plong";
            if (returnString.isEmpty()) returnString += numToFactor;

            return returnString;
        } else {
            return "Cannot factor this number";
        }

```

---

## Testing

The program includes a test file containing unit tests for the *RaindropsCalculator* class, that also makes use of some helper methods.

The tests cover all available outputs whilst also testing for the handling of numbers 0 or less. It also tests the *factorCalculator* method to ensure correct factors are returned.

---

## Dependencies

- JUnit 5

```java
    <dependency>
      <groupId>org.junit.jupiter</groupId>
      <artifactId>junit-jupiter</artifactId>
      <version>5.8.2</version>
      <scope>test</scope>
    </dependency>
```
