data class Pessoa(val nome: String, val profissao: String,
                  val salario: Double, val sexo: String, val idade: Int)

fun main() {
    val pessoas = arrayOf(
        Pessoa("João", "Engenheiro de Software", 75000.0, "Masculino", 18),
        Pessoa("Maria", "Médica", 90000.0, "Feminino", 28),
        Pessoa("Carlos", "Professor", 45000.0, "Masculino", 35),
        Pessoa("Ana", "Advogada", 80000.0, "Feminino", 42),
        Pessoa("Pedro", "Designer Gráfico", 60000.0, "Masculino", 27),
        Pessoa("Laura", "Enfermeira", 55000.0, "Feminino", 29),
        Pessoa("Adalberto", "Engenheiro Civil", 72000.0, "Masculino", 38),
        Pessoa("Julia", "Psicóloga", 68000.0, "Feminino", 31),
        Pessoa("Ricardo", "Contador", 63000.0, "Masculino", 40),
        Pessoa("Camila", "Arquiteta", 82000.0, "Feminino", 34),
        Pessoa("Lucas", "Consultor Financeiro", 95000.0, "Masculino", 18),
        Pessoa("Carla", "Bióloga", 55000.0, "Feminino", 18),
        Pessoa("Gustavo", "Cientista de Dados", 80000.0, "Masculino", 29),
        Pessoa("Isabela", "Engenheira Elétrica", 85000.0, "Feminino", 36),
        Pessoa("Rafael", "Policial", 67000.0, "Masculino", 44),
        Pessoa("Sara", "Farmacêutica", 72000.0, "Feminino", 39),
        Pessoa("Diego", "Técnico de Suporte", 48000.0, "Masculino", 25),
        Pessoa("Larissa", "Designer de Interiores", 60000.0, "Feminino", 27),
        Pessoa("André", "Gestor de Logística", 71000.0, "Masculino", 35),
        Pessoa("Patrícia", "Diretor", 55000.0, "Feminino", 30),
        Pessoa("Miguel", "Chef de Cozinha", 58000.0, "Masculino", 32),
        Pessoa("Clara", "Engenheira de Som", 70000.0, "Feminino", 34),
        Pessoa("Alex", "Técnico de Laboratório", 48000.0, "Masculino", 26),
        Pessoa("Eduarda", "Artista 3D", 65000.0, "Feminino", 28),
        Pessoa("Roberto", "Diretor", 90000.0, "Masculino", 40),
        Pessoa("Vanessa", "Analista de Marketing", 58000.0, "Feminino", 31),
        Pessoa("Marcos", "Operador de Máquinas", 52000.0, "Masculino", 37),
        Pessoa("Cintia", "Gerente de Recursos Humanos", 76000.0, "Feminino", 38),
        Pessoa("Raul", "Engenheiro Mecânico", 70000.0, "Masculino", 41),
        Pessoa("Amanda", "Economista", 78000.0, "Feminino", 29),
        Pessoa("Marcelo", "Consultor de TI", 85000.0, "Masculino", 32),
        Pessoa("Renata", "Terapeuta Física", 62000.0, "Feminino", 35),
        Pessoa("Felipe", "Gerente de Vendas", 90000.0, "Masculino", 39),
        Pessoa("Isadora", "Artista 3D", 60000.0, "Feminino", 26),
        Pessoa("Thiago", "Advogado", 72000.0, "Masculino", 33),
        Pessoa("Lívia", "Gestor de Logística", 68000.0, "Feminino", 34),
        Pessoa("Daniel", "Consultor Financeiro", 88000.0, "Masculino", 28),
        Pessoa("Bianca", "Cirurgiã", 95000.0, "Feminino", 41),
        Pessoa("Leonardo", "Gerente de Projetos", 79000.0, "Masculino", 37),
        Pessoa("Larissa", "Cientista de Dados", 86000.0, "Feminino", 29),
        Pessoa("José", "Engenheiro Civil", 74000.0, "Masculino", 38),
        Pessoa("Gabriela", "Policial", 68000.0, "Feminino", 36),
        Pessoa("Marcelo", "Cientista de Dados", 92000.0, "Masculino", 40),
        Pessoa("Caroline", "Biomédica", 60000.0, "Feminino", 31),
        Pessoa("Lucas", "Gestor de Marketing", 75000.0, "Masculino", 34),
        Pessoa("Raquel", "Psicóloga", 78000.0, "Feminino", 30),
        Pessoa("Matheus", "Escritor", 60000.0, "Masculino", 29),
        Pessoa("Fernanda", "Engenheira Elétrica", 85000.0, "Feminino", 35),
        Pessoa("Marcela", "Terapeuta Ocupacional", 59000.0, "Feminino", 32),
        Pessoa("Roberto", "Desenhista Industrial", 74000.0, "Masculino", 40),
        Pessoa("Isabel", "Engenheira de Software", 79000.0, "Feminino", 37),
        Pessoa("Lucas", "Bombeiro", 58000.0, "Masculino", 33),
        Pessoa("Elaine", "Nutricionista", 61000.0, "Feminino", 28),
        Pessoa("Rodrigo", "Médico Veterinário", 70000.0, "Masculino", 36),
        Pessoa("Juliana", "Gerente de Recursos Humanos", 75000.0, "Feminino", 35),
        Pessoa("Marcos", "Desenvolvedor de Software", 82000.0, "Masculino", 31),
        Pessoa("Aline", "Fotógrafa", 57000.0, "Feminino", 29)
    )

    // Função que calcula quem tem o maior salário por sexo
    fun encontrarMaiorSalarioPorSexo(sexo: String): Pessoa? {
        val pessoasDoSexo = pessoas.filter { it.sexo == sexo }
        return pessoasDoSexo.maxByOrNull { it.salario }
    }

    // Função que calcula quem tem o menor salário por sexo
    fun encontrarMenorSalarioPorSexo(sexo: String): Pessoa? {
        val pessoasDoSexo = pessoas.filter { it.sexo == sexo }
        return pessoasDoSexo.minByOrNull { it.salario }
    }

    // Função que calcula a média de salários por sexo
    fun calcularMediaSalarioPorSexo(sexo: String): Double {
        val pessoasDoSexo = pessoas.filter { it.sexo == sexo }
        val totalSalarios = pessoasDoSexo.sumByDouble { it.salario }
        return if (pessoasDoSexo.isNotEmpty()) totalSalarios / pessoasDoSexo.size else 0.0
    }

    // Função que encontra a pessoa com o cargo "Diretor" que possui o maior salário
    fun encontrarDiretorComMaiorSalario(): Pessoa? {
        val diretores = pessoas.filter { it.profissao == "Diretor" }
        return diretores.maxByOrNull { it.salario }
    }

    // Função que encontra a pessoa com o maior nome na empresa
    fun encontrarPessoaComMaiorNome(): Pessoa? {
        return pessoas.maxByOrNull { it.nome.length }
    }

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

    // Função que encontra as pessoas com nome iniciado em "A"
    fun encontrarPessoasComNomeIniciadoEmA(): List<Pessoa> {
        return pessoas.filter { it.nome.startsWith("A", ignoreCase = true) }
    }

    // Funções para encontrar o homem mais velho, a mulher mais velha, o homem mais novo e a mulher mais nova
    fun encontrarHomemMaisVelho(pessoas: Array<Pessoa>): Pessoa? {
        val homens = pessoas.filter { it.sexo.equals("Masculino", ignoreCase = true) }
        if (homens.isNotEmpty()) {
            return homens.maxByOrNull { it.idade }
        }
        return null
    }

    fun encontrarMulherMaisVelha(pessoas: Array<Pessoa>): Pessoa? {
        val mulheres = pessoas.filter { it.sexo.equals("Feminino", ignoreCase = true) }
        if (mulheres.isNotEmpty()) {
            return mulheres.maxByOrNull { it.idade }
        }
        return null
    }

    fun encontrarHomemMaisNovo(pessoas: Array<Pessoa>): Pessoa? {
        val homens = pessoas.filter { it.sexo.equals("Masculino", ignoreCase = true) }
        if (homens.isNotEmpty()) {
            return homens.minByOrNull { it.idade }
        }
        return null
    }

    fun encontrarMulherMaisNova(pessoas: Array<Pessoa>): Pessoa? {
        val mulheres = pessoas.filter { it.sexo.equals("Feminino", ignoreCase = true) }
        if (mulheres.isNotEmpty()) {
            return mulheres.minByOrNull { it.idade }
        }
        return null
    }

    val homemMaisVelho = encontrarHomemMaisVelho(pessoas)
    val mulherMaisVelha = encontrarMulherMaisVelha(pessoas)
    val homemMaisNovo = encontrarHomemMaisNovo(pessoas)
    val mulherMaisNova = encontrarMulherMaisNova(pessoas)
    val diretorComMaiorSalario = encontrarDiretorComMaiorSalario()
    val pessoaComMaiorNome = encontrarPessoaComMaiorNome()
    val pessoasComNomeIniciadoEmA = encontrarPessoasComNomeIniciadoEmA()
    val homemComMaiorSalario = encontrarMaiorSalarioPorSexo("Masculino")
    val homemComMenorSalario = encontrarMenorSalarioPorSexo("Masculino")
    val mulherComMaiorSalario = encontrarMaiorSalarioPorSexo("Feminino")
    val mulherComMenorSalario = encontrarMenorSalarioPorSexo("Feminino")
    val mediaSalarioHomens = calcularMediaSalarioPorSexo("Masculino")
    val mediaSalarioMulheres = calcularMediaSalarioPorSexo("Feminino")
    val mediaSalarioTotal = calcularMediaSalarioPorSexo("Masculino") + calcularMediaSalarioPorSexo("Feminino")

    println("Homem com o maior salário:  ${homemComMaiorSalario?.nome}")
    println("Homem com o menor salário:  ${homemComMenorSalario?.nome}")
    println("Mulher com o maior salário:  ${mulherComMaiorSalario?.nome}")
    println("Mulher com o menor salário:  ${mulherComMenorSalario?.nome}")
    println("Média dos salários dos homens: R$ $mediaSalarioHomens")
    println("Média dos salários das mulheres: R$ $mediaSalarioMulheres")
    println("Média dos salários independente do sexo: R$ ${mediaSalarioTotal / pessoas.size}")
    println("Diretor com o maior salário: ${diretorComMaiorSalario?.nome}")
    println("Pessoa com o maior nome na empresa: ${pessoaComMaiorNome?.nome}")
    mostrarPessoasCom18Anos(pessoas)
    println("Pessoas com nome iniciado em 'A':")
    pessoasComNomeIniciadoEmA.forEach { println(it.nome) }
    println("Homem mais velho: ${homemMaisVelho?.nome}, Idade: ${homemMaisVelho?.idade}")
    println("Mulher mais velha: ${mulherMaisVelha?.nome}, Idade: ${mulherMaisVelha?.idade}")
    println("Homem mais novo: ${homemMaisNovo?.nome}, Idade: ${homemMaisNovo?.idade}")
    println("Mulher mais nova: ${mulherMaisNova?.nome}, Idade: ${mulherMaisNova?.idade}")
}
