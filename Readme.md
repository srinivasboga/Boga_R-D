# Kadane's Algorithm Implementation

Kadane's Algorithm is a dynamic programming approach that solves the maximum subarray problem in linear time. Given an array of integers, it finds the contiguous subarray that has the largest sum.

### Key Features
- Efficient implementation with O(n) time complexity.
- Handles various test cases, including:
  - Mixed positive and negative numbers
  - Single-element arrays
  - Arrays with all negative numbers
  - Arrays with all positive numbers
  - Empty arrays
  - Arrays with a single negative number

### Example

```java
Kadane k = new Kadane();
int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
int maxSum = k.maxSubArray(nums);
System.out.println("Maximum subarray sum is: " + maxSum); 

## Installation
To run this project, you need to have Java installed on your machine. You can download it from [Oracle's official website](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) or use a package manager for your operating system.

### Clone the Repository
You can clone the repository using the following command:
```bash
git clone https://github.com/srinivasboga/Boga_R-D
