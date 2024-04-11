public class MinhaFilaCircular {
    
    int vetor[];
    int inicio, fim;

    public MinhaFilaCircular(){
        vetor = new int[10]
        inicio = 0;
        fim = 0; //fila está cheia com diferença entre início e fim, por isso sempre perco um espaço de memória
    }

    public void enqueue(int e) throws Exception{
        //ANALISAR A CONDIÇÃO DE FILA CHEIA
        int proxFim = (fim+1)%vetor.length; //limite na indexação desse vetor. Ou vai ser 0, 1, 2 ou 3, não pode ser 4
        if(proxFim == inicio)
            throw new Exception("A fila está cheia.");

        vetor[fim] = e;
        fim = proxFim;
        
    }//para o enqueue não tive vantagem, complicou

    public void dequeue() throws Exception{
        //SABER SE ESTÁ VAZIA
        if(inicio == fim)
            throw new Exception("A fila está vazia.");

        int aux = vetor[inicio];
        inicio = (inicio + 1)%vetor.length;

        return aux;
    }

    public void head() throws Exception{
        if(inicio == fim)
            throw new Exception("A lista está vazia.");

        return vetor[inicio]; //mesma lógica
    
    }

    public void size() throws Exception{
        
    }

    public void isEmpty(){
        //return (inicio==fim);
        
    }

    public void clear(){
        inicio = 0;
        fim = 0;
    }

}
