/* JS5 builds on the previous challenges and adds the use of MORE Array iterators, Arrays, For Loops, Conditionals (If, else, switch)
 *  & calling your own functions.
 */

/* 
  All challenges in this repository are separated into four levels: Foundation, Intermediate, Advanced and Expert.
  The expectation is to complete all Foundation level challenges, with Intermediate and upwards pushing your knowledge
  and may require you to google things in order to solve them. If you find an answer online somewhere, be kind and
  share it with the group!
*/

/* Foundation Challenges */

/**
 * A function that uses the REDUCE array iterator to total an array of scores.
 * The scores will be numbers.
 *
 * @param {number[]} numberArr [7, 7, 6, 2, 3, 2, 3]
 * @return {number} 30  //this is The total of the scores
 */

export const totalScoresArr = (numberArr) => {//numberArr is the input parameter, which expects an array of numbers.
  return numberArr.reduce((total, score) => total + score, 0);//The reduce function iterates over the array and calculates a single cumulative value (in this case, the total).
  //total: The accumulated value (starts at 0 due to the initial value).
  //score: The current element of the array being processed.
  //total + score adds the current score to the total.
  //The 0 after the callback function initializes the accumulator total to 0.
};

console.log(totalScoresArr([7, 7, 6, 2, 3, 2, 3])); // Output: 30
//The array [7, 7, 6, 2, 3, 2, 3] is passed as an argument.



/**
 * A function that turns a string into an array and uses a ARRAY ITERATOR to reverse it.
 * It will need to keep spaces between words.
 * Once reversed it will need to turn the array back into a string.
 *
 * @param {string} toReverse "reverse"  //this is the string to be reversed
 * @return {string} "esrever"           //theis is the reversed string
 */

export const reverseString = (toReverse) => {

  const charArray = toReverse.split("");// Split the string into an array of characters
  //toReverse.split("") converts the string into an array of characters, so "reverse" becomes ["r", "e", "v", "e", "r", "s", "e"].

  const reversedArray = charArray.reverse(); // Use the `reverse` array iterator to reverse the array
  //charArray.reverse() reverses the array in place, resulting in ["e", "s", "r", "e", "v", "e", "r"].

  const reversedString = reversedArray.join(""); // Join the reversed array back into a string
  //reversedArray.join("") combines the characters into a single string: "esrever".

  return reversedString;
};


console.log(reverseString("reverse")); // Output: "esrever"
console.log(reverseString("hello world")); // Output: "dlrow olleh"

/**FROM HERE
 * A function that arranges an array of characters alphabetically.
 * Each character will need to be lowercase.
 * A to Z case insensitive.
 *
 * @param {string[]} characterArr ["X", "B", "B", "b", "g", "l", "n", "x"]
 * @return {string[]} ["b", "b", "b", "g", "l", "n", "x", "x"]
 */

export const sortCharactersAlphabetically = (characterArr) => {
  return;
};

/* Intermediate Challenges */

/**
 * A function that takes an array of numbers and returns an array of numbers ordered numerically
 *
 * You should do this WITHOUT modifying the original array
 *
 * @param {number[]} numberArr [6, 9, 55, 2, 9190, .5]
 * @return {number[]} [9190, 55, 9, 6, 2, 0.5]
 */

export const sortNumbersHighToLow = (numberArr) => {
  return;
};

/**
 * A function that checks if a given item is 'in stock'.
 * You have been given a 'stock list' in the function body.
 *
 * If the item is in the stock list you need to return its index in the following string format.
 * "ITEM is in stock, it is on aisle INDEX."
 *
 * If the item is not in the stock list you need to return the following string format.
 * "Sorry ITEM is not in stock."
 *
 * @param {string} toCheck orange
 * @return {string} "orange is in stock, it is on aisle 2."
 */

export const checkItemInStock = (toCheck) => {
  return;
};

/**
 * A function that takes an array of colours and checks if EVERY colour is a primary colour.
 * The primary colours are ["red", "blue", "yellow"].
 * It will return true if they are ALL primary.
 * It will return false if they are NOT ALL primary.
 *
 * @param {string[]} coloursArr ["red", "orange", "yellow", "green", "blue", "indigo", "violet"]
 * @return {boolean} false
 */

export const checkPrimaryColours = (coloursArr) => {
  return;
};

/* Advanced Challenges */

/**
 * A function that takes a strings and checks to see if it is a palindrome.
 * PALINDROME - a word, phrase, or sequence that reads the same backwards as forwards.
 * It will return true or false depending if it is a palindrome or not.
 *
 * @param {string} stringOne racecar
 * @return {boolean} true
 */

export const checkStringPalindrome = (stringOne) => {
  return;
};

/**
 * A function that totals a nested array of scores arrays.
 * It only needs to total each nested array.
 * e.g. [[1, 2], [2, 3]] = [3, 5]
 * The scores will be numbers.
 *
 * @param {number[]} numberArr [[7, 7, 6], [2, 3, 2], [3]]
 * @return {number[]} [20, 7, 3]
 */

export const totalNestedScoresArr = (scoresArr) => {
  return;
};

/* Expert Challenges */

/**
 * This is the same challenge as advanced JS4, can you implement it differently?
 * Can you complete this challenge using the REDUCE iterator?
 *
 * A function that takes a string and creates a simple encrypted message.
 *
 * The string will be broken into 3 lists.
 * The first three letters will go into their own list.
 * The next three letters will follow this pattern.
 * Joining the first three letters in each of their list.
 * The rest of the letters will follow this pattern.
 * Each list will be joined together and returned as an encrypted message.
 *
 * The word "encrypted" would be broken into:
 *
 * ["e", "r", "t"]
 * ["n", "y", "e"]
 * ["c", "p", "d"]
 *
 * and joined together as ert + nye + cpd to give a final string of "ertnyecpd"
 *
 * @param {string} toEncrypt "encrypted"
 * @return {string} "ertnyecpd"
 */

export const encryptString = (toEncrypt) => {
  return;
};
