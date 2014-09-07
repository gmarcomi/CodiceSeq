/*!
* \File: ProcessDataModel.js 
* \Author: Vanni Giachin <vanni.giachin@gmail.com> 
* \Date: 2014-05-26 
* \LastModified: 2014-07-22
* \Class: ProcessDataModel
* \Package: com.sirius.sequenziatore.client.model
* \Brief: Gestione dei dati da inviare per superare un passo di un processo
*/
define([
 'backbone',
], function( Backbone ){

	var ProcessData = Backbone.Model.extend({
	
		save: function() {
			this.url = "http://localhost:8080/stepdata/"+this.stepId+"/user"+this.username;
			return this.constructor.__super__.save.apply(this);
		}
	
	});

	return ProcessData;

});
/* Cosente di inviare al server i dati di un passo eseguito.
 * 
 * ESEMPIO UTLIZZO
 * // array dei valori rilevati
 * var values = new Array();
 * values.push({ dataId: 1, value: "testo" });
 * values.push({ dataId: 1, value: 12.34 });
 * values.push({ dataId: 1, imageUrl: "img/Tesoro" });
 * values.push({ dataId: 1, latitude: 12.34 , longitude: 12.34, altitude: 12.34 });
 *
 * // data corrente; il formato è da concordare con i progettisti del database
 * var now = new Date();
 *
 * var model = new ProcessDataModel({ 
 *		stepId: 1, username: "Gabriele", dateTime: now, values: values 
 *	});
 *
 * // per testare si può invertire fail con save
 * model.save().done( function() {
 *		console.log("salvato con successo")
 *	}).fail( function() {
 *		console.log("errore di connessione")
 *	});
 */