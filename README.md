# ProjectDesign
## Información General 
* **Periodo Académico:** 2021-1
* **Curso:** Arquitectura de Software
* **Integrantes**: Lina Buitrago, Santiago Laiton, Andres Davila.
* **Profesor**: Diego Alfonso Prieto Torres
## Roles 👥
 * **Diego Alfonso Prieto Torres** - *Product Owner* 
 * **Santiago Laiton** - *Developer* - [santiagolaiton2700](https://github.com/santiagolaiton2700)
 * **Lina Buitrago** - *Scrum Master* - [lina-6020](https://github.com/lina-6020)
 * **Andres Davila** - *Developer* - [AndresDa1302](https://github.com/AndresDa1302)
 
## Descripción del proyecto 📑
Project Design es un aplicativo web para una empresa de diseño gráfico que se encarga de la elaboración y diseño de productos;por medio de este aplicativo se busca la venta y manejo de inventario de dichos productos

### Funcionalidades importantes 
Algunas de las funcionalidades mas importantes son:
* Venta de productos por medio de carrito de compras 
* Manejo de inventario 
* Personalización de productos 
* Ventas simultaneas 
* Calculo de ventas diarias , mensuales y anuales


### Manual de Usuario 

#### Comprador(Usuario)

1. Al ingresar al aplicativo el usuario vera en primer plano todos los productos disponibles, seleccionara el producto de mayor interés y luego pasara a la siguiente página de personalización
2. En la página de personalización el usuario podrá agregar gráficamente detalles como: color, tamaño, frases, entre otras de acuerdo a su gusto y podrá tener una vista preliminar del diseño
3. Después de ajustar todos los detalles el usuario confirmara los detalles y verificara el precio del producto.
4. Al estar seguro del producto que elegia y estar de acuerdo con el precio calculado, el usuario añadirá al carrito el producto y de no querer ningún otro producto finalizará la compra.
5. Para finalizar la compra el usuario tendrá que registrarse o iniciar sesión en caso de que ya tenga una cuenta creada. Ya allí podrá verificar de nuevo los detalles y añadir datos personales necesarios para el despacho como dirección, ciudad entre otros.
6. Finalmente se dirigirá a pagar el producto junto con el valor del envío, para ello elegirá su forma de pago crédito o débito y se dirigirá a realizar el pago con Pay U.
7. Al finalizar el pago exitosamente el aplicativo le indicara la fecha aproximada de llegada de su pedido y la confirmación exitosa de la compra.

#### Gerente 

1. El gerente como todos los usuarios normales podra ver la plataforma con todos los productos disponibles pero para acceder a funciones privilegiadas tendra que iniciar sesión la cual despues de iniciada le mostrara automaticamente todos sus beneficios.
2. Dentro del aplicativo el gerente podra ver todas las estadisticas de los productos mas vendidos , el indice de ventas y el inventario. Tendra el poder de administrarlas de ser necesario.
3. Para salir del aplicativo bastara con cerrar sesión en el mismo.77777777777777777777777777777777777777

#### Jefe de producción 
1. El jefe de producción como todos los usuarios normales podra ver la plataforma con todos los productos disponibles pero para acceder a funciones privilegiadas tendra que iniciar sesión la cual despues de iniciada le mostrara automaticamente todos sus beneficios.
2. Dentro del aplicativo el jefe de producción tendra todo el control para administrar el inventario , podra añadir nueva mercancia al inventario , dar de baja a productos en mal estado o no disponibles y consultar todos los que estan listos para ser vendidos.
3. Para salir del aplicativo bastara con cerrar sesión en el mismo.




## Arquitectura y Diseño detallado 🛠️📐
### Diagrama de Casos de Uso 

![image](https://user-images.githubusercontent.com/59893804/106533793-c0700f80-64c0-11eb-9664-e2b523f989a4.png)

### Modelo E-R

![image](https://user-images.githubusercontent.com/59893804/106535410-2b6f1580-64c4-11eb-93b0-ae76635235e9.png)

### Diagrama de Clases 

![image](https://user-images.githubusercontent.com/59893804/106536131-c4eaf700-64c5-11eb-8c2b-043f884b404f.png)

### Diagramas de secuencia de alto nivel de las funcionalidades más importantes.

* Comprar un Producto
![image](https://user-images.githubusercontent.com/59893804/108645136-cf266280-747f-11eb-8948-ca854dd4861c.png)

* Modificar inventario 
* ![image](https://user-images.githubusercontent.com/59893804/108645275-4eb43180-7480-11eb-9158-b6c5b2ca5e49.png)


### Diseño de la interfaz gráfica usando Wireframes.

* _Página Principal_

    ![image](https://user-images.githubusercontent.com/59893804/106541960-e6051500-64d0-11eb-8e81-40ad8fba5ac3.png)
    
* _Diseño_     

    ![image](https://user-images.githubusercontent.com/59893804/106542068-1e0c5800-64d1-11eb-9dd0-e0bd9a8219fc.png)
    
* _Personalización_ 

    ![image](https://user-images.githubusercontent.com/59893804/106542258-75122d00-64d1-11eb-9fe7-39b75913e2d3.png)
    
* _Diseño Final_

    ![image](https://user-images.githubusercontent.com/59893804/106543002-e30b2400-64d2-11eb-90e2-d90b73782184.png)

* _Orden De Compra_

    ![image](https://user-images.githubusercontent.com/59893804/106543443-bd324f00-64d3-11eb-8ff3-96c1a5eb354d.png)


    



### _Despliegue en HEROKU_ 📦




### _Integración continua en CircleCI_ ✅


### Integrantes
 * Santiago Laiton - [santiagolaiton2700](https://github.com/santiagolaiton2700)
 * Lina Buitrago - [lina-6020](https://github.com/lina-6020)
 * Andres Davila - [AndresDa1302](https://github.com/AndresDa1302)
  





### Reporte de análisis estático de código con _Codacy_ 💻


