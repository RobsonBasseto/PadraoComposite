/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padrão.composite;

/**
 *
 * @author RROBASSETO
 */
public class Folder extends FileSystemItem {
    private String name;
    public FileSystemItem[] children;

    public FileSystemItem[] getChildren() {
        return children;
    }

    public void setChildren(FileSystemItem[] children) {
        this.children = children;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String print() {
        return "print folder";
    }
    
}
