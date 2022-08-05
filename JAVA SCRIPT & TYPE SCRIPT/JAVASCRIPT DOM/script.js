const para = document.querySelector("p");

console.log(para);

const para_byclass = document.querySelector(".error");

console.log(para_byclass)

const div_para_byclass = document.querySelector("div.error");

console.log(div_para_byclass)

const paras = document.querySelectorAll('p');

console.log(paras)

console.log(paras[2])

paras.forEach(para => {
    console.log(para)
})

//get an element by ID
const title = document.getElementById('page-title');
console.log(title);

//get elements by their class name
const errors = document.getElementsByClassName(".error");
console.log(errors); //return as HTML Collections
console.log(errors[1])

//errors.forEach() // can't use for each loop for this collection

//get elements by tagt name
const p_tags = document.getElementsByTagName('p');
console.log(p_tags); // also return as HTML Collection can't use for each here as well
console.log(p_tags[0]);

//getting inner text of elements

console.log(para.innerText);
//changing actual inner text of html

para.innerText = "I changed this para with javascript";

paras.forEach(para => {
    console.log(para)
    para.innerText += ': addition with for each loop through javascript';
});

//accessing inner html and changing the value
const content = document.querySelector('.content');

content.innerHTML = '<h2>this is a new header changed with js</h2>';

const people = ['Dave','Stormzy','Aitch'];

people.forEach(person => {
    content.innerHTML += `<li>${person}</li>`
})
