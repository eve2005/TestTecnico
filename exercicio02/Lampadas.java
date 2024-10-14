/*
 * 
 * 5) Você está em uma sala com três interruptores, cada um conectado a uma
 * lâmpada em salas diferentes. Você não pode ver as lâmpadas da sala em que
 * está, mas pode ligar e desligar os interruptores quantas vezes quiser. Seu
 * objetivo é descobrir qual interruptor controla qual lâmpada. Como você faria
 * para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual
 * interruptor controla cada lâmpada?
 * 
 * 1°Etapa
 * Acendo o primeiro e segundo interruptor e entro na primeira sala
 * Se estiver acesso: o interruptor da primeira sala ou é o 1°interruptor ou o
 * segundo°interruptor
 * Se estiver apagado: o interruptor da primeira sala é o último
 * 
 * 2° etapa
 * Deixo o primeiro interuptor acesso e desligo o segundo interruptor,e o
 * terceiro permanece desligado.Entro segunda sala.
 * Se estiver acessa, sei que o primeiro interruptor pertence a segunda sala,
 * então o segundo interruptor é da primeira sala(com dados da 1° etapa)
 * Se estiver apagado então o primeiro interruptor é da terceira sala. O segundo
 * interruptor da primeira sala, e p terceiro interruptor é da segunda sala.
 * 
 * 
 * 
 * 
 */