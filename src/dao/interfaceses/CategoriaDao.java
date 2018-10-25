package dao.interfaceses;

public interface CategoriaDao {
    
    public Integer obtenerId(String nombre);
    public boolean existe(String nombre);
    
    public boolean guardar(String nombre);
    public boolean modificar(Integer id);
    public boolean borrar(Integer id);
    
    public boolean activar(Integer id);
    public boolean desactivar(Integer id);
    
}
