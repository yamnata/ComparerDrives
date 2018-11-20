<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <link rel="stylesheet" type="text/css" href="produit.css" media="all"/>
        <title>Comparer drive</title>
    </head>

    <body>
    <div id="bloc_page">
      <header>
        <div id="titre_principal"> <img style="width: 46px; height: 40px;" src="images/zozor_logo.png"
            alt="Logo de Zozor" id="logo">
          <h1>Drives</h1>
        </div>
        <nav >
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
        <div id="banniere_description"> 
           
             <ul id="menu-demo2" > 
                 
	           
	             <li ><s:a href="#">Fruits</s:a>
		           <ul>
			          <li >
			            <s:url id="UrlBan" action="afficherProduit">
                           <s:param name="utilisateur.identifiant" value="#session.loginUtilisateur"/>
                           <s:param name="driveC.code" value="#session.codeCasino"/>
                           <s:param name="driveU.code" value="#session.codeCourseU"/>
                           <s:param name="produit.nom">Banane</s:param>
                           <s:param name="driveU.nom">fruits/fruits-exotiques/_pid2/1/6/10</s:param>
                        </s:url>
			            <s:a  href="%{UrlBan}">Banane</s:a></li>
			          <li >
			             <s:url id="UrlOran" action="afficherProduit">
                           <s:param name="utilisateur.identifiant" value="#session.loginUtilisateur"/>
                           <s:param name="driveC.code" value="#session.codeCasino"/>
                           <s:param name="driveU.code" value="#session.codeCourseU"/>
                           <s:param name="produit.nom">Orange</s:param>
                           <s:param name="driveU.nom">fruits/oranges-clementines/_pid2/1/6/7</s:param>
                        </s:url>
			            <s:a href="%{UrlOran}">Orange</s:a></li>			          
			          <li >
			             <s:url id="UrlPom" action="afficherProduit">
                           <s:param name="utilisateur.identifiant" value="#session.loginUtilisateur"/>
                           <s:param name="driveC.code" value="#session.codeCasino"/>
                           <s:param name="driveU.code" value="#session.codeCourseU"/>
                           <s:param name="produit.nom">Pomme</s:param>
                           <s:param name="driveU.nom">fruits/pommes/_pid2/1/6/6</s:param>
                        </s:url>
			            <s:a href="%{UrlPom}">Pomme</s:a></li>
			          <li >
			             <s:url id="UrlPoir" action="afficherProduit">
                           <s:param name="utilisateur.identifiant" value="#session.loginUtilisateur"/>
                           <s:param name="driveC.code" value="#session.codeCasino"/>
                           <s:param name="driveU.code" value="#session.codeCourseU"/>
                           <s:param name="produit.nom">Poire</s:param>
                           <s:param name="driveU.nom">fruits/poires/_pid2/1/6/8</s:param>
                        </s:url>
			            <s:a href="%{UrlPoir}">Poire</s:a></li>
			          <li >
			             <s:url id="UrlMang" action="afficherProduit">
                           <s:param name="utilisateur.identifiant" value="#session.loginUtilisateur"/>
                           <s:param name="driveC.code" value="#session.codeCasino"/>
                           <s:param name="driveU.code" value="#session.codeCourseU"/>
                           <s:param name="produit.nom">Mangue</s:param>
                           <s:param name="driveU.nom">fruits/fruits-exotiques/_pid2/1/6/10</s:param>
                        </s:url>
			            <s:a href="%{UrlMang}">Mangue</s:a></li> 
			          <li >
			             <s:url id="UrlKiw" action="afficherProduit">
                           <s:param name="utilisateur.identifiant" value="#session.loginUtilisateur"/>
                           <s:param name="driveC.code" value="#session.codeCasino"/>
                           <s:param name="driveU.code" value="#session.codeCourseU"/>
                           <s:param name="produit.nom">Kiwi</s:param>
                           <s:param name="driveU.nom">fruits/fruits-exotiques/_pid2/1/6/10</s:param>
                        </s:url>
			            <s:a href="%{UrlKiw}">Kiwi</s:a></li> 
			          <li >
			             <s:url id="UrlAna" action="afficherProduit">
                           <s:param name="utilisateur.identifiant" value="#session.loginUtilisateur"/>
                           <s:param name="driveC.code" value="#session.codeCasino"/>
                           <s:param name="driveU.code" value="#session.codeCourseU"/>
                           <s:param name="produit.nom">Ananas</s:param>
                           <s:param name="driveU.nom">fruits/fruits-exotiques/_pid2/1/6/10</s:param>
                        </s:url>
			            <s:a href="%{UrlAna}">Ananas</s:a></li> 
			          <li >
			             <s:url id="UrlAbr" action="afficherProduit">
                           <s:param name="utilisateur.identifiant" value="#session.loginUtilisateur"/>
                           <s:param name="driveC.code" value="#session.codeCasino"/>
                           <s:param name="driveU.code" value="#session.codeCourseU"/>
                           <s:param name="produit.nom">Abricot</s:param>
                           <s:param name="driveU.nom">fruits/abricots-peches-fruits-a-noyaux/_pid2/1/6/2</s:param>
                        </s:url>
			            <s:a href="%{UrlAbr}">Abricot</s:a></li> 
			          <li >
			             <s:url id="UrlNect" action="afficherProduit">
                           <s:param name="utilisateur.identifiant" value="#session.loginUtilisateur"/>
                           <s:param name="driveC.code" value="#session.codeCasino"/>
                           <s:param name="driveU.code" value="#session.codeCourseU"/>
                           <s:param name="produit.nom">Nectarine</s:param>
                           <s:param name="driveU.nom">fruits/abricots-peches-fruits-a-noyaux/_pid2/1/6/2</s:param>
                        </s:url>
			            <s:a href="%{UrlNect}">Nectarine</s:a></li>
			          <li >
			             <s:url id="UrlFra" action="afficherProduit">
                           <s:param name="utilisateur.identifiant" value="#session.loginUtilisateur"/>
                           <s:param name="driveC.code" value="#session.codeCasino"/>
                           <s:param name="driveU.code" value="#session.codeCourseU"/>
                           <s:param name="produit.nom">Fraise</s:param>
                           <s:param name="driveU.nom">fruits/fruits-rouges/_pid2/1/6/4</s:param>
                        </s:url>
			            <s:a href="%{UrlFra}">Fraise</s:a></li>          			          		
	               </ul>
	             </li>
	             <li ><s:a href="#"> Legumes </s:a>
		           <ul >
			          <li >
			             <s:url id="UrlTom" action="afficherProduit">
                           <s:param name="utilisateur.identifiant" value="#session.loginUtilisateur"/>
                           <s:param name="driveC.code" value="#session.codeCasino"/>
                           <s:param name="driveU.code" value="#session.codeCourseU"/>
                           <s:param name="produit.nom">Tomate</s:param>
                           <s:param name="driveU.nom">legumes/tomates/_pid2/1/7/2</s:param>
                        </s:url>
			            <s:a href="%{UrlTom}">Tomate</s:a></li>   
			          <li >
			             <s:url id="UrlOig" action="afficherProduit">
                           <s:param name="utilisateur.identifiant" value="#session.loginUtilisateur"/>
                           <s:param name="driveC.code" value="#session.codeCasino"/>
                           <s:param name="driveU.code" value="#session.codeCourseU"/>
                           <s:param name="produit.nom">Oignon</s:param>
                           <s:param name="driveU.nom">legumes/ail-oignon-echalote/_pid2/1/7/11</s:param>
                        </s:url>
			            <s:a href="%{UrlOig}">Oignon</s:a></li>
			          <li >
			             <s:url id="UrlCaro" action="afficherProduit">
                           <s:param name="utilisateur.identifiant" value="#session.loginUtilisateur"/>
                           <s:param name="driveC.code" value="#session.codeCasino"/>
                           <s:param name="driveU.code" value="#session.codeCourseU"/>
                           <s:param name="produit.nom">Carotte</s:param>
                           <s:param name="driveU.nom">legumes/carottes/_pid2/1/7/5</s:param>
                        </s:url>
			            <s:a href="%{UrlCaro}">Carotte</s:a></li> 
			          <li >
			             <s:url id="UrlAil" action="afficherProduit">
                           <s:param name="utilisateur.identifiant" value="#session.loginUtilisateur"/>
                           <s:param name="driveC.code" value="#session.codeCasino"/>
                           <s:param name="driveU.code" value="#session.codeCourseU"/>
                           <s:param name="produit.nom">Ail</s:param>
                           <s:param name="driveU.nom">legumes/ail-oignon-echalote/_pid2/1/7/11</s:param>
                        </s:url>
			            <s:a href="%{UrlAil}">Ail</s:a></li>
			          <li >
			             <s:url id="UrlCourg" action="afficherProduit">
                           <s:param name="utilisateur.identifiant" value="#session.loginUtilisateur"/>
                           <s:param name="driveC.code" value="#session.codeCasino"/>
                           <s:param name="driveU.code" value="#session.codeCourseU"/>
                           <s:param name="produit.nom">Courgette</s:param>
                           <s:param name="driveU.nom">legumes/autres-legumes/_pid2/1/7/10</s:param>
                        </s:url>
			            <s:a href="%{UrlCourg}">Courgette</s:a></li> 
			          <li >
			             <s:url id="UrlPoiv" action="afficherProduit">
                           <s:param name="utilisateur.identifiant" value="#session.loginUtilisateur"/>
                           <s:param name="driveC.code" value="#session.codeCasino"/>
                           <s:param name="driveU.code" value="#session.codeCourseU"/>
                           <s:param name="produit.nom">Poivron</s:param>
                           <s:param name="driveU.nom">legumes/autres-legumes/_pid2/1/7/10</s:param>
                        </s:url>
			            <s:a href="%{UrlPoiv}">Poivron</s:a></li>               	          		
	               </ul>
	             </li>
	            
	             
	           </ul> 	       
                            
        </div>
      </div>      
             <div id="casino">           
               <strong><s:property value="#session.nomCasino"/></strong><br/>
                <s:iterator value="#session.liste1">
                   <div id="section">                                        
                    <img height="110" width="110" src="<s:url value="%{image}"/>" />
                    <h3><span style="font-weight: normal;">
                           <s:property value="nom"/></span></h3> 
                           .............
                     <h2><span style="font-weight: bold;">
                           <s:property value="prix"/> </span></h2>
                     <h2><span style="font-weight: normal;">     
                           <s:property value="prix_unitaire"/></span></h2>
                   </div>       
                </s:iterator> 
              </div>                  
           
            <div id="courseu">           
               <strong><s:property value="#session.nomCourseU"/></strong><br/>
                <s:iterator value="#session.liste2">
                   <div id="section">  
                   <img height="110" width="110" src="<s:url value="%{image}"/>" />
                    <h3><span style="font-weight: normal;">
                           <s:property value="nom"/></span></h3> 
                           .............
                     <h2><span style="font-weight: bold;">
                           <s:property value="prix"/> </span></h2>
                     <h2><span style="font-weight: normal;">     
                           <s:property value="prix_unitaire"/></span></h2>
                    </div>      
                </s:iterator> 
              </div>               
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