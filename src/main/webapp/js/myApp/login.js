var login = App.extend(App.Cmp, {
	modelId: 'login',
	httpUrl:  './login',
	responseTarget: 'login-form',
	title: 'sign-in',
	model:[{
		id : 'email',
		name : 'User_Email',
		placeholder : 'Enter your email',
		type : 'email',
		required : 'required',
		label: 'Email'

	},{
		id : 'password',
		name : 'User_Password',
		placeholder : 'Enter the name of your town here',
		type : 'password',
		required : 'required',
		label: 'password'

	}],
	removeRecord: true,
	
});
(function(){
	login.form();
})();


