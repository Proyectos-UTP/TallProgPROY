
package Proyecto_Paquete;
public class Alumno {
    
    /* Atribuos */
    private String nombre;
    private String apellido;
    private String seccion;
    private int edad;
    private int pc1;
    private int pc2;
    private int pc3;
    private int ef;
   
    
    
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
    
        public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPc1() {
        return pc1;
    }

    public void setPc1(int pc1) {
        this.pc1 = pc1;
    }

    public int getPc2() {
        return pc2;
    }

    public void setPc2(int pc2) {
        this.pc2 = pc2;
    }

    public int getPc3() {
        return pc3;
    }

    public void setPc3(int pc3) {
        this.pc3 = pc3;
    }

    public int getEf() {
        return ef;
    }

    public void setEf(int ef) {
        this.ef = ef;
    }
    public String  report(){
      return  "Nombre: "+ this.getNombre() + "\n" +
                "Edad: "+ this.getEdad() + "\n" +
                "Pc1: "+ this.getPc1() + "\n" +
                "Pc2: "+ this.getPc2() + "\n" +
                "Pc3: "+ this.getPc3() + "\n" +
                "Examen Final: "+this.getEf() + "\n" +
                "Promedio: "+this.promedio();
    }
    public double promedio(){
         return ((this.pc1) + (this.pc2) + (this.pc3) + (this.ef)) / 4;
         
    }
        
        public Alumno(String nombre, String apellido, int edad, int pc1, int pc2, int pc3, int Ef) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.pc1 = pc1;
        this.pc2 = pc2;
        this.pc3 = pc3;
        this.ef = Ef;
    
        
        }
            public Alumno() {

    }
}
    

    
    
    
 


