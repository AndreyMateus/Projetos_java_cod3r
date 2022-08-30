package lambdas.threads;

public class Threads {
    public static void main(String[] args) {
        // "Lambdas" antes do java 8

        Runnable trabalho1 = new Trabalho1();

        Runnable trabalho2 = new Runnable() {
            //instanciando uma classe anônima
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Tarefa #02");
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                    }
                }
            }
        };

        //Mesmo as interfaces que NÃO são ditas funcionais ou criadas como interfaces funcionais originalmente, continuam funcionando no contexto de interfaces funcionais.
        //Ou seja você pode usar LAMBDAS para implementar esses métodos que foram criados antes das LAMBDAS e interfaces funcionais.
        Runnable trabalho3 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Tarefa #03");
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                }
            }
        };
        //OU
        //Runnable trabalho3 = Threads::trabalho3;

        //Uma THREAD é um processo que pode ser executado paralelamente
        Thread t1 = new Thread(trabalho1);
        Thread t2 = new Thread(trabalho2);
        Thread t3 = new Thread(trabalho3);

        t1.start(); //iniciando a thread
        t2.start(); //iniciando a thread
        t3.start(); //iniciando a thread
    }

    static void trabalho3(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Tarefa #03");
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
        }
    }
}
