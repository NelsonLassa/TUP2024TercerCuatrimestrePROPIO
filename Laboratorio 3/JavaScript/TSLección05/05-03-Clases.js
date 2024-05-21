class Persona{
    constructor(nombre, apellido){
        this._nombre = nombre;
        this._apellido = apellido;
    }

    get nombre(){
        return this._nombre;
    }
    set nombre(nombre){
        this._nombre = nombre;
    }
    get apellido(){
        return this._apellido;
    }
    set apellido(apellido){
        this._apellido = apellido;
    }
}

let persona1 = new Persona('Martín','Perez');
console.log(persona1.nombre);
persona1.nombre = 'Juan Carlos';
console.log(persona1.nombre);

// Ejercicio dispuesto
console.log(persona1.apellido);
persona1.apellido = 'Sanchez';
console.log(persona1.apellido);
//console.log(persona1);

let persona2 = new Persona('Carlos','Lara');
console.log(persona2.nombre);
persona2.nombre = 'Maria Laura';
console.log(persona2.nombre);
//console.log(persona2);
// Ejercicio dispuesto
console.log(persona2.apellido);
persona2.apellido = 'Castro';
console.log(persona2.apellido);