package td1.exercice2.application;

import td1.exercice2.compression.templateMethod.CustomImageCompressionAlgorithm1;
import td1.exercice2.compression.templateMethod.CustomImageCompressionAlgorithm2;
import td1.exercice2.compression.templateMethod.ImageCompressionAlgorithm;
import td1.exercice2.filtrage.adapter.FiltrageAdapter;
import td1.exercice2.filtrage.strategy.services.FilterStrategy;
import td1.exercice2.filtrage.strategy.services.impl.FiltrageImpl1;
import td1.exercice2.filtrage.strategy.services.impl.FiltrageImpl2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] image = new int[20];

        ImageFramework imageFramework = new ImageFramework(image);

        FilterStrategy filter1 = new FiltrageImpl1();
        FilterStrategy filter2 = new FiltrageImpl2();
        FilterStrategy filter3 = new FiltrageAdapter();

        ImageCompressionAlgorithm compress1 = new CustomImageCompressionAlgorithm1();
        ImageCompressionAlgorithm compress2 = new CustomImageCompressionAlgorithm2();

        System.out.println("Real image...");
        imageFramework.displayImage(image);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choisissez l'implémentation de filtrage (1, 2, 3 ) :");
        int choixFiltrage = scanner.nextInt();

        switch (choixFiltrage) {
            case 1:
                imageFramework.setFilterStrategy(filter1);
                break;
            case 2:
                imageFramework.setFilterStrategy(filter2);
                break;
            case 3:
                imageFramework.setFilterStrategy(filter3);
                break;
            default:
                break;
        }

        System.out.println("\n___________________ image filtrée :_________________________\n");
        int[] imageFiltre = imageFramework.getFilterStrategy().filter(image);
        imageFramework.displayImage(imageFiltre);

        System.out.println("Choisissez l'implémentation de compression (1, 2 ou autre pour par défaut) :");
        int choixCompression = scanner.nextInt();

        switch (choixCompression) {
            case 1:
                imageFramework.setImageCompressionAlgorithm(compress1);
                break;
            case 2:
                imageFramework.setImageCompressionAlgorithm(compress2);
                break;
            default:
                break;
        }

        System.out.println("\n___________________ image compressée :_________________________\n");
        int[] imageCompressee = imageFramework.getImageCompressionAlgorithm().compress(image);
        imageFramework.displayImage(imageCompressee);

        scanner.close();
    }
}
