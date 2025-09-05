public class Contato {
    private String nome;
    private String dataDeNascimento;
    private String telefone;
    private String email;

    public Contato(){
        this("","","","");
    }

    public Contato(String nome, String dataDeNascimento, String email, String telefone){
        this.setNome(nome);
        this.setDataDeNascimento(dataDeNascimento);
        this.setTelefone(telefone);
        this.setEmail(email);
    }

    public Contato(String nome){
        this(nome, "","","");
    }

    public Contato(Contato contato){
        this(contato.getNome(), contato.getDataDeNascimento(), contato.getEmail(), contato.getTelefone());
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString(){
        return "Nome: "+getNome()+"\nTelefone: "+getTelefone();
    }

    public String pegarMeiosDeContato(){
        String retorno = "";
        if (!this.getEmail().equals(""))
            retorno += "Email: "+this.getEmail();
        if (!this.getTelefone().equals(""))
            retorno += " Telefone: "+this.getTelefone();
        if (retorno.equals(""))
            retorno = "Sem meios de contato";

        return retorno;
    }
}