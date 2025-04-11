package hospitalheap;

public class Patient implements Comparable<Patient> {
    private String name;
    private String diagnosis;
    private char priority; // A es el mayor, E es el menor.

    public Patient(String name, String diagnosis, char priority) {
        this.name = name;
        this.diagnosis = diagnosis;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public char getPriority() {
        return priority;
    }

    @Override
    public int compareTo(Patient p) {
        return Character.compare(this.getPriority(), p.getPriority());
    }
}
