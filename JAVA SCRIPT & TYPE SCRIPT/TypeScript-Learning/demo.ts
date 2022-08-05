//declarations by type ineference
var x = 10;
var y = "hi";
var z = true;

//annotations

var a:number = 10;
var b:string;

//type inference
//  x = 'hi';       //Type 'string' is not assignable to type 'number'
 // now to change type we have to make it into another variable
var n = x + "Hello";

// ANY type : allows you to assign data of any type 

var info:any;
info = 10;
info = "wassup y'all";
info = true;
info = null;

var information; // we can also do it simply when we declare a var its of type any if not initiated

// enumeration type

enum eye_color {White=4,Black=1,Red=3};

var my_eyecolor = eye_color.White;

console.log(my_eyecolor);
console.log(eye_color[my_eyecolor]);

//array and tuples

let strArr1: string[] = ["hello","world"];
let strArr2: Array<String> = ["hello","world"];

let anyArr: any[] = ["Hello",10,true];

let myTuple: [string,number] = ["Hi",10];
console.log(myTuple[0])
console.log(myTuple[1])

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

class Person{
    public fname:string;
    public lname: string;
    constructor(fname:string,lname:string){
        this.fname = fname;
        this.lname = lname;
    }
};

//in type script we can prefix all attributes to a constructor
class Person1{
    constructor(public fname:string,public lname:string){
        this.fname = fname;
        this.lname = lname;
    }
}

//--------------------Interfaces--------------------------------------

interface Employee{
    fname:string;
    lname:string;
    age?:number; //makes the property optional else are required
}

let employee1: Employee = {
    fname:"Chandler",
    lname:"Bing",
    age:43,
}


let employee2: Employee = {
    fname:"Affan",
    lname:"Bin Hasan",
}

console.log(employee1);
console.log(employee2);


//read on promises , reflection , proxy in ES6 and type definition in typescript
