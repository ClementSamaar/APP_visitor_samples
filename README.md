# APP_visitor_samples

Visitor permet d'ajouter une fonctionalité à un objet sans le modifier
Il est conçu pour agir sur plusieurs objets
Il permet d'alléger la définition des classes dans un système comprenant des objets ayant des méthodes communes
Pour cela, on créé un objet Visitor qui contiendra les implémentations nécessaires pour une méthode, c'est à dire une
implémentation pour chaque objet nécéssitant cette méthode.
Le paramètre de cette méthode doit être l'instance de l'objet sur lequel elle agit
Ensuite il faut permettre aux objets d'accéder aux implémentations des méthodes qui leur correspondent
Il faut alors déclarer une méthode acceptVisitor.
Cette méthode prend en paramètre une instance de l'objet Visitor requis
Elle appelle donc la méthode correspondante à l'objet appelant dans le visiteur passé en paramètre

Ainsi, on peut définir plusieurs implémentations d'une méthode commune à plusieurs objets sans alourdir la définition
de ces derniers

Le visitor peut aussi être utile lorsque qu'un ensemble d'objet est défini avec une structure fixe et qu'on doit lui
ajouter des méthodes sans modifier sa structure

Exemple generique
Interface Visitor : Permet de faire un template pour les Visitor concret. Contient donc la signature des méthodes que
l'on trouvera dans chaque Visitor
Classes Visitor concrètes : Permettent de définir les implémentations pour une méthode (visitObjectA et visitObjectB)
Classe abstraite Object : Elle définit la signature de la méthode acceptVisitor
Classes concrètes Object : Définit la méthode acceptVisitor (appelle la méthode visitObject correspondante en passant
son propre contexte en paramètre)