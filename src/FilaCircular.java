class FilaCircular {
    private int primeiro;
    private int tamanho;
    private int n;      // quantidade de elementos
    private int[] dados;

    public FilaCircular(int tamanho) {
        this.tamanho = tamanho;
        this.dados = new int[tamanho];
        this.n = 0;             // lista vazia
        this.primeiro = 0;      // posição incial
    }
    private int fim() {
        return (this.primeiro + this.n) % this.tamanho;
    }

    public int getTamanho() {
    	return tamanho;
    }
    
    private int inicio() {
        return (this.primeiro + 1) % this.tamanho;
    }
    private boolean estaCheia() {
        return this.n == this.tamanho;
    }
    private boolean estaVazia() {
        return this.n == 0;
    }
    public boolean inserir(int e) {
        boolean inseriou = false;
        if (!estaCheia()) {
            // inserir elemento na próxima posição livre
            int pos = this.fim();
            this.dados[pos] = e;
            this.n = this.n + 1;
            inseriou = true;
        }
        return inseriou;
    }

    public int remover() {
        int v = -1;
        if (!estaVazia()) {
            // retirar elemento do inicio
            v = this.dados[this.primeiro];
            this.primeiro = this.inicio();  // atualiza o primeiro
            this.n = this.n - 1;
        }
        return v;
    }

    public void imprimir() {
        int i;
        int inicio, fim, n;
        if (!this.estaVazia()) {

            n = this.n;
            inicio = this.primeiro;
            fim = (inicio + n - 1) % this.tamanho;

            System.out.print("\nInicio [" + inicio+"]: ");   // imprime o inicio

            for (i = inicio; i != fim; i = (i + 1) % this.tamanho) {
                System.out.print(this.dados[i]+" ");
            }

            System.out.print(this.dados[i]);    // imprime o último              
            System.out.println(" ["+inicio + "] Fim");
        } else {
            System.out.println("Fila vazia");
        }
    }

    // cria uma pilha capaz de armazenar até n elementos
    public static FilaCircular cria_fila(int n){
        FilaCircular f = null;
        if (n > 0){
            f = new FilaCircular( n );
        }
        return f;
    }
}