<%@ include file="/WEB-INF/views/includes/includes.jsp" %>
<!DOCTYPE html>
<html lang="fr">
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Gestion de stock mvc</title>

    <!-- Bootstrap Core CSS -->
    <link href="<%=request.getContextPath() %>/resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- MetisMenu CSS -->
    <link href="<%=request.getContextPath() %>/resources/vendor/metisMenu/metisMenu.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="<%=request.getContextPath() %>/resources/dist/css/sb-admin-2.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="<%=request.getContextPath() %>/resources/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

    <div id="wrapper">

        <!-- Navigation -->
        <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
            
            <%@ include file="/WEB-INF/views/menu_top/topMenu.jsp" %>
			
            <%@ include file="/WEB-INF/views/menu_left/leftMenu.jsp" %>
            <!-- /.navbar-static-side -->
        </nav>

        <!-- Page Content -->
        <div id="page-wrapper">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header"> <fmt:message code="article.nouveau" /></h1>
                    </div>
                    <!-- /.col-lg-12 -->
                </div>
                
                <div class="row">
	                <div class="col-lg-12">
	                    <div class="panel panel-primary">
	                        <div class="panel-heading">
	                            <fmt:message code="article.nouveau" />
	                        </div>
	                        <!-- /.panel-heading -->
	                        <div class="panel-body">
	                        	<c:url value="/article/enregistrer" var ="urlEnregistrer" />
								<f:form modelAttribute="article" action="${urlEnregistrer }" enctype="multipart/form-data" role = "form">
									<f:hidden path="idArticle"/>
									<f:hidden path="photo"/>
									<div class="form-group">
                                        <label><fmt:message code="common.code" /></label>
                                        <f:input path="codeArticle" class="form-control" placeholder="Code article" />
                                    </div>
									<div class="form-group">
                                        <label><fmt:message code="common.designation" /></label>
                                        <f:input path="designation" class="form-control" placeholder="Désignation" />
                                    </div>
									<div class="form-group">
                                        <label><fmt:message code="common.prixUnitHT" /></label>
                                        <f:input id="prixUnitHT" path="prixUnitaireHT" class="form-control" placeholder="Prix unitaire HT" />
                                    </div>
									<div class="form-group">
                                        <label><fmt:message code="common.tva" /></label>
                                        <f:input  id="tauxTva" path="tauxTva" class="form-control" placeholder="Taux TVA" />
                                    </div>
									<div class="form-group">
                                        <label><fmt:message code="common.prixUnitTTC" /></label>
                                        <f:input id="prixUnitTTC" path="prixUnitaireTTC" class="form-control" placeholder="Prix unitaire TTC" />
                                    </div>
									<div class="form-group">
                                        <label><fmt:message code="common.parametrage.category" /></label>
                                        <f:select class="form-control" path="category.idCategory" items="${categories }" itemLabel="code" itemValue="idCategory" />
                                    </div>
                                    <div class="form-group">
                                        <label><fmt:message code="common.photo" /></label>
                                        <input type="file" name="file">
                                    </div>
                                    <div class="panel-footer">
                                    	<button type="submit" class="btn btn-primary"><i class="fa fa-save">&nbsp;<fmt:message code="common.enregister" /></i></button>
                                    	<a href="<c:url value="/article/" />" class="btn btn-danger"> <i class="fa fa-arrow-left">&nbsp;<fmt:message code="common.annuler" /></i></a>
                                    </div>
								</f:form>	                        
	                        </div>
	                        <!-- /.panel-body -->
	                    </div>
	                    <!-- /.panel -->
	                </div>
                <!-- /.col-lg-12 -->
            </div>
                <!-- /.row -->
            </div>
            <!-- /.container-fluid -->
        </div>
        <!-- /#page-wrapper -->

    </div>
    <!-- /#wrapper -->

    <!-- jQuery -->
    <script src="<%=request.getContextPath() %>/resources/vendor/jquery/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="<%=request.getContextPath() %>/resources/vendor/bootstrap/js/bootstrap.min.js"></script>

    <!-- Metis Menu Plugin JavaScript -->
    <script src="<%=request.getContextPath() %>/resources/vendor/metisMenu/metisMenu.min.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="<%=request.getContextPath() %>/resources/dist/js/sb-admin-2.js"></script>
    
    <!-- My Custom JavaScript files -->
    <script src="<%=request.getContextPath() %>/resources/javascript/article.js"></script>

</body>

</html>
