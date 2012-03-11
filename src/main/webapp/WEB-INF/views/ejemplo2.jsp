<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>Requisitos</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    
    <!-- Los estilos -->
    <link href="resources/bootstrap/css/bootstrap.css" rel="stylesheet">
    <link href="resources/datatables/css/DT_bootstrap.css" rel="stylesheet">
    <style>
      body {
        padding-top: 60px; /* 60px to make the container go all the way to the bottom of the topbar */
      }
    </style>

    <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
      <script src="//html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

  </head>

  <body>

    <div class="navbar navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container">
          <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </a>
          <a class="brand" href="#">Requisitos</a>
          <div class="nav-collapse">
            <ul class="nav">
              <li class="active"><a href="#">Inicio</a></li>
              <li><a href="#about">About</a></li>
              <li><a href="#contact">Contact</a></li>
            </ul>
          </div><!--/.nav-collapse -->
        </div>
      </div>
    </div>

    <div class="container">

      <h1>Bootstrap starter template</h1>
      <p>Use this document as a way to quick start any new project.<br> All you get is this message and a barebones HTML document.</p>
      
	     <div id="demo">
			<table cellpadding="0" cellspacing="0" border="0" class="table table-striped table-bordered table-condensed" id="example">
				<thead>
					<tr>
						<th width="10%">Identificador</th>
						<th width="30%">Nombre</th>
						<th width="10%">Fecha</th>
						<th width="50%">Descripción</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td colspan="3" class="dataTables_empty">Cargando datos del servidor</td>
					</tr>
				</tbody>
			</table>
		</div>

    </div>

    <!-- Se carga el javascript, localizado al final del documento para que una carga mas rapida de la pagina -->
    
    <!-- Bootstrap -->
    <script type="text/javascript" src="resources/bootstrap/js/bootstrap.js"></script>
    
    <!-- JQuery -->
    <script type="text/javascript" src="resources/datatables/js/jquery.js"></script>
	
	<!-- Datatables -->
	<script type="text/javascript" src="resources/datatables/js/jquery.dataTables.js"></script>
	<script type="text/javascript" src="resources/datatables/js/Scroller.js"></script>
	<script type="text/javascript" src="resources/datatables/js/DT_bootstrap.js"></script>
	
	<script type="text/javascript" charset="utf-8">
		$(document).ready(function() {
			$('#example').dataTable( {
			     "bServerSide": true,
			     "bProcessing": false,
			     "bDeferRender": true,
			     "sAjaxSource": "requirement",
			     "aoColumns": [
			                   { "mDataProp": "id" },
			                   { "mDataProp": "name" },
			                   { "mDataProp": "date" },
			                   { "mDataProp": "description" }
			     ],
				 "oLanguage": {
                 		"sUrl": "resources/datatables/internalisation/dataTables.spanish.txt"
          		 },
          		"sDom": "<'row'<'span6'l><'span6'f>r>t<'row'<'span6'i><'span6'p>>",
          		"sPaginationType": "bootstrap"
			} );
		} );
	</script>

  </body>
</html>