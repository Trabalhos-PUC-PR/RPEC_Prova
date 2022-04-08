class Pilha {
    private int topo;
    private int[] dados;
    private int tamanhoMaximo;

    public Pilha(int n) { // inicializar a pilha }
        this.tamanhoMaximo = n;
        this.dados = new int[this.tamanhoMaximo];
        this.topo = -1;
    }

    public int getTamanhoMaximo() {
        return this.tamanhoMaximo;
    }

    // retorna true se a pilha está vazia e false caso contrário 
    private boolean estaVazia() {
        if (this.topo == -1) {
            return true;
        } else {
            return false;
        }
    }

    // retorna true se a pilha está cheia e false caso contrário
    private boolean estaCheia() {
        if (this.topo == this.tamanhoMaximo - 1) {
            return true;
        } else {
            return false;
        }
    }

    // retorna o elemento no topo da pilha
    public int topo() {
        if (! this.estaVazia()) {
            return this.dados[this.topo];
        } else {
            return -1;
        }
    }
    // coloca o elemento na pilha
    public boolean empilha(int e) {
        boolean empilhou = false;
        if (!this.estaCheia()) {
            this.topo = this.topo + 1;
            this.dados[this.topo] = e;
            empilhou = true;
        }
        return empilhou;
    }
    // retira e retorna o elemento do topo da pilha
    public int desempilha() {
        int e = -1;
        if (!this.estaVazia()) {
            e = this.dados[this.topo];
            this.topo = this.topo - 1;
        }
        return e;
    }

    public void imprimir() {
        if (!this.estaVazia()) {
            System.out.print("\n[Topo] ");
            for (int i = 0; i <= this.topo; i++){
                System.out.print("["+this.dados[i]+"] ");
            }
            System.out.println("[base]");
        }else{
            System.out.println("Pilha Vazia");
        }
    }

    // cria uma pilha capaz de armazenar até n elementos
    public static Pilha cria_pilha(int n){
        Pilha p = null;
        if (n > 0){
            p = new Pilha( n );
        }
        return p;
    }
}