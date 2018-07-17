# Java classlib
class lib in java with unit testing

# MaxMin
List of numbers (int) that return the max and min values.

Input {1,2,3,4,5} Output: String "14 10"

### MaxMin Example:

    2+3+4+5 = 14

    1+3+4+5 = 13

    1+2+4+5 = 12

    1+2+3+5 = 11

    1+2+3+4 = 10

Max = 14, Min = 10

# Not Div Class Example

Input: {1,7,4,2}

Input for div: 3

Get Subsets: 

            {1,7}  {1,4}  {1,2}  {7,4}  {7,2}  {4,2}

      Total:  8      5      3     11      9      6   : All Mod 3 (input for div)

NotDivList: {1,7,4} numbers from the list which sum is not div by 3

#PalSearch

ToDO

#Card Game

ToDo

#UserInput

ToDo

#Angry Professor

A Discrete Mathematics professor has a class of students. Frustrated with their lack of discipline, he decides to cancel class if fewer than some number of students are present when class starts. Arrival times go from on time (arrivalTime <= 0) to arrived late (arrivalTime > 0).

Given the arrival time of each student, determine if the class is canceled.

###Input Format

The first line of input contains , the number of test cases.

Each test case consists of two lines.

The first line has two space-separated integers,  (students in the class) and  (the cancelation threshold). 
The second line contains  space-separated integers () describing the arrival times for each student.

Note: Non-positive arrival times (minus or zero) indicate the student arrived early or on time; positive arrival times ( > 0 ) indicate the student arrived  minutes late.


####Output Format

For each test case, print the word YES if the class is canceled or NO if it is not.

#####Note 
   If a student arrives exactly on time , the student is considered to have entered before the class started.

#####Sample Input

    2

    4 3

    -1 -3 4 2

    4 2

    0 -1 2 1
#####Sample Output

    YES
    NO

####Explanation

For the first test case, k = 3. The professor wants at least 3 students in attendance, but only 3 have arrived on time (-3 and -1) so the class is canceled.

For the second test case, k = 2. The professor wants at least 2 students in attendance, and there are 2 who have arrived on time (0 and -1) so the class is not canceled.

#INTNumber

Implements It's A Beautiful Day Problem:

###Example
Day's from 20 - 23. 

Take day 20, switch number order (02) and / by 6. If even it's a beautiful day.
Repeat for day 21 to 23. Return the number of beautiful days.

    i,j = start day to end day
    k = number to divide into diffrence that must be even
    
    int i = 20, int j = 23, int k = 6
    
    20 -> 02
    dif = 18
    18 / 6 = 3
    3 is even so count number of beautiful days ++
    
    Repeat for 21, 22, and 23
    
    return total count
    
    For this case count = 2

###Also Imlements

#####Method getReverseInt
Swap int number order ie 201 = 102.

#####Method numDif
Return the difference between two int's ie 20 02 = 18. 

#####Method numIsEvenlyDivisible
Check if a number is evenly divisible, returns a boolean. 