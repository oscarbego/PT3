
package app;

/*
* PRUEBA TÉCNICA
* PROYECTO 3: Descripción Completa en Archivo de Word (Prueba Técnica JAVA)
*
* CLASE Empleado
* 
* Elaborado por: NORMA JUDITH ORTEGA RODRIGUEZ
* Fecha: 12 de marzo 2022
*/

public class Empleado {

    public static int numeroEmpleados; //Variavle de clase para ir contando #empleados en la empresa
    
    private String nombre;
    private String apellido;
    
    private double salarioMensual;
    
      
    //-------------------- Método constructor ------------------------
    public Empleado( String nombre, String apellido, double salarioMensual )
    {
                //Asignar los valores a la factura
            this.nombre=nombre;
            this.apellido=apellido;
            this.salarioMensual =salarioMensual;
            numeroEmpleados++;
            
    }// cierra constructor
    
    
       
    //------------- Método para calcular el salario anual ---------------------
    //Metodo para calcular el salario anual
    public double calculaSalarioAnual()
    {
        return getSalarioMensual()*12;
    }
    
    
    
    //------------- Método para calcular aumento salarial ---------------------
    public void calculaAumentoSalarial()
    {
        setSalarioMensual(getSalarioMensual()*1.10);
    }

    
    
// ---------------------- Métodos get´s y set´s -------------------------    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }
   
}//cierra class Empleado
