
public class API {
    // Questão 02.
    public FilaCircular merge(FilaCircular A, FilaCircular B){

        // Deve retornar uma terceira FilaCircular R, onde R
        // contem o merge de A e B.

        FilaCircular R = FilaCircular.cria_fila( 1 ); // acertar tamanho
        // coloque o código necessário para fazer o merge de A e B.

        return R;
    }

    // Questão 03.
    public FilaCircular inverteFila(FilaCircular A){

        // Deve retornar uma segunda FilaCircular R
        // contendo os elementos de A em ordem inversa.

        FilaCircular R = FilaCircular.cria_fila( 1 ); // acertar tamanho
        // coloque o código necessário para fazer a copia de A.

        return R;
    }
    // Questão 4.
    public Pilha copia(Pilha A){
        Pilha R = Pilha.cria_pilha( 1 );

        System.out.println(A.topo());

        return R;
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
        Pilha A3 = new Pilha( 1 );
        A3.empilha(69);
        A3.
        Pilha R3 = api.copia(A3);
        //A3.imprimir();
        //R3.imprimir();

        // Questão 05 - chamadas parcialmente dadas
//        String expressao = "";
//        boolean R4 = api.avaliaExpressao(expressao);
        //System.out.println("Expressao: " + expressao);
        //System.out.println("Correta: " + R4);
    }
}