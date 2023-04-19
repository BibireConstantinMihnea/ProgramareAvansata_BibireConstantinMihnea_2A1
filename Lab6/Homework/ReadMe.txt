- Am ales sa implementez varianta 1 a jocului, cea in care pentru a castiga un jucator trebuie sa formeze un triunghi.

- Pentru modelul orientat obiect al jocului am creat o clasa Line ce contine proprietatile unei linii(coordonatele nodurilor de start si sfarsit respectiv culoarea acesteia)

- Am folosit un mouse listener pentru a inregistra coordonatele clickului si a selecta cea mai apropiata linie, acest lucru este reusit prin calcularea distantei de la
punctul clickului la cea mai apropiata linie.

- Liniile sunt stocate intr-un List care este parcurs pentru a gasi cea mai apropiata linie de clickul jucatorului, daca aceasta este gri va fi colorata in culoarea jucatorului
respectiv (jucator 0 - red , jucator 1 - blue).

- Pentru verificarea conditiei de castig creez o noua lista la care sunt adaugate pe parcurs, pentru fiecare jucator liniile colorate de acesta si apoi verific daca ele
formeaza un triunghi.

- Am implementat si butonul de export ce salveaza starea curenta de joc ca un fisier .png.