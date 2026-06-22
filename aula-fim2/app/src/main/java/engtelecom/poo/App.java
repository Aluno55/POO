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
/*
ls = listar conteudo
stat <arq> = imprime propriedades do arq
touch <arq> = cria 1 arq texto
rm <arq> = exclui arq
mv <arq><arq2> = move arq para arq2
*/
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