public class Fisica extends Pessoa {
    private String sobrenome;
    private String cpf;
    private String dataNascimento;
   
       public String getSobrenome() {
           return this.sobrenome;
       }
   
       public void setSobrenome(String sobrenome) {
           this.sobrenome = sobrenome;
       }
   
       public String getCpf() {
           return this.cpf;
       }
   
       public void setCpf(String cpf) {
           this.cpf = cpf;
       }
   
       public String getDataNascimento() {
           return this.dataNascimento;
       }
   
       public void setDataNascimento(String dataNascimento) {
           this.dataNascimento = dataNascimento;
       }
   
   protected boolean validaCpf(){
       System.out.println("CPF validado!!");
       return true;
   }
   
   
   
   
   }