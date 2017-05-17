function nuevaFila(){ //guarda el ticket

	
	var div = document.createElementById("tablas");
	div.appenchild(tr);


	console.log("llegamos al ticket");
	endpointTicket("ticket"); //
}

function endpointTicket(ingresos){
	console.log("llegamos al endpoint" + ingresos);

	var fecha = tomarfecha();
	if(fecha == null) {
		alert("por favor, complete la fecha");
		return;

	var endpointCompleto = "/comITProyecto/ws/formulario/"+ "?ingresos" + ingresos;
	 var xhttp = new XMLHttpRequest();
 	 xhttp.onreadystatechange = function() {
    	if (this.readyState == 4 && this.status == 200) {
    		console.log("oka");
   	 	}
  	};
  	xhttp.open("POST", endpointCompleto, true);
  	request.setRequestHeader("Content-Type", "application/json");  
 }