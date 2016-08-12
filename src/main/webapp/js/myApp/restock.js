var restock = App.extend(App.Cmp, {
	modelId: 'restock',
	httpUrl: './product',
	responseTarget: 'ajax-content',
	title: 'Stock Details',
	
	model: [{
		id: 'Name',
		label: 'Name ',
		name: 'Prod_Name',
		type: 'text',
		placeholder: 'name of product',
		required: 'required'
	},{
		id: 'Stock',
		label: 'Stock',
		name: 'StockLevel',
		type: 'text',
		placeholder: 'Quantity in store',
		required: 'required'
	}],
	removeRecord: true,
	
});