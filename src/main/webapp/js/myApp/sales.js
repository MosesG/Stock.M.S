var sales = App.extend(App.Cmp, {
	modelId: 'sales',
	httpUrl: './sales',
	responseTarget: 'login-form',
	title:'sales',	
	model: [{
		id: 'Product',
		label: 'product ',
		name: 'prod_Name',
		type: 'select',
		options: [],
		placeholder: 'name of product',
		required: 'required'
	},{
		id: 'Quantity',
		label: 'Quantity',
		name: 'Sale_Quantity',
		type: 'text',
		placeholder: 'Quantity',
		required: 'required'
	},{
		id: 'Price',
		label: '',
		name: 'Sale_Price',
		hidden: true,
		type: 'hidden'
	},{
		id: 'Time',
		label: '',
		name: 'Sale_Time',
		hidden: true,
		type: 'hidden'
	}],
	removeRecord: true
});

(function(){
	sales.ajaxRequest.call({
		httpMethod : 'GET',
		httpUrl : './product',
		updateTarget : function(resp) {
			var options = [];
			
			console.log(resp);
			JSON.parse(resp).forEach(function(el){
				options.push({
					label: el.Prod_Name,
					value: el.id,
				});
			});
						
			sales.model[0].options = options;
		}
	})
})();	