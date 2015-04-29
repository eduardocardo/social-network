import java.util.ArrayList;
/**
 * Write a description of class NewsFeed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NewsFeed
{
    //ArrayList que almacena una coleccion de post de mensajes
    private ArrayList<MessagePost> messages;
    //ArrayList que almacena una coleccion de post de fotos
    private ArrayList<PhotoPost> photos;

    /**
     * Constructor for objects of class NewsFeed
     */
    public NewsFeed()
    {
       messages = new ArrayList<>();
       photos = new ArrayList<>();
    }

    /**
     *Metodo que añade post de mensajes al ArrayList
     */
    public void addMessagePost(MessagePost message)
    {
       messages.add(message);
    }
    
    /**
     * Metodo que añade post de fotos al ArrayList
     */
    public void addPhotoPost(PhotoPost photo)
    {
        photos.add(photo);
    }
    
    /**
     * Metodo que muestra primero todos los post de texto y luego los post de fotos
     */
    public void show()
    {
        //primero se recorre la coleccion de post de texto
        for(int i = 0; i < messages.size();i++)
        {
            System.out.println("Mensaje " + (i + 1)); 
            messages.get(i).display();
        }
        //luego muestra los post de fotos
        for(int i = 0;i < photos.size();i++)
        {
            System.out.println("Foto " + (i + 1));
            photos.get(i).display(); 
        }
    }
}
