<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <style type="text/css">@import url('styles.css');</style>
    <title>Comparer Drives</title>
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
          <h1><img src="images/ico_epingle.png" alt="Catégorie voyage" class="ico_categorie">Comprateur
            des drives </h1>
          <p>Ce site est realisé avec eclipse j2ee, struts2 et tomcat7 qui
            permet de scraper les pages web de casino drive&nbsp; et de courseU
            de paris pour fournir aux utilisateurs un comparatif des prix des produits
            commercialisés par ces drives... </p>
          <p>Pour pouvoir comparer les drives il faut entrer un identifiant...</p>
          <br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
          
        </article>
        <aside>
          <h3>Identifier Vous</h3>
          <img src="images/bulle.png" alt="" id="fleche_bulle">
          <p > <s:form action="enregistrer" method="post" theme="simple" cssClass="formulaireLogin" >
                    
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
          <script>
               (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
               (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
               m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
               })(window,document,'script','//www.google-analytics.com/analytics.js','ga');

               ga('create', 'UA-67048385-1', 'auto');
               ga('send', 'pageview');

          </script>
        </div>
      </footer>
    </div>
  </body>
</html>

