// JSON - JavaScript Object Notation

import data from './data.json';

const myAPIReponse = [
    {
        rooms: [
            { name: 'Front Hall', hasFirePlace: false },
            { name: 'Kitchen', hasFirePlace: true },
            { name: 'Best Bedroom', hasFirePlace: true },
            { name: 'Pantry', hasFirePlace: false },
        ],
        address: {
            houseName: 'Bag End',
            street: 'Bagshot Row',
            town: 'Hobbiton',
            region: 'The Shire',
        },
    },
    {
        rooms: [
            { name: 'Front Hall', hasFirePlace: false },
            { name: 'Kitchen', hasFirePlace: true },
            { name: 'Best Bedroom', hasFirePlace: true },
            { name: 'Pantry', hasFirePlace: false },
        ],
        address: {
            houseName: 'Bag End',
            street: 'Bagshot Row',
            town: 'Hobbiton',
            region: 'The Shire',
        },
    },
    {
        rooms: [
            { name: 'Front Hall', hasFirePlace: false },
            { name: 'Kitchen', hasFirePlace: true },
            { name: 'Best Bedroom', hasFirePlace: true },
            { name: 'Pantry', hasFirePlace: false },
        ],
        address: {
            houseName: 'Bag End',
            street: 'Bagshot Row',
            town: 'Hobbiton',
            region: 'The Shire',
        },
    },
];

type User = {
    id: number;
    name: string;
    username: string;
    email: string;
    address: {
        street: string;
        suite: string;
        city: string;
        zipcode: string;
        geo: {
            lat: string;
            lng: string;
        };
    };
    phone: string;
    website: string;
    company: {
        name: string;
        catchPhrase: string;
        bs: string;
    };
};

const user: User = data[0];
for (const key in user) {
    // console.log('user', user);
    console.log('key:', key);
    console.log('Value:', user[key as keyof User]);
}

// console.log(output);

type Dog = {
    [key: string]: string | number;
};

const myDog: Dog = {
    name: 'Pippy',
    age: 12,
    weight: '6.5 kg',
};

for (const key in myDog) {
    console.log('Key : ' + key);
    console.log('Value : ' + myDog[key]);
    console.log('---');
}

type Room = {
    name: string;
    hasFirePlace: boolean;
};

type Address = {
    houseName: string;
    street: string;
    town: string;
    region: string;
};

type House = {
    rooms: Room[];
    address: Address;
};

const myHouse: House = {
    rooms: [
        { name: 'Front Hall', hasFirePlace: false },
        { name: 'Kitchen', hasFirePlace: true },
        { name: 'Best Bedroom', hasFirePlace: true },
        { name: 'Pantry', hasFirePlace: false },
    ] as Room[],
    address: {
        houseName: 'Bag End',
        street: 'Bagshot Row',
        town: 'Hobbiton',
        region: 'The Shire',
        // country: 'Greenland',
    },
};

//For each house in my Array I want to have a string with the address of that house. All the strings should be in an array.

const addresses = myAPIReponse.map((house) => {
    return Object.values(house.address).toString();
});

console.log(addresses);
