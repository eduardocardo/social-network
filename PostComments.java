import java.util.ArrayList;
/**
 * Write a description of class PostComments here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PostComments extends Post
{
     //ArrayList que almacena los comentarios que se hacen sobre el post
    private ArrayList<String> comments;

    /**
     * Constructor for objects of class PostComments
     */
    public PostComments(String author)
    {
         super(author);
         comments = new ArrayList<>();
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
     * Metodo que muestra los comentarios
     */
    public void mostrarComentarios()
    {
          if(comments.size() == 0)
        {
            System.out.println("No hay comentarios");
        }
        else
        {
            
            for(int i = 0; i < comments.size();i++)
            {
                System.out.println(comments.get(i));
            }
        }
    }
}
