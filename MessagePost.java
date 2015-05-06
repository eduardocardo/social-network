import java.util.ArrayList;
import java.lang.System;
/**
 * Write a description of class MessagePost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MessagePost extends Post
{
    //representa el mensaje enviado
    private String message;

    /**
     * Constructor for objects of class MessagePost
     */
    public MessagePost(String author,String text)
    {
        super(author);
        this.message = text;
        
    }
    
    /**
     * Metodo que devuelve el mensaje asociado al post
     * @return el mensaje 
     */
    public String getText()
    {
        return message;
    }
   
    /**
     * Metodo que muestra los datos del post
     */
    public void display()
    {
        System.out.println("Usuario : " + getUserName() + "\nMensaje : " + message
            + "\nNumero de likes : " + getLikes() + "\nEl mensaje fue creado hace " + 
            timeString(System.currentTimeMillis()) + "\nComentarios :");
        mostrarComentarios();
    }
    
    
}
