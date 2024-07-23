public class HelloWorld1{
    public static void main(String[] args) { // args receber parametros
        String ambiente = args[0];

        if (ambiente.equalsIgnoreCase("DEV")){ // ignoreCase ignora se é upper ou lower
            System.out.print("Executando em DEV");
        } else if (ambiente.equalsIgnoreCase("TEST")) {
            System.out.print("Ambiente de teste");
        } else {
            System.out.print(ambiente);
        }
    }
}