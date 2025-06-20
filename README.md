# Projet-JEE---Spring-Angular-JWT
<h2>Compte Rendu </h2>
<h3>Architecture du projet</h3>

Ce projet suit une architecture modulaire en couches typique d'une application Spring Boot, organisée selon les bonnes pratiques du développement backend en Java.

<img src="captures/c1.png">
<img src="captures/c2.png">
<h3>Description de l'Architecture </h3>
dtos/ : Contient les objets comme AccountDTO, CustomerDTO, etc. utilisés pour transférer les données entre les couches.par exemple :

<img src="captures/c3.png">

entities/ : Représente les tables de la base de données (BankAccount, Customer, etc.).
<img src="captures/c4.png">

mappers/ : Convertisseurs entre les entités et les DTOs. Exemple : BankAccountMapperImpl.

<img src="captures/c5.png">
<img src="captures/c6.png">

repositories/ : Interfaces Spring Data JPA pour interagir avec la base de données.

<img src="captures/c7.png">
services/ :

BankService (interface)
<img src="captures/c8.png">

BankAccountServiceImpl (implémentation)


<img src="captures/img.png">
<img src="captures/img_1.png">
<img src="captures/img_2.png">

web/ : Contrôleurs REST (BankAccountRestAPI, CustomerRestController) exposant les endpoints de l’API.

<img src="captures/c9.png">

resources/ : Contient les fichiers de configuration (application.properties) et potentiellement des ressources statiques ou templates.

<img src="captures/c10.png">