import java.util.Scanner;

public class cinema {
    public static void main(String[] args) {
        boolean continuar= true;
        int opcao;
        int resposta;
        int opc1;
        String titulo="";
        int quantidade;
        int total;
        String resp1 ="s";
        boolean s = true;
        Scanner sc = new Scanner (System.in);

            do{
                System.out.println("Menu cinema2\n");
                System.out.println("1- Lista de salas \n");
                System.out.println("2- Cadastrar um novo filme \n");
                System.out.println("3- Filmes em exibição \n");
                System.out.println("4- Comprar ingresso \n");
                System.out.println("5- Comprar no snack bar \n");
                System.out.println("6- Encerrar menu \n");

                
               System.out.println("Digite a opção desejada");        
               opcao = sc.nextInt();
               boolean maximoF= true;

               if(opcao==6){   
                continuar=false;
                System.out.println("Programa encerrado");
                }
                if (opcao==1){            
                    System.out.println("1- Lista de salas \n");
                    continuar=false;
                    System.out.println("Você deseja continuar? se sim digite 1");
                    resposta=sc.nextInt();
                if(resposta==1){
                    continuar=false;
                    }
                }
                if (opcao==1){
                    System.out.println("Escolha uma sala \n");
                    System.out.println(" ** Sala 1 **");
                    System.out.println(" ** Sala 2 **");
                    System.out.println(" ** Sala 3 **");
                    int opc = sc.nextInt();
                
                    
 
                if(opc==1){
                    System.out.println("Sala 1 ");
                    System.out.println("** Filmes em exibição **");
                    System.out.println(" - Gato de botas 2: O Ùltimo Pedido \n");
                    System.out.println(" - FROZEN 2 \n");
                    System.out.println(" - SING 2 \n");
                    System.out.println("Você deseja continuar? se sim digite 1 para encerrar menu digite 6");
                    resposta=sc.nextInt();
                    if(resposta==1){
                        continuar=true;
                        }
                    }
                if(opc==2){
                    System.out.println("Sala 2");
                    System.out.println("** Filmes em exibição \n");
                    System.out.println(" - Sonic 2\n");
                    System.out.println(" - Lightyear\n");
                    System.out.println(" - Carros 3\n");
                    System.out.println("Você deseja continuar? se sim digite 1 para encerrar menu digite 6");
                    resposta=sc.nextInt();
                    if(resposta==1){
                        continuar=true;
                        }
                }
                if(opc==3){
                    System.out.println("** Sala 3");
                    System.out.println(" - Os caras malvados\n");
                    System.out.println(" - Viva -A vida é uma festa\n");
                    System.out.println(" - Operação Big hero\n");
                    System.out.println(" - O homem aranha no Aranhaverso\n");
                    System.out.println("Você deseja continuar? se sim digite 1 para encerrar menu digite 6");
                    resposta=sc.nextInt();
                    if(resposta==1){
                    continuar=true;
                    }
                    if (opc>=4)
                    {continuar =false;
                    System.out.println("Erro maximo");
                    }
                }
                }
            if (opcao==2){
                System.out.println("=== Cadastrar um novo filme ===");
                System.out.print("Título do filme: ");
                titulo = sc.next();
                System.out.println("Filme cadastrado com sucesso!\n");
                int filmes;
            }
        

                if (opcao ==3) {

                    System.out.println("    ===Filmes em catalogo===   \n");
                    System.out.println(" - Gato de Botas 2: O Último Pedido \n");
                    System.out.println(" - Os Caras Malvados \n");
                    System.out.println(" - Sing 2\n");
                    System.out.println(" - Sonic 2 - O Filme\n");
                    System.out.println(" - Lightyear \n");
                    System.out.println(" - Frozen 2 \n");           
                    System.out.println(" - Carros 3 \n");
                    System.out.println(" - Viva – A Vida é uma Festa \n");
                    System.out.println(" - Operação Big Hero\n");
                    System.out.println(" - Homem-Aranha no Aranhaverso\n");
                    System.out.println(  "Filme adicionadoi "+titulo);
                    System.out.println("Você deseja continuar? se sim digite 1 para encerrar menu digite 6");
                    resposta=sc.nextInt();
                if(resposta==1){
                    continuar=true;
                  
                }
                }
         
                if(opcao==6){
                 boolean Continuar=false;
                 System.out.println("Programa encerrado");


                 }
                 int Ingresso;
                 int sala1;
                 int sala2;
                 int sala3;
                 int preço;
                 
                 
         
                 
                System.out.println("Qual sala. 1,2,3");
         
                 int opc = sc.nextInt();
                 sala1 =sc.nextInt();
                 
                 while(opcao==4){
             
                 
                 if (opc ==1){
                     System.out.println("1- sala");
                     System.out.println("preço: R$ 15,00");
                     System.out.println("quantos ingressos ?");
                     int ingresso = sc.nextInt();
                     if(ingresso>=100){
                     System.out.println("a sala nao esta está disponivel" );
                 }
                 else{
                     System.out.println("a sala esta disponivel");         
         
         }
         
                      
             }
             if (opc ==2){
                 System.out.println("sala 2 ");
                 System.out.println("preço: R$ 500,000.00");
                 preço=sc.nextInt();
                 System.out.println("quantos ingressos ?");
                 int ingresso = sc.nextInt();
                 if(ingresso>=80){
                 
                    System.out.println("a sala não esta disponivel");  
         
             }
         
             else{
                 System.out.println("a sala esta disponivel");
         
         }
         break;
                  
         }
         if (opc ==3){
             System.out.println("sala 3");
             System.out.println("preço: R$ 200,00");
             preço=sc.nextInt();
             System.out.println("quantos ingressos ?");
             int ingresso = sc.nextInt();
             if(ingresso>=120){
                 System.out.println("a sala nao esta disponivel");
         }
         else{
            System.out.println("a sala esta disponivel");
        
        
        }
        if(opcao==5){
        System.out.println("|||||   Snackbar  |||||");
        System.out.println("1 - pipoca 2 - Coca Cola 3 - M&M 4 - Bala Fini 5 - Finalizar Compra");
        System.out.println("Escolha uma opção das anteriores");
        int op = sc.nextInt();
        }
        

                if (opc==5){
            System.out.println("1- pipoca");
            System.out.println("preço: 12,00 ");
             int preco = 12;
            System.out.println("digite a quantidade");
            quantidade= sc.nextInt();
            total = (preço*quantidade);
            System.out.println(" o preco total é: "+total);
            int troco = (50-total);
            System.out.println("o troco é :"+troco);
            System.out.println("digite 1 para continuar e 2 para finalizar ?");
            int resp = sc.nextInt();
            
            if(resp == 1){
                continuar = true;
            }
            else{
                continuar = false;
            }
        

       
        if (opc==2){
            System.out.println("2- Coca Cola");
            System.out.println("preço: R$7,00 ");
             int preço_3 = 7;
            System.out.println("digite a quantidade");
            quantidade= sc.nextInt();
            total = (preço_3*quantidade);
            System.out.println(" o preco total é: "+total);
             troco = (50-total);
            System.out.println("o troco é :"+troco);
            System.out.println("digite 1 para continuar e 2 para finalizar ?");
            resposta = sc.nextInt();
            if(total>200){
                System.out.println("Você tá cheio da grana 😉");
                if(total>50){
                
                int troco2 = (200-total);
                System.out.println("o troco é :" +troco2);
                }
            }
                if(total>200){
                    System.out.println("Você tá cheio da grana 😉");
        }
    
        if (opc ==3){
            System.out.println("2 - M&M");
            System.out.println("preço: R$6,00 ");
             int preço_2 = 6;
            System.out.println("digite a quantidade");
            quantidade= sc.nextInt();
            total = (preço_2*quantidade);
            System.out.println(" o preco total é: "+total);
            System.out.println("o troco é :"+troco);
            int troco2 = (200-total);
            System.out.println("o troco é :" +troco2);
            System.out.println("digite 1 para continuar e 2 para finalizar ?");
             sc.nextInt();
            }
            if(total>200){
                System.out.println("Você tá cheio da grana 😉");
        }

        if (opc ==4){
            System.out.println("4- Bala Fini ");
            System.out.println("preço: R$ 3,00 ");
             int preço_4 = 7;
            System.out.println("digite a quantidade");
            quantidade= sc.nextInt();
            total = (preço_4*quantidade);
            System.out.println(" o preco total é: "+total);
            System.out.println("o troco é :"+troco);
            if(total>200){
             System.out.println("Você tá cheio da grana 😉");
            
        }
        int troco2 = (200-total);
        System.out.println("o troco é :" +troco2);
        }
        System.out.println("digite 1 para continuar e 2 para finalizar ?");
     sc.nextInt();
        

        if(opc ==5){
            System.out.println("Finalizar Compra");
            continuar = false;
        }
    }
}

    }


                 
                
                } while(continuar);
            }while(continuar);

        }
    
    
    }
//moises entregou a vida a vida no snack bar
// eu juntei todos os codigos menos os do ingresso e snack bar
// moises fez os 3 ultimos da lista e eu fiz a programação dos 4 primeiros o caio fez a 5