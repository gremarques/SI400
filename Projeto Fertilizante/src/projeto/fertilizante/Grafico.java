package projeto.fertilizante;

public class Grafico 
{
    int id_Grafico;
    
    //Metodos
    public int getId_grafico() 
    {
        return id_Grafico;
    }

    public boolean setId_grafico(int id_Grafico) 
    {
        if (id_Grafico > 0)
        {
            this.id_Grafico = id_Grafico;
            return true;
        }
        else
            return false;
    }
    //Construtor

    public Grafico() {
        this.id_Grafico = 0;
    }
    
    
}
