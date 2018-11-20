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
            <li >
			            <s:url id="UrlAcc" action="naviguerAcc">
                           <s:param name="utilisateur.identifiant" value="#session.prenomUtilisateur"/>                          
                        </s:url>
			            <s:a  href="%{UrlAcc}">Accueil</s:a>
			          </li>
             <li >
			            <s:url id="UrlArt" action="naviguerArt">
                           <s:param name="utilisateur.identifiant" value="#session.prenomUtilisateur"/>                          
                        </s:url>
			            <s:a  href="%{UrlArt}">Article</s:a></li>            
             <li >
			            <s:url id="UrlCom" action="naviguerCom">
                           <s:param name="utilisateur.identifiant" value="#session.prenomUtilisateur"/>                          
                        </s:url>
			            <s:a  href="%{UrlCom}">Comparer_drives</s:a></li>
          </ul>
        </nav>
      </header>
      <div id="banniere_image">
        <div id="banniere_description"> Comparateur des drives casino et courseU
          sur paris... <a href="article1.jsp" class="bouton_rouge">Voir l'article <img src="images/flecheblanchedroite.png"
              alt=""></a> </div>
      </div>
      <section>
        <article>
          <h1><img src="images/ico_epingle.png" alt="Catégorie voyage" class="ico_categorie">Comprateur
            des drives </h1>
          <p>Ce site est realisé avec eclipse j2ee, struts2 et tomcat7 qui
            permet de scraper les pages web de casino drive&nbsp; et de courseU
            de paris fournir aux utilisateurs un comparatif des prix des produits
            commercialisés par ces drives... </p>
          <p>Pour pouvoir comparer les drives il faut entrer un identifiant...</p>
          <br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
          
        </article>
        <aside>
          <h2>   Bienvenue <s:property value="#session.prenomUtilisateur" /> </h2> <br/>  
                    <s:form action="deconnexion" method="post" theme="simple" cssClass="formulaireLogin">
                    <p id="login">Login  :  <s:textfield name="utilisateur.identifiant" value="%{#session.prenomUtilisateur}" readonly="true"  size="20" /></p>
                  
                    
                    <p><s:submit value="deconnexion" /></p>
                    </s:form>
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