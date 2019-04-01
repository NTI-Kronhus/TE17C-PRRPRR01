## HangmanConsoleWindow

1. Börja med att ladda hem HangmanConsoleWindow.jar ovan.
2. Högerklicka på ditt projekt i Eclipse.
3. Välj properties.
4. Välj sedan Java Build Path.
5. Klicka på fliken Libraries.
6. Klicka på Add External JARs
7. Leta upp filen du laddade ner och välj den.
8. Klicka Apply and Close.
9. KLART!


Exempel med användning av HangmanConsoleWindow:
```java
package hangman;

import jaok.HangmanConsoleWindow;

public class hangman_main {

	public static void main(String[] args) {

		HangmanConsoleWindow hcw = new HangmanConsoleWindow();
    
    		hcw.println("Välkommen");

	}

}
```
