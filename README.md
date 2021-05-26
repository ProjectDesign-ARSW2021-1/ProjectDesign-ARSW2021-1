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

### _Despliegue en HEROKU_ 📦

En el siguiente link se puede acceder a _ProjectDesign_

[![ProjectDesign](https://www.herokucdn.com/deploy/button.png)](https://projectdesignfrontend.herokuapp.com)

### Funcionalidades importantes 
Algunas de las funcionalidades mas importantes son:
* Venta de productos por medio de carrito de compras 
* Manejo de inventario 
* Ventas Simultaneas 

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




    
## Continuidad de Desarrollo en GitHub

* _BackEnd_
[GitHub](https://github.com/ProjectDesign-ARSW2021-1/ProjectDesign-ARSW2021-1)

* _FrontEnd_ 
[GitHub](https://github.com/ProjectDesign-ARSW2021-1/ProjectDesign-FrontEnd)







### _Manual de Usuario_ 📐🚶

#### Comprador(Usuario)

1. Al ingresar al aplicativo el usuario vera en primer plano todos los productos disponibles, seleccionara el producto de mayor interés y luego pasara a la siguiente página.
2. Despues de elegir una categoria de interes el usuario podra ver todos los productos disnponibles de esa categoria.
3. Despues de elegir el producto de su preferencia lo puede agregar al carrito inmediatamente o ver sus especificaciones y posteriormente agregarlo al carrito.
4. Cuando ya no desee elegir otro producto se dirigira al carrito de compra , observara el checkout y si todo esta bien efectuara la compra.

_Vista de Usuario_

![image](https://user-images.githubusercontent.com/59893804/114643228-dfe2a000-9c9a-11eb-8b62-d4928f47b385.png)

#### Administrador o Gerente 
1. Como todos los usuarios normales podra ver la plataforma con todos los productos disponibles pero para acceder a funciones privilegiadas tendra que iniciar sesión la cual despues de iniciada le mostrara automaticamente todos sus beneficios.
2. Dentro del aplicativo tendra todo el control para administrar el inventario , modificando cantidades y agregando nuevos productos.
3. Para salir del aplicativo bastara con cerrar sesión en el mismo.

_Vista del Administrador_

![image](https://user-images.githubusercontent.com/59893804/114643412-37810b80-9c9b-11eb-980c-87be73328ddc.png)

#### Trabajador

1. Como todos los usuarios normales podra ver la plataforma con todos los productos disponibles pero para acceder a funciones privilegiadas tendra que iniciar sesión la cual despues de iniciada le mostrara automaticamente todos sus beneficios.
2. Dentro del aplicativo no tendra todo el control para administrar el inventario , modificar cantidades y agregar nuevos productos.Solo podra consultar el inventario.
3. Para salir del aplicativo bastara con cerrar sesión en el mismo.

_Vista del Trabajador_
![image](https://user-images.githubusercontent.com/59893804/118756645-fe573080-b830-11eb-8ad7-c5165b5dba65.png)


## Análisis estático de código 

### _Codacy_

* FrontEnd:  [![Codacy Badge](https://app.codacy.com/project/badge/Grade/7118978001f6438e97faf7cc5320fbbd)](https://www.codacy.com/gh/ProjectDesign-ARSW2021-1/ProjectDesign-ARSW2021-1/dashboard?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=ProjectDesign-ARSW2021-1/ProjectDesign-ARSW2021-1&amp;utm_campaign=Badge_Grade)

### _CircleCi_

* FrontEnd: [![ProjectDesign-ARSW2021-1](https://circleci.com/gh/ProjectDesign-ARSW2021-1/ProjectDesign-ARSW2021.svg?style=svg)](https://app.circleci.com/pipelines/github/ProjectDesign-ARSW2021-1/ProjectDesign-ARSW2021)

## Completitud Funcional ✅ 

En el siguiente enlace se encuentra la administración de este proyecto 
_SpringBacklog_
[SCRUM](https://drive.google.com/drive/u/0/folders/1cpu2b-mAhWEGSzUdam0Ii86mrpDNoCKp)

## Atributos no funcionales 
La arquitectura propuesta para este proyecto es capaz de asegurar los siguientes atributos de calidad

* ### Usabilidad
   ##### Escenario 1: Pagar productos elegidos
   Fuente: Usuario final.
   Objetivo: Mostrar que el usuario puede elegir productos en el marketplace y pagarlos por medio de la pasarela de pagos.
   Infraestructura: Frontend, Backend.
   Ambiente: Aplicación bajo condiciones normales.
   Resultado esperado: El usuario puede completar su compra. 
   Medición: Al correo autorizado debe llegar un mensaje de confirmación indicando el monto de la compra realizada.
    
    ##### Escenario 2: Crear un nuevo producto.
    Fuente: Administrador.
   Objetivo: El administrador debe poder crear un nuevo producto y añadirlo al inventario.
   Infraestructura: Frontend, Backend, Base de datos.
   Ambiente: Aplicación bajo condiciones normales.
   Resultado esperado: El producto creado debe estar disponible en el marketplace. 
   Medición: El producto debe estar registrado en el inventario.
   https://www.youtube.com/watch?v=xc1w11LL5uo

* ### Disponibilidad
   ##### Escenario 1: Hacer uso de la aplicación en trafico alto
   Fuente: Usuario final.
   Objetivo: Hacer uso correcto de la aplicación.
   Infraestructura: Frontend, Backend, Base de datos.
   Ambiente: Aplicación bajo condiciones de trafico alto.
   Resultado esperado: La aplicación funciona con normalidad. 
   Medición: La aplicación debe mostrar productos y permitir comprarlos sin demoras.
   https://www.youtube.com/watch?v=zCUQVWBi_8M    
    ##### Escenario 2: Visilibilidad absoluta 
    Fuente: Usuario final.
   Objetivo: Demostrar que se puede acceder al aplicativo desde cualquier dispositivo brindando una experiencia comoda.
   Infraestructura: Frontend, Backend, Base de datos.
   Ambiente: Aplicación bajo condiciones normales.
   Resultado esperado: Se puede acceder al aplicativo desde un dispositivo movil y desde este se pueden hacer compras con la misma experiencia desktop . 
   Medición: El usuario es capaz de usar el aplicativa con el flujo esperado.
    https://www.youtube.com/watch?v=Axf6lnGqfLQ

* ### Rendimiento
    ##### Escenario 1: Cache
   Fuente: Usuario final.
   Objetivo: Evitar sobrepeticiones a la base de datos de la misma información.
   Infraestructura: Frontend, Backend, Base de datos.
   Ambiente: Aplicación bajo condiciones normales.
   Resultado esperado: Cada vez que el usuario explore los productos estas peticiones no sobrecarguen la base de datos.
   Medición: Esperamos se abra y se cierre el cache en 5 minutos.
   https://www.youtube.com/watch?v=sxBgZqa_2yA
    
    ##### Escenario 2: Conexión cuando se ve una publicación.
    Fuente: Usuario final.
    Objetivo: Conocer cuantas personas estan viendo una publicacion al mismo tiempo.
    Infraestructura: Frontend, Backend, Base de datos.
    Ambiente: Aplicación bajo condiciones normales.
    Resultado esperado: Observar las personas conectadas al aplicativo.
    Medición: Mapa de calor con las interacciones en la página.
    https://www.youtube.com/watch?v=sFQfnYwZCts

* ### Seguridad
   ##### Escenario 1: Contraseñas Cifradas.
   Fuente: Usuario final.
   Objetivo: Crear un nuevo usuario.
   Infraestructura: Frontend, Backend, Base de datos.
   Ambiente: Aplicación bajo condiciones normales.
   Resultado esperado: En el momento de crear la contraseña esta debe estar oculta y debe quedar cifrada en la base de datos. 
   Medición: La contraseña creada debe estar cifrada.
   https://www.youtube.com/watch?v=EfwA69afzcU






### Integrantes
 * Santiago Laiton - [santiagolaiton2700](https://github.com/santiagolaiton2700)
 * Lina Buitrago - [lina-6020](https://github.com/lina-6020)
 * Andres Davila - [AndresDa1302](https://github.com/AndresDa1302)




