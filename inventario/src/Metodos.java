

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
        ps = cn.prepareStatement("INSERT INTO mydb.usuario (run, digitoverificador ,nomUsu, nombre,apePaterno, apeMaterno,email, clave) VALUES (?,?,?,?,?,?,?,?)");
                //+ (usuario.getRun()+ ","+  usuario.getDv()+"," + usuario.getNomUsu()+"," + usuario.getNombre()+","+ usuario.getApePaterno()+","+usuario.getApeMaterno()+","+ usuario.getEmail()+","+usuario.getContrasenia()));
        ps.setString(1, usuario.getRun());
        ps.setString(2, usuario.getDv());
        ps.setString(3, usuario.getNomUsu());
        ps.setString(4, usuario.getNombre());
        ps.setString(5, usuario.getApePaterno());
        ps.setString(6, usuario.getApeMaterno());
        ps.setString(7, usuario.getEmail());
        ps.setString(8, usuario.getContrasenia());
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Agregado correctamente");
        }catch (SQLException ex) {
            
                }
       
    }
    public void modificarUsuario(Usuario usuario, String id) throws SQLException{
        ConexionBD con = new ConexionBD();
        Connection cn = con.conexion();
        PreparedStatement ps = cn.prepareStatement("UPDATE mydb.usuario SET run = ?,digitoverificador = ?, nombre =?, apePaterno=?, apeMaterno=?, email=?, nomUsu=?,clave=? WHERE mydb.usuario.idUsu = "+ id);
        ps.setString(1, usuario.getRun());
        ps.setString(2, usuario.getDv());
        ps.setString(3, usuario.getNombre());
        ps.setString(4, usuario.getApePaterno());
        ps.setString(5, usuario.getApeMaterno());
        ps.setString(6, usuario.getEmail());
        ps.setString(7, usuario.getNomUsu());
        ps.setString(8, usuario.getContrasenia());
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
}