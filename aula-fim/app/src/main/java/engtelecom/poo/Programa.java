package engtelecom.poo;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Programa {
    public void touch(Path path){
        try{
        Files.createFile(path);
        } catch (Exception e){
        IO.println("Erro: " + e);
        }
    }

    public void rm(Path path){
        try{
        Files.delete(path);
        } catch (Exception e){
        IO.println("Erro: " + e);
        }
    }

    public void mv(Path oldPath, Path newPath){
        try{
        Files.move(oldPath, newPath);
        } catch (Exception e){
        IO.println("Erro: " + e);
        }
    }

    public void ls(Path p){
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(p)){
            for (Path path : stream) {
                IO.println(path.getFileName());
            }
        } catch (Exception e){
            System.err.println("Erro: " + e);
        }
    }

    public void stat(Path path){
        if (Files.exists(path)) {
            var a = Files.isRegularFile(path);
            IO.println(String.format("Arquivo: " + path.toAbsolutePath()));
            IO.println(String.format("Regular: " + a));
            IO.println(String.format("Diretório: " + !a));
            IO.println(String.format("Permissão de Leitura: " + Files.isReadable(path)));
            IO.println(String.format("Permissão de Escrita: " + Files.isWritable(path)));
        } else {
            IO.println("Arquivo não encontrado");
        }
    }
}