


function fizzBuzz(){
    for(let i = 1; i <= 100; i++){
        let output = (i%3==0 ? "Fizz" : "") + (i%5==0 ? "Buzz" : "");
        console.log(output.length != 0 ? output : i);
    }
}

fizzBuzz();