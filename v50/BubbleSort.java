public class BubbleSort {

    public static void main(String[] args) {

        // skapar en int array av storleken 20
        int[] randomNumbers = new int[20];

        for (int i = 0; i < randomNumbers.length; i++) {

            // fyller arrayen med 20 slumpmässiga heltal mellan 0 och 20
            randomNumbers[i] = (int) (Math.random() * 20) + 1;
        }

        // skriver ut arrayen
        printIntArray(randomNumbers);

        // anropar bubblesort-metoden och skriver ut antal iterationer
        System.out.println("It took " + bubbleSort(randomNumbers) + " iterations to sort the int array using" +
                " bubble sort algorithm.\n");

        // skriver ut en sorterad array
        printIntArray(randomNumbers);
    }

/**
 * Metoden sorterar heltal i storleksordning med hjälp av bubble sort algoritmen
 * @param randomNumbers
 * @return counter
 */
    static int bubbleSort(int[] randomNumbers) {

        // initierar nödvändiga variabler
        boolean swapped = true;
        int counter = 0;

        // loopen körs tills hela arrayen kollas igenom utan att några tal byter plats med varandra
        do {

            swapped = false;

            //loopar igenom hela arrayen 1 gång
            for (int i = 0; i < randomNumbers.length - 1; i++) {

                // jämför två tal bredvid varandra och byter plats på dem om det högra talet är större än det vänstra
                if (randomNumbers[i] > randomNumbers[i + 1]) {
                    int temp = randomNumbers[i + 1];
                    randomNumbers[i + 1] = randomNumbers[i];
                    randomNumbers[i] = temp;
                    swapped = true; // har åtminstone ett byte skett under körningen så ändras swapped värde till true
                }
                // håller koll på antalet iterationer
                counter++;
            }

        } while (swapped); // do-while loopen körs alltid minst en gång

        return counter; // returnerar antalet iterationer
    }

    /**
     * Metoden skriver ut en int array, sorterad eller osorterad
     * @param randomNumbers
     */
    static void printIntArray(int[] randomNumbers) {

        for (int j :
                randomNumbers) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println();
    }
}

