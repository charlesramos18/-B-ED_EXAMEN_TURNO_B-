/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package charles_y7258218f;

/** EJERCICIO PRÁCTICO EXAMEN EVAL 1 ED
 * 
 * @author charlesramos y7258218f
 *@version 1.0
 */
public class CHARLES_Y7258218F {
  
    static final double FACTOR_HORA_EXTRA = 1.2;
    private String nombreCompleto, dni;
    private double salarioBasePorHora = 10.56;
    /**
     * ◦ Constructor con tres parámetros
     * @param nombreCompleto CHARLES RAMOS MONTILLA
     * @param dni  Y7258218F
     */
    public CHARLES_Y7258218F(String nombreCompleto, String dni) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
    }
    /**
     * ◦ Calcula el salario bruto mensual en función del salario base por hora y
     *  El precio por hora de la hora extra se determina con la constante FACTOR_HORA_EXTRA
     * @param horasExtra  número de horas extra dedicadas redondeado a la baja (entero)
     * @return  devuelve el salario bruto mensual en euros con dos decimales
     */
    public double getSalarioEsteMes(int horasExtra) {
        double cantidadExtra, salarioFinal;
        cantidadExtra = horasExtra * this.salarioBasePorHora
                * FACTOR_HORA_EXTRA;
        salarioFinal = this.salarioBasePorHora * 40 * 4 + cantidadExtra;
        salarioFinal = (double) Math.round(salarioFinal * 100d) / 100d;
        return salarioFinal;
    }
    // Este método no lo comentaremos con JavaDoc

    public static void main(String[] args) {
        CHARLES_Y7258218F emp = new CHARLES_Y7258218F("Charles ramos ", "y7258218f");
        int horasExtra = 2;
        System.out.println("El salario de " + emp.nombreCompleto + " este mes será de " + emp.getSalarioEsteMes(horasExtra) + " euros, al hacer " + horasExtra + " horas extra.");
    }

}
