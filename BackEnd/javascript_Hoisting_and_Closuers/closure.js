//closure is a function along with its lexical environment


function closure(){

    var a=15;

    function abc(){

        console.log(a);  // when a not found inthis fuction it check in its lexical envirnment
                        // means its parent function and next parents functions parent function
        
    }
    return abc;
}

let b = closure();
b();   // show value of a when call func b()