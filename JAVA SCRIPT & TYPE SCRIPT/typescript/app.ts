console.log('Hello');

function greetPerson(name) {
    var greet;
    if(name === 'Affan'){
        greet = "Hello Affan";
    }
    else{
        greet = 'Hi there';
    }
    
    console.log(greet);
}
greetPerson("Affan");
greetPerson('none');

//default function parameters

let percentExtra = () => 0.1;

let getValue = function name(value=10,extra=value*percentExtra()) {
    console.log(value+extra);
    console.log('Number of arguements passed in is : ' + arguments.length)
}

getValue();
getValue(20);
getValue(undefined,20);

const x = 4;

if(x===4){
    let y = 1;
}

//console.log(y);

let displayColors = function (message , ...colors) {
    console.log(message);
    //console.log(colors);
    for (let i in colors){
        console.log(colors[i]);
    }
}
let colorArray = ['Orange','Yellow','Indigo']
let message = 'List of Colors';

displayColors(message, ...colorArray)

displayColors(message,'Red');
displayColors(message,'Red','Blue');
displayColors(message,'Red','Blue','Green');

//----------------OBJECT LITERALS--------------------------------
let firstname = 'Affan'
let lastname = 'Bin Hasan'

let person = {
    firstname,
    lastname
}

function createPerson(firstname, lastname, age) {
    let fullName = firstname+" "+lastname;
    return {
        firstname, 
        lastname,
        fullName,
        isSenior:function(){
            return age>60
        }
    }
}

let p = createPerson('Ross',"Geller",37);

console.log(p.firstname);
console.log(p.lastname);
console.log(p.isSenior());

let global_var = "lastname"

let person_2 = {
    "first name":"Affan",
    [global_var]:"Bin Hasan"
}

console.log(person_2.lastname);

//-----------------------Destructing Array------------------------

let employee = ["Affan","Bin Hasan","Male"]

let [fname,lname,gender,age=22] = employee;

console.log(fname)
console.log(lname)
console.log('---------------------------------------------------')
console.log(gender)
console.log(age);

let [fName,...elements] = employee;

console.log(elements)

//-------------------Destructing Objects---------------------------
let employee_obj = {
    emp_fname:"Chandler",
    emp_lname:"Ross",
    emp_gender:"Male"
}

let {emp_fname: f,emp_lname: l,emp_gender: g} = employee_obj; //using alias for attributes

console.log(f)
console.log(l)
console.log(g)

//-------------------FOR OF LOOP-------------------------------

console.log('Using simple FOR LOOP')
for(let i in colorArray){
    console.log(colorArray[i]);
}

console.log('Using FOR OF LOOP')
for (let color of colorArray){
    console.log(color)
}

let letters = "ABC"

for(let letter of letters){
    console.log(letter)
}

//--------------------Classes ---------------------------------
//classes consist of methods only like constructor method
class Person{
    constructor(name,age){
        this.name = name;
        console.log('Constructor Created for : '+ this.name) //constructor method
    }
    static staticMethod(){
        console.log("StaticMethod") //static method
    }
    greet(){
        console.log("Hello "+ this.name)    //prototype method
    }
    getID(){
        return 10;  //prototype
    }
    getAge(){
        return this.age;
    }
}

let guy = new Person("Chandler",90);
Person.staticMethod();
guy.greet();

console.log(typeof Person)

console.log(guy.greet === Person.prototype.greet)

class Employee extends Person {
    constructor(name){
        super(name); //invokes the constructor of the parent class
        console.log("Employee COnstructor Created For :" + this.name)
    }
}

let emp = new Employee('Employee');

console.log(emp.getID());

Person.staticMethod();

//------------------------------------Collections---------------------------------

//-------------------------------map and sets ------------------------------

let mySet = Object.create(null);

mySet.id = 1;

if(mySet.id){
    console.log('id exist');
}

let myMap = Object.create(null);

myMap.name = "Affan";
let val = myMap.name;
console.log(val);

myMap[100] = "Hello"
console.log(myMap["100"]);
let obj1 = {};
let obj2 = {};
myMap[obj1] = "World";
console.log(myMap[obj1]);

//new ds for set

let myset = new Set();
myset.add("Hello");
console.log(myset)

myset.add(obj1);
myset.add(obj2);

console.log(myset)

let newset = new Set([1,2,3,4,4,4,4,4,5]);

console.log(newset)

newset.add('hello').add('world')

console.log(newset)