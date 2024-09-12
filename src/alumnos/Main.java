package alumnos;

import javax.swing.*;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                frmAlumnos pantalla = new frmAlumnos();
                pantalla.setVisible(true);

                pantalla.setBotonGuardarListener(new BotonGuardarListener() {
                    @Override
                    public void guardando(alumno persona) {
                        System.out.println("Nombre:"+persona.getNombre());
                        System.out.println("A. Paterno:"+persona.getAPaterno());
                        System.out.println("A. Materno:"+ persona.getAMaterno());
                        System.out.println("CURP"+ persona.getCURP());
                        System.out.println("Sexo:"+persona.getSexo());
                        System.out.println("Telefono"+persona.getTelefono());
                        System.out.println("Correo"+persona.getCorreo());
                        System.out.println("Discapacidad: "+persona.getDiscapacidad());
                        System.out.println("Edad: "+persona.getEdad());

                        Path path = Path.of("C:\\Arch\\pl.txt");
                        String Nombre = persona.getNombre();
                        String Apaterno = persona.getAPaterno();
                        String AMaterno = persona.getAMaterno();
                        String Sexo = persona.getSexo();
                        String Curp = persona.getCURP();
                        String Correo = persona.getCorreo();
                        String Telefono = persona.getTelefono();
                        String Discapacidad = persona.getDiscapacidad();
                        int Edad = persona.calcularEdad();


                        try(FileWriter archivo = new FileWriter(path.toFile(),true)){
                            PrintWriter pw = new PrintWriter(archivo);
                            archivo.write(Nombre);
                            archivo.write("\n"+Apaterno);
                            archivo.write("\n"+AMaterno);
                            archivo.write("\n"+Sexo);
                            archivo.write("\n"+Curp);
                            archivo.write("\n"+Correo);
                            archivo.write("\n"+Telefono);
                            archivo.write("\n"+Discapacidad);
                            archivo.write("\n"+Edad);


                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                        }


                    }
                });

            }
        });
    }
}
