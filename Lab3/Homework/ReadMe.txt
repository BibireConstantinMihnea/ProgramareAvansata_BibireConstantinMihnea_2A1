-Proprietati specifice pentru clase:
  -Company: adress
  -Designer: salary
  -Programmer: numberOfActiveProjects

- Clasa Person are HashMap-ul "relationships" ce defineste relatiile intre persoane si companii.

-Pentru a calcula importanta unui nod in retea exista metoda nodeImportance ce returneaza dimensiunea HashMap-ului (cate relatii are persoana sau compania respectiva).

-In clasa nodeComparator este implementata interfata Comparator pentru a compara nodurile in functie de nodeImportance.