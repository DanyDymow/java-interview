import java.io.*;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MarkdownToTxtConverter {

    public static void main(String[] args) {
        Path currentDir = Paths.get(".");
        try {
            // Список всех файлов .md в текущей директории и поддиректориях
            List<Path> mdFiles;
            try (Stream<Path> paths = Files.walk(currentDir)) {
                mdFiles = paths.filter(Files::isRegularFile)
                               .filter(path -> path.toString().endsWith(".md"))
                               .collect(Collectors.toList());
            }

            // Создание папки txt
            Path txtDir = currentDir.resolve("txt");
            Files.createDirectories(txtDir);

            // Конвертация каждого .md файла в .txt
            for (Path mdFile : mdFiles) {
                Path relativePath = currentDir.relativize(mdFile);
                Path txtFile = txtDir.resolve(relativePath).resolveSibling(relativePath.getFileName().toString().replace(".md", ".txt"));
                Files.createDirectories(txtFile.getParent());

                convertMdToTxt(mdFile, txtFile);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void convertMdToTxt(Path mdFile, Path txtFile) {
        try {
            List<String> lines = Files.readAllLines(mdFile, StandardCharsets.UTF_8);
            Files.write(txtFile, lines, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}