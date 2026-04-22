# Sistema de Relógio Brasileiro e Americano

Este projeto é uma aplicação Java didática que demonstra a implementação de diferentes sistemas de horários (24h e 12h AM/PM) utilizando conceitos avançados de Programação Orientada a Objetos (POO) e as APIs modernas do ecossistema Java.

## 🚀 Funcionalidades

- **Relógio Brasileiro:** Exibe o horário no formato de 24 horas (HH:mm:ss).
- **Relógio Americano:** Exibe o horário no formato de 12 horas com o marcador AM/PM (hh:mm:ss a), incluindo a lógica de conversão necessária para a API de tempo do Java.
- **Interação via Console:** Interface simples para entrada de dados e escolha do tipo de relógio.

## 🛠️ Conceitos Técnicos Aplicados

O projeto utiliza recursos introduzidos nas versões mais recentes do Java (Java 17+):

1.  **Sealed Classes (Classes Seladas):** A classe `Horario` é selada, o que significa que apenas as classes explicitamente autorizadas (`RelogioAmericano` e `RelogioBrasileiro`) podem estendê-la. Isso garante maior segurança e controle na hierarquia de herança.
2.  **Java Time API:** Uso de `LocalTime` e `DateTimeFormatter` para manipulação e formatação profissional de datas e horas.
3.  **Encapsulamento e Herança:** Uso de modificadores de acesso, getters/setters e sobrescrita de métodos (`@Override`).
4.  **Try-with-resources:** Gerenciamento automático de recursos (Scanner) para evitar vazamentos de memória.
5.  **Switch Expressions:** Uso da sintaxe moderna do `switch` (setas `->`) para um código mais limpo e legível.

## 📁 Estrutura do Projeto

- `Horario.java`: Classe base selada que define a estrutura comum de tempo.
- `RelogioBrasileiro.java`: Implementação específica para o padrão 24h.
- `RelogioAmericano.java`: Implementação específica para o padrão 12h com lógica AM/PM.
- `Main.java`: Ponto de entrada que gerencia o fluxo da aplicação.

## ⚙️ Pré-requisitos

- **Java JDK 17** ou superior (necessário para o suporte a `sealed classes`).
- Um terminal ou IDE de sua preferência (IntelliJ IDEA, VS Code, Eclipse).

## 🏃 Como Executar

1. Clone este repositório ou baixe os arquivos.
2. Navegue até a pasta `src`.
3. Compile os arquivos:
   ```bash
   javac *.java
   ```
4. Execute a classe principal:
   ```bash
   java Main
   ```

## 📝 Exemplo de Uso

Ao iniciar o programa, escolha o tipo de relógio. Se escolher o **Americano**, o programa solicitará a hora (1-12) e se o período é **AM** (antes do meio-dia) ou **PM** (após o meio-dia), realizando a formatação correta automaticamente.

---
*Desenvolvido como exemplo de estudos em Java.*
