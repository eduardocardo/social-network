import java.util.ArrayList;
/**
 * Write a description of class PhotoPost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PhotoPost extends PostComments
{
   
    private String fileName;
    //es el titulo del archivo
    private String caption;
    
    /**
     * Constructor for objects of class PhotoPost
     */
    public PhotoPost(String author,String fileName,String caption)
    {
        super(author);
        this.fileName = fileName;
        this.caption = caption;
       
    }
    
    /**
     * Metodo que devuelve el nombre del archivo
     * @return  el nombre del archivo
     */
    public String getImageFile()
    {
        return fileName;
    }

    /**
     *Metodo que devuelve el titulo asociado al archivo
     *@return el texto asociado a la imagen
     */
    public String getCaption()
    {
        return caption;
    }   
  
    /**
     * Metodo que muestra los datos del post
     */
    public void display()
    {
        System.out.println("Usuario : " + getUserName() + "\nFileName : " + fileName
            + "\nAsunto :" + caption + "\nLikes : " + getLikes() + 
            "\nEl mensaje fue creado hace " + timeString(System.currentTimeMillis()) 
            + "\nComentarios :");
        mostrarComentarios();
    }
    
    
}
