# LDLC

Desarrollo del proyecto **Lista de la compra** en *Jakarta*, para la web.

Se tiene que refactorizar la base de datos, pues se han encontrado opciones que no estaban contempladas:

- Un mismo producto puede estar representado por dos códigos de barras diferentes.
  - P. ej.: El bote de mayonesa *Ligeresa* cambia la cantidad manteniendo el formato y con ellos lo representa un nuevo código de barras.
  - P. ej.: un producto de marca blanca ha cambiado de fabricante.
