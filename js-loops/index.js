// Loops
// Why do we use loops?
// How do we write loops?
// What are the different kind of loops?
// How can we use loops to go through strings?

// A way of repeating a set of code  with start point, an end point and a way to join the two

// FOR loops (FOR...IN LOOP)

// [for reserved keyword] (loop start position; finish condition; iteration) {
//     block of code to execute
// }

for (let i = 0; i < 3; ++i) {
    console.log(`The number is ${i}`);
}

for (let i = 0; i < 6; i += 2) {
    console.log(`Second for loop, ${i}`);
}

for (let i = 6; i < 6; i += 2) {
    // NOT RUNNING 6 is NOT STRICLY SMALLER THAN 6
    console.log(`6, ${i}`);
}

for (let i = 6; i < 6; i++) {
    // NOT RUNNING 6 is NOT STRICLY SMALLER THAN 6
    console.log(`6, ${i}`);
}

const myString = 'Hello';
console.log(myString.length);
console.log('Char at 1:', myString.charAt(1));

// Index - in strings

const word = 'automatically';
console.log(word.length);
for (let index = 0; index < word.length; ++index) {
    console.log(word.charAt(index));
}

// ## Challenge: Sum of `n`

// ### MVP:

// Create a function with a for loop that will add all the numbers up to n

// 1. You should create a variable to set the upper limit of your loop
// 2. Your loop should increment by 1 on each iteration
// 3. Your function should print the final result

// ```js
// sum(10) => 55
// ```

const sum = (n) => {
    let total = 0;
    for (let i = 0; i <= n; i++) {
        total += i;
        if (i === n) {
            console.log(total);
        }
    }
    //  console.log(total);
    return total;
};

sum(10);
sum(110);
sum(1024);
sum(10287486);

// ### Bonus:

// Try writing the function again with the same inputs and outputs **Without**
// using a loop. (You may need to google some formulas!)

const sumOfN = (n) => [n * (n + 1)] / 2;
console.log(sumOfN(10));

// WHILE loops

let i = Math.ceil(Math.random() * 10);

while (i !== 5) {
    console.log(`${i} is not 5`);
    // PROCESS HAPPENING * 100
    i = Math.ceil(Math.random() * 10);
}

console.log('After the while loop:', i);

const sumWithWhile = (n) => {
    let k = 0;
    let total = 0;
    while (k <= n) {
        total += k;
        console.log(`k: ${k}, total: ${total}`);
        k++;
    }
    console.log(total);
};

sumWithWhile(10);

// HERE

// How do we skip iterations?

const sentence =
    'Vitest automatically adds test files include patterns to the default value of coverage.exclude additions';

console.log(sentence.length);

// Counting the number of a in sentence

const countingAs = () => {
    let counter = 0;

    for (let i = 0; i < sentence.length; i++) {
        const char = sentence.charAt(i);

        if (char === 'a') {
            // Will skip to the next loop.
            continue;
        }

        if (char === 'e') {
            counter++;
        }

        if (char === '.') {
            // Will exist the loop altogether but won't terminate the function a loop might be in.
            break;
        }
    }

    console.log(counter);
};

countingAs();

// Sentence - string - iterable structure

for (const letter of sentence) {
    console.log(letter);
}

// [].forEach();

function isPrime(num) {
    // Your code here
    if (num <= 1) {
        return false; // Numbers less than or equal to 1 are not prime
    }

    // Loop from 2 to the square root of num
    for (let i = 2; i <= Math.sqrt(num); i++) {
        if (num % i === 0) {
            return false; // num is divisible by i, so it's not prime
        }
    }

    return true; // If no divisors were found, num is prime
}

console.log(isPrime(7)); // Output: true
console.log(isPrime(10)); // Output: false
console.log(isPrime(2)); // Output: true
console.log(isPrime(1)); // Output: false