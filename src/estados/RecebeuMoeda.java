public class RecebeuMoeda implements Estado {
    private MaquinaDeGoma maquina;

    public RecebeuMoeda(MaquinaDeGoma maquina) {
        this.maquina = maquina;
    }

    @Override
    public void insereMoeda() {
        System.out.println("Você já inseriu uma moeda.");
    }

    @Override
    public void ejetaMoeda() {
        System.out.println("Moeda devolvida.");
        maquina.setEstado(maquina.getSemMoedaEstado());
    }

    @Override
    public void acionaAlavanca() {
        System.out.println("Alavanca acionada...");
        if (maquina.getGomas() > 0) {
            maquina.setEstado(maquina.getGomaVendidaEstado());
        } else {
            maquina.setEstado(maquina.getGomasAcabaramEstado());
        }
    }

    @Override
    public void entregaGoma() {
        System.out.println("Nenhuma goma entregue.");
    }
}
