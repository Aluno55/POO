package engtelecom.poo;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class App {
    public static void main(String[] args) {
        // try(Scanner arq = new Scanner(App.class.getClassLoader().getResourceAsStream("texto.txt"))){
        //     while (arq.hasNext()){
        //         IO.println(arq.nextLine());
        //     }
        // } catch (Exception e){
        //     System.err.println("Erro: " + e);
        // }

        String currentDir = System.getProperty("user.dir");

        Path dir = Path.of(currentDir);

        // Path dir = Path.of(currentDir+"/arquivo.txt");
        // if (Files.exists(dir)) {
        //     IO.println(String.format("Arquivo: " + dir.toAbsolutePath()));
        //     IO.println(String.format("Regular: " + Files.isRegularFile(dir)));
        //     IO.println(String.format("Diretório: " + Files.isDirectory(dir)));
        //     IO.println(String.format("Permissão de Leitura: " + Files.isReadable(dir)));
        //     IO.println(String.format("Permissão de Escrita: " + Files.isWritable(dir)));
        // } else {
        //     IO.println("Arquivo não encontrado");
        //     IO.println(currentDir);
        // }

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)){
            for (Path path : stream) {
                IO.println(path.getFileName());
            }
        } catch (IOException e){
            System.err.println("Erro: " + e);
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
    }
}