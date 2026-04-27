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
