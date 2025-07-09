# Sistema de Classificação de Candidatos em Java

## 📖 Descrição Geral

Sistema em Java para gerenciamento e classificação de candidatos eleitorais. O projeto lê dados de candidatos de um arquivo, permite consultas por número de inscrição e gera um arquivo com os dois melhores candidatos classificados por critérios de pontuação, idade e dependentes.

## 🎯 Objetivo

Ler os dados de 5 candidatos a partir de um arquivo, permitir consultas pelo número de inscrição e gerar um arquivo com os dois candidatos mais bem classificados, conforme os critérios definidos.

## 🛠️ Funcionalidades

- 📄 Leitura dos dados dos candidatos do arquivo `Candidatos.txt`
- 🔍 Consulta por número de inscrição com busca recursiva
- 🏆 Classificação dos candidatos com base em:
  - Pontuação total
  - Idade (priorizando maiores de 60)
  - Número de dependentes (em caso de empate)
- 📁 Geração de arquivo `Classificados2.txt` com os dois primeiros colocados

## 📐 Regras de Classificação

A ordenação e seleção dos candidatos segue os seguintes critérios, nesta ordem:

1. Maior pontuação
2. Em caso de empate:
   - Prioriza candidatos com **idade igual ou superior a 60**
3. Persistindo o empate:
   - Prioriza o candidato com maior número de dependentes

## 🧱 Estrutura do Projeto

```
sistema-classificacao-candidatos/
├── MenuCand.java # Menu principal com opções de interação
├── Candidatos.java # Classe que representa um candidato
├── CandidatoFuncoes.java # Lógica de leitura, consulta e classificação
├── Candidatos.txt # Arquivo de entrada com dados dos candidatos
├── Classificados2.txt # Arquivo gerado com os dois melhores candidatos
```

### 📄 Formato do Arquivo `Candidatos.txt`

O arquivo deve conter os dados de **5 candidatos** (ou mais), seguindo a ordem abaixo para cada um:

```
Número de inscrição (int)
Nome (String)
Idade (int)
Número de dependentes (int)
Pontuação total (int)
```

Exemplo de conteúdo do `Candidatos.txt`:

```
1001
João Silva
34
2
85
1002
Maria Souza
29
1
92
1003
Carlos Lima
41
3
78
1004
Ana Costa
22
0
95
1005
Paulo Mendes
36
1
88
...
```

### 📄 Exemplo de Arquivo `Classificados2.txt` Gerado

```
Inscrição: 1018
Nome: Beatriz Castro
Idade: 39
Número de dependentes: 3
Pontuação: 96

Inscrição: 1004
Nome: Ana Costa
Idade: 22
Número de dependentes: 0
Pontuação: 95
```

## ▶️ Como Executar

1. Certifique-se de que o arquivo `Candidatos.txt` esteja no diretório do projeto.
2. Compile os arquivos Java:

```
javac MenuCand.java Candidatos.java CandidatoFuncoes.java
```

3. Execute o programa:

```
java MenuCand
```

4. Navegue pelo menu:
   
```
Menu
1 - Leitura de Candidatos
2 - Pesquisa do Candidato
3 - Grava o 1° lugar
9 - FIM!
```

## 💻 Tecnologias Utilizadas

- Java (JDK 8+)
- Swing (JOptionPane)
- Manipulação de arquivos `.txt`

## 🏷️ Tags

`java` `poo` `arquivo-txt` `classificação` `candidatos` `recursividade`
