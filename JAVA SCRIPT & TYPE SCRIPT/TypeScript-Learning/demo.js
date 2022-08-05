//declarations by type ineference
var x = 10;
var y = "hi";
var z = true;
//annotations
var a = 10;
var b;
//type inference
//  x = 'hi';       //Type 'string' is not assignable to type 'number'
// now to change type we have to make it into another variable
var n = x + "Hello";
// ANY type : allows you to assign data of any type 
var info;
info = 10;
info = "wassup y'all";
info = true;
info = null;
var information; // we can also do it simply when we declare a var its of type any if not initiated
// enumeration type
var eye_color;
(function (eye_color) {
    eye_color[eye_color["White"] = 4] = "White";
    eye_color[eye_color["Black"] = 1] = "Black";
    eye_color[eye_color["Red"] = 3] = "Red";
})(eye_color || (eye_color = {}));
;
var my_eyecolor = eye_color.White;
console.log(my_eyecolor);
console.log(eye_color[my_eyecolor]);
//array and tuples
let strArr1 = ["hello", "world"];
let strArr2 = ["hello", "world"];
let anyArr = ["Hello", 10, true];
let myTuple = ["Hi", 10];
console.log(myTuple[0]);
console.log(myTuple[1]);
// myTuple[2] = 100;
//A tuple is a TypeScript type that works like an array with some special considerations:
// The number of elements of the array is fixed.
// The type of the elements is known.
// The type of the elements of the array need not be the same.
//console.log(myTuple[2]);
//pushing works
myTuple.push(100);
console.log(myTuple);
//------------------class ---------------------------
class Person {
    constructor(fname, lname) {
        this.fname = fname;
        this.lname = lname;
    }
}
;
//in type script we can prefix all attributes to a constructor
class Person1 {
    constructor(fname, lname) {
        this.fname = fname;
        this.lname = lname;
        this.fname = fname;
        this.lname = lname;
    }
}
let employee1 = {
    fname: "Chandler",
    lname: "Bing",
    age: 43,
};
let employee2 = {
    fname: "Affan",
    lname: "Bin Hasan",
};
console.log(employee1);
console.log(employee2);
//read on promises , reflection , proxy in ES6 and type definition in typescript
//# sourceMappingURL=demo.js.map