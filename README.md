# ProjectDesign

## Información General 
* **Periodo Académico:** 2021-1
* **Curso:** Arquitectura de Software
* **Integrantes**: Lina Buitrago, Santiago Laiton, Andres Davila.
* **Profesor**: Diego Alfonso Prieto Torres

### Roles 👥
 * **Diego Alfonso Prieto Torres** - *Product Owner* 
 * **Santiago Laiton** - *Developer* - [santiagolaiton2700](https://github.com/santiagolaiton2700)
 * **Lina Buitrago** - *Scrum Master* - [lina-6020](https://github.com/lina-6020)
 * **Andres Davila** - *Developer* - [AndresDa1302](https://github.com/AndresDa1302)
 
### Descripción del proyecto 📑
Project Design es un aplicativo web para una empresa de diseño gráfico que se encarga de la elaboración y diseño de productos;por medio de este aplicativo se busca la venta y manejo de inventario de dichos productos

### Funcionalidades importantes 
Algunas de las funcionalidades mas importantes son:
* Venta de productos por medio de carrito de compras 
* Manejo de inventario 
* Personalización de productos 
* Ventas Simultaneas 
* Calculo de ventas diarias , mensuales y anuales

#### Diagrama de Casos de Uso 

![image](https://user-images.githubusercontent.com/59893804/106533793-c0700f80-64c0-11eb-9664-e2b523f989a4.png)


## Arquitectura Backend 🔨
La arquitectura de BackEnd se encuentra claramente separada en capas de control:
* Controllers 
* Entities
* Repositories
* Service (Impl)

### _Modelo E-R_

![image](https://user-images.githubusercontent.com/59893804/106535410-2b6f1580-64c4-11eb-93b0-ae76635235e9.png)

### _Diagrama de Clases_ 

![image](https://user-images.githubusercontent.com/59893804/106536131-c4eaf700-64c5-11eb-8c2b-043f884b404f.png)

### _Diagramas de secuencia de alto nivel de las funcionalidades más importantes._

* Comprar un Producto
![image](https://user-images.githubusercontent.com/59893804/108645136-cf266280-747f-11eb-8948-ca854dd4861c.png)

* Modificar inventario 
* ![image](https://user-images.githubusercontent.com/59893804/108645275-4eb43180-7480-11eb-9158-b6c5b2ca5e49.png)


## Arquitectura FrontEnd

El FrontEnd se encuentra correctamente modularizado y con un diseño por capas:
* Public 
    * Boostrap
        * Css
        * Js
    * Img    
* Src
    * Components
    * Services   

### _Diagrama de Componentes

![image](https://user-images.githubusercontent.com/59893804/111412248-12a07500-86aa-11eb-9fcd-2ab164402340.png)



### _Diseño de la interfaz gráfica usando Wireframes._

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
    
## Continuidad de Desarrollo en GitHub

* _BackEnd_
[GitHub](https://github.com/ProjectDesign-ARSW2021-1/ProjectDesign-ARSW2021-1)

* _FrontEnd_ 
[GitHub](https://github.com/ProjectDesign-ARSW2021-1/ProjectDesign-FrontEnd)


## Despliegue en Heroku y Manual de Uso

### _Despliegue en HEROKU_ 📦

En el siguiente link se puede acceder a _ProjectDesign_

[![ProjectDesign](https://www.herokucdn.com/deploy/button.png)](https://projectdesign-frontend.herokuapp.com/)


### _Manual de Usuario_ 📐🚶

#### Comprador(Usuario)

1. Al ingresar al aplicativo el usuario vera en primer plano todos los productos disponibles, seleccionara el producto de mayor interés y luego pasara a la siguiente página.
2. Despues de elegir una categoria de interes el usuario podra ver todos los productos disnponibles de esa categoria.
3. Despues de elegir el producto de su preferencia lo puede agregar al carrito inmediatamente o ver sus especificaciones y posteriormente agregarlo al carrito.
4. Cuando ya no desee elegir otro producto se dirigira al carrito de compra , observara el checkout y si todo esta bien efectuara la compra.

_Vista de Usuario_

![image](https://user-images.githubusercontent.com/59893804/114643228-dfe2a000-9c9a-11eb-8b62-d4928f47b385.png)

#### Administrador 
1. El jefe de producción como todos los usuarios normales podra ver la plataforma con todos los productos disponibles pero para acceder a funciones privilegiadas tendra que iniciar sesión la cual despues de iniciada le mostrara automaticamente todos sus beneficios.
2. Dentro del aplicativo el jefe de producción tendra todo el control para administrar el inventario , modificando cantidades y agregando nuevos productos.
3. Para salir del aplicativo bastara con cerrar sesión en el mismo.

_Vista del Administrador_

![image](https://user-images.githubusercontent.com/59893804/114643412-37810b80-9c9b-11eb-980c-87be73328ddc.png)

#### Gerente 

1. El gerente como todos los usuarios normales podra ver la plataforma con todos los productos disponibles pero para acceder a funciones privilegiadas tendra que iniciar sesión la cual despues de iniciada le mostrara automaticamente todos sus beneficios.
2. Dentro del aplicativo el gerente podra ver todas las estadisticas de los productos mas vendidos , el indice de ventas y el inventario. Tendra el poder de administrarlas de ser necesario.
3. Para salir del aplicativo bastara con cerrar sesión en el mismo.



## Análisis estático de código 

### _Integración continua en CircleCI

## Completitud Funcional ✅ 

En el siguiente enlace se encuentra la administración de este proyecto 
_SpringBacklog_
[SCRUM](https://drive.google.com/drive/u/0/folders/1cpu2b-mAhWEGSzUdam0Ii86mrpDNoCKp)





### Integrantes
 * Santiago Laiton - [santiagolaiton2700](https://github.com/santiagolaiton2700)
 * Lina Buitrago - [lina-6020](https://github.com/lina-6020)
 * Andres Davila - [AndresDa1302](https://github.com/AndresDa1302)
  




