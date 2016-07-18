<<<<<<< HEAD
<!DOCTYPE html>
<!--[if IE 9 ]><html class="ie9"><![endif]-->
    
<!-- Mirrored from byrushan.com/projects/mae/1-0/index.html by HTTrack Website Copier/3.x [XR&CO'2014], Mon, 18 Jul 2016 09:10:36 GMT -->
<head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Material Admin</title>
        
        
        <!-- Vendor CSS -->
        <link href="vendors/bower_components/fullcalendar/dist/fullcalendar.min.css" rel="stylesheet">
        <link href="vendors/bower_components/animate.css/animate.min.css" rel="stylesheet">
        <link href="vendors/bower_components/material-design-iconic-font/dist/css/material-design-iconic-font.min.css" rel="stylesheet">
        <link href="vendors/bower_components/malihu-custom-scrollbar-plugin/jquery.mCustomScrollbar.min.css" rel="stylesheet">        
        <link href="vendors/bower_components/google-material-color/dist/palette.css" rel="stylesheet">

       
        <!-- CSS -->
        <link href="css/app.min.1.css" rel="stylesheet">
        <link href="css/app.min.2.css" rel="stylesheet"> 
        
    </head>
    <body data-ma-header="teal">
        <header id="header" class="media">
            <div class="pull-left h-logo">
                <a href="index.html" class="hidden-xs">
                    Material   
                    <small>admin extended</small>
                </a>
                
                <div class="menu-collapse" data-ma-action="sidebar-open" data-ma-target="main-menu">
                    <div class="mc-wrap">
                        <div class="mcw-line top palette-White bg"></div>
                        <div class="mcw-line center palette-White bg"></div>
                        <div class="mcw-line bottom palette-White bg"></div>
                    </div>
                </div>
            </div>

            <ul class="pull-right h-menu">
                <li class="hm-search-trigger">
                    <a href="#" data-ma-action="search-open">
                        <i class="hm-icon zmdi zmdi-search"></i>
                    </a>
                </li>
                
                <li class="dropdown hidden-xs hidden-sm h-apps">
                    <a data-toggle="dropdown" href="#">
                        <i class="hm-icon zmdi zmdi-apps"></i>
                    </a>
                    <ul class="dropdown-menu pull-right">
                        <li>
                            <a href="#">
                                <i class="palette-Red-400 bg zmdi zmdi-calendar"></i>
                                <small>Calendar</small>
                            </a>
                        </li>
                        
                        <li>
                            <a href="#">
                                <i class="palette-Green-400 bg zmdi zmdi-file-text"></i>
                                <small>Files</small>
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                <i class="palette-Light-Blue bg zmdi zmdi-email"></i>
                                <small>Mail</small>
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                <i class="palette-Orange-400 bg zmdi zmdi-trending-up"></i>
                                <small>Analytics</small>
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                <i class="palette-Purple-300 bg zmdi zmdi-view-headline"></i>
                                <small>News</small>
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                <i class="palette-Blue-Grey bg zmdi zmdi-image"></i>
                                <small>Gallery</small>
                            </a>
                        </li>
                    </ul>
                </li>
                <li class="dropdown hidden-xs">
                    <a data-toggle="dropdown" href="#"><i class="hm-icon zmdi zmdi-more-vert"></i></a>
                    <ul class="dropdown-menu dm-icon pull-right">
                        <li class="hidden-xs">
                            <a data-action="fullscreen" href="#"><i class="zmdi zmdi-fullscreen"></i> Toggle Fullscreen</a>
                        </li>
                        <li>
                            <a data-action="clear-localstorage" href="#"><i class="zmdi zmdi-delete"></i> Clear Local Storage</a>
                        </li>
                        <li>
                            <a href="#"><i class="zmdi zmdi-face"></i> Privacy Settings</a>
                        </li>
                        <li>
                            <a href="#"><i class="zmdi zmdi-settings"></i> Other Settings</a>
                        </li>
                    </ul>
                </li>
                <li class="hm-alerts" data-user-alert="sua-messages" data-ma-action="sidebar-open" data-ma-target="user-alerts">
                    <a href="#"><i class="hm-icon zmdi zmdi-notifications"></i></a>
                </li>
                <li class="dropdown hm-profile">
                    <a data-toggle="dropdown" href="#">
                        <img src="img/profile-pics/1.jpg" alt="">
                    </a>
                    
                    <ul class="dropdown-menu pull-right dm-icon">
                        <li>
                            <a href="profile-about.html"><i class="zmdi zmdi-account"></i> View Profile</a>
                        </li>
                        <li>
                            <a href="#"><i class="zmdi zmdi-input-antenna"></i> Privacy Settings</a>
                        </li>
                        <li>
                            <a href="#"><i class="zmdi zmdi-settings"></i> Settings</a>
                        </li>
                        <li>
                            <a href="#"><i class="zmdi zmdi-time-restore"></i> Logout</a>
                        </li>
                    </ul>
                </li>
            </ul>
            
            <div class="media-body h-search">
                <form class="p-relative">
                    <input type="text" class="hs-input" placeholder="Search ">
                    <i class="zmdi zmdi-search hs-reset" data-ma-action="search-clear"></i>
                </form>
            </div>
            
        </header>

        <section id="main">
            <aside id="s-user-alerts" class="sidebar">
                <ul class="tab-nav tn-justified tn-icon m-t-10" data-tab-color="teal">
                    <li><a class="sua-messages" href="#sua-messages" data-toggle="tab"><i class="zmdi zmdi-email"></i></a></li>
                    <li><a class="sua-notifications" href="#sua-notifications" data-toggle="tab"><i class="zmdi zmdi-notifications"></i></a></li>
                    <li><a class="sua-tasks" href="#sua-tasks" data-toggle="tab"><i class="zmdi zmdi-view-list-alt"></i></a></li>
                </ul>

                <div class="tab-content">
                    <div class="tab-pane fade" id="sua-messages">
                        <ul class="sua-menu list-inline list-unstyled palette-Light-Blue bg">
                            <li><a href="#"><i class="zmdi zmdi-check-all"></i> Mark all</a></li>
                            <li><a href="#"><i class="zmdi zmdi-long-arrow-tab"></i> View all</a></li>
                            <li><a href="#" data-ma-action="sidebar-close"><i class="zmdi zmdi-close"></i> Close</a></li>
                        </ul>

                        <div class="list-group lg-alt c-overflow">
                            <a href="#" class="list-group-item media">
                                <div class="pull-left">
                                    <img class="avatar-img" src="img/profile-pics/1.jpg" alt="">
                                </div>

                                <div class="media-body">
                                    <div class="lgi-heading">David Villa Jacobs</div>
                                    <small class="lgi-text">Sorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam mattis lobortis sapien non posuere</small>
                                </div>
                            </a>

                            <a href="#" class="list-group-item media">
                                <div class="pull-left">
                                    <img class="avatar-img" src="img/profile-pics/5.jpg" alt="">
                                </div>
                                <div class="media-body">
                                    <div class="lgi-heading">Candice Barnes</div>
                                    <small class="lgi-text">Quisque non tortor ultricies, posuere elit id, lacinia purus curabitur.</small>
                                </div>
                            </a>

                            <a href="#" class="list-group-item media">
                                <div class="pull-left">
                                    <img class="avatar-img" src="img/profile-pics/3.jpg" alt="">
                                </div>
                                <div class="media-body">
                                    <div class="lgi-heading">Jeannette Lawson</div>
                                    <small class="lgi-text">Donec congue tempus ligula, varius hendrerit mi hendrerit sit amet. Duis ac quam sit amet leo feugiat iaculis</small>
                                </div>
                            </a>

                            <a href="#" class="list-group-item media">
                                <div class="pull-left">
                                    <img class="avatar-img" src="img/profile-pics/4.jpg" alt="">
                                </div>
                                <div class="media-body">
                                    <div class="lgi-heading">Darla Mckinney</div>
                                    <small class="lgi-text">Duis tincidunt augue nec sem dignissim scelerisque. Vestibulum rhoncus sapien sed nulla aliquam lacinia</small>
                                </div>
                            </a>

                            <a href="#" class="list-group-item media">
                                <div class="pull-left">
                                    <img class="avatar-img" src="img/profile-pics/2.jpg" alt="">
                                </div>
                                <div class="media-body">
                                    <div class="lgi-heading">Rudolph Perez</div>
                                    <small class="lgi-text">Phasellus a ullamcorper lectus, sit amet viverra quam. In luctus tortor vel nulla pharetra bibendum</small>
                                </div>
                            </a>
                        </div>

                        <a href="#" class="btn btn-float btn-danger m-btn">
                            <i class="zmdi zmdi-plus"></i>
                        </a>
                    </div>
                    <div class="tab-pane fade" id="sua-notifications">
                        <ul class="sua-menu list-inline list-unstyled palette-Orange bg">
                            <li><a href="#"><i class="zmdi zmdi-volume-off"></i> Mute</a></li>
                            <li><a href="#"><i class="zmdi zmdi-long-arrow-tab"></i> View all</a></li>
                            <li><a href="#" data-ma-action="sidebar-close"><i class="zmdi zmdi-close"></i> Close</a></li>
                        </ul>

                        <div class="list-group lg-alt c-overflow">
                            <a href="#" class="list-group-item media">
                                <div class="pull-left">
                                    <img class="avatar-img" src="img/profile-pics/1.jpg" alt="">
                                </div>

                                <div class="media-body">
                                    <div class="lgi-heading">David Villa Jacobs</div>
                                    <small class="lgi-text">Sorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam mattis lobortis sapien non posuere</small>
                                </div>
                            </a>

                            <a href="#" class="list-group-item media">
                                <div class="pull-left">
                                    <img class="avatar-img" src="img/profile-pics/5.jpg" alt="">
                                </div>
                                <div class="media-body">
                                    <div class="lgi-heading">Candice Barnes</div>
                                    <small class="lgi-text">Quisque non tortor ultricies, posuere elit id, lacinia purus curabitur.</small>
                                </div>
                            </a>

                            <a href="#" class="list-group-item media">
                                <div class="pull-left">
                                    <img class="avatar-img" src="img/profile-pics/3.jpg" alt="">
                                </div>
                                <div class="media-body">
                                    <div class="lgi-heading">Jeannette Lawson</div>
                                    <small class="lgi-text">Donec congue tempus ligula, varius hendrerit mi hendrerit sit amet. Duis ac quam sit amet leo feugiat iaculis</small>
                                </div>
                            </a>

                            <a href="#" class="list-group-item media">
                                <div class="pull-left">
                                    <img class="avatar-img" src="img/profile-pics/4.jpg" alt="">
                                </div>
                                <div class="media-body">
                                    <div class="lgi-heading">Darla Mckinney</div>
                                    <small class="lgi-text">Duis tincidunt augue nec sem dignissim scelerisque. Vestibulum rhoncus sapien sed nulla aliquam lacinia</small>
                                </div>
                            </a>

                            <a href="#" class="list-group-item media">
                                <div class="pull-left">
                                    <img class="avatar-img" src="img/profile-pics/2.jpg" alt="">
                                </div>
                                <div class="media-body">
                                    <div class="lgi-heading">Rudolph Perez</div>
                                    <small class="lgi-text">Phasellus a ullamcorper lectus, sit amet viverra quam. In luctus tortor vel nulla pharetra bibendum</small>
                                </div>
                            </a>
                        </div>
                    </div>
                    <div class="tab-pane fade" id="sua-tasks">
                        <ul class="sua-menu list-inline list-unstyled palette-Green-400 bg">
                            <li><a href="#"><i class="zmdi zmdi-time"></i> Archived</a></li>
                            <li><a href="#"><i class="zmdi zmdi-check-all"></i> Mark all</a></li>
                            <li><a href="#" data-ma-action="sidebar-close"><i class="zmdi zmdi-close"></i> Close</a></li>
                        </ul>

                        <div class="list-group lg-alt c-overflow">
                            <div class="list-group-item">
                                <div class="lgi-heading m-b-5">HTML5 Validation Report</div>

                                <div class="progress">
                                    <div class="progress-bar" role="progressbar" aria-valuenow="95" aria-valuemin="0" aria-valuemax="100" style="width: 95%">
                                        <span class="sr-only">95% Complete (success)</span>
                                    </div>
                                </div>
                            </div>
                            <div class="list-group-item">
                                <div class="lgi-heading m-b-5">Google Chrome Extension</div>

                                <div class="progress">
                                    <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="80" aria-valuemin="0" aria-valuemax="100" style="width: 80%">
                                        <span class="sr-only">80% Complete (success)</span>
                                    </div>
                                </div>
                            </div>
                            <div class="list-group-item">
                                <div class="lgi-heading m-b-5">Social Intranet Projects</div>

                                <div class="progress">
                                    <div class="progress-bar progress-bar-info" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100" style="width: 20%">
                                        <span class="sr-only">20% Complete</span>
                                    </div>
                                </div>
                            </div>
                            <div class="list-group-item">
                                <div class="lgi-heading m-b-5">Bootstrap Admin Template</div>

                                <div class="progress">
                                    <div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%">
                                        <span class="sr-only">60% Complete (warning)</span>
                                    </div>
                                </div>
                            </div>
                            <div class="list-group-item">
                                <div class="lgi-heading m-b-5">Youtube Client App</div>

                                <div class="progress">
                                    <div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="80" aria-valuemin="0" aria-valuemax="100" style="width: 80%">
                                        <span class="sr-only">80% Complete (danger)</span>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <a href="#" class="btn btn-float btn-danger m-btn">
                            <i class="zmdi zmdi-plus"></i>
                        </a>
                    </div>
                </div>
            </aside>

            <aside id="s-main-menu" class="sidebar">
                <div class="smm-header">
                    <i class="zmdi zmdi-long-arrow-left" data-ma-action="sidebar-close"></i>
                </div>

                <ul class="smm-alerts">
                    <li class="active" data-user-alert="sua-messages" data-ma-action="sidebar-open" data-ma-target="user-alerts">
                        <i class="zmdi zmdi-email"></i>
                    </li>
                    <li data-user-alert="sua-notifications" data-ma-action="sidebar-open" data-ma-target="user-alerts">
                        <i class="zmdi zmdi-notifications"></i>
                    </li>
                    <li data-user-alert="sua-tasks" data-ma-action="sidebar-open" data-ma-target="user-alerts">
                        <i class="zmdi zmdi-view-list-alt"></i>
                    </li>
                </ul>

                <ul class="main-menu">
                    <li class="active">
                        <a href="index.html"><i class="zmdi zmdi-home"></i> Home</a>
                    </li>
                    <li class="sub-menu">
                        <a href="#" data-ma-action="submenu-toggle"><i class="zmdi zmdi-view-compact"></i> Accounts</a>
                    </li>
                    <li><a href="typography.html"><i class="zmdi zmdi-format-underlined"></i> Sales</a>
                    	<ul>
                            <li><a href="photos.html">Cash</a></li>
                            <li><a href="photo-timeline.html">Cheques</a></li>
                        </ul>
                    </li>
                    <li><a href="widgets.html"><i class="zmdi zmdi-widgets"></i> Stock</a></li>
                    <li class="sub-menu">
                        <a href="#" data-ma-action="submenu-toggle"><i class="zmdi zmdi-view-list"></i>Products</a>
                    </li>
                    <li class="sub-menu">
                        <a href="#" data-ma-action="submenu-toggle"><i class="zmdi zmdi-collection-text"></i>Restock Orders</a>
                    </li>
                    <li class="sub-menu">
                        <a href="#" data-ma-action="submenu-toggle"><i class="zmdi zmdi-swap-alt"></i>Receipt</a>
                    </li>
                    <li class="sub-menu">
                        <a href="#" data-ma-action="submenu-toggle"><i class="zmdi zmdi-swap-alt"></i>Reports</a>
                    </li>
                    <li class="sub-menu">
                        <a href="#" data-ma-action="submenu-toggle"><i class="zmdi zmdi-swap-alt"></i>Stuff</a>
                    </li>
                </ul>
            </aside>

            <section id="content">
                <div class="container">
                    <div class="card">
                        <div class="card-header">
                            <h2>Striped rows <small>Add zebra-striping to any table row within the tbody</small></h2>
                        </div>

                        <div class="table-responsive">
                            <table class="table table-striped">
                                <thead>
                                    <tr>
                                        <th>#</th>
                                        <th>First Name</th>
                                        <th>Last Name</th>
                                        <th>Username</th>
                                        <th>Nickname</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td>1</td>
                                        <td>Alexandra</td>
                                        <td>Christopher</td>
                                        <td>@makinton</td>
                                        <td>Ducky</td>
                                    </tr>
                                    <tr>
                                        <td>2</td>
                                        <td>Madeleine</td>
                                        <td>Hollaway</td>
                                        <td>@hollway</td>
                                        <td>Cheese</td>
                                    </tr>
                                    <tr>
                                        <td>3</td>
                                        <td>Sebastian</td>
                                        <td>Johnston</td>
                                        <td>@sebastian</td>
                                        <td>Jaycee</td>
                                    </tr>
                                    <tr>
                                        <td>4</td>
                                     

  <td>Mitchell</td>
                                        <td>Christin</td>
                                        <td>@mitchell4u</td>
                                        <td>AdskiDeAnus</td>
                                    </tr>
                                    <tr>
                                        <td>5</td>
                                        <td>Elizabeth</td>
                                        <td>Belkitt</td>
                                        <td>@belkitt</td>
                                        <td>Goat</td>
                                    </tr>
                                    <tr>

 <td>6</td>
                                        <td>Benjamin</td>
                                        <td>Parnell</td>
                                        <td>@wayne234</td>
                                        <td>Pokie</td>
                                    </tr>
                                    <tr>
                                        <td>7</td>
                                        <td>Katherine</td>
                                        <td>Buckland</td>
                                        <td>@anitabelle</td>
                                        <td>Wokie</td>
                                    </tr>
                                    <tr>
                                        <td>8</td>
                                        <td>Nicholas</td>
                                        <td>W

  <td>@mwalmart</td>
                                        <td>Spike</td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                    
                    
                </div>
            </section>

            <footer id="footer">
                Copyright &copy; 2015 Material Admin

                <ul class="f-menu">
                    <li><a href="#">Home</a></li>
                    <li><a href="#">Dashboard</a></li>
                    <li><a href="#">Reports</a></li>
                    <li><a href="#">Support</a></li>
                    <li><a href="#">Contact</a></li>
                </ul>
            </footer>

        </section>

        <!-- Page Loader -->
        <div class="page-loader palette-Teal bg">
            <div class="preloader pl-xl pls-white">
                <svg class="pl-circular" viewBox="25 25 50 50">
                    <circle class="plc-path" cx="50" cy="50" r="20"/>
                </svg>
            </div>
        </div>
        
        <!-- Older IE warning message -->
        <!--[if lt IE 9]>
            <div class="ie-warning">
                <h1 class="c-white">Warning!!</h1>
                <p>You are using an outdated version of Internet Explorer, please upgrade <br/>to any of the following web browsers to access this website.</p>
                <div class="iew-container">
                    <ul class="iew-download">
                        <li>
                            <a href="http://www.google.com/chrome/">
                                <img src="img/browsers/chrome.png" alt="">
                                <div>Chrome</div>
                            </a>
                        </li>
                        <li>
                            <a href="https://www.mozilla.org/en-US/firefox/new/">
                                <img src="img/browsers/firefox.png" alt="">
                                <div>Firefox</div>
                            </a>
                        </li>
                        <li>
                            <a href="http://www.opera.com">
                                <img src="img/browsers/opera.png" alt="">
                                <div>Opera</div>
                            </a>
                        </li>
                        <li>
                            <a href="https://www.apple.com/safari/">
                                <img src="img/browsers/safari.png" alt="">
                                <div>Safari</div>
                            </a>
                        </li>
                        <li>
                            <a href="http://windows.microsoft.com/en-us/internet-explorer/download-ie">
                                <img src="img/browsers/ie.png" alt="">
                                <div>IE (New)</div>
                            </a>
                        </li>
                    </ul>
                </div>
                <p>Sorry for the inconvenience!</p>
            </div>   
        <![endif]-->

         <!-- Javascript Libraries -->
        <script src="vendors/bower_components/jquery/dist/jquery.min.js"></script>
        <script src="vendors/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
        <script src="vendors/bower_components/malihu-custom-scrollbar-plugin/jquery.mCustomScrollbar.concat.min.js"></script>
        <script src="vendors/bower_components/Waves/dist/waves.min.js"></script>
        <script src="vendors/bootstrap-growl/bootstrap-growl.min.js"></script>
        <script src="vendors/bower_components/moment/min/moment.min.js"></script>
        <script src="vendors/bower_components/fullcalendar/dist/fullcalendar.min.js"></script>
        <script src="vendors/bower_components/simpleWeather/jquery.simpleWeather.min.js"></script>
        <script src="vendors/bower_components/salvattore/dist/salvattore.min.js"></script>

        <script src="vendors/bower_components/flot/jquery.flot.js"></script>
        <script src="vendors/bower_components/flot/jquery.flot.resize.js"></script>
        <script src="vendors/bower_components/flot.curvedlines/curvedLines.js"></script>
        <script src="vendors/sparklines/jquery.sparkline.min.js"></script>
        <script src="vendors/bower_components/jquery.easy-pie-chart/dist/jquery.easypiechart.min.js"></script>
        <script src="js/flot-charts/curved-line-chart.js"></script>
        <script src="js/flot-charts/line-chart.js"></script>

        <!-- Placeholder for IE9 -->
        <!--[if IE 9 ]>
        <script src="vendors/bower_components/jquery-placeholder/jquery.placeholder.min.js"></script>
        <![endif]-->

        <script src="js/charts.js"></script>

        <script src="js/functions.js"></script>
        <script src="js/actions.js"></script>
        <script src="js/demo.js"></script>

    </body>
  
<!-- Mirrored from byrushan.com/projects/mae/1-0/index.html by HTTrack Website Copier/3.x [XR&CO'2014], Mon, 18 Jul 2016 09:11:51 GMT -->
=======
<html lang="en">

<head>

	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="">
	<meta name="author" content="">
	
	<title>Welcome to TripTicket</title>
	
	<!-- Bootstrap Core CSS -->
	<link href="css/bootstrap.min.css" rel="stylesheet">
	<link href="css/custom.css" rel="stylesheet">

	<!-- Custom CSS -->
	<link href="css/shop-item.css" rel="stylesheet">
	<link href="css/datepicker3.min.css" rel="stylesheet">
</head>

<body>

    <!-- Navigation -->
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">TripTicket</a>
            </div>
        </div>
        <!-- /.container -->
    </nav>

    <!-- Page Content -->
    <div class="container">

        <div class="row">

            <div class="col-md-3">
                <div class="list-group">
                    <a href="#" class="list-group-item active" onclick="company.init()">Companies</a>
                    <a href="#" class="list-group-item " onclick="triplocation.init()">Locations</a>
                    <a href="#" class="list-group-item" onclick="route.init()">Routes</a>
                    <a href="#" class="list-group-item" onclick="ticket.init()">Ticket</a>
                    <a href="#" class="list-group-item  glyphicon glyphicon-user" onclick="passenger.init()"> Passenger</a>
                    <a href="#" class="list-group-item " onclick="vehicle.list()">Vehicle</a>
					<a href="#" class="list-group-item " onclick="person.list()">Persons</a>
                   	<a href="#" class="list-group-item " onclick="trip.init()">Trip</a>
 					<a href="#" class="list-group-item " onclick="vehicle.init()">Vehicle</a>
                    <a href="#" class="list-group-item " onclick="parcel.init()">Parcel</a>


                </div>
                 
            </div>

            <div class="col-md-9">
            
                <div class="well" id="ajax-content">

                </div>

            </div>

        </div>

    </div>
    <!-- /.container -->

    <div class="container">

        <hr>

        <!-- Footer -->
        <footer>
            <div class="row">
                <div class="col-lg-12">
                    <p>Copyright &copy; 2016</p>
                </div>
            </div>
        </footer>

    </div>
    <!-- /.container -->

	<script src="js/app/base.app.js"></script>
    <script src="js/app/company.js"></script>
    <script src="js/app/ticket.js"></script>
    <script src="js/app/location.js"></script>
    <script src="js/app/vehicle.js"></script>
    <script src="js/app/route.js"></script>
    <script src="js/app/trip.js"></script>
    <script src="js/app/passenger.js"></script>


    <script src="js/app/person.js"></script>

    <script src="js/app/parcel.js"></script>


    <script src="js/app/person.js"></script>

    <script src="js/app/parcel.js"></script>

    
    <!-- jQuery -->
    <script src="js/jquery-1.10.2.min.js"></script>
    <script src="js/bootstrap-datepicker.min.js"></script>
    
	
	
    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>
    
    
    <script>
		$(document).ready(function(){
			var date_input=$('input[name="dateofpayment"]'); //our date input has the name "date"
			var container=$('.bootstrap-iso form').length>0 ? $('.bootstrap-iso form').parent() : "body";
			date_input.datepicker({
				format: 'yyyy-mm-dd',
				container: container,
				todayHighlight: true,
				autoclose: true,
			})
		})
	</script>
	
	<script>
		$(document).ready(function(){
			var date_input=$('input[name="travelDate"]'); //our date input has the name "date"
			var container=$('.bootstrap-iso form').length>0 ? $('.bootstrap-iso form').parent() : "body";
			date_input.datepicker({
				format: 'yyyy-mm-dd',
				container: container,
				todayHighlight: true,
				autoclose: true,
			})
		})
	</script>

</body>

>>>>>>> 007d43724d8fb8746c06069fa1b094eea7e84941
</html>
