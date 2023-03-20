import java.util.Arrays;

// Componente compuesto que contiene uno o más componentes hoja o compuestos
public class Composite implements Component {
    private final char operation;
    private final Component[] components;
    
    public Composite(char operation, Component... components) {
        this.operation = operation;
        this.components = components;
    }
    
    @Override
    public double operate() {
        switch (operation) {
            case '+':
                return Arrays.stream(components)
                             .mapToDouble(Component::operate)
                             .sum();
            case '-':
                return components[0].operate() - components[1].operate();
            case '*':
                return components[0].operate() * components[1].operate();
            case '/':
                return components[0].operate() / components[1].operate();
            default:
                throw new IllegalArgumentException("Invalid operation: " + operation);
        }
    }
}
