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
		required: 'required'
	},{
		id: 'Code',
		label: 'Code',
		name: 'Prod_Code',
		type: 'text',
		required: 'required'
	},{
		id: 'Price',
		label: 'Price',
		name: 'Prod_Price',
		type: 'text',
		required: 'required'
	},{
		id: 'Category',
		label: 'Category',
		name: 'Prod_Cat',
		type: 'text',
		required: 'required'
	},{
		id: 'Stock',
		label: 'Stock',
		name: 'StockLevel',
		type: 'text',
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