# Demonstração de alguns Padrões de Projetos em Ambiente Java

Este projeto demonstra a aplicação de alguns Padrões de Projetos em Java, destacando os principais componentes e seu funcionamento. 

## Singleton Pattern
Implementamos o padrão Singleton com três variações:
- **SingletonLazy:** Cria a instância apenas quando necessário.
- **SingletonEager:** Cria a instância imediatamente na inicialização.
- **SingletonLazyHolder:** Usa uma classe interna para inicialização segura e eficiente.

## Strategy Pattern
Utilizamos o padrão Strategy para definir estratégias de movimento, incluindo:
- **ComportamentoAgressivo:** Movimento agressivo.
- **ComportamentoDefensivo:** Movimento defensivo.
- **ComportamentoNormal:** Movimento normal. A classe Robô pode alterar o comportamento dinamicamente.

## Facade Pattern
Implementamos o padrão Facade para simplificar a interação com subsistemas complexos. A classe Facade coordena a migração de clientes, utilizando CepApi e CrmService.

## Novos Comportamentos de Salto
Introduzimos três comportamentos de salto:
- **ComportamentoDefensivoComSalto:** Combina movimento defensivo com um salto específico.
- **ComportamentoNormalComSalto:** Combina movimento normal com um salto específico.
- **ComportamentoAgressivoComSalto:** Combina movimento agressivo com um salto específico. Esses comportamentos de salto seguem o padrão Strategy, permitindo escolhas dinâmicas.

## Testes Abrangentes
Na classe de teste, adicionamos casos de teste para validar os novos comportamentos de salto e os comportamentos existentes. Isso destaca como os Padrões de Projetos em Ambiente Java facilitam a expansão do sistema de forma flexível e modular.
