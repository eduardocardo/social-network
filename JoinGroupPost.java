/**
 * Write a description of class JoinGroupPost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JoinGroupPost extends Post
{
    //indica al grupo al que se une el usuario
    private String group;

    /**
     * Constructor for objects of class JoinGroupPost
     */
    public JoinGroupPost(String username,String group)
    {
        super(username);
        this.group = group;
    }

    /**
     *Metodo que devuelve el grupo
     *@return el grupo al que se ha unido
     */
    public String grtGroup()
    {
       return group;
    }
    
    /**
     * Metodo que muestra informacion
     */
    public void display()
    {
        System.out.println("Autor del post : " + getUserName());
        System.out.println("Grupo al que se ha unido : " + group);
        System.out.println("Numero de likes : " + getLikes());
        System.out.println("El mensaje fue creado hace : " 
                            + timeString(System.currentTimeMillis()));
    }
}