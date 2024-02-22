package src.constants;

import java.nio.file.Path;

import static src.constants.Alphabet.ALPHABET;

public class Constants {

    private static final String ORIGINAL_FILE = "Введите путь к файлу, который нужно закодировать (*.txt):";
    private static final String DESTINATION_FILE = "Введите путь к файлу, куда нужно записать закодированное содержимое (*.txt):";
    private static final String EXAMPLE_FILE = "Enter example file (*.txt):";
    private static final String FILE_IS_EXIST = "Вы ввели путь к файлу, желаете продолжить? (y/n)";
    private static final String FILE_NOT_EXIST = "Такого файла не сущетвует";
    private static final String ORIGINAL_DESTINATION = "Original file and destination file must be different.";
    private static final String MODE = "Enter mode (1 - Encryption; 2 - Decryption; 3 - BruteForce; 4 - Statistical Analysis):";
    private static final String KEY = "Enter key 0.." + (ALPHABET.length - 1) + ":";

    private static Path originalFile;
    private static Path destinationFile;
    private static Path exampleFile;
}
