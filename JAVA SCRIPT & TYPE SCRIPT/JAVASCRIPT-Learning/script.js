// alert("Hello World");
console.log(1);
let age = 25;
console.log("age is " + age);

const current_year = 2022;
console.log(current_year)

var score = 80;  //old method of creating variables . now we use let and const

//strings

email = 'affan.better@nodomain.com';
console.log(email);

//string concatenation
let first_name ="Affan";
let last_name = "Bin Hasan"

let full_name = first_name + " " + last_name;

console.log(full_name);

//getting character
console.log(full_name[0]);

//string length
console.log(full_name.length);

//string methods
console.log(full_name.toUpperCase());
let name_length = full_name.length

console.log(name_length);

let index = email.indexOf('@');

console.log('index of @ in the email address - ' + index);

//common string methods

let last_index = email.lastIndexOf('n');

console.log('last index of n');

//slice
console.log(email.slice(3,8));

let indexof_at = email.indexOf('@');
let indexof_dot = email.lastIndexOf('.');

let domain = email.slice(indexof_at+1,indexof_dot);

console.log('domain is : ' + domain);


//replace
let replacement_single = email.replace('.',','); 
let replacement_correction = email.replace(',','.'); 

let replacement = email.replace('nodomain','gmail');



console.log('email after domain assignment : ' + replacement);

//--------------NUMBERS--------------------------------

let radius = 10;
const pi = 3.14;

//math operator +,-,*,/,**,%

//expression follows B P D M A S . where P -> power

let circle_area = pi * radius**2;
console.log('area of cirle is : ' + circle_area)

let steps = 0;

steps++; //one by one incrementer
console.log('steps one by one : ' + steps);
steps += 5 // multiple incrementer
// we can increment by *=,/=,-=
console.log('multiple steps now : ' + steps);

//-------Template Strings ------------------------------------

const title = 'Psychological Genius';
const author = 'Affan';
const likes = 30 ; 

//normal concatenation
let information_normal_way = 'title : ' + title + ' by ' + author + ' has ' + likes + " likes ";

console.log(information_normal_way);

//template string way. here we use ` not ' -> has a button above TAB ON KEYBOARD

let information = `Title : ${title} by ${author} has ${likes} likes`;
console.log('Information Using String Template\n'+information);

//HTML Template 

let html = `
    <h2>${title}</h2>
    <p>By ${author}</p>
    <span>This Blog has ${likes} likes.</span>
    `;

console.log(html);

//----------------ARRAYS------------------------------------------
let names =['Stormzy','Dave','Aitch'];

let third_name = names[2];

names[9] = 'Affan';

console.log(names);

names.push('Harmony');

console.log('array after PUSH function : ' +names)

names.pop();

console.log('array after POP function : ' +names);

console.log('length of array of names is = ' + names.length);

let all_names_str = names.join(',');

console.log('All Name in a String : ' + all_names_str);

//Concatenate Arrays

let combined_array = names.concat(['Zikr','Fikr','Witr']);
//combined_array = [1,2,3,4,5];

console.log('After combination of new array : '+ combined_array);

new_var = 'new var';

console.log(new_var);

new_var = 2;

console.log(new_var);

new_var2 = 10 ;

console.log(new_var + new_var2);

console.log(new_var ==  new_var2);

console.log(new_var !=  new_var2);

console.log(combined_array.includes('Zikr'));

// == or != is abstact comparator
let your_age = 25;

console.log('== or != is abstact comparator');
console.log(your_age == 25);
console.log(your_age == '25');

// === or !== strict comparison

console.log('=== or !== strict comparison');
console.log(your_age === 25);
console.log(your_age === '25');

//---------------TYPE CONVERSION----------------------------------
let high_score = '100';
console.log('TYPE CONVERSION HAPPENING NOW');
console.log('BEFORE CONVERSION');
console.log(typeof high_score);
console.log(high_score + 1);

high_score = Number(high_score);
console.log('AFTER CONVERSION');
console.log(typeof high_score);
console.log(high_score + 1);

let invalid_conv = Number('Affan');
console.log("Trying to make a String a Number");
console.log(invalid_conv);
console.log(typeof invalid_conv);



//------------------------------------------------------------------------------------------------------------------------------'


//-----------------------------------------FUNCTIONS--------------------------------------------------------------------------------------

const speak = function name() {
    console.log('good day');
};


//------------------------------------------OBJECTS--------------------------------------------------

let user = {
    name: 'crystal',
    age : 30,
    email: 'crystal@clear.com',
    location: 'berlin',
    blogs: [{title:'New World',likes:30},{title:'10 Important Points to note',likes:50}],

    login : function() {
        console.log('user logged in');
    },
    logout() {
        console.log('user logged out');
    },
    logBlogs(){
        console.log('This User has written following blogs : ');
        this.blogs.forEach(blog => {
            console.log(blog.title, blog.likes);
        })
    }
}

console.log(typeof user);
//acessing property
console.log("Username is : " + user.name);
console.log("User's email is : " + user['email']);

//update value
user.age = 35
user['name'] = 'Affan';

console.log("updated => " + user.name);

//using methods
user.login();
user.logout();

// "this" usage
console.log(this);
user.logBlogs();

//MATH OBJECT

console.log(Math);
console.log(Math.PI);

const area = 7.6;
console.log("round of area : " + Math.round(area));
console.log("floor of area : " + Math.floor(area));
console.log('remove decimal : ' + Math.trunc(area));

//random numbers
const random_num = Math.random();

console.log("Random Number = "+random_num);

//any number till 100
console.log(Math.round(random_num * 100));

//---memory management of reference types/object types ----

//primitive values stack

//assignning values
let scoreOne = 50;
let scoreTwo = scoreOne;

console.log(`scoreOne : ${scoreOne} `, `scoreTwo : ${scoreTwo}`);
   
//changing value
scoreOne = 100;
console.log(`scoreOne : ${scoreOne} `, `scoreTwo : ${scoreTwo}`);

//Reference Type

//assigning value
const userOne = {name: "Affan",age:21};
const userTwo = userOne; // it doesn't copy the object but the pointer to the actual copy

console.log(userOne,userTwo);

//updating value of one - messes up all the copies we tried to make -

userOne.age = 10 ;

//changes made to actual copy shown by copied since it points to actual object which has changed now
console.log(userOne,userTwo);

//-----contructor------

let myProfile_dummy = {
    firstName: "Affan",
    middleName: "Bin",
    lastName: "Hasan",

    fullname(){
        console.log(`Full Name is ${this.firstName} ${this.middleName} ${this.lastName}`);
    }
}

myProfile_dummy.fullname();

let Profile = function(firstName,middleName,lastName){
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    this.fullname = function(){
        console.log(`Full Name is ${this.firstName} ${this.middleName} ${this.lastName}`);
    };
}

let person1 = new Profile('Affan','Bin','Hasan');
let person2 = new Profile('Dave','','Dylan');
let person3 = new Profile('Amit','','Mahadik');
let person4 = new Profile('Cristiano','Ronaldo','Dos Santos');

person1.fullname();
person2.fullname();
person3.fullname();
person4.fullname();

let arrow = () => {
    let x = 3
    console
};

arrow();