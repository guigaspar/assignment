'use strict'

var guiApp = angular.module('gui', [ 'ui.bootstrap', 'gui.controllers',
		'gui.services' ]);
guiApp.constant("CONSTANTS", {
	getUserByIdUrl : "/customers",
	getAllUsers : "/customers",
	saveUser : "/customers"
});