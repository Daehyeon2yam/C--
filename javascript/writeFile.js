const { compileFunction } = require('vm');

const fs = require('fs').promises;

fs.writeFile('./writeme.txt','글이 써짐').then(()=> {
    return fs.readFile('./writeme.txt');
})
.then((data) =>{
    console.log(data.toString());
})
.catch((err)=>{
    console.error(err);
});
