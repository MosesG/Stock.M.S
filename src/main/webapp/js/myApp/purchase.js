var purchase = App.extend(App.Cmp, {
	modelId: 'purchase',
	httpUrl:  './purchase',
	responseTarget: 'purchase-form',
	title: 'new sale',
	model:[{
		id: 'Product',
		label: 'product ',
		name: 'prod_Name',
		type: 'select',
		option: [],
		placeholder: 'name of product',
		required: 'required'
	},{
		id: 'Quantity',
		label: 'Quantity',
		name: 'Sale_Quantity',
		type: 'text',
		placeholder: 'Quantity',
		required: 'required'
	}],
	removeRecord: true,
});
(function(){
	purchase.form();
})();

(function(){
	purchase.ajaxRequest.call({
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
						
			purchase.model[0].options = options;
		}
	})
})();	




