<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Tabletki, administracja</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css"
	integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb"
	crossorigin="anonymous">
<link rel="stylesheet" type="text/css"
	href="/media/css/site-examples.css?_=19472395a2969da78c8a4c707e72123a">
<link rel="stylesheet" type="text/css"
	href="https://cdn.datatables.net/1.10.16/css/jquery.dataTables.min.css">
<style type="text/css" class="init">
</style>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/solid.css" integrity="sha384-ioUrHig76ITq4aEJ67dHzTvqjsAP/7IzgwE7lgJcg2r7BRNGYSK0LwSmROzYtgzs" crossorigin="anonymous">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/fontawesome.css" integrity="sha384-sri+NftO+0hcisDKgr287Y/1LVnInHJ1l+XC7+FOabmTTIK0HnE2ID+xxvJ21c5J" crossorigin="anonymous">
<script type="text/javascript"
	src="/media/js/site.js?_=30af62656a8280c8984f7320f0cc0923"></script>
<script type="text/javascript"
	src="/media/js/dynamic.php?comments-page=examples%2Fbasic_init%2Fzero_configuration.html"
	async></script>
<script type="text/javascript" language="javascript"
	src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script type="text/javascript" language="javascript"
	src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>
<script type="text/javascript" language="javascript"
	src="../resources/demo.js"></script>
<script type="text/javascript" class="init">
	$(document).ready(function() {
		$('#example').DataTable();
	});
</script>
</head>
<body>
<c:set var="medicaments" scope="session" value="${medicaments}" />
<c:set var="patients" scope="session" value="${patients}" />
<c:if test="${medicaments.doubledEan == 1}">
<div class="modal-dialog">
						<div class="modal-content">
							<div class="modal-body">
								<div class="text-center">
									<h6>Lek o takim kodzie kreskowym już istnieje</h6>
									
								</div>
								
							</div>
						</div>
</div>
</c:if>

<div class="container">
<div class="col-xs-12" style="height: 50px;"></div>
	<div class="row align-items-end.ml-1">
		 <div class="col-sm">
		 	<form:form method="post" modelAttribute="medicaments" class="form-horizontal" role="form">
		 	<div class="form-group">
		 	<label for="ean" class="col-md-3 control-label">Kod kreskowy</label>
		 	<form:input path="ean" class="form-control" placeholder="Proszę przepisać ciąg liczb z kodu kreskowego (bez spacji)" required="true" />
		 	 
			 
			
		 </div>
		 <div class="form-group">
		 	<label for="nazwa" class="col-md-3 control-label">Nazwa leku</label>
		 	<form:input path="nazwa" class="form-control" placeholder="W nazwie sugeruję dla ułatwienia zawrzeć wielkość opakowania np. Nurofen Express Forte (20) " required="true" />
		 	 
			 
			
		 </div>
		 <div class="form-group">
		 	<label for="liczba_w_paczce" class="col-md-3 control-label">Liczba sztuk w opakowaniu</label>
		 	<form:input path="liczba_w_paczce" class="form-control" placeholder="Liczba sztuk w opakowaniu" required="true" />
		 	 
			 
			
		 </div>
		 
			 <input type="submit" class="btn btn-success" value="Prześlij">
		 	</div>
		 	
		 	</form:form>
		 
		 </div>
		
		 
	</div>
	
	<div class="row mt-4">
		 <div class="col-sm">
		
		 </div>
		  <div class="col-sm">
			 
		 
		 </div>
		 <div class="col-sm">
			<a href="activ"><span class="text-secondary"><i class="fas fa-tools fa-5x"></i>
		 <br>Administracja</span></a>
		 </div>
		 <div class="col-sm">
			 <a href="home"><span class="text-secondary text-center"><i class="fas fa-home fa-5x"></i>
			 <br>Główna</span></a>
		 	
		 </div>
		 
	</div>
	
</div>

</body>
</html>