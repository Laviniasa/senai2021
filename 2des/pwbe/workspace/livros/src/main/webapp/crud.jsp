<%@page import="vo.Livro"%>
<%@page import="ctr.LivroProcess"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de livros</title>
</head>
<body>
<form>
	<label>Id</label><input type="number" name="id"/>
	<label>Autor</label><input type="text" name="autor"/>
	<label>T�tulo</label><input type="text" name="titulo"/>
	<label>Pre�o</label><input type="number" name="preco"/>
</form>
<table>
	<tr><th>Id</th><th>Autor</th><th>T�tulo</th><th>Pre�o</th></tr>
<%
	LivroProcess.testes();
	for(Livro l: LivroProcess.livros){
		out.print("<tr>");		
		out.print(l.toHTML());
		out.print("</tr>");
	}
	LivroProcess.salvar();
%>
</table>
</body>
</html>