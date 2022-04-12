function square(x) { return(x*x); }
function double(x) { return(x*2); }

function composedValue(f1,f2,value) {
    return f1(f2(value));
}

l//let f1 = n => square(double(n));
//let f2 = n => double(square(n));

const func_1 = function(f1,f2){}

function isEven(n) {
    return (n%2 === 0);
}

function find(arr,f1) {
    for(let i=0;i<arr.length;i++){
        if(f1(arr[i]) === true){
            return arr[i];
        }
    }
}

function map(arr,f1) {
    let temp_val,size=arr.length;
    for(let i=0;i<size;i++){
        temp_val=f1(arr[i]);
        arr.push(temp_val);
        
        
    }
    arr.splice(0,size);
    
    return arr;
}

console.log('Non Recursive Square Array');
console.log(map([1, 2, 3, 4, 5], square));

function anony(something) {
    blah;
}

function recursive_find(arr,f1) {
    //let i ;
    if(f1(arr[0])===true){
        
        //return arr[0];
        
    }
    else{
        arr.shift();
        recursive_find(arr,f1);
        return arr[0];
    }
    
}

console.log('Recursive - Find first Even in an Array');
console.log(recursive_find([1, 3, 5, 4, 2], isEven));

//20+30+26

//35 out of 76