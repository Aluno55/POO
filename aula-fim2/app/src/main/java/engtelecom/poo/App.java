package engtelecom.poo;
import java.nio.file.Path;

public class App {
    public static void aplicativo(){
        IO.readln("ls: lista o conteúdo no diretório atual\nstat <Arquivo>: imprime propriedades do arquivo\n"+
        "touch <Arquivo>: cria um arquivo texto\nrm <Arquivo>: exclui o arquivo indicado\nmv <Arquivo1> <Arquivo 2>: move o arquivo1 para o arquivo2");
        String currentDir = System.getProperty("user.dir");
        Path dir = Path.of(currentDir);
    }
    public static void main(String[] args) {
        App app = new App();
    }
}

/*
arquivo regulares: arquivos contendo imagens, texto, etc.
arquivo diretório: arquivos contendo outros arquivos. Uma "pasta"

caminho absoluto: ex. home/aula/POO/aula-fim2/app/src/main/java/engtelecom/poo/App.java
caminho relativo: ex. ../poo/App.java ou app\App.java

arquivo binário: eficiente armazenamento, imagem, áudio, vídeo, etc.
arquivo texto: usa caracteres, texto, csv, markdown, etc.

the "resources" directory is used to save resources, like audios, images and the such.

Path path = Path.of("src/main/resources/coisas"); // InputStream is = App.class.getClassLoader().getResourceAsStream();
*/