package edu.escuelaing.arsw.projecDesign.Shop;

import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import edu.escuelaing.arsw.projecDesign.controllers.UsuarioController;
import edu.escuelaing.arsw.projecDesign.entities.CarritoDeCompra;
import edu.escuelaing.arsw.projecDesign.entities.Inventario;
import edu.escuelaing.arsw.projecDesign.entities.Producto;
import edu.escuelaing.arsw.projecDesign.entities.Usuario;
import edu.escuelaing.arsw.projecDesign.service.UsuarioService;
import edu.escuelaing.arsw.projecDesign.service.imp.CarritoImp;
import edu.escuelaing.arsw.projecDesign.service.imp.InventarioImp;
import edu.escuelaing.arsw.projecDesign.service.imp.ProductoImp;
import edu.escuelaing.arsw.projecDesign.service.imp.UsuarioImp;

public class ShopTest {
    @Test
    public void crearUsuario(){
        Usuario user = new Usuario();
        user.setCargo("cliente");
        user.setCorreo("jorgito@gmail.com");
        user.setNombre("Rosa meltroso");
        user.setContrasena("churrias123");
        user.setTelefono(464856);
        user.setDireccion("tunal");
        UsuarioImp creador= new UsuarioImp();
        creador.guardarUsuario(user);
        Assertions.assertFalse(creador.guardarUsuario(user));
    }
    @Test
    public void validarUsuarioRepetido()
    {
        Usuario user = new Usuario();
        user.setCargo("cliente");
        user.setEnabled(true);
        user.setCorreo("jorgito@gmail.com");
        user.setNombre("Rosa meltroso");
        user.setContrasena("churrias123");
        user.setTelefono(464856);
        user.setDireccion("tunal");
        UsuarioImp creador= new UsuarioImp();
        creador.guardarUsuario(user);
        Assertions.assertEquals(creador.buscarPorCorreo("jorgito@gmail.com"),creador.buscarPorCorreo(user.getCorreo()));
    }
    @Test
    public void crearInventario()
    {
        Inventario inventory = new Inventario(null, null, null, 0);
        inventory.setIdProducto("45sd12345ds");
        inventory.setnombreProducto("camisetasrosadas");
        Date date = new Date(System.currentTimeMillis());
        inventory.setFechaEntrada(date);
        inventory.setCantidad(20);
        InventarioImp inventario=new InventarioImp();
        inventario.guardarInventario(inventory);
        Assertions.assertFalse(inventario.guardarInventario(inventory));
    }
    @Test
    public void validarInventarioRepetido()
    {
        Inventario inventory = new Inventario(null, null, null, 0);
        inventory.setIdProducto("45sd12345ds");
        inventory.setnombreProducto("camisetasrosadas");
        Date date = new Date(System.currentTimeMillis());
        inventory.setFechaEntrada(date);
        inventory.setCantidad(20);
        InventarioImp inventario=new InventarioImp();
        inventario.guardarInventario(inventory);
        Assertions.assertEquals(inventario.buscarPorId("45sd12345ds"),inventario.buscarPorId(inventory.getId()));
    }
    @Test
    public void crearProducto()
    {
        Producto producto = new Producto(null, null, 0, null, null, null, null);
        producto.setEspecificacion("producto de excelente calidad");
        producto.setNombre("zapatos");
        producto.setPrecio(45000);
        producto.setTexto("Johann es gurrero");
        producto.setTipo("Camisetas");
        producto.setId("chulo sin h");
        ProductoImp inventario=new ProductoImp();
        inventario.guardarProducto(producto);
        Assertions.assertFalse(inventario.guardarProducto(producto));
    }
    @Test
    public void validarProductoRepetido()
    {
        Producto producto = new Producto(null, null, 0, null, null, null, null);
        producto.setEspecificacion("producto de excelente calidad");
        producto.setNombre("zapatos");
        producto.setPrecio(45000);
        producto.setTexto("Johann es gurrero");
        producto.setTipo("Camisetas");
        producto.setId("chulo sin h");
        ProductoImp inventario=new ProductoImp();
        inventario.guardarProducto(producto);
        Assertions.assertEquals(inventario.buscarPorId("chulo sin h"),inventario.buscarPorId(producto.getId()));
    }

    @Test
    public void crearCarrito()
    {
        CarritoDeCompra carrito = new CarritoDeCompra();
        carrito.setCorreo("jorgito@gmail.com");
        carrito.setNombre("Rosa meltroso");
        carrito.setSubTotal(4651256.5644);
        carrito.setId("jhk32131jlk");
        CarritoImp carro=new CarritoImp();
        carro.guardarCarrito(carrito);
        Assertions.assertFalse(carro.guardarCarrito(carrito));
    }

    @Test
    public void validarCarritoRepetido()
    {
        CarritoDeCompra carrito = new CarritoDeCompra();
        carrito.setCorreo("jorgito@gmail.com");
        carrito.setNombre("Rosa meltroso");
        carrito.setSubTotal(4651256.5644);
        carrito.setId("jhk32131jlk");
        CarritoImp carro=new CarritoImp();
        carro.guardarCarrito(carrito);
        Assertions.assertEquals(carro.buscarPorCorreo("jorgito@gmail.com"),carro.buscarPorCorreo(carrito.getCorreo()));
    }

    @Test
    public void buscarUsuario()
    {
        UsuarioImp userExist= new UsuarioImp();
        if(userExist.buscarPorCorreo("oadavilaf18@gmail.com")!=null)
        {
            System.out.println("usuario existe");
            Assertions.assertTrue(true);
        }else
        {
            System.out.println("usuario no existe");
            Assertions.assertFalse(false);
        }

        
    }

    @Test
    public void buscarInventario()
    {
        InventarioImp inventarioExist= new InventarioImp();
        if(inventarioExist.buscarPorId("3")!=null)
        {
            System.out.println("usuario existe");
            Assertions.assertTrue(true);
        }else
        {
            System.out.println("usuario no existe");
            Assertions.assertFalse(false);
        }

        
    }






}
