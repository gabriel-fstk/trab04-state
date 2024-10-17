public class MaquinaDeGoma {
    private Estado semMoeda;
    private Estado recebeuMoeda;
    private Estado gomaVendida;
    private Estado gomasAcabaram;

    private Estado estadoAtual;
    private int gomas;

    public MaquinaDeGoma(int numeroDeGomas) {
        this.gomas = numeroDeGomas;

        semMoeda = new SemMoeda(this);
        recebeuMoeda = new RecebeuMoeda(this);
        gomaVendida = new GomaVendida(this);
        gomasAcabaram = new GomasAcabaram(this);

        estadoAtual = numeroDeGomas > 0 ? semMoeda : gomasAcabaram;
    }

    public void insereMoeda() {
        estadoAtual.insereMoeda();
    }

    public void ejetaMoeda() {
        estadoAtual.ejetaMoeda();
    }

    public void acionaAlavanca() {
        estadoAtual.acionaAlavanca();
        estadoAtual.entregaGoma();
    }

    public void liberarGoma() {
        System.out.println("Uma goma está saindo...");
        if (gomas != 0) {
            gomas--;
        }
    }

    public int getGomas() {
        return gomas;
    }

    public void setEstado(Estado novoEstado) {
        this.estadoAtual = novoEstado;
    }

    public Estado getSemMoedaEstado() {
        return semMoeda;
    }

    public Estado getRecebeuMoedaEstado() {
        return recebeuMoeda;
    }

    public Estado getGomaVendidaEstado() {
        return gomaVendida;
    }

    public Estado getGomasAcabaramEstado() {
        return gomasAcabaram;
    }
}
