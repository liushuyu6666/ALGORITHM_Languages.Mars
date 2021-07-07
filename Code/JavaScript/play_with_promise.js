const myPromise = new Promise((res, rej) => {
    let val = Math.random();
    if(val > 0.5){
        res(val);
    }
    else{
        rej(val);
    }
})

const anotherPromise = myPromise
.then((val) => {
    console.log('yes: ' + val);
    return val;
})
.then((val) => {
    console.log('yes again: ' + val);
    return val;
})
.catch((val) => {
    console.log('no: ' + val);
    return val;
})
.finally((val) => {
    // A finally callback will not receive any argument
    console.log('complete: ' + val); 
})

setTimeout(() => console.log(anotherPromise), 2000);

// while(1);