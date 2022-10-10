package libraryApplication;

import Menu.Menu;
import org.springframework.beans.factory.annotation.Autowired;

public class LibraryApplication {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.showMenu();
    }
}
