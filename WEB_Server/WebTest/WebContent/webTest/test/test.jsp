<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
 
    <center>
        <h2>��� ȸ�� ����</h2>
        <table width="800" border="1" bordercolor="gray">
            <tr height="40">
                <td align="center" width="50">���̵�</td>
                <td align="center" width="200">�̸���</td>
                <td align="center" width="150">��ȭ</td>
                <td align="center" width="150">���</td>
                <td align="center" width="150">����</td>
                <td align="center" width="100">����</td>
            </tr>
            <!-- forEach���� ������ �� ����� ���� ���ʴ�� ����Ѵ�. -->
            <!-- c�±׸� ����Ͽ����Ƿ� $�� ����Ͽ� ����Ѵ�. -->
 
            <c:forEach var="bean" items="${v }">
 
                <tr height="40">
                    <td align="center" width="50">${bean.id }</td>
                    <td align="center" width="200"><a href="#">${bean.email }</a>
                    </td>
                    <td align="center" width="150">${bean.tel }</td>
                    <td align="center" width="150">${bean.hobby }</td>
                    <td align="center" width="150">${bean.job }</td>
                    <td align="center" width="100">${bean.age }</td>
                </tr>
            </c:forEach>
        </table>
    </center>
</body>
</html>