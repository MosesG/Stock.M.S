<!DOCTYPE html>
    <!--[if IE 9 ]><html class="ie9"><![endif]-->
    
<!-- Mirrored from byrushan.com/projects/mae/1-0/login.html by HTTrack Website Copier/3.x [XR&CO'2014], Mon, 18 Jul 2016 09:15:12 GMT -->
<head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>StockMan System</title>
        
        <!-- Vendor CSS -->
        <link href="vendors/bower_components/animate.css/animate.min.css" rel="stylesheet">
        <link href="vendors/bower_components/google-material-color/dist/palette.css" rel="stylesheet">
        <link href="vendors/bower_components/material-design-iconic-font/dist/css/material-design-iconic-font.min.css" rel="stylesheet">
            
        <!-- CSS -->
        <link href="css/app.min.1.css" rel="stylesheet">
        <link href="css/app.min.2.css" rel="stylesheet">
    </head>
 
    <body>
        <div class="login" data-lbg="teal">
            <!-- Login -->
            <div class="l-block toggled" id="l-login">
                <div class="lb-header palette-Teal bg">
                    <i class="zmdi zmdi-account-circle"></i>
                    welcome! please sign in.
                </div>

                <div class="lb-body">
                <span style="color:red; visibility:hidden; " id = "error">Incorrect login details!</span>
        		<div id = "login-form"></div>
        		
                </div>
            </div>

            <!-- Register -->
            <div class="l-block" id="l-register">
                <div class="lb-header palette-Blue bg">
                    <i class="zmdi zmdi-account-circle"></i>
                    Create an account
                </div>

                <div class="lb-body">
                <div id= "register-form"></div>
                
                <span style="color:red; visibility:hidden; " id = "error2">Password Mismatch!</span>
                    <div class="checkbox m-b-30">
                        <label>
                            <input type="checkbox" value="">
                            <i class="input-helper"></i>
                            Accept the license agreement
                        </label>
                    </div>
					
                    <button class="btn palette-Blue bg" onclick="user.save()">Create Account</button>

                    <div class="m-t-30">
                        <a data-block="#l-login" data-bg="teal" class="palette-Blue text d-block m-b-5" href="#">Already have an account?</a>
                        <a data-block="#l-forget-password" data-bg="purple" href="#" class="palette-Blue text">Forgot password?</a>
                    </div>
                </div>
            </div>

            <!-- Forgot Password -->
            <div class="l-block" id="l-forget-password">
                <div class="lb-header palette-Purple bg">
                    <i class="zmdi zmdi-account-circle"></i>
                    Forgot Password?
                </div>

                <div class="lb-body">
                    <p class="m-b-30">Lorem ipsum dolor fringilla enim feugiat commodo sed ac lacus.</p>

                    <div class="form-group fg-float">
                        <div class="fg-line">
                            <input type="text" class="input-sm form-control fg-input">
                            <label class="fg-label">Email Address</label>
                        </div>
                    </div>

                    <button class="btn palette-Purple bg">Create Account</button>

                    <div class="m-t-30">
                        <a data-block="#l-login" data-bg="teal" class="palette-Purple text d-block m-b-5" href="#">Already have an account?</a>
                        <a data-block="#l-register" data-bg="blue" href="#" class="palette-Purple text">Create an account</a>
                    </div>
                </div>
            </div>
        </div>

       

        <!-- Javascript Libraries -->
         <script src="js/myApp/base.app.js"></script>
          <script src="js/myApp/user.js"></script>
           <script src="js/myApp/login.js"></script>
          <script src="js/myApp/register.js"></script>
          <script src="js/myApp/purchase.js"></script>
         
          
        
        <script src="vendors/bower_components/jquery/dist/jquery.min.js"></script>
        <script src="vendors/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
        <script src="vendors/bower_components/Waves/dist/waves.min.js"></script>

        <!-- Placeholder for IE9 -->
        <!--[if IE 9 ]>
            <script src="vendors/bower_components/jquery-placeholder/jquery.placeholder.min.js"></script>
        <![endif]-->

        <script src="js/functions.js"></script>
        
    </body>

<!-- Mirrored from byrushan.com/projects/mae/1-0/login.html by HTTrack Website Copier/3.x [XR&CO'2014], Mon, 18 Jul 2016 09:15:12 GMT -->
</html>