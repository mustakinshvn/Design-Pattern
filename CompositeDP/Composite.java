package CompositeDP;

import java.util.ArrayList;
import java.util.List;

public class Composite implements FileSystemComponent{

    private String name;

     private List<FileSystemComponent> components= new ArrayList<>();

     public Composite(String name) {
        this.name = name;
    }

    public void addComponent(FileSystemComponent component){
        components.add(component);
     }

     public void removeComponent(FileSystemComponent component){
        components.remove(component);
     }
   @Override
    public void display(){
          System.out.println(name);

          for(FileSystemComponent com : components){
              com.display();
          }

    }
}
