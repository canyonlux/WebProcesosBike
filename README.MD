API REST de Bicicletas con Spring Boot
Descripción

Este proyecto es una API REST creada con Spring Boot. El servicio está diseñado para gestionar una lista de bicicletas, cada una con atributos únicos como nombre, precio, color y año de fabricación. Esta API es un ejemplo de cómo implementar y exponer datos a través de una interfaz REST, sin persistencia de datos.
Características

    Modelo de Datos: Product representa una bicicleta con sus atributos.
    Servicio: ProductService proporciona acceso a los datos de las bicicletas.
    Controlador: ProductController expone los endpoints para interactuar con la API.

Modelo de Datos

La clase Product representa una bicicleta y tiene los siguientes atributos:

    int id: Identificador único de la bicicleta.
    String name: Nombre de la bicicleta.
    double price: Precio de la bicicleta.
    String color: Color de la bicicleta.
    int year: Año de fabricación de la bicicleta.

Servicio

El servicio ProductService implementa la interfaz IProductService y se encarga de proveer un conjunto de bicicletas. Actualmente, el servicio genera un conjunto de 10 bicicletas con diferentes características.
Controlador

El controlador ProductController utiliza anotaciones de Spring Boot para manejar las solicitudes HTTP. El endpoint principal es:

    GET /product: Retorna un conjunto de 10 bicicletas con sus detalles.

Uso de la API

Para utilizar la API, inicia la aplicación Spring Boot y accede al siguiente URL:

http://localhost:8080/product

Esto devolverá un JSON con la lista de bicicletas disponibles.
Herramientas para Probar la API

Puedes probar esta API usando diferentes herramientas como:

    Navegador Web: Accediendo directamente al URL proporcionado.
    Cliente HTTP de IntelliJ: Herramienta integrada en IntelliJ para probar APIs.
    RESTED (Firefox Add-on): Extensión de navegador para realizar peticiones HTTP.

Tecnologías Utilizadas

    Spring Boot
    Java