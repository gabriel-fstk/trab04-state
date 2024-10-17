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
        System.out.println("Você não inseriu uma moeda.");
    }

    @Override
    public void acionaAlavanca() {
        System.out.println("Você acionou, mas não há moeda.");
    }

    @Override
    public void entregaGoma() {
        System.out.println("Você precisa pagar primeiro.");
    }
}
