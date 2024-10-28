import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia,nomecliente;
        Double saldo;
        Locale.setDefault(Locale.US);
// PERGUNTAS AO USUÁRIO
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite seu nome");
        nomecliente = sc.nextLine();
        System.out.println("Por favor, digite a agência");
        agencia = sc.nextLine();
        System.out.println("Por favor, digite seu número ");
        numero = sc.nextInt();
        System.out.println("Por favor, digite seu Saldo atual ");
        saldo = sc.nextDouble();

//VISUALIZAÇÃO NA TELA
        System.out.println("Olá, " + nomecliente +", obrigado por criar uma conta em nosso banco, sua agência é: "+agencia+",");
        System.out.println(" Conta "+numero+ " e seu Saldo de "+ saldo + " já está disponível para saque." );


        
    }
}
