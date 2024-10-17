public class GomaVendida implements Estado {
    private MaquinaDeGoma maquina;

    public GomaVendida(MaquinaDeGoma maquina) {
        this.maquina = maquina;
    }

    @Override
    public void insereMoeda() {
        System.out.println("Aguarde, estamos entregando a goma.");
    }

    @Override
    public void ejetaMoeda() {
        System.out.println("Desculpe, você já acionou a alavanca.");
    }

    @Override
    public void acionaAlavanca() {
        System.out.println("A alavanca já foi acionada.");
    }

    @Override
    public void entregaGoma() {
        maquina.liberarGoma();
        if (maquina.getGomas() > 0) {
            maquina.setEstado(maquina.getSemMoedaEstado());
        } else {
            maquina.setEstado(maquina.getGomasAcabaramEstado());
        }
    }
}
