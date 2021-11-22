import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class AddressBook {
    HashMap<String, String> agenda = new HashMap<>();
    String numero, nombre;

    public void list(){
        if (agenda.entrySet().isEmpty()){
            JOptionPane.showMessageDialog(null, "No hay contactos");
        }else {
            System.out.println("Contactos:");
            for (Map.Entry<String, String> entry : agenda.entrySet()) {
                System.out.println("Número:" + entry.getKey() + " Nombre:" + entry.getValue());
            }
        }
    }

    public void create(){
        numero = (JOptionPane.showInputDialog("Ingresa el numero"));
        nombre = (JOptionPane.showInputDialog("Ingresa el nombre"));
        if (!agenda.containsKey(numero)){
            agenda.put(numero,nombre);
            JOptionPane.showMessageDialog(null, "Se ha añadido el contacto");
        }else{
            JOptionPane.showMessageDialog(null, "Ya existe el contacto");
        }

    }

    public void delete(){
        numero = (JOptionPane.showInputDialog("Ingresa el numero"));

        if (agenda.containsKey(numero)){
            agenda.remove(numero);
            JOptionPane.showMessageDialog(null, "Se ha eliminado el contacto");
        }else{
            JOptionPane.showMessageDialog(null, "El contacto no existe");
        }
    }

    public void load(){

    }

    public void save(){

    }
}
