public class TestePilha {
    public static void main(String[] args) throws Exception {
        MinhaPilha mp = new MinhaPilha();

        System.out.println("A minha pilha está vazia? " + mp.isEmpty() + ".");

        mp.push(1);
        mp.push(2);
        mp.push(3);

        System.out.println("A minha pilha está vazia? " + mp.isEmpty() + ".");
        
        System.out.println("\nA pilha contém " + mp.size() + " elementos.");

        System.out.println("\nO elemento do topo da pilha é " + mp.top() + ".");
        mp.pop();
        System.out.println("O elemento do topo da pilha é " + mp.top() + ".");

        mp.clear();
        System.out.println("\nA minha pilha está vazia? " + mp.isEmpty() + ".");


    }
}
