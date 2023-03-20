// Componente hoja que realiza una operación aritmética simple
public class Leaf implements Component {
    private final double value;
    
    public Leaf(double value) {
        this.value = value;
    }
    
    @Override
    public double operate() {
        return value;
    }
}