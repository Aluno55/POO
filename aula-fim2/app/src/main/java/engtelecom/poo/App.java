package engtelecom.poo;
import java.nio.file.Path;

public class App {
    public void aplicativo(){
        String option = IO.readln("ls: lista o conteúdo no diretório atual\n"+
        "stat <Arquivo>: imprime propriedades do arquivo\n"+
        "touch <Arquivo>: cria um arquivo texto\n"+
        "rm <Arquivo>: exclui o arquivo indicado\n"+
        "mv <Arquivo1> <Arquivo 2>: move o arquivo1 para o arquivo2");
        String currentDir = System.getProperty("user.dir");
        Path dir = Path.of(currentDir);
        Programa prog = new Programa();
        
        option = option.toLowerCase();

        switch (option) {
            case "ls":
                prog.ls(dir);
                break;
            case "stat":
                prog.stat(dir);
                break;
            case "touch":
                prog.touch(dir);
                break;
            case "rm":
                prog.rm(dir);
                break;
            case "mv":
                var newDir = IO.readln("Insira o segundo arquivo");
                Path dir2 = Path.of(newDir);
                prog.mv(dir, dir2);
                break;
            default:
                IO.println("Invalido");
                break;
        }
    }

    public static void main(String[] args) {
        App app = new App();
        app.aplicativo();
    }
}