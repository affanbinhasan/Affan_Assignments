let greet = Math.floor(Math.random()*2)+1;

if(greet === 1){
    alert("HAVE A GOOD DAY");
}
else{
    alert("HAVE A BAD DAY");
}

function parity(n) {
    if (n<0){
        return 'please enter a whole number';
    }
    if (n===0 || n%2 === 0){
        return 'even';
    }
    else if (n === 1 || n%2 === 1){
        return 'odd';
    }
}

function max(n1,n2,n3) {
    let max = n1;
    if (n2>max && n2 > n3){
        max = n2;
        return max;
    }
    else if(n3>max && n3 > n2){
        max = n3;
        return max;
    }
    else{
        return max;
    }

}

function flipcoin() {
    let outcome = Math.floor(Math.random()*2) + 1;
    if (outcome === 1){
        return 'head';
    }
    else{
        return 'tail';
    }
}

function numHeads(n) {
    let count = 0,outcome;
    for (let i = 1;i<=n;i++){
        outcome = flipcoin();
        if (outcome === 'head'){
            count+=1;
        }
        
    }
    return count;
}

function headsRatio(n) {
    let total_heads = numHeads(n);
    return total_heads/n;
}

function padChars(n,str) {
    let new_str = '';
    for (let i = 0 ; i<=n;i++){
        new_str += str;
    }
    return new_str;
}

function numRollsToGetSix() {
    let count = 0,outcome;
    while (outcome !== 6){
        outcome = Math.floor(Math.random()*6) + 1
        count+=1
    }
    return count;
}

