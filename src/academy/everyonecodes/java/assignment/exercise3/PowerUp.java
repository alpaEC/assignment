package academy.everyonecodes.java.assignment.exercise3;

public class PowerUp {
    private int intensity;
    private String type;

    public PowerUp(int intensity, String type) {
        this.intensity = intensity;
        this.type = type;
    }

    public int getIntensity() {
        return intensity;
    }

    public void setIntensity(int intensity) {
        this.intensity = intensity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
