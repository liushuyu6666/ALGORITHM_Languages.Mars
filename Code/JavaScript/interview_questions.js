var str = "Vivek Singh Bisht"; //using double quotes
var str2 = 'John Doe'; //using single quotes

var x = 3; //without decimal
var y = 3.6; //with decimal

var bigInteger =  234567890123456789012345678901234567890;

var a = 2;
var b =  3;
var c =  2;
if(a == b){
    console.log("t");
}// returns false
else{
    console.log("f");
}

var x; // value of x is undefined
var y = undefined; // we can also set the value of a variable as undefined

var z = null;

var symbol1 = Symbol('symbol');

console.log(typeof "John Doe") // Returns "string"
console.log(typeof 3.14) // Returns "number"
console.log(typeof true) // Returns "boolean"
console.log(typeof 234567890123456789012345678901234567890n) // Returns bigint
console.log(typeof undefined) // Returns "undefined"
console.log(typeof null) // Returns "object" (kind of a bug in JavaScript)
console.log(typeof Symbol('symbol')) // Returns Symbol

for(i = 0; i < 3; i++){
    b = 1;
    var b;
    b = 2;
    console.log(b);
}