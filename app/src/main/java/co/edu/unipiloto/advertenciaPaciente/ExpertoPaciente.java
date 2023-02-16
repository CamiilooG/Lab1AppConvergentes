package co.edu.unipiloto.advertenciaPaciente;

import java.util.ArrayList;

public class ExpertoPaciente{
    public ArrayList<String> getPatients(String tiposPaciente) {
        ArrayList<String> pacientes = new ArrayList<>();
        System.out.println(tiposPaciente.toString() == "rubia");
        switch (tiposPaciente) {
            case "diabetes":
                System.out.println(pacientes);
                pacientes.add("diabetes tipo1");
                pacientes.add("diabetes tipo 2");
                break;
            case "glaucoma":
                pacientes.add("glaucoma infeccion");
                pacientes.add("glaucoma generado");
                break;
            case "leucemia":
                pacientes.add("leucemia hereditaria");
                pacientes.add("leucemia");
                break;
        }
        System.out.println(pacientes);
        System.out.println(tiposPaciente);
        return pacientes;
    }
}
