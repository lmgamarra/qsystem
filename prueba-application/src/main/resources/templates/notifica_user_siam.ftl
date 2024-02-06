<#import "base.html" as base>

<@base.layout>

<table> 
<tr> 
<td><p style='margin:0px;'><b>${titulo}</b></p>
</td> 
</tr> 

<tr>
<td> 
<p style='margin:0px;'>Estimado(a) ${nombre}, se envía credenciales de acceso al sistema SIAM.</p>
</td> 
</tr> 


<tr>
<td> 
<p style='margin:0px;'>Usuario: ${username}</p>
</td> 
</tr>

<tr>
<td> 
<p style='margin:0px;'>Contraseña: <b class="remove">${password}</b></p>
</td> 
</tr>

</table>
 

</@base.layout>




     