# LAB1TMPS

Principiul SRP (Principiul responsabilității unice): Fiecare clasă (Shape, Rectangle, Circle, AreaCalculator) 
își are o singură responsabilitate și este responsabilă pentru îndeplinirea acesteia.

Principiul OCP (Principiul deschis-închis): Nu se modifică codul existent în timp ce adăugăm noi funcționalități. 
În exemplul dat, noi clase (Rectangle și Circle) au fost adăugate fără modificarea codului existent în interfața Shape sau în clasa AreaCalculator.

Principiul LSP (Principiul substituției lui Liskov): Obiectele claselor derivate (Rectangle și Circle) pot fi folosite în locul obiectelor
 interfeței Shape, iar programul va funcționa corect și fără probleme.

Principiul ISP (Principiul segregării interfeței): Interfața Shape este simplă și include doar metoda area(), care este 
relevantă pentru toate formele. Astfel, nu se adaugă metode inutile sau nerelevante în interfața Shape.

Principiul DIP (Principiul inversării dependențelor): Clasa AreaCalculator depinde numai de interfața Shape și nu de 
clasele concrete Rectangle sau Circle. Acest lucru face clasa AreaCalculator mai flexibilă și capabilă să lucreze cu alte clase care implementează 
interfața Shape fără a fi nevoie să schimbe codul din clasa AreaCalculator.
