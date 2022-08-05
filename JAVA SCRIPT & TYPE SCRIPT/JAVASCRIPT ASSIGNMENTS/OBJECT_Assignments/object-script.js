console.log("Q1\n");

function person(fname, lname, age, skills, dateofbirth, address, married, profession) {
    this.fname = fname;
    this.lname = lname;
    this.age = age;
    this.skills = skills;
    this.dateofbirth = dateofbirth;
    this.address = address;
    this.married = married;
    this.profession = profession;
}


person1 = new person("nikhil","goud",22,["c"],"24/10/1996",{city:"hyderabad",pincode:"521185"},"false","sr analyst");
person2 =new person("harish","chinna",21,"HTML","08/06/1997",{city:"Ameerpet",pincode:"500038"},"false","jranalyst");

print=function()
{
console.log(person1);
console.log(person2);
}();

console.log("Q2\n");

amithab=new person("amithab","bachan",22,["c"],"24/10/1996",{city:"hyderabad",pincode:"521185"},"false","sranalyst");

abhisheik=new person("abhisheik",21,"HTML","08/06/1997","false","jr analyst");
var abhisheik=Object.create(abhisheik);

print=function()
{
console.log(amithab);
console.log(abhisheik.lname);
console.log(abhisheik.address);
}();

console.log(abhisheik.fname);

console.log('-------------------------------------------');
let Rectangle = function(width,height){
    this.width = width;
    this.height = height;
    this.getArea = () => console.log('Area of Rectangle is ' + width*height);
}

let shape1 = new Rectangle(3,4);
let shape2 = new Rectangle(6,7);

shape1.getArea();
shape2.getArea();

let r = new Rectangle(4, 5);
r.height = 50;
r.getArea();

let man = {firstname:'Newman',middlename:'Horse',lastname:'Jack'};

console.log(man.firstname);
console.log(man.lastname);
console.log(man.middlename);

man.middlename = 'Slick';
console.log(man.middlename);

let string_object1 = "[{firstname:'Eval',lastname:'R'}]";

let eval_object = eval(string_object1);

let string_object2 = '{"firstname":"Eval","lastname":"R"}';

const parse_object = JSON.parse(string_object2);

console.log(parse_object);

