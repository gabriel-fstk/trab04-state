public class Main {
    public static void main(String[] args) {
        MaquinaDeGoma maquina = new MaquinaDeGoma(5);

        maquina.insereMoeda();
        maquina.acionaAlavanca();

        maquina.insereMoeda();
        maquina.ejetaMoeda();

        maquina.insereMoeda();
        maquina.acionaAlavanca();

        for (int i = 0; i < 4; i++) {
            maquina.insereMoeda();
            maquina.acionaAlavanca();
        }

        // Tentativa de usar a máquina sem gomas
        maquina.insereMoeda();
        maquina.acionaAlavanca();
    }
}
