
public class API {
    
    //Questão 01
    // imprimir   Início-> [0]: 68 [1]: 35 [2]: 10 [3] : 21 <-Ultimo [4]: 
    // lista nativa [0] : 10 [1]: 21 [2]: 75 [3] : 68 [4]: 35
    // Questão 02.
    // Questão 02.

	public FilaCircular merge(FilaCircular A, FilaCircular B, int size){
    
        FilaCircular R = FilaCircular.cria_fila(size*2); // acertar tamanho
    	
    	int auxA = A.remover();
    	int auxB = B.remover();
    	
    	for(int i = 0; i < size*2; i++) {
    		if(auxA > auxB) {
    			if(auxA == -1) {
    				R.inserir(auxA);
    				auxA = A.remover();
    			}else{
        			R.inserir(auxB);
        			auxB = B.remover();
    			}
    			
    		} else {
    			
    			if(auxA == -1) {
        			R.inserir(auxB);
        			auxB = B.remover();
    			} else {
    				R.inserir(auxA);
    				auxA = A.remover();
    			}
			}	
    	}
        // Deve retornar uma terceira FilaCircular R, onde R
        // contem o merge de A e B.
        
        // coloque o código necessário para fazer o merge de A e B.
        return R;
    }

    // Questão 03.
    public FilaCircular inverteFila(FilaCircular A){

        // Deve retornar uma segunda FilaCircular R
        // contendo os elementos de A em ordem inversa.

        FilaCircular R = FilaCircular.cria_fila(A.getTamanho()); // acertar tamanho
        FilaCircular Reserva = A;
        Pilha P = new Pilha(A.getTamanho());
        for(int i = Reserva.remover(); i != -1; i = Reserva.remover()){
            P.empilha(i);
        }
        for(int j = P.desempilha(); j != -1; j = P.desempilha()){
            R.inserir(j);
        }
        // coloque o código necessário para fazer a copia de A.
        return R;
    }
    // Questão 4.
    public Pilha copia(Pilha A){
        FilaCircular fila = new FilaCircular(A.getTamanhoMaximo());

        int count = 0;
        while(A.topo() != -1) {
            fila.inserir(A.topo());
            A.desempilha();
            count++;
        }

        Pilha result = Pilha.cria_pilha( count );

        for(int i =0; i<count; i++) {
            int temp = fila.remover();

            A.empilha(temp);
            result.empilha(temp);
        }

        return result;
    }

    // questão 5.
    public boolean avaliaExpressao(String exp){

        boolean verdadeira = false;
        // coloque o código necessário
        // para avaliar expressões

        return verdadeira;
    }

    public static void main(String [] args){
        API api = new API();

        // Questão 02 - chamadas parcialmente dadas
//        FilaCircular A1 = new FilaCircular( 1 );
//        FilaCircular B1 = new FilaCircular( 1 );
//        FilaCircular R1 = api.merge(A1, B1);
        //A1.imprimir();
        //B1.imprimir();
        //R1.imprimir();

        // Questão 03 - chamadas parcialmente dadas
//        FilaCircular A2 = new FilaCircular( 1 );
//        FilaCircular R2 = api.inverteFila(A2);
        //A2.imprimir();
        //R2.imprimir();

        // Questão 04 - chamadas parcialmente dadas
        Pilha A3 = new Pilha( 2 );
        A3.empilha(69);
        A3.empilha(68);

        Pilha R3 = api.copia(A3);

        A3.imprimir();
        R3.imprimir();

        // Questão 05 - chamadas parcialmente dadas
//        String expressao = "";
//        boolean R4 = api.avaliaExpressao(expressao);
        //System.out.println("Expressao: " + expressao);
        //System.out.println("Correta: " + R4);
    }
}
