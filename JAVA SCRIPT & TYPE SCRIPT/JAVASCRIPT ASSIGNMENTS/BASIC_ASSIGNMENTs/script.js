// alert('Hello World\n Press OK to Continue');

// let name = window.prompt('Enter Your Name : ');
// alert('Your Name is '+ name);

// let new_name = window.prompt('Enter Your Name : ');

// if(new_name === 'Alice' || new_name === 'Bob'){
//     alert('Welcome '+ new_name );
// }

// let n = window.prompt('Enter a Number to Perform Operations :');

function sum(x) {
    let i = 0,sum=0;
    while(i<=x){
        sum+=i;
        i+=1;
    }
    return sum;
}
//let result = sum(n);
//alert('Sum is : ' + result);

function sum_3_5(x) {
    let i = 0,sum=0;
    while(i<=x){
        if (i%3=== 0 || i%5===0){
        sum+=i;
        }
        i+=1;
    }
    return sum;
}
//let n2 = window.prompt('Enter a Number to Perform Operations :');
//let result2 = sum_3_5(n2);
//alert('Sum of number divisible by 3 and 5 := ' + result2);

function product(x) {
    let i = 0,sum=0;
    while(i<=x){
        sum*=i;
        i+=1;
    }
    return sum;
}

function multiplication_table() {
    //let i = 0,j=0;
    for (i = 1;i<=12;i++){
        console.log('table for '+ i);
        for(j=1;j<=10;j++){
            console.log(i + ' x ' + j +' = ' +i*j);
        }
        console.log('\n');
    }
}

function leap_year() {
    let count = 1,year=2022;
    while (count <= 20){
        if (year%4==0 || year%100==0 || year%400==0){
            console.log(`Leap Year ${count} is ${year}.`)
            count+=1;
        }
        year+=1;
    }
}

function max_element(arr) {
    if (arr.length == 0){
        return 'Please enter a Valid Array';
    }
    else{
        let max = arr[0];
        for (i=1;i<=arr.length;i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return 'Maximum value in the list is = ' + max ;
    }

}

function rev_list(arr) {
    if (arr.length == 0){
        return 'Please enter a Valid Array';
    }
    else{
        return arr.reverse();
    }
}

function search_element(ele,arr) {
    if (arr.length == 0){
        return 'Please enter a Valid Array';
    }
    else{
        console.log(arr.includes(ele));
    }
}

function odd_pos(arr) {
    if (arr.length == 0){
        return 'Please enter a Valid Array';
    }
    else{
        for(i=0;i<arr.length;i++){
            if((i+1)<=2 || (i+1)%2 !== 0 ){
                console.log(`Element at ${i+1} is : ${arr[i]}`);
            }
        }
    }
}

function running_total(arr) {
    let sum = 0;
    if (arr.length == 0){
        return 'Please enter a Valid Array';
    }
    else{
        for(i=0;i<arr.length;i++){
            sum+=arr[i];
            console.log(`Sum at index ${i} is : ${sum}`);
        }
    }
}

function add_with_for(arr){
    let count = 0;
    for(let i=0;i<arr.length;i++){
        count += arr[i];
    }
    return count;
}

function add_with_while(arr){
    let count = 0,i;
    while(i<arr.length){
        count += arr[i];
        i+=1;
    }
    return count;
}

function concat_list(arr1,arr2) {
    console.log(arr1.concat(arr2));
}

function concat_list_alter(arr1,arr2) {
    var both = [];
    var i;

    for (i = 0; i < arr1.length; i += 1) {
        both.push(arr1[i]);
        if (i < arr2.length) {
            both.push(arr2[i]);
        }
    }

  return both
}

function concat_list_sort(arr1,arr2) {
    let new_arr = [];
    new_arr.concat(arr1);
    new_arr.concat(arr2);
    new_arr.sort();
    console.log(new_arr);
}

function arrayRotate(arr, k) {
    let tmp = 0;
    const leng = arr.length;
    k = k % leng;
    for (let i = 0; i < k; i++) {
       tmp = arr.pop();
       arr.unshift(tmp);
    }
   return arr;
}

function fabonacci(n) {
    let n1 = 0, n2 = 1, nextTerm;
    for (let i = 1; i <= n; i++) {
        console.log(n1);
        nextTerm = n1 + n2;
        n1 = n2;
        n2 = nextTerm;
    }
}