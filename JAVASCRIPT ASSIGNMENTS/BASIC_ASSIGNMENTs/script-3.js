const x = 5;

function half(x) {
    return(x / 2);
}

function seven() {
    let x = 7;
    return(x);
}

function calculator(a,b,c) {
    if(c === 0){
        return 'ZeroDivisionError';
    }
    else{
        return (a+b)/c;
    }
}

function isEven(n) {
    return (n%2 == 0);
    
}


let four_nums = [],num;

for (let i = 0; i<4;i++){
    num = Math.random();
    four_nums.push(num);
}

let hundred_nums = [],num2;

for (let i = 0; i<=100;i++){
    num2 = Math.random();
    hundred_nums.push(num);
}

function longestToken(str) {
    let final_str = '',temp_str='',count,max_count=0;
    for (let i = 0 ;i < str.length; i++){

        if(str[i] === 'a' || str [i] === 'b'){
            count = 0;
            temp_str = '';
        }

        else {
            temp_str += str[i]
            count += 1;
             
        }

        if (count > max_count){
            max_count = count;
            final_str = temp_str;
        }
    }
    return final_str;
}

function lengthOfNonQWords(arr) {
    let count = 0;
    for (let i = 0 ;i < arr.length; i++){
        if (arr[i].includes('q') === false){
            count += arr[i].length;
        }
    }
    return count;
}
