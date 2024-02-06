<#import "base.html" as base>
<@base.layout>
    <h3><span style="text-decoration: underline; color: #5bc500;">Recordatorio de configuraci&oacute;n de rol funcional</span></h3>
<p>La solicitud con n&uacute;mero ${ticketNumero} est&aacute; pendiente de atenci&oacute;n, contiene el siguiente resumen:</p>
<table style="width: 100%; border-color: #00A9E0;" border="#00A9E0">
<tbody>
<tr>
<td>Solicitante</td>
<td>${nombresSolicitante}</td>
</tr>
<tr>
<td>Tipo de solicitud</td>
<td>${tipoSolicitud}</td>
</tr>
<tr>
<td>Sustento</td>
<td>${sustento}</td>
</tr>
</tbody>
</table>
</@base.layout>