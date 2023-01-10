public class Main {

    public static void main(String args[]) {

        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();


        cliente.nombre = "Javier";
        cliente.edad = 43;
        cliente.cel = 27794377;
        cliente.credito = 10000.90;
        System.out.println("Hola! Soy " + cliente.nombre + ", tengo " + cliente.edad + " años y mi número de celular es " + cliente.cel
                + ". Mi crédito disponible es $" + cliente.credito + " dólares.");


        trabajador.nombre = "Felipe";
        trabajador.edad = 22;
        trabajador.cel = 1159890996;
        trabajador.salario = 80000.99;
        System.out.println("Hola. Soy " + trabajador.nombre + ", tengo " + trabajador.edad + " años y mi número de celular es " + trabajador.cel
                + ". Mi salario es de $" + trabajador.salario + " dólares.");
    }
}

class Persona {
    String nombre;
    int edad;
    int cel;
}


class Cliente extends Persona {
    double credito;
}

class Trabajador extends Persona {
    double salario;
}
