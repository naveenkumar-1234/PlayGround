# BasicMath Program

This project provides a set of basic mathematical operations implemented in Java. Below are the different functionalities provided in the program along with their time complexities:

## 1. Count digits
- Time complexity: O(log N) => n/10 -- logarithmic in base 10.

## 2. Reverse integer
- Time complexity: O(log N) => n/10, n%10 -- logarithmic.

## 3. Check Palindrome
- Time complexity: O(log N) => it uses reverseNumber() which also logarithmic.

## 4. GCD for Two numbers
- Time complexity: O(min(n1,n2)) => It iterates n1 times in worst case, in best case - O(1) > Its brute force approach.

## 5. Armstrong Number
- Time complexity: O(log N) => It uses countDigits() so it also have same TC, it also takes some time to calculate POW -- O(d), but in Worst case minimum number must be eliminated.

## 6. Prime or Not
- Time complexity: O(sqrt(N)) => It iterates sqrt(N) times.

## 7. Print all Divisors
- Time complexity: O(sqrt(N)) => It iterates sqrt(N) times.


# Euclidean Algorithm Program

This program implements the **Euclidean Algorithm** to compute the **Greatest Common Divisor (GCD)** of two numbers efficiently.

## Explanation:
- **Greatest Common Divisor / Highest Common Factor**:
  The Euclidean Algorithm is used to make more efficient when we are performing GCD for two numbers. In brute force, GCD(n1, n2) takes O(min(n1, n2)). But, while using Euclid's algorithm, it takes O(log(min(n1, n2))).

### Formula:
1. r = a % b     **| a >= b |**      **Min and Max Not needed because when we switch a=b and b=r it change MAX as a and MIN as b.** **Example : a=10 and b=35 , r= 10% 35 it will give 10 so a= 35 and b= 10 . Finally it switched**
2. a = b
3. b = r
4. Perform until b = 0
5. If b = 0, then a must be the GCD of two numbers.

### Time Complexity:
The time complexity of the Euclidean algorithm is **O(log(min(n1, n2)))**, where `n1` and `n2` are the two numbers. This is because each step reduces the problem size logarithmically.
