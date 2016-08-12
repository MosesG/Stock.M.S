var App = App || {};

App.extend = function(proto, literal) {
	var newLiteral = Object.create(proto);
	Object.keys(literal).forEach(function(k) {
		newLiteral[k] = literal[k];
	})

	return newLiteral;
};

App.Cmp = {
	responseTarget : '',
	httpMethod : 'GET',
	async : true,
	httpUrl : '',
	requestParams : '',
	getEl : function(elId) {
		return document.getElementById(elId);
	},
	updateTarget : function(resp) {
		var me = this;
		me.getEl(me.responseTarget).innerHTML = resp;
	},
	ajaxRequest : function() {
		var me = this;
		var xhr = new XMLHttpRequest();

		xhr.onreadystatechange = function() {

			if (xhr.readyState == 4) {
				if (xhr.status == 200) {
					me.updateTarget(xhr.responseText);
				}
			}
		}

		xhr.open(me.httpMethod, me.httpUrl, me.async);
		if (me.requestParams) {
			xhr.setRequestHeader('Content-Type',
					'application/x-www-form-urlencoded');
			xhr.send(me.requestParams);
		} else
			xhr.send();
	},
	validate : function() {

		var me = this;

		me.nullChecker();
		me.numberChecker();
		me.mailChecker();

		if (this.httpUrl == './login')
			me.login();

		if (this.httpUrl == './register')
			me.register();

		me.submitForm();
	},
	number : true,
	numberChecker : function() {
		var me = this;

		me.model.forEach(function(el) {
			var context = this;

			if (el.type == "number") {

				var numberValue = document.getElementById(el.id).value;
				var numberReg = /^\s*(\+|-)?\d+\s*$/;

				var valid = numberReg.test(numberValue);
				var fieldId = document.getElementById(el.id);
				if (valid == false) {

					me.ajaxRequest.call({
						updateTarget : function() {
							me.commonError("Incorrect Number format", el.id,
									fieldId);

						},
						httpMethod : 'POST',
						httpUrl : me.httpUrl
					});

					me.number = false;

				} else {
					me.commonOkay(el.id);
					me.number = true;

				}

			}

		});
		return me.number;
	},
	email : true,
	mailChecker : function() {
		var me = this;

		me.model
				.forEach(function(el) {
					var context = this;

					if (el.type == "email") {

						var compare = document.getElementById(el.id).value;

						var reg = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;

						var tested = reg.test(compare);
						var fieldId = document.getElementById(el.id);
						if (tested == false) {

							me.ajaxRequest.call({
								updateTarget : function() {
									me.commonError("Incorrect Email format",
											el.id, fieldId);

								},
								httpMethod : 'POST',
								httpUrl : me.httpUrl

							});

							me.email = false;

						} else {
							me.commonOkay(el.id);
							me.email = true;

						}
					}
				});

		return me.email;
	},

	commonError : function(errorMsg, myId, fieldId) {

		var para = document.createElement("p");
		para.setAttribute('style', 'color:red; font-size:11');
		para.setAttribute('id', 'para');

		var errorMsg = document.createTextNode(errorMsg);
		para.appendChild(errorMsg);

		var parentDivId = fieldId.parentNode.id;
		var parentDiv = document.getElementById(parentDivId);

		var NumberOfchildren = parentDiv.childNodes.length;// gets the number
		// of children

		/*
		 * console.log(NumberOfchildren); if (NumberOfchildren <= 3)// ensures
		 * repetition of multiclick errors // is avoided
		 * parentDiv.appendChild(para);
		 */

		document.getElementById(myId).style.backgroundColor = "#f5dddd";
		document.getElementById(myId).style.borderColor = "red";
		document.getElementById(myId).style.color = "red";
	},

	commonOkay : function(myId) {
		/*
		 * if (document.getElementById("para") != null) { var element =
		 * document.getElementById("para"); element.outerHTML = ""; delete
		 * element; }
		 */

		document.getElementById(myId).style.backgroundColor = "#e1ffdc";
		document.getElementById(myId).style.borderColor = "#1b9506";
		document.getElementById(myId).style.color = "#1b9506";
	},
	Null : true,
	nullChecker : function() {
		var me = this;
		me.model.forEach(function(el) {
			if (el.required) {
				var field = me.getEl(el.id);
				var value = field.value;

				if (value) {
					me.commonOkay(el.id);
					me.Null = false;
				} else
					me.commonError("required", el.id, field);
			}
		});

		return me.Null;

	},
	model : [],
	form : function() {
		var me = this;
		var Qnt;
		var id;

		var form = ' <form class="form-horizontal" role="form">'
				+ '<div class="card-header"><h2>' + me.title + '</h2>'
				+ '</div>' + '<div class="card-body card-padding">';

		me.model.forEach(function(el) {
			form += '<div class="form-group">' + '<div class="fg-line">'
					+ '<label class="fg-label">' + el.label + '</label>'
					+ '<div id="' + el.id + '_div">';

			if (el.type == 'select' && el.options) {
				form += '<div class="select">'
						+ '<select class="form-control" name="' + el.name
						+ '" id="' + el.id + '">';
				el.options.forEach(function(opt) {
					form += '<option value=' + opt.value + '>' + opt.label
							+ '</option>'
				});
				form += '</select></div>';

			} else if (el.type == 'checkbox') {
				form += '<div class="checkbox m-b-15">'
						+ ' <input type="checkbox" value="false">'
						+ ' <i class="input-helper"></i>' + '</div>';
			} else
				form += '<input type="' + el.type + '" name="' + el.name
						+ '" placeholder="' + el.placeholder
						+ '" class="form-control auto-size" id="' + el.id
						+ '" </div></div></div></div>';
			
			
			/*if (this.httpUrl == './sales') {
				if (el.name == 'sale_Quantity')
					Qnt = el.value;
					console.log("this is the quantity: " + Qnt);

				if (el.name == 'prod_Name')
					id = el.value;
					console.log(id);
			}*/
		})

		if (this.httpUrl == './register') {
			form += '</form>'
					+ '<div class="col-sm-10"  style="float:right">'
					+ '<a class="btn btn-success" id="'
					+ me.modelId
					+ '-save">finish</a> | '
					+ '<a class="btn btn-success" onclick ="login.form()">sign in</a>'
					+ '</div>';
		} else if (this.httpUrl == './login') {
			form += '</form>'
					+ '<div class="col-sm-10"  style="float:right">'
					+ '<a class="btn btn-success" id="'
					+ me.modelId
					+ '-save">login</a> | '
					+ '<a class="btn btn-success" onclick ="register.form()">Register</a>'
					+ '</div>';
		} else if (this.httpUrl == './sales') {
			form += '</form>'
				+ '<div class="col-sm-10"  style="float:right">'
				+ '<a class="btn btn-success" id="'
				+ me.modelId
				+ '-save">Complete purchase</a> | '
				+ '<a class="btn btn-success" onclick ="register.form()">Register</a>'
				+ '</div>';
		} else
			form += '</form>' + '<div class="col-sm-10"  style="float:right">'
					+ '<a class="btn btn-success" id="' + me.modelId
					+ '-save">Save</a>' + '</div>';

		me.updateTarget(form);
		me.getEl(me.modelId + '-save').addEventListener("click", function() {
			me.validate();

			if (this.httpUrl == './login')
				me.login();

			if (this.httpUrl == './register')
				me.register();
		});

	},

	submitForm : function() {
		var me = this;
		if (me.Null == false && me.email == true && me.number == true) {
			var formValues = me.model.filter(function(el) {
				var formEl = me.getEl(el.id);
				if (!formEl)
					return;

				if (!formEl.value)
					return;

				el.value = formEl.value;

				return el;

			}).map(
					function(el) {
						return encodeURIComponent(el.name) + '='
								+ encodeURIComponent(el.value);
					}).join('&');

			me.ajaxRequest.call({
				httpMethod : 'POST',
				httpUrl : me.httpUrl,
				requestParams : formValues,
				responseTarget : me.responseTarget,
				updateTarget : function(resp) {
					if (this.httpUrl == './register') {
						var successUrl = "login.jsp";
						window.location.href = successUrl;
					} else
						me.init();
				}
			});
		}
	},
	loadForm : function(id) {
		var me = this;
		me.ajaxRequest.call({
			httpMethod : me.httpMethod,
			httpUrl : me.httpUrl + '/load?id=' + id,
			responseTarget : me.responseTarget,

			updateTarget : function(resp) {
				me.form();
				var result = JSON.parse(resp);
				me.model.forEach(function(el) {
					Object.keys(result).forEach(function(k) {
						if (el.name == k) {
							console.log(el.id + '=' + result[k]);
							me.getEl(el.id).value = result[k];
						}
					})
				})
			}
		});

	},
	removeRec : function(id) {
		var me = this;

		me.ajaxRequest.call({
			httpMethod : 'DELETE',
			httpUrl : me.httpUrl + '?id=' + id,
			responseTarget : me.responseTarget,
			updateTarget : function(resp) {
				me.init();
			}
		});

	},
	listView : function(id, tableUrl) {
		var me = this;
		var editId;
		var delId;
		var formload;
		console.log("this is passed: " + id);
		me.ajaxRequest
				.call({
					httpMethod : me.httpMethod,
					responseTarget : 'ajax-content',
					httpUrl : me.httpUrl + '/filter?id=' + id,

					responseTarget : me.responseTarget,

					updateTarget : function(resp) {
						var table = '<div class="card">';
						table += ' <div class="card-header">'
								+ " <h2>"
								+ me.title
								+ "<small>without any effort.</small></h2>"
								+ '<div style="float:right">'
								+ "<a id=\""
								+ formload
								+ "\"><span class=\"glyphicon glyphicon-plus\" aria-hidden=\"true\"></span></a>"
								+ '</div>'
								+ '</div>'
								+ ' <div class="table-responsive">'
								+ '<table id="data-table-basic" class="table table-striped">'
								+ '<thead>' + '<tr>';

						me.model.forEach(function(model) {
							table += '<th>' + model.label + '</th>';

						});

						table += '</tr>' + '</thead>';

						table += '<tbody>';

						var result = JSON.parse(resp);
						me.model
								.forEach(function(el) {
									Object.keys(result).forEach(function(k) {
											JSON.parse(resp).forEach(function(el) {

												table += '<tr>';

												me.model.forEach(function(model) {
													console.log("items: " + result[k]);
													
															table += '<td>'
																	+ result[k]
																	+ '</td>';
														});

												table += "<td>"
														+ "<a id=\""
														+ editId
														+ "\"><span class=\"glyphicon glyphicon-pencil\" aria-hidden=\"true\"></span></a> | "
														+ "<a id=\""
														+ delId
														+ "\"><span class=\"glyphicon glyphicon-trash\" aria-hidden=\"true\"></span></a>";
												table += "<td>"
														+ '</tr>';

											});
									})
								})
						table += '</tbody>'

						table += '</table></div></div>';

						if (me.getEl(me.responseTarget).innerHTML = table) {
							
							var jsonRecords = JSON.parse(resp);
							
							jsonRecords.forEach(function(el) {
								console.log("passed id: " + delId);
								
								editId = me.modelId + "-edit-" + el.id;
								delId = me.modelId + "-del-" + el.id;
								listId = me.modelId + "-list-" + el.id;

								me.getEl(editId).addEventListener('click',
										function() {
											me.loadForm(el.id);
										});

								me.getEl(delId).addEventListener('click',
										function() {
											me.removeRec(el.id);
										});

							});

							me.getEl(me.modelId + "-create-add-form")
									.addEventListener('click', function() {
										me.form();
									});
						}

					}
				});
	},

	tableStore : '',
	model : '',

	table : function(tableUrl) {
		var me = this;
		var editId;
		var delId;
		var list;
		var formload;

		me.ajaxRequest
				.call({
					httpMethod : 'GET',
					httpUrl : tableUrl,
					responseTarget : me.responseTarget,
					updateTarget : function(resp) {
						var table = '<div class="card">';
						table += ' <div class="card-header">'
								+ " <h2>"
								+ me.title
								+ "<small>without any effort.</small></h2>"
								+ '<div style="float:right">'
								+ "<a id=\""
								+ formload
								+ "\"><span class=\"glyphicon glyphicon-plus\" aria-hidden=\"true\"></span></a>"
								+ '</div>'
								+ '</div>'
								+ ' <div class="table-responsive">'
								+ '<table id="data-table-basic" class="table table-striped">'
								+ '<thead>' + '<tr>';

						me.model.forEach(function(model) {
							table += '<th>' + model.label + '</th>';

						});

						table += '</tr>' + '</thead>';

						table += '<tbody>';

						JSON
								.parse(resp)
								.forEach(
										function(el) {

											editId = me.modelId + "-edit-"
													+ el.id;
											delId = me.modelId + "-del-"
													+ el.id;
											listId = me.modelId + "-list-"
													+ el.id;

											table += '<tr>';
											console.log(el.id);
											me.model.forEach(function(model) {
												table += '<td>'
														+ el[model.name]
														+ '</td>';
											});
											table += "<td><a id=\""
													+ editId
													+ "\"><span class=\"glyphicon glyphicon-pencil\" aria-hidden=\"true\"></span></a> | <a id=\""
													+ delId
													+ "\"><span class=\"glyphicon glyphicon-trash\" aria-hidden=\"true\"></span></a>";

											if ((tableUrl == './category')
													|| (tableUrl == './product')) {
												table += " | <a id=\""
														+ listId
														+ "\"><span class=\"glyphicon glyphicon-align-justify\" aria-hidden=\"true\"></span></a></td>"
											}

											else {
												table += "</td>";
											}

											+'</tr>';

										});
						table += '</tbody>'

						table += '</table></div></div>';

						var jsonRecords = JSON.parse(resp);

						if (me.getEl(me.responseTarget).innerHTML = table) {
							jsonRecords.forEach(function(el) {

								console.log("passed id: " + delId);

								editId = me.modelId + "-edit-" + el.id;
								delId = me.modelId + "-del-" + el.id;
								listId = me.modelId + "-list-" + el.id;

								me.getEl(editId).addEventListener('click',
										function() {
											me.loadForm(el.id);
										});

								me.getEl(delId).addEventListener('click',
										function() {
											me.removeRec(el.id);
										});

								me.getEl(formload).addEventListener('click',
										function() {
											me.form();
										});

								me.getEl(listId).addEventListener(
										'click',
										function() {
											if (tableUrl == './category'){
												console.log(el.Cat_DeptId);
											
												me.listView(el.Cat_DeptId,tableUrl);
											}
												
											else{
												
												if(tableUrl == './product'){
													console.log(el.Prod_Name);
													me.listView(el.Id,tableUrl);
												}
											}
										
										});
								
							});

							me.getEl(me.modelId + "-create-add-form")
									.addEventListener('click', function() {
										me.form();
									});
						}
					}
				});
	},

	login : function() {
		var me = this;
		if (me.Null == false && me.email == true && me.number == true) {
			var typedEmail = document.getElementById("email").value;
			var typedPassword = document.getElementById("password").value;
			me.ajaxRequest
					.call({
						httpMethod : 'GET',
						httpUrl : './user',
						responseTarget : me.responseTarget,
						updateTarget : function(resp) {

							var jsonRecords = JSON.parse(resp);

							jsonRecords
									.forEach(function(el) {
										console.log(el);
										if (el.User_Email == typedEmail) {
											console
													.log(typedEmail
															+ " Already Exists.....checking password....");

											if (el.User_Password == typedPassword) {
												console.log("Status: "
														+ el.User_Status);

												if (el.User_Status == "Admin") {

													var successUrl = "index2.jsp";
													window.location.href = successUrl;

												} else {
													var successUrl = "index.jsp";
													window.location.href = successUrl;
												}
											} else
												console
														.log("Incorrect Password");

										} else {
											console.log(typedEmail
													+ " DOesnt Exists");
											document.getElementById("error").style.visibility = "visible";
										}

									});
						}
					})
		}
	},

	register : function() {
		var me = this;
		if (me.Null == false && me.email == true && me.number == true) {
			var password = document.getElementById("password").value;
			var confpass = document.getElementById("confirmpassword").value;

			if (password != confpass) {
				document.getElementById("error").style.visibility = "visible";
				var successUrl = "register.form()";
				window.location.href = successUrl;
			} else {
				var successUrl = "login.jsp";
				window.location.href = successUrl;
			}
		}
	},
	
	restockform: function(){
		var me = this;
		me.ajaxRequest.call({
			httpMethod : me.httpMethod,
			httpUrl : me.httpUrl + '/load?id=' + id,
			responseTarget : me.responseTarget,

			updateTarget : function(resp) {
				me.form();
				var result = JSON.parse(resp);
				me.model.forEach(function(el) {
					Object.keys(result).forEach(function(k) {
						if (el.name == k) {
							console.log(el.id + '=' + result[k]);
							me.getEl(el.id).value = result[k];
						}
					})
				})
			}
		});

	},

	restock : function() {
		var me = this;

		me.ajaxRequest
				.call({
					httpMethod : 'GET',
					httpUrl : './product',
					responseTarget : me.responseTarget,
					updateTarget : function(resp) {
						var table = '<div class="card">';
						table += ' <div class="card-header">'
								+ " <h2>"
								+ me.title
								+ "<small>without any effort.</small></h2>"
								+ '</div>'
								+ ' <div class="table-responsive">'
								+ '<table id="data-table-basic" class="table table-striped">'
								+ '<thead>' + '<tr>' + '<th>Id</th>'
								+ '<th>Name</th>' + '<th>Stock Available</th>';
						+'<th>Resock</th>' + '</tr>' + '</thead>';

						table += '<tbody>';
						table += '<tr>';

						var jsonRecords = JSON.parse(resp);

						jsonRecords
								.forEach(function(el) {

									var editId = el.id;
									var stock = el.StockLevel;
									var product = el.Prod_Name;
									table += '<td>' + editId + '</td>';
									table += '<td>' + product + '</td>';
									table += '<td>' + stock + '</td>';

									table += "<td>"
											+ "<a id=\""
											+ editId
											+ "\"><span class=\"glyphicon glyphicon-edit\" aria-hidden=\"true\"></span></a>"
											+ "</td>" + "</tr>"

									console.log("passed id in restock: " + editId); 
									console.log("passed StockLevel in restock: "+ stock);
								});

						table += '</tbody>'
						table += '</table></div></div>';

						me.getEl(me.responseTarget).innerHTML = table
					}
				})
	},

	init : function() {
		this.table(this.httpUrl);
	},

	init2 : function() {
		this.restock(this.httpUrl);
	},

	init3 : function() {
		this.form();
	}
};
