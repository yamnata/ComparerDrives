<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <link rel="stylesheet" type="text/css" href="comparer.css" media="all"/>
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
            <li >
			            <s:url id="UrlAcc" action="naviguerAcc">
                           <s:param name="utilisateur.identifiant" value="#session.loginUtilisateur"/>                          
                        </s:url>
			            <s:a  href="%{UrlAcc}">Accueil</s:a>
			          </li>
             <li >
			            <s:url id="UrlArt" action="naviguerArt">
                           <s:param name="utilisateur.identifiant" value="#session.loginUtilisateur"/>                          
                        </s:url>
			            <s:a  href="%{UrlArt}">Article</s:a></li>            
             <li >
			            <s:url id="UrlCom" action="naviguerCom">
                           <s:param name="utilisateur.identifiant" value="#session.loginUtilisateur"/>                          
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
                    <h1><img src="images/logo.jpeg" alt="" class="ico_categorie" />Choisir deux drives :</h1>
                    <div >
                        <s:form action="ajouterDrive" method="post" theme="simple">
                            <s:hidden name="utilisateur.identifiant"> </s:hidden>
                            <br/>Selectionner Casino Drive:<br/>
                            <s:select  id="mainselection" size="6" name="driveC.nom" value="1"
                                    list="#{'1':'Géant Casino PARIS Massena (13 PLACE DE VENETIE 75113 PARIS)',
                                            '2':'Supermarché Casino PARIS Flandre (77 AVENUE DE FLANDRE 75119 PARIS)',
                                            '3':'Supermarché Casino PARIS Grand Pavois (352 RUE LECOURBE 75015 PARIS 15)',
                                            '4':'Supermarché Casino PARIS Menilmontant (28-30-34 RUE DE MENILMONTANT 75020 PARIS 20)',
                                            '5':'Supermarché Casino PARIS Montparnasse (30-32 BOULEVARD DE VAUGIRARD 75015 PARIS 15)',
                                            '6':'Supermarché Casino PARIS Saint-Didier (16 RUE DES BELLES FEUILLES 75116 PARIS)'}" />
		                    <br/><br/>Selectionner CourseU Drive:<br/>
		                  
		                         <s:select  id="mainselection" size="2" name="driveU.nom" value="1"
		                             list="#{
		                                     '1':'Super U Paris (103 AVENUE DE CLICHY 75017 PARIS)'}"/>
                            <br/><br/><s:submit value="confirmer"/>
                        </s:form> 
                    </div>
                </article>
                <aside>
                     <h2>   Bienvenue <s:property value="#session.loginUtilisateur" /> </h2> <br/>
                    <s:form action="deconnexion" method="post" theme="simple" cssClass="formulaireLogin">
                    <p id="login">Login  :  <s:textfield name="utilisateur.identifiant" value="%{#session.loginUtilisateur}" readonly="true" size="20" /></p>
                  
                    
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