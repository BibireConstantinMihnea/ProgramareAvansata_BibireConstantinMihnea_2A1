-Am folosit o interfata pentru comanda generica.

-Pentru comanda report am folosit FreeMarker. In folderul resources/templates exista template-ul report.ftl folosit in reprezentarea html. In map-ul data sunt
 stocate asocierile intre datele ce vor fi afisate si variabilele din template. Pentru debugging am folosit printStackTrace. Fisierul html este deschis folosind clasa Desktop.

-Am creat 2 custom exception: UnsupportedCommandException pentru validarea comenzilor si EmptyCatalogException pentru verificarea validitatii datelor din catalog la listare.

