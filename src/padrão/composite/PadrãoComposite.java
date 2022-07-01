/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package padrão.composite;

/**
 *
 * @author RROBASSETO
 */
public class PadrãoComposite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        File file = new File();
        
        file.setName("file 1");
        System.out.println(file.getName());
        System.out.println(file.print());
        
        Folder folder = new Folder();
        
        folder.setName("folder 1");        
        System.out.println(folder.getName());
        System.out.println(folder.getChildren());
        System.out.println(folder.print());
    }
    
}
