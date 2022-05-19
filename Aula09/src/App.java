public class App {
    public static void main(String[] args) throws Exception {
        
        Endereco end = new Endereco("Rua Dom Pedro", "Centro", 15, 48100000);

        Cliente c1 = new Cliente("Diego", end);

        Cliente c2 = new Cliente("Will", end);

        c1.imprimeInformacoes();
        c2.imprimeInformacoes();

    }
}
