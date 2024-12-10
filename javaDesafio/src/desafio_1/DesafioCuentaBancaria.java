package desafio_1;

import java.util.Scanner;

public class DesafioCuentaBancaria {
    public static void main(String[] args) {

        String nombre = "Tony Stark";
        String tipoDeCuenta = "Corriente";
        double saldo = 1599.99;

        System.out.printf("""
                ******************************
                
                Nombre del cliente: %s
                Tipo de cuenta: %s
                Saldo disponible: $%.2f
                
                ********************************""",nombre, tipoDeCuenta, saldo);


        String menu = """
                \n*** Escriba el numero de la opcion deseada ***
                1. Consultar saldo
                2. Retirar
                3. Depositar
                9. Salir
                """;
        Scanner teclado = new Scanner(System.in);

        var salir = false;
        while(!salir){
            System.out.println(menu);
            var opcion = Integer.parseInt(teclado.next());
            switch (opcion){
                case 1 -> System.out.printf("El saldo actualizado es: %.2f", saldo);
                case 2 ->{
                    System.out.println("Cual es el valor que deseas retirar?");
                    var retiroSaldo = teclado.nextDouble();
                    if (saldo < retiroSaldo|| saldo<=0){
                        System.out.println("Saldo insuficiente");
                    }else {
                        saldo -= retiroSaldo;
                        System.out.printf("El saldo actualizado es: %.2f", saldo);
                    }
                }
                case 3 -> {
                    System.out.println("Cual es el valor que vas a depositar?");
                    var Saldodepositado = teclado.nextDouble();
                    saldo += Saldodepositado;
                }
                case 9 -> {
                    System.out.println("Finalizado el programa. Muchas gracias por usar nuestro servicios");
                    salir = true;
                }
                default -> System.out.println("Opcion no valida");

            }
        }

    }
}
