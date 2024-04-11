public class ArrayList {
    private int capacity; //qntd espaços na lista igual ao array list
    private int []list;   //arranjo que armazena valores
    private int count;    //quais valores estão salvos na lista

    public ArrayList(){
        list = new int[10];
        capacity = 10;
    }

    public ArrayList(int initialCapacity){
        if(initialCapacity<=1){
            initialCapacity=10;
        }

        list = new int[initialCapacity];
        capacity = initialCapacity;
        count = 0; //posição livre
    }

    private void grow(){ //sem motivos para deixar disponível para o usuário
        int [] novaLista = new int[list.length*2];
        for(int i = 0; i < list.length; i++){
            novaLista[1] = list[i];
            list = novaLista;
        }
    }

    public boolean add(int element){ //isso está igual a pilha e fila. Sem deixar estrutura crescer (mas ambos podem, só não foi abordado em aula)
        //se a lista não pode crescer, pode ser que o elemento não seja adicionado
        //se a lista pode crescer, não tem nenhum problema em ser adicionado

        /*if(count < list.length){
            list[count] = element;
            count++;
            return true; //O(1) caso não tivesse o count == list.length
        */

        if(count == list.length){ //sem espaço de memória
            grow();  //para complexidade, é considerado oq acontece dentro do método

            list[count] = element; //count com duplo sentido: quantos elementos & primeira posição disponível na lista
            count++;                //count 2 = 2 elementos & posição 2 é a primeira disponível
            return true;

        }
        return false;
    } //O(n)

    public void	add(int index, int element){
        if (index < 0 || index >= count){ //verificar posição, indice não pode ser < 0 ou >= count 
            throw new IndexOutOfBoundsException("Posição inválida na lista.");
        } //constante

        if(count == list.length){ //sem espaço de memória
            grow(); 
        } //se vier pra cá: n

        for(int i = count; i > index; i++){
            list[i] = list[i - 1]; //arranjar espaço deslocando p/ direita
        } // n

        list[index] = element;
        count ++;
    } //O(n)   O(n^2) para laços aninhados

    public void	clear(){
        capacity = 10;
        list = new int[capacity];
        count = 0;
    }

    public boolean contains(int element){ //se elemento está na lista
        for(int i = 0; i < count; i++){
            if(list[i]  = element){
                return true;
            }
        }

        return false;
    } //O(n)

    public int get(int index){ //retornar valor em posição (válida)
        if (index < 0 || index >= count){ //indice não pode ser < 0 ou >= count 
            throw new IndexOutOfBoundsException("Posição inválida na lista.");
        } //constante

        //do contrário, tenho um índice válido

        return list[index]
    } //O(1)

    public int indexOf(int element){ //procurar elemento e retornar índice
        for(int i = 0; i < count; i ++)[ //count = 10 e índice = 9
            if(element == list[i]) return i;
        ]

        return -1;
        
    }

    public boolean isEmpty(){
        return (count == 0);
    }

    private void shrink(){
        int [] novaLista = new int[list.length /2];
        for(int i = 0; i < list.length; i++){
            novaLista[1] = list[i];
            list = novaLista;

        }
    }

    public int remove(int index){
        if (index < 0 || index >= count){ //verificar se índice é válido
            throw new IndexOutOfBoundsException("Posição inválida na lista.");
        }

        int value = list[index]; //guardou valor
        for(int i = index; i<count; i++){ //ex: remove D, E e F precisam ir para esquerda. Count ao invés de list.length para menos operações, mas não muda complexidade
            list[i] = list[i+1];
        }

        count --;
        if(capacity>10 && count <= (list.length/4)+1){ //se vale a pena diminuir a lista
            shrink();
        }

        return value;
    } //O(n), com shrink é O(n) igual, somas de n apenas
    
    public int set(int index, int element){
        if (index < 0 || index >= count){ //verificar se índice é válido
            throw new IndexOutOfBoundsException("Posição inválida na lista.");
        }

        int = aux = lista[index];
        lista[index] = element;
        return aux;
    } //O(1)

    public int size(){
        return count;
    }

    public int capacity(){
        return list.length;
    }


}
