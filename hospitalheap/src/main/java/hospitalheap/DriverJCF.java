package hospitalheap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class DriverJCF {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Patient> pacientes = new ArrayList<>();
        try {
            pacientes = readFile("pacientes.txt");
        }catch (IOException e) {
            System.out.println("Error al leer el archivo");
            return;
        }
        
        PriorityQueue<Patient> queue = new PriorityQueue<Patient>();
        for (Patient p : pacientes) {
            queue.add(p);
        }
        System.out.println("-".repeat(50));
        System.out.println("\t\t Cola de Pacientes");
        System.out.println("-".repeat(50));
        System.out.print("Presione cualquier tecla para atender a un paciente (Ingrese 'S' para salir del programa.): \nR/ ");
        String input = sc.nextLine();
        while (!input.equals("S")) {
            Patient p = queue.poll();
            System.out.println("El paciente a atender es: " + p.getName() + ", con diagnóstico " + p.getDiagnosis() + " y prioridad " + p.getPriority());
            System.out.print("Presione cualquier tecla para atender a otro paciente (Ingrese 'S' para salir del programa.): \nR/ ");
            input = sc.nextLine();
        }
    }

    @SuppressWarnings("resource")
    public static ArrayList<Patient> readFile(String fileName) throws IOException {
        ArrayList<Patient> patients = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = br.readLine()) != null) {
            String[] tokens = line.split(",");
            patients.add(new Patient(tokens[0], tokens[1], tokens[2].charAt(0)));
        }
        return patients;
    }
}
