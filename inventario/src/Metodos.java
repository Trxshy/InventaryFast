
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Metodos {
//SECCION DE METODOS PARA GESTION DE USUARIO
    public void agregarUsuario(Usuario usuario) throws SQLException{
        ConexionBD con = new ConexionBD();
        Connection cn = con.conexion();
        try{
        PreparedStatement ps;
        ps = cn.prepareStatement("INSERT INTO mydb.usuario (run, digitoverificador ,nomUsu, nombre,apePaterno, apeMaterno,email, clave, Ti_Usu_idTiUsu) VALUES (?,?,?,?,?,?,?,?,(select idTiUsu FROM mydb.ti_usu WHERE nomTiUsu =?))");
        ps.setString(1, usuario.getRun());
        ps.setString(2, usuario.getDv());
        ps.setString(3, usuario.getNomUsu());
        ps.setString(4, usuario.getNombre());
        ps.setString(5, usuario.getApePaterno());
        ps.setString(6, usuario.getApeMaterno());
        ps.setString(7, usuario.getEmail());
        ps.setString(8, usuario.getContrasenia());
        ps.setString(9, usuario.getCargo());
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Agregado correctamente");
        }catch (SQLException ex) {
            
                }
       
    }
    public void modificarUsuario(Usuario usuario, String id) throws SQLException{
        ConexionBD con = new ConexionBD();
        Connection cn = con.conexion();
        PreparedStatement ps = cn.prepareStatement("UPDATE mydb.usuario SET run = ?,digitoverificador = ?, nombre =?, apePaterno=?, apeMaterno=?, email=?, nomUsu=?,clave=?, Ti_Usu_idTiUsu = (select idTiUsu from ti_usu WHERE nomTiUsu = ?) WHERE mydb.usuario.idUsu = "+ id);
        ps.setString(1, usuario.getRun());
        ps.setString(2, usuario.getDv());
        ps.setString(3, usuario.getNombre());
        ps.setString(4, usuario.getApePaterno());
        ps.setString(5, usuario.getApeMaterno());
        ps.setString(6, usuario.getEmail());
        ps.setString(7, usuario.getNomUsu());
        ps.setString(8, usuario.getContrasenia());
        ps.setString(9, usuario.getCargo());
        ps.executeUpdate();
    }
    public void eliminarUsuario(String run) throws SQLException{
        ConexionBD con = new ConexionBD();
        Connection cn = con.conexion();
        PreparedStatement ps = cn.prepareStatement("DELETE from mydb.usuario WHERE run =" + run);
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Eliminado correctamente");
    }
    
//Metodo para generar la contraseña
    public static String contrasenia(String nombre, String run){
        String contrasenia ="";
        String n = nombre.substring(0,3);
        String r = run.substring(0,8);
        contrasenia = n + r;
        return contrasenia;
        
    }
    //Metodo para generar el nombre de usuario
    public static String nomUsu(String nombre, String apellido){
        String nomusuario = "";
        String n = nombre.substring(0,3);
        String a = apellido.substring(0,3);
        nomusuario = n + a;
        return nomusuario;
    }
    
    //METODOS PARA LA GESTION DE PROVEEDORES
    public void agregarProveedor(Proveedor prov) throws SQLException{
        ConexionBD con = new ConexionBD();
        Connection cn = con.conexion();
        try{
        PreparedStatement ps = cn.prepareStatement("INSERT INTO mydb.proveedor (Run, Dv, NomProv,Direccion,numero) VALUES (?,?,?,?,?)");
        ps.setString(1, prov.getRun());
        ps.setString(2, prov.getDv());
        ps.setString(3, prov.getNombre());
        ps.setString(4, prov.getDireccion());
        ps.setString(5, prov.getNumeroContacto());
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Agregado correctamente.");
        }catch (SQLException ex){
            
        }
      
    }
    public void modificarProveedor(Proveedor prov, String id)throws SQLException{
        ConexionBD con = new ConexionBD();
        Connection cn = con.conexion();
        try{
            PreparedStatement ps = cn.prepareStatement("UPDATE mydb.proveedor SET Run=?,Dv=?,NomProv=?, Direccion=?,numero=? WHERE idProveedor = "+ id);
            ps.setString(1, prov.getRun());
            ps.setString(2, prov.getDv());
            ps.setString(3, prov.getNombre());
            ps.setString(4, prov.getDireccion());
            ps.setString(5, prov.getNumeroContacto());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Modificado correctamente.");
        }catch (SQLException ex){
            
        }
        }
    public void eliminarProveedor(String id)throws SQLException {
        ConexionBD con = new ConexionBD();
        Connection cn = con.conexion();
        PreparedStatement ps =  cn.prepareStatement("DELETE FROM mydb.proveedor WHERE mydb.id = " + id);
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Eliminado correctamente.");
    }

    
    //METODOS PARA LA GESTION DE PRODUCTOS
    public void agregarProducto(Producto prod) throws SQLException{
        ConexionBD con = new ConexionBD();
        Connection cn = con.conexion();
        PreparedStatement ps = cn.prepareStatement("INSERT INTO mydb.producto (nbrePro,FeElab,feVenc,precio,codBarra,Categoria_idCateg,Stock_idStock) VALUES (?,?,?,?,?,(select idCateg FROM mydb.categoria WHERE nomCateg = ?),(select idStock from mydb.stock))");
        ps.setString(1, prod.getNomProd());
        ps.setString(2, prod.getFechaElab());
        ps.setString(3, prod.getFechaVenc());
        ps.setInt(4, prod.getPrecio());
        ps.setString(5, prod.getCodBarra());
        ps.setString(6, prod.getCategoria());
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Agregado correctamente.");
    }
    public void modificarProducto(Producto prod, String id)throws SQLException{
        ConexionBD con = new ConexionBD();
        Connection cn = con.conexion();
        PreparedStatement ps = cn.prepareStatement("UPDATE mydb.producto SET nbrePro=?,FeElab=?,feVenc=?,precio=?,codBarra=? WHERE idProd = "+ id);
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Modificado correctamnte");
    }
    public void eliminarProducto(String id)throws SQLException{
        ConexionBD con = new ConexionBD();
        Connection cn = con.conexion();
        PreparedStatement ps = cn.prepareStatement("DELETE FROM mydb.producto WHERE idProd = "+id);
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Eliminado correctamente.");
    
    }

}  

