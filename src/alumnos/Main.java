package alumnos;

import javax.swing.*;

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


                    }
                });

            }
        });
    }
}
