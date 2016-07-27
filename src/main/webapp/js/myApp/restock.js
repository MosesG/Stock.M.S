var restock = App.extend(App.Cmp, {
	modelId: 'restock',
	httpUrl: './product',
	responseTarget: 'ajax-content',
	title: 'Stock Details',
	
	removeRecord: true,
	
});