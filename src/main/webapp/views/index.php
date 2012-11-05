<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    	               "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title >Premier projet Java EE avec PHP</title >
<?php
	function quercus_test()
	{
		return function_exists ("quercus_version");
	}
?>
</head>
<body>
<p>
Test de Quercus
</p>
<?php
	if (quercus_test())
	{
		echo  "Quercus fonctionne parfaitement";
	}
?>
<p>
Test instance de la class personne
</p>
<?php
	//importation du paquetage Java
	import  com.javaee.php.entites.Personne;
	//instanciation de la classe
	$pojo=new Personne();
	//declenchement de methodes
	$pojo->setId(1);
	$pojo->setNom("Lafosse");
	echo  $pojo->afficherPersonne();
	//importation
	import  java.util.Calendar;
	//singleton
	$calendar=Calendar::getInstance();
	//afficher la valeur
	echo ("<br/>".$calendar);
	
	
	
	import com.javaee.php.services.impl.EmployeeServiceImpl;
	$pojo1=new EmployeeServiceImpl();
	echo $pojo1->countListEmployee();
?>
</body>
</html>