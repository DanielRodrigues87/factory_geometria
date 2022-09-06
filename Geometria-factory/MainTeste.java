public class MainTeste {
    
    public static void main(String[] args) {
        Poligono poligono = PoligonoFactory.createPoligono(5);
        System.out.println(poligono.getDescription());
    }
}
