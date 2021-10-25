# AvatarGenerator
Primeramente este proyecto no ha podido ser subido de forma convencional como código de Java Web.
El src es todo el cógido en java, se puede poner en la carpeta de cógido y lo único que necesita es la librería de Gson para la manipulación y parseo de archivos Json, que se encuentra en la raíz del cógido y sólo se tiene que añadir a los archivos JAR para que el proyecto funcione.
El web.xml tiene una dependencia que hace que los url del AJAX sea más corta, es necesaria para que la parte web pueda funcionar, principalmente el javascript.
la carpeta web es todo la información del front-end.
No olvidar que el archivo de configuración el glassfish en la etiqueta <context-root> se tiene que tener el nombre literal del proyecto, de lo contrario no va a funcionar.
