import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyTxtFiles {
    public static void main(String[] args) {
        // Папки, которые нужно обработать
        String[] folders = { "!Eng", "Eng" };

        for (String folder : folders) {
            File dir = new File(folder);
            if (dir.exists() && dir.isDirectory()) {
                try {
                    processDirectory(dir, dir);
                } catch (IOException e) {
                    System.err.println("Ошибка при обработке папки " + folder + ": " + e.getMessage());
                }
            } else {
                System.err.println("Папка " + folder + " не существует или не является директорией");
            }
        }
    }

    // Рекурсивная функция для обработки директорий и копирования .txt файлов
    public static void processDirectory(File rootDir, File currentDir) throws IOException {
        File[] files = currentDir.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    // Рекурсивный обход поддиректорий
                    processDirectory(rootDir, file);
                } else if (file.isFile() && file.getName().endsWith(".txt")) {
                    // Если это .txt файл, копируем его в соответствующую папку txt
                    File txtDir = new File(rootDir, "txt");
                    if (!txtDir.exists()) {
                        txtDir.mkdirs();
                    }

                    // Построение пути к файлу в новой папке txt
                    Path relativePath = rootDir.toPath().relativize(file.toPath());
                    Path destinationPath = Paths.get(txtDir.getPath(), relativePath.toString());

                    // Создаем директорию, если она не существует
                    if (!destinationPath.getParent().toFile().exists()) {
                        Files.createDirectories(destinationPath.getParent());
                    }

                    Files.copy(file.toPath(), destinationPath, StandardCopyOption.REPLACE_EXISTING);
                    System.out.println("Файл " + file.toPath() + " скопирован в " + destinationPath);
                }
            }
        }
    }
}
