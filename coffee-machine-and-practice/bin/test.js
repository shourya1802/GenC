console.log("Started")

const pm = new Promise((resolve, reject) => {
    setTimeout(() => {
        console.log("Completed")
    }, 5000);
    if (1 === 1) resolve("Done");
    else reject("error");

});

console.log("Middle")

pm.then(ok => console.log(ok)).catch(err => console.log(err));