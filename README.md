# Atividade Singleton - Prof. Rafaela
## Alunos:
  Marco Thulio Martins: RA - 4231921901 ||
  Breno Jesus Andrade de Oliveira: RA - 4231921291 ||
  GitHub : [bJesuss](https://github.com/bJesuss)
### Escopo da atividade:
  PRÁTICA - FÁBRICA DE CHOCOLATE

As modernas fábricas de chocolate utilizam sistemas automatizados para controlar suas caldeiras, que são responsáveis por misturar leite e chocolate, aquecê-los até a ebulição e passar a mistura para a fase seguinte da produção de barras de chocolate.

Sua tarefa é implementar um sistema que controle a caldeira de chocolate da fábrica XYZ, obedecendo às seguintes regras operacionais:

Regras do Sistema
	1 - Preenchimento da Caldeira: A caldeira só pode ser preenchida com chocolate e leite quando estiver vazia.
		a) Fervura: A caldeira só pode ferver a mistura se ela já estiver cheia, mas ainda não fervida.
		b) Drenagem: A caldeira só pode ser drenada após a mistura ter sido fervida. Não é possível drenar a caldeira se o conteúdo ainda não foi fervido ou se ela estiver vazia.

	2 - Requisitos
		a) Padrão Singleton: Para garantir que apenas uma caldeira esteja em operação ao mesmo tempo, você deve usar o padrão Singleton. Isso significa que o sistema deve permitir a criação de apenas uma instância da caldeira durante todo o processo de fabricação.

	3 - Estados da Caldeira: A caldeira deve ter três estados distintos:
		a)Vazia: A caldeira está vazia e pronta para ser preenchida.
		b) Cheia: A caldeira foi preenchida com chocolate e leite, mas a mistura ainda não foi fervida.
		c) Em ebulição: A caldeira está fervendo a mistura de chocolate e leite.

	4 - Comportamento do Sistema
		a) Preenchimento: Se a caldeira estiver vazia, o sistema deve permitir que ela seja preenchida. Caso contrário, o preenchimento não deve ser permitido.
		b) Fervura: O sistema só deve permitir que a caldeira ferva quando estiver cheia. Se a caldeira estiver vazia ou se a mistura já estiver fervida, a operação não deve ser permitida.
		c) Drenagem: A mistura deve ser drenada apenas se tiver passado pelo processo de fervura. Se o conteúdo ainda não estiver fervido ou a caldeira estiver vazia, a drenagem não deve ocorrer.
Descrição da Tarefa

	5 - Utilize o padrão Singleton para garantir que apenas uma instância da caldeira seja usada em todo o processo.

	6 - Garanta que as restrições de operação sejam cumpridas:
		a) Não preencher a caldeira se ela já estiver cheia.
		b) Não ferver a mistura se a caldeira estiver vazia ou se a mistura já estiver fervida.
		c) Não drenar a caldeira se o conteúdo não tiver sido fervido.

	7 - Implemente a classe CaldeiraChocolate com no mínimo:
		a) Atributos:
		b) vazia: Indica se a caldeira está vazia (inicialmente true).
		c) fervida: Indica se a mistura já foi fervida (inicialmente false).
		d) instancia: Mantém a única instância da caldeira (Singleton).

	8 - Métodos:
		a) getInstancia(): Retorna a única instância da caldeira, garantindo o padrão Singleton.
		b) encher(): Preenche a caldeira com chocolate e leite, respeitando a regra de que a caldeira deve estar vazia para ser preenchida.
		c) ferver(): Coloca a mistura de chocolate e leite em ebulição, verificando se a caldeira está cheia e se a mistura ainda não foi fervida.
		d) drenar(): Drena a mistura fervida, verificando se a fervura ocorreu e se a caldeira não está vazia.

	9 - Implemente a classe FabricaDeChocolate para testar todos os métodos da CaldeiraChocolate.
