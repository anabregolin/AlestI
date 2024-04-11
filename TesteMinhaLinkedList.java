public class TesteMinhaLinkedList {
    public static void main(String[] args) {
        MinhaLinkedList mll = new MinhaLinkedList();

        System.out.println(mll);
        System.out.println("size" + mll.size());

        mll.add(7);
        System.out.println(mll);
        System.out.println("size" + mll.size());

        mll.add(3);
        System.out.println(mll);
        System.out.println("size" + mll.size());

        mll.add(17);
        System.out.println(mll);
        System.out.println("size" + mll.size());

        mll.clear();
        System.out.println(mll);
        System.out.println("size" + mll.size());

        System.out.println("O valor 4 está na lista: " + mll.contains(4));
        System.out.println("O valor está na lista: " + mll.contains(77));
        
    }
}
