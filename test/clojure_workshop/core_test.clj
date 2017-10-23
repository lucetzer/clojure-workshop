(ns clojure-workshop.core-test
  (:use midje.sweet)
  (:use [clojure-workshop.core]))

(println "An example passing test")

(fact "returns the nth element of a string"
      (string-element "hello" 4) => \l)

; 20 Problems   (Remember to write the test first!)

; Write a function called repeatString which repeats the given string exactly n times. e.g. repeatStr(6, "U") => "UUUUUU"


;  Write a function which will split a sequence into two parts e.g. [1 2 3 4 5 6] => ((1 2 3) (4 5 6)) 


; Write a function which reverses a sequence.


; Write a function which reverses a sequence without using your previous method.


; Write a function which takes a vector of keys and a vector of values and constructs a map from them. e.g. ([:a :b :c] [1 2 3]) => {:a 1, :b 2, :c 3}


; When given a collection of numbers, write a function that will return the sum of the first, second and last number.


; When given a collection of numbers, write a function that returns numbers that are even and when divided by 4 will be greater than 4.


; When given a collection of numbers, write a function that will increase each number by 3 and return the sum of the collection.


;  When given a vector of strings, sort it alphabetically (case-sensitive!) and then return the first value. The returned value must be a string, and have '***' between each of its letters.


; When given a collection e.g. '(1 2 3 4 6 3), return the list without the duplication.


; You are going to be given a word. Your job is to return the middle character of the word.
; If the word's length is odd, return the middle character. If the word's length is even, return the middle 2 characters.


; You must create a function, spread, that takes a function and a list of arguments to be applied to that function.
; You must make this function return the result of calling the given function with the given arguments.
; e.g. (spread + [1 2 3 4 5]) => 15


; Write a function which duplicates each element of a sequence. e.g. (your function [1 2 3]) => '(1 1 2 2 3 3)
; [[1 2] [3 4]] => '([1 2] [1 2] [3 4] [3 4])


; A function within a function. Given an input n, write a function always that returns a function which returns n. e.g. (def three (always 3)) (three) returns 3


; Build a bonus calculator function that takes in two arguments (salary, bonus). If bonus is true, the salary should be multiplied by 10. If bonus is false, bonus isn't awarded.

; Rock Paper Scissors
; Let's play! You have to return which player won! In case of a draw return Draw!.
; Examples:
; rps('scissors','paper') // Player 1 won!
; rps('scissors','rock') // Player 2 won!
; rps('paper','paper') // Draw!


; All we eat is water and dry matter.   John bought potatoes: their weight is 100 kilograms. Potatoes contain water and dry matter.  
; The water content is 99 percent. He thinks they are too wet and puts them in an oven - at low temperature - for them to lose some water.  
; At the output there is only 98% moisture.  
; What is the total weight in kilograms (moisture plus dry matter) coming out of the oven?  He finds 50 kilograms and he thinks he made a mistake: So much weight lost for so little water in less!  
; Can you help him?  
; Write function potatoes with  int parameter p0 - initial humidity percent - int parameter w0 initial weight - int parameter p1 - final humidity percent - potatoes should return the final weight coming out of the oven w1 truncated as an int.  Example:  potatoes(99, 100, 98) --> 50


; Batman & Robin have gotten into quite a pickle this time.
; The Joker has mixed up their iconic quotes and also replaced one of the characters in their names, with a number.
; They need help getting things back in order.
; Implement the getQuote method which takes in an array of quotes, and a string comprised of letters and a single number (e.g. "Rob1n") where the number corresponds to their quote indexed in the passed in array.
; Return the quote along with the character who said it:
; You are guaranteed that the number in the passed in string is placed somewhere after the first character of the string.
; (getQuote ["I am vengeance. I am the night. I am Batman!" "Holy haberdashery, Batman!" "Let's put a smile on that faaaceee!"] "Rob1n")
; =>  "Robin: Holy haberdashery, Batman!"
; The quotes either belong to "Batman", "Robin", or "Joker".


;My friend John likes to go to the cinema. He can choose between system A and system B.
;
;System A : buy a ticket (15 dollars) every time
;System B : buy a card (500 dollars) and every time
;buy a ticket the price of which is 0.90 times the price he paid for the previous one.
;#Example: If John goes to the cinema 3 times:

;System A : 15 * 3 = 45
;System B : 500 + 15 * 0.90 + (15 * 0.90) * 0.90 + (15 * 0.90 * 0.90) * 0.90 ( = 536.5849999999999, no rounding for each ticket)
;John wants to know how many times he must go to the cinema so that the final result of System B, when rounded up to the next dollar, will be cheaper than System A.

;The function movie has 3 parameters: card (price of the card), ticket (normal price of a ticket), perc (fraction of what he paid for the previous ticket) and returns the first n such that

;ceil(price of System B) < price of System A.
;More examples:

;movie(500, 15, 0.9) should return 43
;(with card the total price is 634, with tickets 645)
;movie(100, 10, 0.95) should return 24
;(with card the total price is 235, with tickets 240)


; Set up a music store that sells string instruments and decide what you have in stock.
; Write a function that lets you know what instruments are in stock and how many are available when you have a customer query.
; Add a flat price for each instrument (assume you only have one of each type of instrument).
; Add the ability for someone to purchase an instrument. You will need adjust your stock levels.
