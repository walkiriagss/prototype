package prototype;

public class Medico implements Cloneable {
    private String nome;
    private String crm;

    public Medico(String nome, String crm) {
        super();
        this.nome = nome;
        this.crm = crm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public Object clone() throws  CloneNotSupportedException{
        return  super.clone();
    }

    @Override
    public String toString() {
        return "Medico{" +
                "nome='" + nome + '\'' +
                ", crm='" + crm + '\'' +
                '}';
    }
}
