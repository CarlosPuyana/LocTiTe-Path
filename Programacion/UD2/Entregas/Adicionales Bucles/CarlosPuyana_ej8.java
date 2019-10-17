package Adicionales;

import java.util.Scanner;

public class CarlosPuyana_ej8 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int erDia=0;
        int ndoDia=0;
        int primeraHora;
        int segundaHora;
        String primerDiaString;
        String segundoDiaString;
        String nombreDia1="";
        String nombreDia2="";
        boolean datosCorrectos=true;

        do {
            System.out.println("Introduce el dia y la hora");
            primerDiaString = teclado.next();
            primeraHora = teclado.nextInt();

            switch (primerDiaString) {
                case "lunes":
                case "1":
                    erDia=1;
                    nombreDia1="Lunes";
                    break;
                case "martes":
                case "2":
                    erDia=2;
                    nombreDia1="Martes";
                    break;
                case "miercoles":
                case "3":
                    erDia=3;
                    nombreDia1="Miercoles";
                    break;
                case "jueves":
                case "4":
                    erDia=4;
                    nombreDia1="Jueves";
                    break;
                case "viernes":
                case "5":
                    erDia=5;
                    nombreDia1="Viernes";
                    break;
                case "sabado":
                case "6":
                    erDia=6;
                    nombreDia1="Sabado";
                    break;
                case "domingo":
                case "7":
                    erDia=7;
                    nombreDia1="Domingo";
                    break;
                default:
                    erDia=0;
            }

            System.out.println("Introduce el dia y la hora");
            segundoDiaString=teclado.next();
            segundaHora=teclado.nextInt();

            switch (segundoDiaString) {
                case "lunes":
                case "1":
                    ndoDia=1;
                    nombreDia2="Lunes";
                    break;
                case "martes":
                case "2":
                    ndoDia=2;
                    nombreDia2="Martes";
                    break;
                case "miercoles":
                case "3":
                    ndoDia=3;
                    nombreDia2="Miercoles";
                    break;
                case "jueves":
                case "4":
                    ndoDia=4;
                    nombreDia2="Jueves";
                    break;
                case "viernes":
                case "5":
                    ndoDia=5;
                    nombreDia2="Viernes";
                    break;
                case "sabado":
                case "6":
                    ndoDia=6;
                    nombreDia2="Sabado";
                    break;
                case "domingo":
                case "7":
                    ndoDia=7;
                    nombreDia2="Domingo";
                    break;
                default:
                    ndoDia=0;
            }

            datosCorrectos=true;

            if (ndoDia<=erDia) {
                System.out.println("El segundo día debe ser posterior al primero.");
                datosCorrectos = false;
            }

            if ((erDia==0) || (ndoDia==0)) {
                System.out.println("No has introducido correctamente el dia de la semana.");
                System.out.println("Los días validos son: Lunes, Martes, Miercoles, Jueves y Viernes.");
                datosCorrectos=false;
            }

            if ((primeraHora<0) || (primeraHora>23) || (segundaHora<0) || (segundaHora>23)) {
                System.out.println("No se ha introducido correctamente la hora del día.");
                System.out.println("Las horas validas están entre 0 y 23.");
                datosCorrectos=false;
            }

        } while (datosCorrectos=false);

        System.out.print("Entre las " + primeraHora + ":00h del " + nombreDia1 + " y las " + segundaHora + ":00h del " + nombreDia2);
        System.out.println(" hay " + (((ndoDia*24)+segundaHora)-((erDia*24)+primeraHora)) + " horas.");

    }
}
