// Ejemplo de uso
public class Main {
    public static void main(String[] args) {
        // Se crea una estructura de operaciones aritméticas
        Component tree = new Composite('+',
                                        new Composite('-',
                                                        new Leaf(10),
                                                        new Leaf(5)),
                                        new Composite('*',
                                                        new Leaf(3),
                                                        new Leaf(4)));
        
        // Se realiza la operación
        double result = tree.operate();
        System.out.println(result); // Output: 22.0
    }
}
