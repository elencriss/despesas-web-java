<%-- imports da diretiva page --%>
<%@page import="br.com.impacta.despesaswebjava.dao.DespesaDAO"%>
<%@ page language="java" contentType="text/html; charset=utf-8"	pageEncoding="utf-8"
import="br.com.impacta.despesaswebjava.dao.*,
		br.com.impacta.despesaswebjava.models.*,
		java.util.*"%>

<!DOCTYPE html>
<html lang="pt">
<head>

<link rel="stylesheet" href="../css/bootstrap.min.css">
<script src="../js/bootstrap.min.js"></script>
<title>Listagem de Despesas Pessoais</title>

</head>

<body>
	<!-- CONTEÚDO PRINCIPAL -->
	<div class="container">
		<div class="navbar navbar-expand-sm bg-light">Despesas Pessoais</div>
			<div class="panel-body">
				[Aqui um texto introdutório da tabela]
			</div>
		<table class="table">
			<thead>
				<tr>
					<th>Descrição</th>
					<th>Categoria</th>
					<th>Data</th>
					<th>Valor</th>
					<th>Observações</th>
				</tr>
			</thead>
			<tbody>
				<%-- Buscar os dados  --%>
				<%
					DespesaDAO dao = new DespesaDAO();
					List<Despesa> despesas = dao.getDespesas();
				%>
				<%--Início do bloco de repetição --%>
				<% for(Despesa despesa : despesas) {%>
					<tr>
						<td><%= despesa.getDescricao() %></td>
						<td><%= despesa.getCategoria() %></td>
						<td><%= despesa.getData() %></td>
						<td><%= String.format("R$ %.2f", despesa.getValor())%></td>
						<td><%= (despesa.getObservacoes() != null) ? despesa.getObservacoes() : "" %></td>
					</tr>
				<% } %>
				<%--Fim do bloco de repetição --%>
			</tbody>
		</table>
	</div>	
</body>
</html>