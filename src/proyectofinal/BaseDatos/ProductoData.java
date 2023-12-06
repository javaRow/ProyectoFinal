
package proyectofinal.BaseDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyectofinal.Tablas.Producto;

/**
 *
 * @author Usuario
 */
public class ProductoData {

    private Connection con = null;

    public ProductoData() {
        con = Conexion.getConnection();
    }

        public void agregarProducto(Producto producto) {
            
            String sql = "SELECT * FROM producto WHERE nombre = ?";
            try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, producto.getNombre());
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            // El producto ya existe en la base de datos
            JOptionPane.showMessageDialog(null, "El producto ingresado ya existe");
            return;
        }

         sql = "INSERT INTO producto (nombre, stock, precio, estado) VALUES (?, ?, ?, ?)";
        
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, producto.getNombre());
            ps.setInt(2, producto.getStock());
            ps.setDouble(3, producto.getPrecio());
            ps.setBoolean(4, true);
            ps.executeUpdate();
            rs = ps.getGeneratedKeys();
            if (rs.next()) {
                producto.setIdCodigo(1);
                JOptionPane.showMessageDialog(null, "Se agrego un nuevo producto");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto");
        }
    }

    public void modificarProducto(Producto producto) {

        String sql = "UPDATE producto SET nombre= ? ,stock= ? ,precio= ? ,estado= ? WHERE id_Codigo=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, producto.getNombre());
            ps.setInt(2, producto.getStock());
            ps.setDouble(3, producto.getPrecio());
            ps.setBoolean(4, producto.getEstado());
            ps.setInt(5, producto.getIdCodigo());

            int exito = ps.executeUpdate();
            if (exito == 1) {

                JOptionPane.showMessageDialog(null, "Producto Modificado exitosamente ");
            }

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al tratar de acceder a la tabla producto");

        }
    }
    
    public void eliminarProducto(int id) {
        
        try {
            String sql = "UPDATE producto SET estado= 0 where id_Codigo = ?";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            int elimino = ps.executeUpdate();
            
            if (elimino == 1) {
                
                JOptionPane.showMessageDialog(null, "Producto Eliminado");
                
            }
            ps.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto");
            
        }
    }
    
    public Producto buscarProducto(int id) {
        
        String sql = "SELECT nombre, stock, precio FROM producto WHERE id_Codigo = ? AND estado= 1";
        Producto producto = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                producto = new Producto();
                producto.setIdCodigo(id);
                producto.setNombre(rs.getString("nombre"));
                producto.setStock(rs.getInt("stock"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setEstado(true);
            } else {
                JOptionPane.showMessageDialog(null, " No existe ese producto ");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al accder a la tabla " + ex.getMessage());

        }

        return producto;
    }
    
     public Producto buscarProductoPorNombre(String nombre) {
        
        String sql = "SELECT id_Codigo, nombre, stock, precio FROM producto WHERE nombre = ? AND estado= 1";
        
        Producto producto = null;
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {                
                producto = new Producto();                
                producto.setIdCodigo(rs.getInt("id_Codigo"));
                producto.setNombre(rs.getString("nombre"));
                producto.setStock(rs.getInt("stock"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setEstado(true);
            } else {
                JOptionPane.showMessageDialog(null, "El producto no existe ");                
                
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al accder a la tabla " + ex.getMessage());
            
        }
        
        return producto;
    }
     
     public List<Producto> ListarProductos(){
         
         String sql = "SELECT id_Codigo, nombre, stock, precio FROM producto WHERE estado= 1";
         
         ArrayList<Producto> productos=new ArrayList();
         try{
             PreparedStatement ps=con.prepareStatement(sql);
             
             ResultSet rs = ps.executeQuery();
             
             while(rs.next()){
                 Producto producto=new Producto();
                 producto.setIdCodigo(rs.getInt("id_Codigo"));
                 producto.setNombre(rs.getString("nombre"));
                 producto.setStock(rs.getInt("stock"));
                 producto.setPrecio(rs.getDouble("precio"));
                 producto.setEstado(true);
                 
                 productos.add(producto);
                 
             }
             ps.close();
             
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
        }
         return productos;
     }

public void actualizarProducto(Producto producto) {
    String sql = "UPDATE producto SET nombre=?, stock=?, precio=?, estado=? WHERE id_Codigo=?";
    
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, producto.getNombre());
        ps.setInt(2, producto.getStock());
        ps.setDouble(3, producto.getPrecio());
        ps.setBoolean(4, producto.getEstado());
        ps.setInt(5, producto.getIdCodigo());

        int exito = ps.executeUpdate();
        if (exito == 1) {
            JOptionPane.showMessageDialog(null, "Producto Modificado exitosamente");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el producto con el ID proporcionado");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al tratar de acceder a la tabla producto: " + ex.getMessage());
    }



}
























}









