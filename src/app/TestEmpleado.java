package app;

/*
* PRUEBA TÉCNICA
* PROYECTO 3: Descripción Completa en Archivo de Word (Prueba Técnica JAVA)
*
* Probar el funcionamiento de la clase EMPLEADO
* Registrar 2 empleados, incrementar el sueldo y mostrar su salario anual                    
*
* Elaborado por: NORMA JUDITH ORTEGA RODRIGUEZ
* Fecha: 13 de marzo 2022
*/

import java.util.Scanner; //Libreria para poder leer datos del teclado

public class TestEmpleado {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); //Variable que permita la lectura de teclado
        
        //Definir un arreglo de objetos tipo Empleado
        Empleado arregloEmpleados[]=new Empleado[2];
        
        
        
        int numEmpleados=2; //En la descripción del proyecto se solicitan 2 empleados
        int opc; //Para controlar el ciclo de ejecucion
        
        do{
            System.out.println("");
            System.out.println("");
            System.out.println("=========================");
            System.out.println("    MENU DE OPCIONES");
            System.out.println("=========================");
            System.out.println("1. Registro de Empleados");
            System.out.println("2. Aumento Salarial");
            System.out.println("3. Mostrar Empleados");
            System.out.println("4. Terminar");
            System.out.println("=========================");
            System.out.print("Seleccione una opcion (1-4): ");
            opc=sc.nextInt();
            System.out.println("");
            System.out.println("");
            
            switch(opc){
                case 1: 
                    System.out.println(" +++++++++ REGISTRO DE EMPLEADOS ++++++++++");
                    for(int posicion=0;posicion<numEmpleados;posicion++)
                    {
                        System.out.println("Datos empleado "+(posicion+1)+": ");
                        System.out.print("Nombre: ");
                        String nombre=sc.next();
                        System.out.print("Apellido: ");
                        String apellido=sc.next();
                        System.out.print("Salario Mensual: ");
                        double salarioMensual=sc.nextDouble();
                        System.out.println("");

                        arregloEmpleados[posicion]=new Empleado(nombre,apellido,salarioMensual);
                    }//cierra for captura
                    break;
                
                case 2:
                    System.out.println("+++++++++++++ AUMENTO SALARIAL +++++++++++++");
                    System.out.println("Calculando incremento");
                    for(int posicion=0;posicion<numEmpleados;posicion++)
                    {
                        System.out.println("Empleado "+(posicion+1)+" ok !!");
                        arregloEmpleados[posicion].calculaAumentoSalarial();
                    }//cierra for aumento
                    break;
                
                case 3:
                    System.out.println("+++++++++++ EMPLEADOS REGISTRADOS +++++++++");
                    System.out.println("Nombre Completo       Salario Mensual       Salario anual");
                    System.out.println("-----------------------------------------------------------");
                    for(int posicion=0;posicion<numEmpleados;posicion++)
                    {
                        System.out.println(arregloEmpleados[posicion].getNombre()+" "   
                                + arregloEmpleados[posicion].getApellido()+ "           $"
                                + arregloEmpleados[posicion].getSalarioMensual()+ "           $"
                                + arregloEmpleados[posicion].calculaSalarioAnual());
                        System.out.println("");
                        System.out.println("TOTAL DE EMPLEADOS EN LA EMPRESA"+Empleado.numeroEmpleados);
                        
                    }//cierra for imprime
                    break;
                
                case 4:
                    System.out.println("Hasta luego!!");
                    break;
                
                default:
                    System.out.println("Debe elegir una opcion entre 1 y 4!!");
                    break;
                    
            }//cierra switch
        
        }while(opc!=4);
        
    }//cierra void main
    
}//cierra class TestEmpleado
