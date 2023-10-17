# Aplicativos_moveis_unicsul

<h1>Atividade_03</h1>
<p>
Crie uma base de dados com 50 registros, cada registro deve possuir:
* Nome
* Sexo
* Idade
* Cargo
* Salário

Após o cadastro, a aplicação deve exibir:
* Quem é o homem mais velho
* Quem é a mulher mais velha
* Quem é o homem mais novo
* Quem é a mulher mais nova
* Qual é a média da idade dos homens
* Qual é a idade média das mulheres
* Qual é a idade média independente do sexo

Após o cadastro, a aplicação deve exibir:
* Quem é o homem com o maior salário
* Quem é o homem com o menor salário
* Quem é a mulher com o maior salário
* Quem é a mulher com o menor salário
* Qual é a média dos salários dos homens
* Qual é a média dos salários das mulheres
* Qual é a média dos salários independente do sexo

Após o cadastro, a aplicação deve exibir:
* Quem é a pessoa com o cargo “Diretor” que possui
* maior salário
* Quem é a pessoa que tem o maior nome na empresa
* Quem são as pessoas que possuem 18 anos
* Quem são as pessoas que tem o nome iniciado em “A”

## Função que calcula quem tem o maior salário por sexo

```kotlin
fun encontrarMaiorSalarioPorSexo(sexo: String): Pessoa? {
        val pessoasDoSexo = pessoas.filter { it.sexo == sexo }
        return pessoasDoSexo.maxByOrNull { it.salario }
    }
```

## Função que calcula quem tem o menor salário por sexo

```kotlin
fun encontrarMenorSalarioPorSexo(sexo: String): Pessoa? {
        val pessoasDoSexo = pessoas.filter { it.sexo == sexo }
        return pessoasDoSexo.minByOrNull { it.salario }
    }
```

## Função que calcula a média de salários por sexo

```kotlin
fun calcularMediaSalarioPorSexo(sexo: String): Double {
        val pessoasDoSexo = pessoas.filter { it.sexo == sexo }
        val totalSalarios = pessoasDoSexo.sumByDouble { it.salario }
        return if (pessoasDoSexo.isNotEmpty()) totalSalarios / pessoasDoSexo.size else 0.0
    }
```

## Função que encontra a pessoa com o cargo "Diretor" que possui o maior salário

```kotlin
 fun encontrarDiretorComMaiorSalario(): Pessoa? {
        return pessoas.filter { it.profissao == "Diretor" }.maxByOrNull { it.salario }
    }
```

## Função que encontra a pessoa com o maior nome na empresa
```kotlin
 fun encontrarPessoaComMaiorNome(): Pessoa? {
        return pessoas.maxByOrNull { it.nome.length }
    }
```

## Função que todas as pessoas que tem 18 anos
```kotlin
 fun mostrarPessoasCom18Anos(pessoas: Array<Pessoa>) {
        val pessoasCom18Anos = pessoas.filter { it.idade == 18 }
        if (pessoasCom18Anos.isNotEmpty()) {
            println("Pessoas com 18 anos:")
            for (pessoa in pessoasCom18Anos) {
                println("${pessoa.nome} - Idade: ${pessoa.idade}")
            }
        } else {
            println("Nenhuma pessoa com 18 anos encontrada.")
        }
    }
```

## Função que encontra as pessoas com nome iniciado em "A"
```kotlin
 fun encontrarPessoasComNomeIniciadoEmA(): List<Pessoa> {
        return pessoas.filter { it.nome.startsWith("A", ignoreCase = true) }
    }
```


</p>
