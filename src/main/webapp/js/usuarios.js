function entrar(){
	

var endpointCompleto = "/comITProyecto/ws/usuario";
	
	var request = new XMLHttpRequest(); 
	request.open("GET", endpointCompleto , true);
	request.send(null);
	request.onreadystatechange = function() { //le asignamos la función al evento on ready state change
		//readyState 4: el request terminó y la respuesta está disponible.
		//status 200: salió todo bien
		if (request.readyState == 4 && request.status == 200) { //chequeamos que ya tengamos el response y que el código del status sea 200
		   console.log(request.responseText);
		   agregarSonidoDeAnimal(request.responseText);
		}
	} 