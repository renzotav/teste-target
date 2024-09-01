public class TerceiroExec {
    int indice = 12;
    int soma = 0;
    int k = 1;


    void Calcular() {
        do {
            k = k + 1;
            soma = soma + k;
        } while (k < indice);
        System.out.println(soma);

    }


}
