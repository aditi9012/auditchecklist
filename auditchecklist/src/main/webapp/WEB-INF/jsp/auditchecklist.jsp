<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<html>
<head>
<title></title>
</head>
<body>
<h2>Project Name: ${newrequest.projectName}</h2>
<h2>Manager Name: ${newrequest.managerName}</h2>
<h2>Owner Name: ${newrequest.ownerName}</h2>
<form:form method="POST" action="/submit" modelAttribute="AuditDetail">
Audit Type <form:select path="AuditType" id="mySelect" onchange="check(this);">
<form:option value="" label="Select one"/>
<form:option value="SOX" label="SOX"/>
<form:option value="Internal" label="Internal"/>
</form:select>

 <div id="0" style="display:none;">
 <div>
  <p>Have all Change requests followed SDLC before PROD move?</p>
  <form:radiobutton path="Q1" value="yes"/> Yes
 <form:radiobutton path="Q1" value="no"/> No
  </div>
   <div>
  <p>Have all Change requests been approved by the application owner?</p>
<form:radiobutton path="Q2" value="yes"/> Yes
 <form:radiobutton path="Q2" value="no"/> No
  </div>
   <div>
  <p>For a major change, was there a database backup taken before and after PROD move?</p>
<form:radiobutton path="Q3" value="yes"/> Yes
 <form:radiobutton path="Q3" value="no"/> No
  </div>
   <div>
  <p>Has the application owner approval obtained while adding a user to the system?</p>
 <form:radiobutton path="Q4" value="yes"/> Yes
 <form:radiobutton path="Q4" value="no"/> No
  </div>
   <div>
  <p>Is data deletion from the system done with application owner approval?</p>
 <form:radiobutton path="Q5" value="yes"/> Yes
 <form:radiobutton path="Q5" value="no"/> No
  </div>
  
 </div>
 
 
 
 <div id="1" style="display:none;">
 <div>
  <p>Have all Change requests followed SDLC before PROD move?</p>
 <form:radiobutton path="Q1" value="yes"/> Yes
 <form:radiobutton path="Q1" value="no"/> No
  </div>
  <div>
  <p>Have all Change requests been approved by the application owner?</p>
 <form:radiobutton path="Q2" value="yes"/> Yes
 <form:radiobutton path="Q2" value="no"/> No
  </div>
  <div>
  <p>Are all artifacts like CR document, Unit test cases available?</p>
 <form:radiobutton path="Q3" value="yes"/> Yes
 <form:radiobutton path="Q3" value="no"/> No
  </div>
  <div>
  <p>Is the SIT and UAT sign-off available?</p>
 <form:radiobutton path="Q4" value="yes"/> Yes
 <form:radiobutton path="Q4" value="no"/> No
  </div>
  <div>
  <p>Is data deletion from the system done with application owner approval?</p>
 <form:radiobutton path="Q5" value="yes"/> Yes
 <form:radiobutton path="Q5" value="no"/> No
  </div>
 </div>
 <input type="submit" value="submit"/>
 </form:form>
 

 <script>
 function check(nameSelect)
 {
 document.getElementById("0").style.display = "none";
 document.getElementById("1").style.display = "none";
     if(nameSelect){
         var a=document.getElementById("mySelect").value;
         console.log(a);
         if(a=="SOX"){
         document.getElementById("0").style.display = "block";
         }
         else if(a=="Internal"){
         document.getElementById("1").style.display = "block";
         }
     }
     else{
       document.getElementById("0").style.display = "none";
     }

 }

</script>
</body>
</html>