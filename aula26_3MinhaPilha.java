public class MinhaPilha
{
    int vetor[];
    int topo;

    public MinhaPilha(){
        vetor = new int[10];
        topo = -1; //depende a lógica

    }

    //static = não precisa criar obj. Como método de classe, faz sentido criar objeto

    public void push(int e){
        //apenas permitir inserir se tiver espaço na pilha, quando estiver cheia o topo será:
        if(topo!=vetor.length - 1){
            topo++;
            vetor[topo] = e;
        }
    }

    public int pop() throws Exception{
        if(!isEmpty()){
            int aux = vetor[topo];
            topo --;
            return aux;
        }
        throw new Exception("Pilha está vazia.");
       
    }

    public int top() throws Exception{
        if(!isEmpty()){
            return vetor[topo];
        }
        throw new Exception("Pilha está vazia.");
       
    }

    public int size(){
        return topo + 1;
    }

    public boolean isEmpty(){
        return (topo == -1);
    }

    public void clear(){
        topo = -1;
    }
}
