package lista;

public class ListaEncadeada <T>{
    private  No<T> inicio;
    private  No<T> utilmo;
    private int tamanho = 0;

    public  void adiciona(T elemento){
        No<T> celula = new No<>(elemento);
        if (this.tamanho == 0){
            this.inicio = celula;
            this.utilmo = celula;
        } else {
            this.utilmo.setProximo(celula);
        }
        this.utilmo = celula;
        this.tamanho ++;

    }

    public int getTamanho(){
        return  this.tamanho;
    }

    @Override
    public String toString() {
        return "ListaEncadeada{" +
                "inicio=" + inicio +
                '}';
    }
}
