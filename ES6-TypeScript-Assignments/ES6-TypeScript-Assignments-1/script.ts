const x = 4;

if(x===4){
    let y = 1;
}

//console.log(y);

let Order = {
    id:101,
    title:'shirt',
    price:500,
    printOrder : () => console.log(`you ordered a ${this.title} of price ${this.price}`),
    getPrice : () => console.log('price is : '+this.price),
}

let Order2 = Object.assign(Order);

Order2.printOrder();

function userfriends(username,...userarray) {
    console.log(username);
    for (let i in userarray){
        console.log(userarray[i]);
    }
}

userfriends('affan',[1,2,3,4,5,6]);

function add(a=2,b=2) {
    console.log(a+b);
}

add();

function printCapitalNames(...names) {
    for (let i in names){
        console.log(names[i].toUpperCase());
    }
}

printCapitalNames('affan','bin','hasan','is','genius');

function ticket(model,desk_no,name) {
    console.log(`I have problem with laptop model no ${model} , desk number ${desk_no} and my name is ${name}`)
}

ticket('hh2300f',30226,'Affan')

let employee = ["Affan","Bin Hasan","Male"]

let [fname,lname,gender,age=22] = employee;

console.log('---------------------------------------------------')
console.log(gender)



//-------------------Destructing Objects---------------------------
let organization = {
    org_name:"Chandler",
    address:"56th Street, Swift Avenue , Newland",
    pincode: 712738
}

let {org_name,address,pincode} = organization; //using alias for attributes

console.log(pincode);

//------------------------------class and modules ------------------

class Account {
    constructor(id,name,balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    getAccountBalance(){
        console.log('Your Account Balance is : ' + this.balance)
    }
} 

class SavingAccount extends Account {
    constructor(id,name,balance,interest,cash_credit){
        super(id,name,balance);
        this.interest = interest;
        this.cash_credit = cash_credit;
    }
    getAccountBalance(){
        console.log(this.balance + this.cash_credit)
    }
}

class CurrentAccount extends Account {
    constructor(id,name,balance,interest,cash_credit){
        super(id,name,balance);
        this.interest = interest;
        this.cash_credit = cash_credit;
    }
}

let save_ac = new SavingAccount(98,'Dave',40000,3,4000);

save_ac.getAccountBalance();