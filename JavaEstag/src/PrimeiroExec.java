public class PrimeiroExec {

    void VerificarFibonacci() {
        int numero = 25;
        int fibo1 = 0;
        int fibo2 = 1;
        do {
            int fibo = fibo1;
            fibo1 = fibo2;
            fibo2 = fibo + fibo1;
        } while (fibo2 < numero);
        if (fibo2 == numero) {
            System.out.println("Ele é um fibonacci.");
        } else {
            System.out.println("Ele não é um fibonacci");
        }


    }

}
