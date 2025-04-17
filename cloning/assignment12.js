/*Question 1: Book Library
You are developing a digital library system to manage books. 
Each book has a title, author, and year of publication. 
You want to create a library that can add books, list them, and clone books for editing without altering the original copy.
Create a constructor function to create 'Book' objects with properties: 'title', 'author', and 'year'.
Implement a function 'addBook' to add a book to the library (an array of books).
Implement a function 'listBooks' that lists all books in the library, using a 'for...of' loop.
Use the 'Object.assign()' method to create a clone of a book object, allowing changes to be made without affecting the original.
Test the functions by adding at least 3 books, cloning one, and listing all books.*/
function Book(title, author, year) {
    this.title=title,
    this.author=author,
    this.year=year
}
let library = [];

function addBook(book) {
    library.push(book);
}
function listBooks() {
    for (const book of library) {
        console.log(`Title: ${book.title}, Author: ${book.author}, Year: ${book.year}`);
    }
}
function BookCopy(book) {
    return Object.assign({}, book);
}
addBook(new Book("1984", "George Orwell", 1949));
addBook(new Book("The Hobbit", "J.R.R. Tolkien", 1937));
addBook(new Book("To Kill a Mockingbird", "Harper Lee", 1960));
listBooks()
let clonedBook = Object.assign({}, library[1]);
clonedBook.title = "The Lord of the Rings";
console.log("Cloned and modified book:");
console.log(`Title: ${clonedBook.title}, Author: ${clonedBook.author}, Year: ${clonedBook.year}`);
listBooks()



console.log("____");
console.log("____");
console.log("____");
/*Question 2: Shopping Cart
You are building an online shopping cart where users can add, and view items. 
Each item has a name, price, and quantity.
1. Create a factory function 'createItem' to generate an item with properties 'name', 'price', and 'quantity'.
2. Implement a 'cart' array to store items.
3. Implement 'addItem' to add items from the cart.
4. Use a 'for...in' loop to iterate over the properties of an item object and display them.
5. Implement a 'calculateTotal' function that uses a 'for...of' loop to calculate the total cost of items in the cart.*/
function createItem(name, price, quantity){
   return{
     name,
    price,
    quantity
   };
}
let cart = [];
function addItem(item){
cart.push(item);
}
function listItems() {
    console.log("Listing items in the cart:");
    for (const item of cart) {
        for (const property in item) {
            console.log(`${property}: ${item[property]}`);
        }
        console.log('---');
    }
}
function calculateTotal() {
    let total = 0;
    for (const item of cart) {
        total += item.price * item.quantity;
    }
    return total;
}
addItem(new createItem("Laptop", 1200, 1));
addItem(new createItem("Phone", 800, 2));
listItems();
console.log(`Total cost: $${calculateTotal()}`);
