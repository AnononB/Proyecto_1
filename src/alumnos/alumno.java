package alumnos;

public class alumno {
    private String nombre;
    private String apaterno;
    private String amaterno;
    private String CURP;
    private String telefono;
    private String correo;
    private boolean discapacidad;
    private int edad;
    private String sexo;

    public alumno(String nombre,String apaterno,String amaterno,String CURP,String telefono,
                  String correo,boolean discapacidad, String sexo )
    {
        this.nombre=nombre;
        this.apaterno=apaterno;
        this.amaterno=amaterno;
        this.CURP=CURP;
        this.telefono=telefono;
        this.correo=correo;
        this.discapacidad=discapacidad;
        this.sexo=sexo;
    }
    public String getNombre() {

        return nombre;
    }
    public String getAPaterno() {

        return apaterno;
    }
    public String getAMaterno() {

        return amaterno;
    }
    public String getCURP() {
        return CURP;
    }
    public String getTelefono() {
        return telefono;

    }
    public String getCorreo() {
        return correo;
    }
    public String getDiscapacidad() {
        if(discapacidad==true)
            return "SI";
        else
            return "NO";

    }
    public int getEdad() {
        return calcularEdad();

    }
    public String getSexo() {

        return sexo;
    }

    public int calcularEdad() {

        String fNc = CURP.substring(4, 10);
        int a = Integer.parseInt(fNc.substring(0, 2));
        int m = Integer.parseInt(fNc.substring(2, 4));
        int d = Integer.parseInt(fNc.substring(4, 6));

        if (a >= 0 && a <= 24) {
            a += 2000;
        } else {
            a += 1900;
        }

        java.time.LocalDate fAc = java.time.LocalDate.now();
        int añoA = fAc.getYear();
        int mesA = fAc.getMonthValue();
        int diaA = fAc.getDayOfMonth();

        int edad = añoA - a;

        if (m > mesA || (m == mesA && d > diaA)) {
            edad--;
        }
        return edad;
        }
}
