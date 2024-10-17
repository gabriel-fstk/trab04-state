# Máquina de Gomas

Este projeto simula o comportamento de uma máquina de venda de gomas, utilizando o padrão de projeto **State**. O sistema alterna entre diferentes estados conforme a interação do usuário, como inserir moeda, acionar a alavanca e receber a goma.

## Estrutura do Projeto

O projeto está organizado em duas principais pastas:

- `/src/`: Contém o código-fonte da aplicação.

### Estrutura da pasta `/src/`
```
/src/
├── /estados/
│   ├── Estado.java # Interface que define os métodos para os estados da máquina
│   ├── SemMoeda.java # Estado quando a máquina não tem moeda 
│   ├── RecebeuMoeda.java # Estado quando a máquina recebeu uma moeda
│   ├── GomaVendida.java # Estado quando a goma foi vendida
│   └── GomasAcabaram.java # Estado quando as gomas acabaram 
│
├── MaquinaDeGoma.java # Classe principal da máquina de gomas
└── Main.java # Classe principal para execução
```

## Tech Stack

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=plastic&logo=openjdk&logoColor=white)


## Como Executar

### Requisitos

- JDK 8 ou superior
- Maven (opcional para gerenciamento de dependências e execução de testes)
- IDE de sua preferência (VSCode, Eclipse, IntelliJ, etc.)

### Executar a Aplicação

1. Clone o repositório:

```bash
git clone https://github.com/seu-usuario/trab04-state.git
```

Compile e execute a aplicação:
```bash
javac Main.java
```

## Funcionamento

A Máquina de Gomas possui quatro estados principais:

- **Sem Moeda**: Aguardando a inserção de uma moeda.
- **Recebeu Moeda**: Pronta para acionar a alavanca e liberar a goma.
- **Goma Vendida**: Uma goma está sendo liberada.
- **Gomas Acabaram**: Não há mais gomas disponíveis.

Os estados são definidos pela interface Estado.java, e cada estado possui suas implementações específicas nas classes correspondentes.

##Fluxo de Uso

- **Insira uma moeda**: O estado muda de "Sem Moeda" para "Recebeu Moeda".
- **Acione a alavanca**: Se houver gomas, o estado muda para "Goma Vendida" e uma goma é liberada.
- **Gomas Esgotadas**: Se todas as gomas forem liberadas, o estado muda para "Gomas Acabaram", e a máquina não aceitará mais moedas.

## Contribuição

Se quiser contribuir com o projeto, siga estas etapas:

1. Faça um fork do projeto.
2. Crie uma nova branch: 
   ```bash
   git checkout -b feature/nova-funcionalidade
   ```
3. Commit suas mudanças: 
   ```bash
   git commit -m 'feat: adiciona nova funcionalidade X'
   ```
4. Envie para o repositório remoto: 
   ```bash
   git push origin feature/nova-funcionalidade
   ```
5. Abra um Pull Request.

## Licença

Este projeto está licenciado sob a licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.
