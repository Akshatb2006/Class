let inputBox = document.getElementById("inputbox");
let displayBox = document.getElementById("displaybox");
let count = 1;

function debounce(fun, timer) {
    let timeOut;
    return function(...args) {
        clearTimeout(timeOut);
        timeOut = setTimeout(() => {
            fun.apply(this, args);
        }, timer);
    }
}

function throttle(fn, delay) {
    let timeout;
    let lastran;
    return function(...args) {
        clearTimeout(timeout);
        if (!lastran) {
            fn(...args);
            lastran = Date.now();
        } else {
            timeout = setTimeout(() => {
                if ((Date.now() - lastran) >= delay) {
                    fn(...args);
                    lastran = Date.now();
                }
            }, delay - (Date.now() - lastran));
        }
    }
}

let display = function(query) {
    console.log('API call hit: ' + count++);
    displayBox.textContent = query;
}

let debounceDisplay = debounce(display, 1000);
let throttleDisplay = throttle(display, 1000);

inputbox.addEventListener('input', (e) => {
    throttleDisplay(e.target.value);
});
