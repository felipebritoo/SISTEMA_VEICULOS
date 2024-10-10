 SISTEMA_VEICULOS:Nesse reprositorio foi feito com o intuito de auxiliar logica de progamação orientada objeto.

🚀 Começando

Sistema de Gerenciamento de Veículos
Este projeto implementa um sistema para processar dados de diferentes tipos de veículos, incluindo automóveis, motocicletas, caminhões, bicicletas e skates. O sistema utiliza princípios de programação orientada a objetos, como encapsulamento e validação de dados.

Estrutura do Projeto
Classe Base: Veiculo

Contém atributos comuns a todos os veículos: modelo, ano de fabricação, montadora, cor e kilometragem.
Métodos de acesso (getters e setters) com validações para garantir dados corretos.
Método abstrato gerarInsert() para ser implementado nas subclasses.
Classes Derivadas

Automovel: Adiciona atributos específicos como quantidade de passageiros, tipo de freio e airbag. Implementa o método gerarInsert() para criar instruções SQL de inserção.
Motocicleta: Inclui atributos como cilindrada e torque.
Caminhao: Contém quantidade de eixos e peso bruto.
Bicicleta: Possui atributos como marca, material, quantidade de marchas e amortecedor.
Skate: Inclui atributos como marca e tipo de rodas.
Classe Principal: Main

Cria instâncias das classes derivadas.
Chama o método gerarInsert() para exibir as instruções de inserção SQL para cada veículo.

📋 Pré-requisitos Visual Studio + extensões do Java

🔧 Instalação Cada programa pode ser executado individualmente. Basta compilar o código em seu ambiente Java e executar o arquivo correspondente. Alguns programas utilizam a classe Scanner para permitir a entrada de dados pelo usuário.

🛠️ Construído com Ferramentas utilizadas e bibliotecas Visual Studio

📌 Versão Versão 1.0

✒️ Autores Herick Marlon - Trabalho Inicial -  SISTEMA_VEICULOS