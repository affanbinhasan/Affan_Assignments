var promise1 = new Promise(function(resolve,reject){
    let x=2;
    if(x!=0){
        resolve(x);
    }
    else{
        reject("x value is 0");
    }
})
var promise2 = new Promise(function(resolve,reject){
    let y=5;
    if(y!=0){
        resolve(y);
    }
    else{
        reject("y value is 0");
    }
})


 Promise.all([promise1,promise2]).then(function(values){
     let sum =0;
    for(let num in values){
        sum+=values[num];
    }
    console.log(sum)
 })



class Account{
     constructor(id,name,balance){
         this.id=id;
         this.name= name;
         this.balance = balance;
     }
 }
class SavingAccount extends Account{
    constructor(id,name,balance,interest){
           super(id,name,balance);
           this.interest  = interest;
    }
    getBalance(){
        this.totalBalance=0;
        this.totalBalance = this.balance + (this.balance*this.interest);
        return this.totalBalance;
    }
}

class CurrentAccount extends Account{
    constructor(id,name,balance,cash_credit){
           super(id,name,balance);
           this.cash_credit  = cash_credit;
    }
    getBalance(){
        this.totalBalance=0;
        this.totalBalance = this.balance -this.cash_credit;
        return this.totalBalance;
    }
}

var SavingAccountObj = new SavingAccount(12,"Kanshi",8000,10);
console.log(SavingAccountObj.getBalance());

var CurrentAccountObj = new CurrentAccount(12,"ANusha",140000,100);
console.log(CurrentAccountObj.getBalance());



var Circle = /** @class */ (function () {
    function Circle(radius) {
        this.radius = radius;
    }
    Circle.prototype.print = function () {
        return "The radius of Circle is " + this.radius + "\nArea is " + (Math.PI * this.radius * this.radius);
    };
    return Circle;
}());
var Employee = /** @class */ (function () {
    function Employee(ename, eid, edesignatio) {
        this.eid = eid;
        this.ename = ename;
        this.edesignatio = edesignatio;
    }
    Employee.prototype.print = function () {
        return "Employee Details:\n" + "Employee Id:" + this.eid + "\n" + "Employee Name: " + this.ename
            + "\n" + "Employee Designation: " + this.edesignatio;
    };
    return Employee;
}());
function printAll(obj1, obj2) {
    console.log(obj1.print());
    console.log(obj2.print());
}
var circleObj = new Circle(2);
var employeeObj = new Employee("Neha", 12345, "Manager");
printAll(circleObj, employeeObj);