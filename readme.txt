Problema: Sistema de Gestão de Torneio de Luta Medieval
Você deve criar um sistema que gerencie um torneio de luta medieval, onde cavaleiros com diferentes características se enfrentam em batalhas. O sistema deve permitir:

Requisitos Funcionais:
Cadastro de Cavaleiros, cada um com:

Nome

Nível (de 1 a 100)

Classe (por exemplo: Paladino, Bárbaro, Arqueiro)

Força

Defesa

Velocidade

Pontos de Vida (HP)
----------------------------------------------------------------------------
Sistema de Batalha:

Dois cavaleiros podem duelar.

O sistema calcula quem ataca primeiro com base na velocidade.

O ataque subtrai da vida do oponente a diferença entre força e defesa.

O duelo segue até um cavaleiro chegar a 0 HP.
----------------------------------------------------------------------------
Torneio:

Pode ser criado com vários cavaleiros.

O sistema sorteia batalhas em pares até que reste apenas um campeão.

Logs de Batalha:

A cada turno, mostrar quem atacou, o dano causado e a vida restante do oponente.