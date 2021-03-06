# Hella Loops 01
* Ensure each of the test cases in the class ***HellaLoopsTest*** successfully passes upon completion of each of the method stubs in the class ***NumberUtilities***.
    * `String getEvenNumbers(int start, int stop)`
    * `String getOddNumbers(int start, int stop)`
    * `String getSquareNumbers(int start, int stop, int step)`
    * `String getRange(int start, int stop, int step)`
    * `String getExponentiations(int start, int stop, int step, int exponent)`

## `String getRange(int stop)`
* **Description**
    * Given an integer, `stop`, return a `String` concatenation of all integers between `0` up to and not including `stop`.
### Example
* Sample Script

    ```
    // : Given
    int stop = 11;
    
    // : When
    String outcome = loops.getRange(stop);
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    012345678910
    ```









<br><br><br><br>
## `String getRange(int start, int stop)`
* **Description**
    * Given two integers, `start`, and `stop`, return a `String` concatenation of all integers between `start` up to and not including `stop`.
### Example
* Sample Script

    ```
    // : Given
    int start = 5;
    int stop = 11;
    
    // : When
    String outcome = loops.getRange(start, stop);
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    5678910
    ```





<br><br><br><br>
## `String getRange(int start, int stop, int step)`
* **Description**
    * Given three integers, `start`, `stop`, and `step` return a `String` concatenation of all integers between `start`, incrementing by `step`, up to and not including `stop`.
### Example
* Sample Script

    ```
    // : Given
    int start = 5;
    int stop = 20;
    int step = 5;
    
    // : When
    String outcome = loops.getRange(min, max, step);
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    51015
    ```













<br><br><br><br>
## `String getEvenNumbers(int start, int stop)`
* **Description**
    * Given two integers, `start`, and `stop`, return a `String` concatenation of all even integers between `start` up to and not including `stop`.
### Example
* Sample Script

    ```
    // : Given
    int start = 5;
    int stop = 20;
    
    // : When
    String outcome = loops.getOddNumbers(min, max);
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    681012141618
    ```


<br><br><br><br>
## `String getOddNumbers(int start, int stop)`
* **Description**
    * Given two integers, `start`, and `stop`, return a `String` concatenation of all even integers between `start` up to and not including `stop`.
### Example
* Sample Script

    ```
    // : Given
    int start = 5;
    int stop = 20;
    
    // : When
    String outcome = loops.getOddNumbers(min, max);
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    5791113151719
    ```















<br><br><br><br>
## `String getSquareNumbers(int start, int stop)`
* **Description**
    * Given two integers, `start`, and `stop`, return a `String` concatenation of all values squared between `start` up to and not including `stop`.
### Example
* Sample Script

    ```
    // : Given
    int start = 5;
    int stop = 20;
    
    // : When
    String outcome = loops.getOddNumbers(min, max);
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    25100225
    ```











<br><br><br><br>
## `String getExponentiations(int start, int stop, int step, int exponent)`
* **Description**
    * Given four integers, `start`, `stop`, `step`, and `exponent`, return a `String` concatenation of all values, raised to the specified `exponent`, between `start` up to and not including `stop`, incrementing by the specified `step`.
### Example
* Sample Script

    ```
    // : Given
    int start = 5;
    int stop = 20;
    int step = 5;
    int exponent = 2;
    
    // : When
    String outcome = loops.getOddNumbers(min, max);
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    25100225
    ```