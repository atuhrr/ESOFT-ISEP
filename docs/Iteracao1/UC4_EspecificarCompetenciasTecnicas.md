# UC 4-Especificar Competências Técnicas

## 1. Engenharia de Requisitos

### Formato Breve

 O administrativo inicia a especificação de uma competência técnica(i.e código, descriçao breve e detalhada, área de atividade...). O administrativo intoduz então os dados solicitados.O sitema valida e apresenta os dados, pedindo que os confirme. O administrativo confirma.O siatema regista os dados conforme o administrativoda operação.


### SSD
![UC4_SSD.svg](UC4_SSD.svg)


### Formato Completo

#### Ator principal

 Administrativo

#### Partes interessadas e seus interesses


* **Administrativo:** pretende definir as competências para serem então depois catalogadas com categorias de tarefas nas áreas de atividade.
* **Freelancer:** pretende registar a sua competência técnica para que possa ser contactado por empresas que esjetam interessadas em contratar pessoas dessa mesma competência.
* **T4J:** Pretende que a plataforma permita catalogar as competênciatecnicas e as suas categorias de tarefas em áreas de atividade.

#### Pré-condições

É necessário existir já existir já uma área de atividade referente a essa competência técnica.

#### Pós-condições
A informação de competência técnica é registada no sistema.

#### Cenário de sucesso principal (ou fluxo básico)


1. O administrativo inicia a especificação de uma competência técnica.
2. O sistema solicita os dados necessários(i.e código,descrição breve e detalhada, e uma dada área de atividade)
3. O administrativo intoduz os dados solicitados
4. O sistema valida e apresenta os dados ao administrativo pedindo que os confirme. 
5. O administrativo confirma.
6. O sistema regista os dados da competência técnica e informa o administrativo do sucesso da operação.


#### Extensões (ou fluxos alternativos)
 *a. O administrador solicita o cancelamento da especificação da competência técnica

> O caso de uso termina.

4a. Área de atividade não existe
> 1. O sistema informa que a área de atividade não existe.
> 2. O sistema permite a introdução de uma nova área de atividade (passo 3)
>
	>	2a. O administrador não altera os dados. O caso de uso termina.

4b. Dados mínimos obrigatórios em falta.
>1. O sistema informa quais os dados em falta.
>2. O sistema permite a introdução dos dados em falta (passo 3)
>
	>	2a. O administrador não altera os dados. O caso de uso termina.
4c. O sistema deteta que os dados (ou algum subconjunto dos dados) introduzidos devem ser únicos e que já existem no sistema.
> 1. O sistema avisa o administrador para o facto.
> 2. O sistema permite a sua alteração (passo 3)
>
	>	2a. O administrador não altera os dados. O caso de uso termina.

#### Requisitos especiais
(enumerar requisitos especiais aplicaveis apenas a este UC)

\-

#### Lista de Variações de Tecnologias e Dados
(enumerar variações de tecnologias e dados aplicaveis apenas a este UC)
\-

#### Frequência de Ocorrência
(descrever com que frequência este UC é realizado)

\-

#### Questões em aberto

(lista de questões em aberto, i.e. sem uma resposta conhecida.)

## 2. Análise OO

### Excerto do Modelo de Domínio Relevante para o UC

(Apresentar aqui um excerto do MD relevante para este UC)


## 3. Design - Realização do Caso de Uso

### Racional

| Fluxo Principal | Questão: Que Classe... | Resposta  | Justificação  |
|:--------------  |:---------------------- |:----------|:---------------------------- |
| Passo1  		 |							 |             |                              |
| Passo2  		 |							 |             |                              |
| Passo3  		 |							 |             |                              |
| Passo4  		 |							 |             |                              |
| Passo5  		 |							 |             |                              |
| Passo6  		 |							 |             |                              |              

### Sistematização ##

 Do racional resulta que as classes conceptuais promovidas a classes de software são:

 * Classe1
 * Classe2
 * Classe3

Outras classes de software (i.e. Pure Fabrication) identificadas:  

 * xxxxUI  
 * xxxxController


###	Diagrama de Sequência

![SD_UCX.png](SD_UCX.png)


###	Diagrama de Classes

![CD_UCX.png](CD_UCX.png)
