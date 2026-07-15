<!--
Sync Impact Report
- Version change: 1.0.0 -> 1.1.0
- Modified principles:
  - "Lean Validation" (removido) -> "Cobertura de Testes Obrigatória"
  - "Pragmatic Spring Boot Usage" -> adaptado para "Adoção de Java 21 e Spring Boot compatível" (linguagem formalizada)
  - Novos princípios adicionados: Arquitetura Hexagonal, Cobertura de Testes 100%, Evitar Comentários, Gate de Finalização (lint + testes 100%), Proibição de Gambiarras
- Added sections: Regras de Qualidade e Entrega, Arquitetura
- Removed sections: "Lean Validation" (reformulado)
- Templates requiring updates: ✅ .specify/templates/plan-template.md, ✅ .specify/templates/spec-template.md, ✅ .specify/templates/tasks-template.md
- Follow-up TODOs: none
-->

# Constituição do Todo

## Princípios Centrais

### I. Simplicidade em Primeiro Lugar
O projeto DEVE permanecer pequeno, focado e fácil de compreender. Novas funcionalidades DEVEM resolver a necessidade imediata sem introduzir abstrações desnecessárias ou complexidade especulativa. Quando existirem trade‑offs, a opção mais simples que satisfaça o requisito DEVE ser escolhida.

### II. Código Limpo por Padrão
O código DEVE ser fácil de ler e manter. Nomes DEVEM ser explícitos, classes e funções DEVEM ter responsabilidade única, e a complexidade DEVEM ser reduzida por funções pequenas, estrutura clara e formatação consistente. Evitar duplicação quando ela prejudicar a manutenibilidade.

### III. Adoção de Java 21 e Spring Boot Compatível
A base do projeto DEVE usar Java 21 e uma versão do Spring Boot compatível. Configuração, injeção de dependências e estrutura de pacotes DEVEM seguir convenções claras e não superdimensionar a solução para o escopo do projeto.

### IV. Arquitetura Hexagonal (Obrigatória)
O código DEVE seguir a arquitetura hexagonal (ports & adapters). Dependências externas e detalhes de infraestrutura DEVEM ser isolados nos adaptadores; o domínio e as regras de negócio DEVEM ser independentes de frameworks e infra.

### V. Cobertura de Testes 100% por Funcionalidade
Toda funcionalidade NOVA ou alterada DEVE ter testes automatizados cobrindo 100% das linhas/ramificações relevantes do código dessa funcionalidade. A cobertura é um requisito de aceitação — sem 100% de cobertura não há conclusão da tarefa.

### VI. Evitar Comentários; Priorizar Código Legível
Comentários DEVEM ser evitados. Prefira código simples, nomeclatura clara e extração de funções para tornar o propósito explícito. Comentários só são aceitáveis quando explicam decisões de projeto não óbvias e não podem ser expressas por código mais claro.

### VII. Gate de Finalização Estrito
Uma tarefa SÓ PODE SER considerada finalizada se os comandos de lint e de testes retornarem 100% de sucesso. Não há exceções: se qualquer um desses comandos falhar, a tarefa NÃO está completa.

### VIII. Proibição de Gambiarras
Proibido usar gambiarras ("workarounds") em produção ou em testes. Testes NÃO PODEM conter artifícios que distorçam resultados, ignorar falhas ou suprimir erros. Qualquer atalho deverá ser removido antes da conclusão da tarefa.

## Regras de Qualidade e Entrega
- Linting automatizado DEVE estar configurado e ser executado como parte do fluxo de validação (CI/local).
- Testes automatizados DEVERÃO ser executáveis localmente e no CI; os resultados DEVEM ser determinísticos.
- Métricas de cobertura DEVERÃO apontar 100% para o escopo da funcionalidade entregue (linhas e ramos pertinentes).
- Mudanças na arquitetura que afetem princípios DEVEM incluir justificativa no plano da feature e aprovação em revisão de código.

## Project Constraints
- O projeto DEVE usar Java 21.
- O projeto DEVE usar uma versão do Spring Boot compatível com Java 21.
- A arquitetura DEVE seguir o padrão hexagonal (ports/adapters).
- Preferir implementações diretas e legíveis; evitar frameworks desnecessários.

## Development Workflow
- Antes de iniciar implementação, o plano DEVE descrever como a feature respeita a arquitetura hexagonal e como alcançará 100% de cobertura de testes.
- Para cada user story, criar tarefas separadas para: implementação, testes (unitários, integração, contrato quando aplicável), e verificação de cobertura.
- Nenhuma mesclagem ou marcação de tarefa como concluída até que lint e testes passem 100% localmente e no CI.

## Governance
Esta constituição substitui práticas ad‑hoc. Emendas DEVEM:
- Ser registradas neste documento com data e justificativa;
- Indicar quais templates ou guias foram atualizados;
- Incluir um plano de migração quando a mudança afetar entregas existentes.

**Version**: 1.1.0 | **Ratified**: 2026-07-05 | **Last Amended**: 2026-07-15
