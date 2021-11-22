import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        showMenu();
    }

    public static void showMenu() throws IOException {
        byte option = 0;
        AddressBook agenda = new AddressBook();
        File myObj = new File("src/contactos.csv");
        agenda.load(myObj);
        do{
            try {
                option = Byte.parseByte(JOptionPane.showInputDialog("""
                        Agenda de contactos
                        Selecciona una opción
                        1. Ver lista
                        2. Añadir contacto
                        3. Borrar contacto
                        0. Salir"""));
            }catch (Throwable e){
                JOptionPane.showMessageDialog(null, "Opción inválida");
                showMenu();
            }
            switch (option) {
                case 1 -> agenda.list();
                case 2 -> agenda.create();
                case 3 -> agenda.delete();
                case 0 -> {
                    agenda.save();
                    option = 0;
                }
                default -> JOptionPane.showMessageDialog(null, "Opción inválida");
            }
        }while (option != 0);
    }
}
