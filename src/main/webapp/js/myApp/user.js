var user = App.extend(App.Cmp, {
	modelId: 'user',
	httpUrl:  './user',
	responseTarget: 'ajax-content',
	model:[{
		id : 'name',
		name : 'Name',
		placeholder : 'Enter your user name here',
		type : 'text',
		required : 'required',
		label: 'Name'
	
	},{
		id : 'email',
		name : 'Email',
		placeholder : 'Enter your email',
		type : 'email',
		required : 'required',
		label: 'Email'

	}, {
		id : 'phoneNumber',
		name : 'Phone',
		placeholder : 'Enter your phone number',
		type : 'number',
		required : 'required',
		label: 'Phone Number'

	},{
		id : 'password',
		name : 'Password',
		placeholder : 'Enter the name of your town here',
		type : 'password',
		required : 'required',
		label: 'password'

	},{
		id : 'box',
		name : 'Box',
		placeholder : 'Enter your postal adress here',
		type : 'box',
		required : 'required',
		label: 'P.O BOX'

	}],
	removeRecord: true,
	
});
(function(){
	user.init();
})();