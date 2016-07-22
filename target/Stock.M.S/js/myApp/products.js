var products = App.extend(App.Cmp, {
	modelId: 'product',
	httpUrl: './product',
	responseTarget: 'ajax-content',
	columnModel: ['name'],
	title:'Products',	
	
	model: [{
		id: 'Name',
		label: 'Name ',
		name: 'Prod_Name',
		type: 'text',
		placeholder: 'name of product',
		required: 'required'
	},{
		id: 'Code',
		label: 'Code',
		name: 'Prod_Code',
		type: 'text',
		placeholder: 'code',
		required: 'required'
	},{
		id: 'Price',
		label: 'Price',
		name: 'Prod_Price',
		type: 'text',
		placeholder: 'price of product',
		required: 'required'
	},{
		id: 'Category',
		label: 'Category',
		name: 'Prod_Cat',
		type: 'text',
		placeholder: 'category of product',
		required: 'required'
	},{
		id: 'Stock',
		label: 'Stock',
		name: 'StockLevel',
		type: 'text',
		placeholder: 'Quantity in store',
		required: 'required'
	},{
		id: 'id',
		label: '',
		name: 'id',
		hidden: true,
		type: 'hidden'
	}],
	removeRecord: true
});