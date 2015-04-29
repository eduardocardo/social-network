import java.util.ArrayList;
import java.lang.System;
/**
 * Write a description of class MessagePost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MessagePost
{
    //indica el nombre del usuario
    private String userName;
    //representa el mensaje enviado
    private String message;
    //indica el momento en el que fue creado
    private long timeStamp;
    //indica el numero de likes que tiene el post
    private int likes;
    //ArrayList que almacena los comentarios que se hacen sobre el post
    private ArrayList<String> comments;

    /**
     * Constructor for objects of class MessagePost
     */
    public MessagePost(String author,String text)
    {
        this.userName = author;
        this.message = text;
        timeStamp = System.currentTimeMillis();
        likes = 0;
        comments = new ArrayList<>();
    }

    /**
     *Metodo que aumenta el numero de likes que tiene el post
     */
    public void like()
    {
        likes++;
    }

    /**
     * Metodo que disminuye el numero de likes que tiene el post si el numero de likes es mayor 
     * de 0,por defecto no hace nada
     */
    public void unlike()
    {
        if(likes > 0)
        {
            likes--;
        }

    }

    /**
     * Metodo que añade un comentario a la coleccion de comentarios sobre el post
     * @param text es el comentario que quiere añadir
     */
    public void addComment(String text)
    {
        comments.add(text);
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
     * Metodo que devuelve el tiempo en el que fue creado el post
     * @return el tiempo en el que fue creado en milisegundos
     */
    public long getTimeStamp()
    {
        return timeStamp;
    }

    /**
     * Metodo que muestra los datos del post
     */
    public void display()
    {
        System.out.println("Usuario : " + userName + "\nMensaje : " + message
            + "\nNumero de likes : " + likes + "\nEl mensaje fue creado hace " + 
            timeString(System.currentTimeMillis()) + "\nComentarios :");
        if(comments.size() == 0)
        {
            System.out.println("No hay ningun comentario");

        }
        else
        {
            for(int i = 0; i < comments.size();i++)
            {
                System.out.println(comments.get(i));
            }
        }                  
    }
    
    /**
     * Metodo que muestra la diferencia de tiempo en milisegundos entre el momento en el que se  
     * crea el mensaje y un tiempo que se pasa por parametro
     * @param  time es el tiempo a comparar
     * @return la diferencia entre esos tiempos en forma de cadena
     */
    public String timeString(long time)
    {
        long diferencia = time - timeStamp;
        int segundos = (int)diferencia/1000;
        int minutos = segundos/60;
        int horas = minutos/60;
        minutos -= horas*60;
        segundos -= minutos*60;
        
        String tiempo = " ";
        if(horas != 0)
        {
            tiempo += horas + " horas ";
        }
        if(minutos != 0)
        {
            tiempo += minutos + " minutos ";
        }
        tiempo += segundos + " segundos ";
        return tiempo;
    }
}
