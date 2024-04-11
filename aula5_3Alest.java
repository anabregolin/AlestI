public class aula3_5Alest{
public static void main(String [] args){

    int n = 10;

    forA(n);
    forB(n);
    forC(n);
    forD(n);
    forE(n);
    forF(n);
    forG(n);
    
    //for n vezes
    //segundo for n vezes

}

    public static void forA(int n){
        int count = 0;
        long ti= System.currentTimeMillis();
            for(int i=0;i<n;i++){
                count++;
            }
        long tf = System.currentTimeMillis();
        long total = tf - ti;

        System.out.println("Tempo A: " + total + " nanosegundos.");


    }

    public static void forB(int n){
        int count = 0;
        long ti= System.currentTimeMillis();
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    count++;
                }
            }
        long tf = System.currentTimeMillis();
        long total = tf - ti;

        System.out.println("Tempo B: "+ total + " nanosegundos.");

    }

    public static void forC(int n){
        int count = 0;
        long ti= System.currentTimeMillis();
            for(int i=0;i<n;i++){
                for(int j=1;j<2*i;j++){
                    count++;
                }
            }
        long tf = System.currentTimeMillis();
        long total = tf - ti;

        System.out.println("Tempo C: "+ total + " nanosegundos.");

    }

    public static void forD(int n){
        int count = 0;
        long ti = System.currentTimeMillis();
            for(int i=0;i<n;i=i+i){
                    count++;
                
            }
            long tf = System.currentTimeMillis();
        long total = tf - ti;

        System.out.println("Tempo D: "+ total + " segundos.");
        
    }

    public static void forE(int n){
        int count = 0;
        long ti= System.currentTimeMillis();
            for(int i=0;i<n;i=i++){
                for(int j=1;j<n;j=j+j){
                    count++;
                }
            }
        long tf = System.currentTimeMillis();
        long total = tf - ti;

        System.out.println("Tempo E "+ total + " segundos.");
        
    }

    public static void forF(int n){
        int count = 0;
        long ti= System.currentTimeMillis();
            for(int i=0;i<n;i=i++){
                for(int j=1;j<n;j++){
                    for(int k=0;k<n;k++){
                    count++;
                    }
            }
        }
        long tf = System.currentTimeMillis();
        long total = tf - ti;

        System.out.println("Tempo F: "+ total + " segundos.");
        
    }

    public static void forG(int n){
        int count = 0;
        long ti= System.currentTimeMillis();
            for(int i=0;i<n;i=i++){
                for(int j=1;j<i+2;j++){
                    for(int k=0;k<n;k++){
                    count++;
                }
            }
        }
        long tf = System.currentTimeMillis();
        long total = tf - ti;

        System.out.println("Tempo G: "+ total + " segundos.");
        
    }
}


    
