package inOutPutData;
import java.util.Formatter;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class createFile {
    private Formatter output;

    public void openfile() {
        try {
            output = new Formatter("cliente.txt");
        }catch(Exception e){
            System.err.pritnln("error create file!");
            System.exit(1);
        }
    }

    public void addRecord() {
        AccountRecord record = new AccountRecord();
        Scanner input = new Scanner(System.in);
        System.out.println("%s\n\n", "Para finalizar a entrada digite no terminal <ctrl> e tecle enter");
        System.out.println("%s\n%s", "Entre com o núemro da conta, nome, sobrenome e saldo!","->");
        while(!input.hasNext()) {
            try {
                record.setAccount(input.nextInt());
                record.setfirstName(input.next());
                record.setlastName(input.next());
                record.setbalance(input.nextDouble());

                if(record.getAccount()>0)
                {
                    output.format("%d %s %s %.2f\n", record.getAccount, record.getfirstName(), record.getlastName(), record.getbalance());
                }else{
                    System.out.println("Conta de ser maior q zero");
                }
            } catch(NoSuchElementException e) {
                System.err.println("entrada inválida");
            }
            System.out.println("%s %s\n%s", "Entre com o numero de contanome e saldo!", "->");
        }
        input.close();
    }
    public void closeFile() {

    }
}