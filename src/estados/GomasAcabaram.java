public class GomasAcabaram implements Estado {
    @SuppressWarnings("unused")
    private MaquinaDeGoma maquina;

    public GomasAcabaram(MaquinaDeGoma maquina) {
        this.maquina = maquina;
    }

    @Override
    public void insereMoeda() {
        System.out.println("Sem gomas disponíveis.");
    }

    @Override
    public void ejetaMoeda() {
        System.out.println("Moeda devolvida.");
    }

    @Override
    public void acionaAlavanca() {
        System.out.println("Sem gomas disponíveis.");
    }

    @Override
    public void entregaGoma() {
        System.out.println("Sem gomas disponíveis.");
    }
}
