function timer() {
    let second = 0;

    const run = () => {
        second++;
        console.log(second);
    }
    return {
        run: run
    }
    // const func = () => {
    //     return {
    //         run: run,
    //     }
    // }
    // return func();
}


function main() {

    const t = timer();
    setInterval(t.run, 1000);
    // the main thread will never be interrupted ! there is no interruption
    // while(1);
}

main()