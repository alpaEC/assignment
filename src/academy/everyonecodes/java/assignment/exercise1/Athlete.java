package academy.everyonecodes.java.assignment.exercise1;

public class Athlete {
    private String firstName;
    private String lastName;
    private double height;
    private boolean suspended;

    public Athlete(String fN, String sN, double h, boolean s){
        firstName = fN;
        lastName = sN;
        height = h;
        suspended = s;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isSuspended(){
        return suspended;
    }

    public void setSuspended(boolean b){
        suspended = b;
    }
}
