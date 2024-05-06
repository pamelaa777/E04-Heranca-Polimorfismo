public class PessoaFisica extends Cliente {
    String cpf;
    int idade;
    char sexo;

 public  PessoaFisica (String nome, String endereco, String cpf, int idade, char sexo) {
    super(nome, endereco);//ele coloca as que nao estao instanciados no this e que estao e cliente
     this.cpf = cpf;
     this.idade = idade;
     this.sexo = sexo;
 }

 @Override
public void imprimir() {
    System.out.println("====================");
    System.out.println("Nome: " + this.nome);
    System.out.println("CPF: " + this.cpf );
    System.out.println("Endereco: " + this.endereco);
    System.out.println("Idade: " + this.idade);
    System.out.println("Sexo: " + this.sexo);
    System.out.println("====================");
}
}