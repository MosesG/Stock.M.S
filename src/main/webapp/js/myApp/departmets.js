var department = App.extend(App.Cmp, {
	modelId: 'department',
	httpUrl: './department',
	responseTarget: 'ajax-content',
	columnModel: ['name'],
	title:'departments',	
	model: [{
		id: 'Name',
		label: 'Department Name ',
		name: 'Dept_Name',
		type: 'text',
		placeholder: 'name of Department',
		required: 'required'
	},{
		id: 'Code',
		label: 'Code',
		name: 'Dept_Code',
		type: 'text',
		placeholder: 'Code',
		required: 'required'
	},{
		id: 'Desc',
		label: 'Description',
		name: 'Dept_Desc',
		type: 'text',
		placeholder: 'Dept Description',
		required: 'required'
	}],
	removeRecord: true
});

	