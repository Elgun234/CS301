// Task 1

//  1)
// let fullName =  "Elgun Mehralizade Hikmet";
// let letters = fullName.split('');

// console.log(letters);

// 2)


// let fullName = "Elgun Mehralizade Hikmet";
// let names = fullName.split(' ');


// let newFullName = names[1] + ' ' + names[0] + ' ' + names.slice(2).join(' ');

// console.log(newFullName);


// 3)

// let fullName = "Elgun Mehralizade Hikmet";

// let names = fullName.split(' ');
// let newFullName = names[1] + ' ' + names[0] + ' ' + names.slice(2).join(' ');
// let stringVersion = newFullName.toString()

// console.log(stringVersion)  ;


// 4)

// let arr = [4, 5, 2, 1,5, 2, 5, 3, 5, 6, 2, 1, 6, 2, 6, 2, 5, 3, 2, 7, 4, 6, 4, 5, 6, 2, 5, 6, 3, 7, 3, 7]



// let countOf5 = arr.filter(item => item === 5).length;

// console.log("Occurrences of 5: " + countOf5);



 // 5)

// let arr = [4, 5, 2, 1,5, 2, 5, 3, 5, 6, 2, 1, 6, 2, 6, 2, 5, 3, 2, 7, 4, 6, 4, 5, 6, 2, 5, 6, 3, 7, 3, 7]

// let sum = arr.reduce((total, current) => total + current,0)


// console.log("Sum: " + sum);



// 6)


// let arr = [4, 5, 2, 1,5, 2, 5, 3, 5, 6, 2, 1, 6, 2, 6, 2, 5, 3, 2, 7, 4, 6, 4, 5, 6, 2, 5, 6, 3, 7, 3, 7]

// let duplicatedNumbers = arr.filter((value, index, self) => self.indexOf(value) !== index);


// let sortedDuplicatedNumbers = Array.from(new Set(duplicatedNumbers)).sort((a, b) => a - b);

// console.log("Duplicated Numbers (in ascending order): " + sortedDuplicatedNumbers.join(', '));



// 7)


// let arr = [4, 5, 2, 1, 5, 2, 5, 3, 5, 6, 2, 1, 6, 2, 6, 2, 5, 3, 2, 7, 4, 6, 4, 5, 6, 2, 5, 6, 3, 7, 3, 7];

// let maxNumber = Math.max(...arr);


// let frequencyOfMaxNumber = arr.filter(num => num === maxNumber).length;

// console.log("Largest Number: " + maxNumber);
// console.log("Frequency of the Largest Number: " + frequencyOfMaxNumber);


// 8)

// let name = "Elgun"


// let totalLettersCount = name.length;

// console.log("Total letter count in the word 'Elgun':", totalLettersCount);


// let arr = [4, 5, 2, 1, 5, 2, 5, 3, 5, 6, 2, 1, 6, 2, 6, 2, 5, 3, 2, 7, 4, 6, 4, 5, 6, 2, 5, 6, 3, 7, 3, 7];
// let targetNumber = 5
// let isNumberInArray = arr.includes(targetNumber);

// console.log(`Is ${targetNumber} present in the array? ${isNumberInArray}`);


// // 9}


// let arr = [4, 5, 2, 1, 5, 2, 5, 3, 5, 6, 2, 1, 6, 2, 6, 2, 5, 3, 2, 7, 4, 6, 4, 5, 6, 2, 5, 6, 3, 7, 3, 7];


// const desiredRemainder = 2;
// const index = arr.findIndex(element => element % 3 === desiredRemainder);


// if (index !== -1) {
//     console.log(`Found element: ${arr[index]}, Index: ${index}`);
// } else {
//     console.log("Element not found with the specified remainder.");
// }


// 10)

// let arr = [4, 5, 2, 1, 5, 2, 5, 3, 5, 6, 2, 1, 6, 2, 6, 2, 5, 3, 2, 7, 4, 6, 4, 5, 6, 2, 5, 6, 3, 7, 3, 7];

// const maxİndex = arr.indexOf(Math.max(...arr))

// console.log(maxİndex)


// 11)

// let arr = [4, 5, 2, 1, 5, 2, 5, 3, 5, 6, 2, 1, 6, 2, 6, 2, 5, 3, 2, 7, 4, 6, 4, 5, 6, 2, 5, 6, 3, 7, 3, 7];

// let searchNumber = 4

// let indices = arr.reduce(function(acc, element, index) {
//     if (element === searchNumber) {
//         acc.push(index);
//     }
//     return acc;
// }, []);


// if (indices.length > 0) {
//     console.log(`Indices of the number 4 in the array: ${indices.join(', ')}`);
// } else {
//     console.log("Number 4 not found in the array.");
// }


// 12)

//  let arr = [4, 5, 2, 1, 5, 2, 5, 3, 5, 6, 2, 1, 6, 2, 6, 2, 5, 3, 2, 7, 4, 6, 4, 5, 6, 2, 5, 6, 3, 7, 3, 7];

// let searchNumber = 5;

// let smallestIndex = arr.indexOf(searchNumber);
// let largestIndex = arr.lastIndexOf(searchNumber);



// console.log(`Smallest index of the number 5: ${smallestIndex}`);
// console.log(`Largest index of the number 5: ${largestIndex}`);



// 13)

// let arr = [4, 5, 2, 1, 5, 2, 5, 3, 5, 6, 2, 1, 6, 2, 6, 2, 5, 3, 2, 7, 4, 6, 4, 5, 6, 2, 5, 6, 3, 7, 3, 7];

// let newArray = arr.filter(element => element > 2);

// console.log(newArray)


// // 14)

// let arr = [4, 5, 2, 1, 5, 2, 5, 3, 5, 6, 2, 1, 6, 2, 6, 2, 5, 3, 2, 7, 4, 6, 4, 5, 6, 2, 5, 6, 3, 7, 3, 7]
// let searchNumber = 7

// let indexSum = arr.indexOf(searchNumber) !== -1 



// 16)




let arr2 = [
    {
        name: 'test',
        key: 1
    },
    {
        name: 'task',
        key: 2
    },
    {
        name: 'tanqo',
        key: 3
    },
    {
        name: 'like',
        key: 4
    },
    {
        name: 'task',
        key: 5
    },
    {
        name: 'trust',
        key: 6
    },
    {
        name: 'test',
        key: 7
    },
    {
        name: 'last',
        key: 8
    },
    {
        name: 'tanqo',
        key: 9
    },
    {
        name: 'elephant',
        key: 10
    },
    {
        name: 'love',
        key: 11
    },
    {
        name: 'small',
        key: 12
    },
    {
        name: 'little',
        key: 13
    },
]


// const Objects = arr2.filter(obj => obj.name.startsWith('t'));

// console.log(Objects)


// 17)

// const tStartEndCount = arr2.filter(obj => obj.name.startsWith('t') && obj.name.endsWith('t')).length;


// console.log(tStartEndCount)


// 18)

// const tStartEndKeySum = arr2.reduce((sum, obj) => obj.name.startsWith('t') && obj.name.endsWith('t') ? sum + obj.key : sum, 0);

// console.log(tStartEndKeySum)



// 19)




// 20)
// const longestNameKey = arr2.reduce((maxKey, obj) => obj.name.length > arr2[maxKey].name.length ? obj.key : maxKey, 0);
// console.log(longestNameKey)


// 21)

// const longestNameIS = Math.pow(arr2.findIndex(obj => obj.key === longestNameKey), 2);

// console.log(longestNameKey)



// 22)
// const lengthFourObjects = arr2.filter(obj => obj.name.length === 4);

// console.log(lengthFourObjects)


// 23)

// const maxKeyObjectName = arr2.reduce((maxKeyObj, obj) => obj.key > arr2[maxKeyObj].key ? obj.key : maxKeyObj, 0)

// console.log(maxKeyObjectName)



// 24)

// const doubleLIndexes = arr2.reduce((indexes, obj, index) => obj.name.split('L').length - 1 === 2 ? [...indexes, index] : indexes, []);

// console.log(doubleLIndexes)

// 25)

const doubleTKeys = arr2.reduce((keys, obj) => obj.name.split('t').length - 1 === 2 ? [...keys, obj.key] : keys, []);

console.log(doubleTKeys)


