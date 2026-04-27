# README — Configuração e Execução de Projeto Java

## 0.1 Java ↔ JVM (Bytecode, HotSpot/VM, Portabilidade)

O Java é uma linguagem de programação cujo código-fonte (`.java`) é compilado em **bytecode** (`.class`). Esse bytecode não é executado diretamente pelo sistema operacional, mas sim pela **JVM (Java Virtual Machine)**.

A JVM funciona como uma camada intermediária que interpreta ou compila dinamicamente o bytecode para código nativo da máquina. Implementações modernas, como a **HotSpot VM**, utilizam técnicas de otimização em tempo de execução (JIT - Just-In-Time Compiler), melhorando o desempenho.

Essa arquitetura garante a principal vantagem do Java: **portabilidade**. Um programa compilado pode rodar em qualquer sistema que possua uma JVM compatível, seguindo o princípio *"write once, run anywhere"*.

---

## 0.2 Instalação do JDK (17+)

Foi realizada a instalação do JDK versão 17 ou superior.

Comando utilizado para verificação:

```bash
java -version
```

---

## 0.3 Instalação e Configuração do IntelliJ IDEA

O IntelliJ IDEA foi instalado e configurado com o JDK previamente instalado.

Configuração realizada:

* Acesso às configurações do projeto
* Definição do **Project SDK** apontando para o JDK 17+


---

## 0.4 Criação do Projeto

Foi criado um novo projeto do tipo:

* **Java Application**

Estrutura básica gerada automaticamente pelo IntelliJ.

---

## 0.5 Hello World

Arquivo `Main.java` criado com o seguinte conteúdo:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Estação Letheia online.");
    }
}
```

---

## 0.6 Build do Projeto

O build foi realizado através do menu do IntelliJ:

* Menu **Build**
* Opção **Build Project**

Durante esse processo:

* O código-fonte `.java` é compilado
* São gerados arquivos `.class` (bytecode)
* O IntelliJ utiliza o compilador do JDK configurado

Se houver erros de compilação, eles são exibidos no console do IDE.

---

## 0.7 Execução da Aplicação

A aplicação foi executada diretamente pelo console do IntelliJ:

* Clique com botão direito no arquivo `Main.java`
* Seleção da opção **Run 'Main.main()'**

Saída esperada no console:

```
Estação Letheia online.
```
---

## 0.8 Depuração (Debug)

Foi realizado um processo de depuração com as seguintes etapas:

* Inserção de um **breakpoint** no método `main`
* Execução em modo **Debug**
* Observação das variáveis no painel de debug
* Uso do comando **Step Over** para avançar linha a linha


### Observações

Durante a depuração, foi possível acompanhar a execução do programa passo a passo, verificando o fluxo de execução e o comportamento das variáveis em tempo real. Além disso, o uso do *Step Over* permitiu entender como cada instrução é processada pela JVM.

---
## Fundamentos de Orientação a Objetos

O Java é uma linguagem baseada no paradigma de Orientação a Objetos (OO). Para compreender a estrutura do código, é essencial dominar quatro conceitos fundamentais:

Classe (Class): É o "molde" ou a planta-baixa (blueprint). Ela define a estrutura, as características e os comportamentos que uma entidade terá no sistema, mas não é a entidade em si.

Objeto (Object): É a instância concreta criada a partir de uma classe. Se a classe é o projeto de uma estação espacial, o objeto é a estação já construída e ocupando espaço na memória.

Campos (Fields / Atributos): São as variáveis declaradas dentro de uma classe. Eles armazenam o "estado" ou as características do objeto (ex.: nome da estação, nível de energia, status de conexão).

Métodos (Methods): São as funções definidas dentro da classe. Eles representam os "comportamentos" ou as ações que o objeto é capaz de executar (ex.: iniciar sistemas, transmitir mensagens).
---
## 2.2 Diagrama de Entidades e Tipos de Dados

Abaixo está o diagrama de classes em formato ASCII, demonstrando a estrutura e as dependências conceituais do sistema de monitoramento (Estação Letheia):

```text
  +-------------------+          +-------------------+
  |    Observador     |          |    Coordenada     |
  +-------------------+          +-------------------+
  | - id: int         |          | - latitude: double|
  | - nome: String    |          | - longitude:double|
  | - nascimento:     |          +-------------------+
  |   LocalDateTime   |                   ^
  | - documento: Long |                   |
  | - email: String   |                   | (Localização)
  +-------------------+                   |
            ^                             |
            | (Relata)                    |
            |                   +-------------------+
            +-------------------|   Avistamento     |
                                +-------------------+
                                | - id: BigInteger  |
                                | - dataHora:       |
                                |   LocalTime       |
                                | - descricao:String|
                                | - testemunhas: int|
                                +-------------------+
```

### Justificativas de Decisões Técnicas
Durante o desenvolvimento, optou-se por utilizar classes específicas da API do Java para garantir precisão, segurança e escalabilidade aos dados do sistema:

java.time.LocalTime e java.time.LocalDateTime (API de Datas do Java 8+):

Por que usamos: Diferente da antiga classe Date, as classes do pacote java.time são imutáveis e thread-safe (seguras para uso em sistemas paralelos).

Onde usamos: * O LocalDateTime foi aplicado na data de nascimento do Observador, pois guarda a data e o horário exato sem as complexidades de fuso horário.

O LocalTime foi utilizado no Avistamento (dataHora) para registrar a hora, minuto e segundo exatos em que o fenômeno foi detectado no céu.

java.math.BigInteger:

Por que usamos: Tipos primitivos como int e long possuem limites máximos (o long suporta até ~9 quintilhões). O BigInteger aloca a memória dinamicamente, permitindo armazenar números inteiros de tamanho infinito (limitados apenas pela memória RAM da máquina). Ele também é imutável, o que aumenta a segurança da informação.

Onde usamos: Aplicado como identificador (id) da classe Avistamento. Como a Estação Letheia pode mapear registros em escala universal ou receber fluxos massivos de dados espaciais ao longo de milênios, o BigInteger garante que o sistema nunca sofrerá de overflow (estouro de limite) na geração de novos IDs.