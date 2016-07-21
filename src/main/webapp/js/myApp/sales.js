var sales = App.extend(App.Cmp, {
	modelId: 'sales',
	httpUrl: './sales',
	responseTarget: 'ajax-content',
	columnModel: ['name'],
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
		name: 'sale_Quantity',
		type: 'text',
		placeholder: 'Quantity',
		required: 'required'
	},{
		id: 'Price',
		label: 'Total Price',
		name: 'sale_Price',
		type: 'text',
		placeholder: 'total price',
		required: 'required'
	}],
	removeRecord: true
});
(function(){
	sales.ajaxRequest.call({
		httpMethod : 'GET',
		httpUrl : './product',
		updateTarget : function(resp) {
			var options = [];
			var price
			console.log(resp);
			JSON.parse(resp).forEach(function(el){
				options.push({
					label: el.Name,
					value: el.id
				});
			});
			
			sales.model[0].options = options;
		}
	})
})();	