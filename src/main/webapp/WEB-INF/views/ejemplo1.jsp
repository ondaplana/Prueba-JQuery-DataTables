<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
	<title>Home</title>
	
	<meta http-equiv="content-type" content="text/html; charset=utf-8" />
	<link rel="shortcut icon" type="image/ico" href="http://www.datatables.net/favicon.ico" />
		
	<title>DataTables example</title>
	<style type="text/css" title="currentStyle">
		@import "resources/datatables/css/demo_page.css";
		@import "resources/datatables/css/header.ccss";
		@import "resources/datatables/css/demo_table.css";
	</style>
	<script type="text/javascript" src="resources/datatables/js/jquery.js"></script>
	<script type="text/javascript" src="resources/datatables/js/jquery.dataTables.js"></script>
	<script type="text/javascript" src="resources/datatables/js/Scroller.js"></script>
	<script type="text/javascript" charset="utf-8">
		$(document).ready(function() {
			$('#example').dataTable( {
				   "sScrollY": "400px",
			       "bServerSide": true,
			       "bProcessing": false,
			       "bDeferRender": true,
			       "sAjaxSource": "requirement",
			       "sDom": "frtiS",
			       "aoColumns": [
				                   { "mDataProp": "id" },
				                   { "mDataProp": "name" },
				                   { "mDataProp": "date" },
				                   { "mDataProp": "description" }
			       ],
				   "oLanguage": {
                   			"sUrl": "resources/datatables/internalisation/dataTables.spanish.txt"
          		   }
			} );
		} );
	</script>
</head>
<body>
	<div id="demo">
		<table cellpadding="0" cellspacing="0" border="0" class="display" id="example">
			<thead>
				<tr>
					<th width="10%">Identificador</th>
					<th width="30%">Nombre</th>
					<th width="15%">Fecha</th>
					<th width="45%">Descripción</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td colspan="3" class="dataTables_empty">Cargando datos del servidor</td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>
