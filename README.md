# **Sistema de Gerenciamento de Veículos**

Este projeto é uma aplicação simples desenvolvida em Java para gerenciamento de veículos. Ele utiliza conceitos de **orientação a objetos (OO)**, como herança, métodos de acesso e classes abstratas, conforme os requisitos definidos para a atividade avaliativa.

---

## **Descrição do Projeto**

O sistema foi projetado para representar veículos de diferentes tipos (Carro e Moto), utilizando uma arquitetura baseada em classes abstratas. Cada tipo de veículo possui atributos e métodos específicos, garantindo uma implementação clara e extensível.

---

## **Funcionalidades**

1. **Classe Abstrata Veiculo:**
    - **Atributos comuns a todos os veículos:**
        - `marca`: Nome do fabricante do veículo (público).
        - `modelo`: Modelo do veículo (público).
        - `ano`: Ano de fabricação do veículo (privado, acessado por métodos).
    - **Métodos:**
        - Método abstrato `informacoesVeiculo()` para retornar informações detalhadas.
        - Métodos `getAno()` e `setAno(int ano)` para manipular o ano de fabricação.

2. **Classe Carro:**
    - Herda da classe `Veiculo`.
    - Atributo adicional `numeroPortas` (público).
    - Implementação do método `informacoesVeiculo()` para exibir os detalhes do carro.

3. **Classe Moto:**
    - Herda da classe `Veiculo`.
    - Atributo adicional `cilindrada` (privado).
    - Métodos `getCilindrada()` e `setCilindrada(int cilindrada)` para manipular a cilindrada.
    - Implementação do método `informacoesVeiculo()` para exibir os detalhes da moto.

4. **Classe Principal (Main):**
    - Instancia objetos de `Carro` e `Moto`.
    - Define os atributos para cada objeto.
    - Exibe as informações dos veículos no console utilizando o método `informacoesVeiculo()`.

---

## **Estrutura do Projeto**

```
GerenciamentoVeiculos/
├── src/
│   ├── Veiculo.java           # Classe abstrata Veiculo
│   ├── Carro.java             # Classe Carro (herda de Veiculo)
│   ├── Moto.java              # Classe Moto (herda de Veiculo)
│   ├── Main.java              # Classe Principal (Main)
├── README.md                  # Documentação do projeto
└── .gitignore                 # Arquivo para ignorar arquivos desnecessários no Git
```

---

## **Como Executar**

### **Pré-requisitos**
Certifique-se de ter instalado:
- **Java Development Kit (JDK)** (versão 8 ou superior).
- Um editor de texto ou IDE como **Eclipse**, **IntelliJ IDEA**, ou **VS Code**.

### **Passo a Passo**

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/seu-usuario/GerenciamentoVeiculos.git
   cd GerenciamentoVeiculos
   ```

2. **Compile os arquivos Java:**
   ```bash
   javac src/*.java
   ```

3. **Execute o programa principal:**
   ```bash
   java -cp src Main
   ```

---

## **Exemplo de Saída**

Ao executar o programa, você verá a seguinte saída no console:

```
Carro:
Marca: Toyota
Modelo: Corolla
Ano: 2020
Número de Portas: 4

Moto:
Marca: Honda
Modelo: CB 500X
Ano: 2022
Cilindrada: 500cc
```

---

## **Conceitos Utilizados**

- **Classes Abstratas:** A classe `Veiculo` serve como uma base para outros tipos de veículos, garantindo que todos implementem o método `informacoesVeiculo()`.
- **Herança:** `Carro` e `Moto` herdam os atributos e métodos da classe `Veiculo`, mas adicionam comportamentos próprios.
- **Encapsulamento:** O atributo `ano` em `Veiculo` e `cilindrada` em `Moto` são manipulados exclusivamente por métodos de acesso (getters e setters).
- **Polimorfismo:** A chamada do método `informacoesVeiculo()` em cada classe demonstra o uso de métodos com comportamento diferente.

---

## **Como Contribuir**

1. Faça um fork deste repositório.
2. Crie uma branch para suas alterações:
   ```bash
   git checkout -b minha-contribuicao
   ```
3. Commit suas alterações:
   ```bash
   git commit -m "Adiciona funcionalidade X"
   ```
4. Envie para o repositório remoto:
   ```bash
   git push origin minha-contribuicao
   ```
5. Abra um Pull Request detalhando suas alterações.
