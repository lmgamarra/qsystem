<#import "base_large.html" as base>

<@base.layout>

<table> 
<tr> 
<td><p style='margin:0px;'><b>${titulo}</b></p>
</td> 
</tr> 

<tr>
<td> 
<p style='margin:0px;'>Estimado(a) ${nombre}, A continuación solicitudes rechazadas según ticket ${numTicket}.</p>
</td> 
</tr> 

<tr>
<td>
<#list solicitudes>
<table style="width:100%" border="1">
<tr>
<td style="width:15%"><b>Tipo Documento</b></td> 
<td style="width:15%"><b>Número Documento</b></td> 
<td style="width:20%"><b>Apellidos y Nombres</b></td>
<td style="width:15%"><b>Número solicitud</b></td>
<td style="width:35%"><b>Motivo Rechazo</b></td>                                     
</tr>

<#items as solicitud>
<tr>
<td>${solicitud.tipoDocumento}</td>
<td>${solicitud.numDocumento}</td>
<td>${solicitud.nombreCompleto}</td>
<td>${solicitud.numSolicitud}</td>
<td>${solicitud.motivoRechazo}</td>                                        
</tr>
</#items>
</table>
</#list>
</td>
</tr>




</table>
 

</@base.layout>




     