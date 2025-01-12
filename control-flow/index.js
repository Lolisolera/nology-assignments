// Control Flow
// Why Do we use control flow in our apps?
// How do we use it?
// What patterns can we use?

// if / else

// if([expression to evaluate]) {
//      block of code to execute when expression is true
// } else {
//      block of code to execute when all previous expressions were false
// }

const correctPassword = 'poiqeroiehfkjasdf';
let input = 'poiqeroiehfkjasdf';
input = 'polo';

if (input === correctPassword) {
    console.log('welcome');
} else if (input === '') {
    console.log('please input password');
} else {
    console.log('access denied');
}

// Switch
// cases
// default

const errorCode = 4; // errorCode - can be 1 to 3 - 0 is success

switch (errorCode) {
    case 0:
        console.log('Success');
        break;
    case 1:
        console.log('try again');

        break;
    case 2:
    case undefined:
    case 'two':
    case '2':
        console.log('disk error');
        break;
    case 3:
        console.log('Command not recognised');
        break;
    case 4:
        console.log('4');
        break;

    default:
        console.log('Error not valid');
}

// Ternary operators

const score = 10;
const target = 15;
// [expression to evaluate] ? [value to return if true] : [value to return if false]
const qualificationStatus =
    score > target ? "You're qualified" : "You've NOT qualified";

console.log(qualificationStatus);

const number = 5 > 6 ? '5 is greater than 6' : '5 is Not greater than 6';
console.log(number);
