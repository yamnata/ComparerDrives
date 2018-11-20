<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <style type="text/css">
          @import url(article.css) all;
        </style>
        <title>Comparer drive</title>
    </head>

    <body>
    <div id="bloc_page">
      <header>
        <div id="titre_principal"> <img style="width: 46px; height: 40px;" src="images/zozor_logo.png"
            alt="Logo de Zozor" id="logo">
          <h1>Drives</h1>
        </div>
        <nav>
          <ul>
            <li><s:a href="index.jsp">Accueil</s:a></li>
            <li><s:a href="article.jsp">Article</s:a></li>
            
          </ul>
        </nav>
      </header>
      <div id="banniere_image">
        <div id="banniere_description"> Comparateur des drives casino et courseU
          sur paris... <a href="article.jsp" class="bouton_rouge">Voir l'article <img src="images/flecheblanchedroite.png"
              alt=""></a> </div>
      </div>
            <section>
                <article>
                  <h1>1-Introduction</h1>
                     <p> Ce site est un ensemble de pages web en jsp, réalisé sous eclipse j2ee basé sur la technologie java j2ee et le framework struts2 .Il est déployé sur un serveur tomcat7. Le back-end de ce site est un moteur de recherche qui permet de scraper les pages web de deux sites(casino drive et courseU de Paris) pour fournir aux utilisateurs un comparatif des prix des produits commercialisés par deux drives (par exemple: fruits et légumes sélectionnés).</p>
                   <h1>2-Definitions</h1> 
                    <h2>Scraper le web (Web scraping)</h2>    
                      <p>Le web scraping est une technique d'extraction des données de sites Web, via un script ou un programme, dans le but de le transformer pour permettre son utilisation dans un autre contexte.</p>
                    <h2>Jsp</h2> 
                      <p>Le JavaServer Pages ou JSP est une technique basée sur Java qui permet aux développeurs de créer dynamiquement du code HTML, XML ou tout autre type de page web. Cette technique permet au code Java et à certaines actions prédéfinies d'être ajoutés dans un contenu statique. Depuis la version 2.0 des spécifications, la syntaxe JSP est complètement conforme au standard XML.

                          La syntaxe du JSP ajoute des balises XML, appelées actions JSP, qui peuvent être utilisées pour appeler des fonctions. 

                         Les JSP sont compilées par un compilateur JSP pour devenir des servlets Java. Un compilateur JSP peut créer une servlet Java en code source Java qui peut à son tour être compilé par le compilateur Java.</p>
                    <h2>Struts2</h2>
                      <p> Apache Struts 2 est un framework Java, pour le développement d'applications Web. 

                          Struts 2 regroupe les avantages de deux précédents outils, WebWork et Struts 1, mais c'est une refonte complète.</p>
                    <h2>Tomcat</h2> 
                      <p> Apache Tomcat est un conteneur web libre de servlets et JSP Java EE. Issu du projet Jakarta. Il implémente les spécifications des servlets et des JSP du Java Community Process1, est paramétrable par des fichiers XML et de propriétés, et inclut des outils pour la configuration et la gestion. Il comporte également un serveur HTTP. </p>
                    <h1>3-Conclusion</h1>
                     <p> Ce projet étant un preuve de concept, je me suis limité dans une première version aux rayons fruits et légumes ainsi que seulement deux drives. Ceci dit le principe peut être étendu facilement pour couvrir l'ensemble des rayons et comparer les prix de plusieurs drives. 
                    
                    
                </article>
                <aside>
                    <h3>Identifier Vous</h3>
                    <img src="images/bulle.png" alt="" id="fleche_bulle">
                    <p > <s:form action="enregistrer" method="post" theme="simple" cssClass="formulaireLogin" validate="true">
                    
                    Login: <br/> <s:textfield name="utilisateur.identifiant" size="20"/><br>
                                 <span style="color:#FF0000;"><s:fielderror fieldName="utilisateur.identifiant"/></span>
                    mot de passe: <s:password name="utilisateur.mdp" size="20" /> <br/>
                                 <span style="color:#FF0000;"><s:fielderror fieldName="utilisateur.mdp"/></span>                  
                    <s:submit value="créer compte"/>
                    <s:submit value="connecter" action="connexion"/>  <br/>                     
                    
                    <strong style="color:#FF0000;"><s:property value="#session.connexion" /></strong>
                    </s:form></p>
          
                </aside>
            </section>
            
      <footer>
        <div id="mes_photos">
          <h1>Les photos</h1>
          <p><img style="width: 67px; height: 63px;" src="images/Casino.jpeg" alt="Photographie"><img
              style="width: 67px; height: 63px;" src="images/casino1.jpeg" alt="Photographie"><img
              style="width: 81px; height: 61px;" src="images/casino.jpeg" alt="Photographie"><img
              style="width: 79px; height: 62px;" src="images/courseU.jpeg" alt="Photographie"><img
              style="width: 67px; height: 63px;" src="images/courseu1.jpeg" alt="Photographie"></p>
        </div>
        <div id="les_drives">
          <h1>Les drives</h1>
          <ul>
            <li><a href="http://www.casinodrive.fr/">Casino Drive</a></li>
            <li><a href="http://www.coursesu.com/">CourseU</a></li>
          </ul>
        </div>
      </footer>
        </div>
    </body>
</html>