public class MinhaLinkedList {

    public class Node{
        public int valor;
        public Node prox; //referência
        public Node(int v){
                valor = v;
                prox = null;
        }
    }

    private Node head, tail; //sempre aponta para início
    private int count; //quantos elementos existem

    public MinhaLinkedList(){ 
       tail =  head = null;  //valor inválido controlado. Para lugar nenhum, que é null
        count = 0;
    }

    //resolver os métodos mais fáceis antes

    public boolean add(int element){  
        Node novo = new Node(element); //vincular novo node

        if(isEmpty()){
            tail = head = novo;

        } else{
            //++++++++++++++++++++++ implementação com o tail ++++++++++++++++++++++
            tail.prox = novo;
            tail = novo;

            /*++++++++++++++++++++++ implementação sem o tail ++++++++++++++++++++++
            Node estagiario = head; //head pergunta para o estágiário para onde vai :)
            while(estagiario.prox != null){
                estagiario = estagiario.prox;
            }

            estagiario.prox = novo; //quando chega no final da lista
            */
            
        } //com O(1), sem O (n)

        count ++;
        return true;
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

    public boolean contains(int element){ //se existe ou não
        Node navegador = head;

        //laço da busca
        while(navegador != null){
            if(navegador.valor == element){
                return true;
            }
            navegador = navegador.prox;
        }

        return false;
    } 

    public int get(int index){ 
        if((index < 0) || (index>= count)){
            throw new IndexOutOfBoundsException("Posição inválida");
        }

        int count = 0;
        Node navegador = head;

        while (index != count){
            navegador = navegador.prox;
            count++;

        }

        return navegador.valor;
    } 

    public int indexOf(int element){
        Node navegador = head;
        int count = 0; //ou usar for, será o i

        while(navegador != null){
            if(navegador.valor == element){
                return count;

            }
            count++;
            navegador = navegador.prox;

        }

        return -1;
    }

    public boolean isEmpty(){
        return (count == 0);
    }

    public int remove(int index){
        if((index < 0) || (index>= count)){
            throw new IndexOutOfBoundsException("Posição inválida");
        }

        int count = 0;
        Node navegador = head;

        while (index != count){
            navegador = navegador.prox;
            count++;

        }

        return navegador.valor;

    } 
    
    public int set(int index, int element){


    } 

    public int size(){
        return count;
    }

    public String toString(){  //só para visualizarmos
        StringBuilder sb = new StringBuilder();

        sb.append( "[");
        if(! isEmpty()){
            Node navegador = head;
            while(navegador.prox != null){ //se não é null, adicina node e coloca entre vírgula
                sb.append(navegador.valor+ ", ");
                navegador = navegador.prox;
            }
        }
        sb.append("]");

        return sb.toString();
    }

}
