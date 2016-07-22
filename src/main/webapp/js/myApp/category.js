var category = App.extend(App.Cmp, {
	modelId: 'category',
	httpUrl: './category',
	responseTarget: 'ajax-content',
	columnModel: ['name'],
	title:'categories',	
	model: [{
		id: 'Department',
		label: 'Department',
		name: 'cat_Dept',
		type: 'select',
		options: [],
		placeholder: 'Department',
		required: 'required'
	},{
		id: 'Name',
		label: 'Category Name ',
		name: 'cat_Name',
		type: 'select',
		placeholder: 'Category Name',
		required: 'required'
	},{
		id: 'Code',
		label: 'Code',
		name: 'cat_Code',
		type: 'text',
		placeholder: 'Quantity',
		required: 'required'
	},{
		id: 'Desc',
		label: 'Description',
		name: 'cat_Desc',
		type: 'text',
		placeholder: 'Description',
		required: 'required'
	}],
	removeRecord: true
});
(function(){
	category.ajaxRequest.call({
		httpMethod : 'GET',
		httpUrl : './department',
		updateTarget : function(resp) {
			var options = [];
			var price
			console.log(resp);
			JSON.parse(resp).forEach(function(el){
				options.push({
					label: el.Dept_Name,
					value: el.id
				});
			});
			
			sales.model[0].options = options;
		}
	})
	
})();	