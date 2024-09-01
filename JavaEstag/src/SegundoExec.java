public class SegundoExec {


    void VerificarString() {
        int quantidadeA = 0;
        String palavra = "bolo";
        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) == 'a' || palavra.charAt(i) == 'A') {
                quantidadeA++;
            }
        }
        if (quantidadeA > 0) {
            System.out.println("A letra a aparece " + quantidadeA + " vezes na palavra.");
        } else {
            System.out.println("A palavra " + palavra + " não tem letra a.");
        }

    }
}
