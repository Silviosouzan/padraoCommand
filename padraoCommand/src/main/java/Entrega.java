public class Entrega {

    private int hora;
    private int dia;
    private String situacao;

    public Entrega(int hora, int dia) {
        this.hora = hora;
        this.dia = dia;
    }

    public String getSituacao() {
        return situacao;
    }

    public void abrirEntrega() {
        this.situacao = "Entrega aberta";
    }

    public void fecharEntrega() {
        this.situacao = "Entrega fechada";
    }
}
