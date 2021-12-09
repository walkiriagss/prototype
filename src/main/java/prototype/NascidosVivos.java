package prototype;

import java.util.Date;

public class NascidosVivos implements Cloneable{
    private int registro;
    private String nome;
    private String nomeMae;
    private Medico medico;

    public NascidosVivos(int registro, String nome, String nomeMae, Medico medico) {
        this.registro = registro;
        this.nome = nome;
        this.nomeMae = nomeMae;
        this.medico = medico;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }


    public NascidosVivos clone() throws CloneNotSupportedException{
        NascidosVivos nascidosVivosClone = (NascidosVivos) super.clone();
        nascidosVivosClone.medico = (Medico) nascidosVivosClone.medico.clone();
        return nascidosVivosClone;
    }

    @Override
    public String toString() {
        return "NascidosVivos{" +
                "registro=" + registro +
                ", nome='" + nome + '\'' +
                ", nomeMae='" + nomeMae + '\'' +
                ", medico=" + medico +
                '}';
    }
}
