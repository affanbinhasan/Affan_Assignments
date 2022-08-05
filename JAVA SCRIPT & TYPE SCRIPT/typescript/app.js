console.log('Hello');
function greetPerson(name) {
    var greet;
    if (name === 'Affan') {
        greet = "Hello Affan";
    }
    else {
        greet = 'Hi there';
    }
    console.log(greet);
}
greetPerson("Affan");
greetPerson('none');
//default function parameters
var percentExtra = function () { return 0.1; };
var getValue = function name(value, extra) {
    if (value === void 0) { value = 10; }
    if (extra === void 0) { extra = value * percentExtra(); }
    console.log(value + extra);
    console.log('Number of arguements passed in is : ' + arguments.length);
};
getValue();
getValue(20);
getValue(undefined, 20);
