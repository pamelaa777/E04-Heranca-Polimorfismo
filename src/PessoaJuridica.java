public class PessoaJuridica extends Cliente{
        String cnpj;
        int numFuncionarios;
        String setor;

        public  PessoaJuridica (String nome, String endereco, String cnpj, int numFuncionarios, String setor) {
            super(nome, endereco);//ele coloca as que nao estao instanciados no this e que estao e cliente
            this.cnpj = cnpj;
            this.numFuncionarios = numFuncionarios;
            this.setor = setor;
        }
        public void imprimir() {
            System.out.println("====================");
            System.out.println("Nome: " + this.nome);
            System.out.println("Endereco: " + this.endereco);
            System.out.println("CNPJ: " + this.cnpj );
            System.out.println("Numero de Funcionarios: " + this.numFuncionarios);
            System.out.println("Setor: " + this.setor);
            System.out.println("====================");
        }
    }

