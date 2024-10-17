public class SemMoeda implements Estado {
    private MaquinaDeGoma maquina;

    public SemMoeda(MaquinaDeGoma maquina) {
        this.maquina = maquina;
    }

    @Override
    public void insereMoeda() {
        System.out.println("Moeda inserida.");
        maquina.setEstado(maquina.getRecebeuMoedaEstado());
    }

    @Override
    public void ejetaMoeda() {
        System.out.println("Voc� n�o inseriu uma moeda.");
    }

    @Override
    public void acionaAlavanca() {
        System.out.println("Voc� acionou, mas n�o h� moeda.");
    }

    @Override
    public void entregaGoma() {
        System.out.println("Voc� precisa pagar primeiro.");
    }
}
