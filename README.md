# Projeto ERP Financeiro

Este projeto é um sistema de gerenciamento financeiro para um ERP, implementado em Java usando EJB (Enterprise JavaBeans) para lógica de negócios e JPA (Java Persistence API) para persistência de dados. O sistema lida com entidades financeiras como bancos, contas bancárias, moedas, saldos e títulos.

## Funcionalidades

- **Gerenciamento de Bancos**: Recupera e gerencia informações sobre bancos.
- **Gerenciamento de Contas Bancárias**: Obtém informações sobre contas bancárias e permite a criação e atualização de contas.
- **Gerenciamento de Saldos**: Consulta e atualiza saldos de contas bancárias.
- **Conversão de Moeda**: Consulta informações sobre conversão de moedas.
- **Conciliamento de Títulos**: Gerencia e concilia títulos financeiros.

## Requisitos

- Java 11
- Payara 5 ou servidor de aplicação Java EE compatível
- Maven para gerenciamento de dependências

## Estrutura do Projeto

- `src/main/java/br/com/marxsoftware/erp/business/financeiro/`: Contém a lógica de negócios relacionada a finanças, implementada na classe `BancoFacadeBean`.
- `src/main/java/br/com/marxsoftware/erp/persistence/financeiro/`: Contém as entidades JPA que representam a estrutura do banco de dados.

## Configuração

1. **Clone o Repositório**

   ```terminal
   git clone https://github.com/usuario/projeto-erp-financeiro.git
   cd projeto-erp-financeiro

2. **Configurar o Ambiente**


Certifique-se de que o Payara 5 está instalado e configurado corretamente. O projeto usa o PU_MXCRM como unidade de persistência, que deve estar configurada no Payara.


3. **Compilar o Projeto**

Compile o projeto usando Maven:

```terminal
mvn clean install

4. **Implantar no Servidor**

Faça o deploy do arquivo WAR gerado em target/ no Payara 5.
Configure o banco de dados e outras propriedades necessárias no Payara.


### Explicações Adicionais:

1. **Descrição Geral**: Oferece uma visão geral das funcionalidades e propósito do projeto.
2. **Requisitos**: Lista as dependências e pré-requisitos para executar o projeto.
3. **Estrutura do Projeto**: Explica a organização do código.
4. **Configuração**: Passos para configurar e executar o projeto.
5. **Uso**: Exemplos de como utilizar os métodos principais.
6. **Documentação**: Direciona o usuário para o código-fonte para detalhes adicionais.
7. **Contribuições**: Instruções para quem deseja colaborar com o projeto.
8. **Licença**: Informação sobre a licença do projeto.
9. **Contato**: Informações para suporte e contato.

Você pode ajustar o conteúdo conforme necessário para melhor refletir o seu projeto específico e suas necessidades.


