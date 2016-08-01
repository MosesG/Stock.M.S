var user = App.extend(App.Cmp, {
	modelId: 'user',
	httpUrl:  './user',
	responseTarget: 'ajax-content',
	title: 'stuff details',
	model:[{
		id : 'name',
		name : 'User_Name',
		placeholder : 'Enter your user name here',
		type : 'text',
		required : 'required',
		label: 'Name'
	
	},{
		id : 'email',
		name : 'User_Email',
		placeholder : 'Enter your email',
		type : 'email',
		required : 'required',
		label: 'Email'

	}, {
		id : 'phoneNumber',
		name : 'User_PhoneNo',
		placeholder : 'Enter your phone number',
		type : 'number',
		required : 'required',
		label: 'Phone Number'

	},{
		id : 'box',
		name : 'User_Box',
		placeholder : 'Enter your postal adress here',
		type : 'box',
		required : 'required',
		label: 'P.O BOX'

	},{
		id : 'password',
		name : 'User_Password',
		placeholder : 'Enter the name of your town here',
		type : 'password',
		required : 'required',
		label: 'password'

	},{
		id: 'Id',
		label: '',
		name: 'id',
		hidden: true,
		type: 'hidden'
	}],
	removeRecord: true,
	
});
(function(){
	user.table();
})();















