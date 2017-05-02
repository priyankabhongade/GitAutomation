#Author: chetan.bendre

Feature: to implement calculator

@add
Scenario: to verify addition is performed.
Given user is providing two numbers "4" & "5"
Then "add" numbers 
Then verify result is "9"


Scenario: to verify substraction is performed.
Given user is providing two numbers "4" & "5"
Then "substract" numbers
Then verify result is "-1"

Scenario: to verify multiplication is performed.
Given user is providing two numbers "4" & "5"
Then "multiply" numbers
Then verify result is "20"

Scenario: to verify division is performed.
Given user is providing two numbers "4" & "5"
Then "division" numbers
Then verify result is "0"

Scenario: to verify sqaure of number is performed.
Given user is providing number "5"
Then "sqaure" numbers
Then verify result is "25"


Scenario Outline: to verify addition is performed.
Given user is providing two numbers "<num1>" & "<num2>"
Then "<operation>" numbers 
Then verify result is "<result>"
Examples:
|num1|num2|operation|result|
|5|4|add|9|
|52|40|substract|12|
|5|44|multiply|220|
|25|5|division|5|


Scenario Outline: to verify sqaure of number is performed.
Given user is providing number "<num>"
Then "sqaure" numbers
Then verify result is "<result>"

Examples:
|num|result|
|2|4|
|3|9|
  
