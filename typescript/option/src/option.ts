interface Option<A> {
    get(): A | null
    map<B>(f: (a: A) => B): Option<B>
}

interface Some<A> extends Option<A> {
    value: A
    get(): A
}

interface None extends Option<never> {
    get(): null
}

class Some<A> implements Some<A> {
    constructor(value: A) {
        this.value = value
    }
    get(): A {
        return this.value
    }
    map<B>(f: (a: A) => B): Some<B> {
        return new Some(f(this.value))
    }
}

class None implements None {
    constructor() {
    }

    get(): null {
        return null
    }

    map<A, B>(f: (a: A) => B): None {
        return new None
    }
}


let opt: Option<number> = new Some(100)
console.log(opt.map( x => x + 100))

