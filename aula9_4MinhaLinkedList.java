public class MinhaLinkedList {

    public class Nodo(){
        public int valor;
        public Node prox; //referência
    }

    private Node head; //sempre aponta para início
    private int count; //quantos elementos existem

    public MinhaLinkedLis(){ 
        head = null;  //valor inválido controlado. Para lugar nenhum, que é null
        count = 0;
    }

    //resolver os métodos mais fáceis antes

    public boolean add(int element){
        
    } 
    
    public void	add(int index, int element){

    } 

    public void	clear(){
        head = null; 
        /*só larga a lista que já existia. Java programa "garbage collector" para lidar com essa 
        sujeira que fica, ou seja, não precisa se preocupar. 
        Em C, não existe isso, programa simples pode acabar juntando um monte de memória
        */
        count = 0;
    }

    public boolean contains(int element){ 

    } 

    public int get(int index){ 

    } 

    public int indexOf(int element){
        
    }

    public boolean isEmpty(){
        return (count == 0);
    }

    public int remove(int index){

    } 
    
    public int set(int index, int element){

    } 

    public int size(){
        return count;
    }

}
