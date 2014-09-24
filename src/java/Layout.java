/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Not-A
 */
public class Layout {
    
    public String header(String title){
    return "<!DOCTYPE html>"+"<html>"+"<head>"+"<link rel='stylesheet' type='text/css' href='./css/bootstrap.css'><script type=\"text/javascript\" src=\"//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js\"></script><script src=\"./js/bootstrap.js\"></script>"+
            "<title>" + title + "</title>"        
            +"</head><body>";
    }
    
    public String footer(){
        return "</body></html>";
    }
    public String containerOpen(){
    return "<div class='container' style='margin-top:30px;'>";
    }
    
    public String containerClose(){
    return "</div>";
    }
    
    public String navBar(){
        return "<nav class=\"navbar navbar-default navbar-fixed-top\" role=\"navigation\">\n" +
"  <div class=\"container\">\n" +
"      <!-- Brand and toggle get grouped for better mobile display -->\n" +
"    <div class=\"navbar-header\">\n" +
"      <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n" +
"        <span class=\"sr-only\">Toggle navigation</span>\n" +
"        <span class=\"icon-bar\"></span>\n" +
"        <span class=\"icon-bar\"></span>\n" +
"        <span class=\"icon-bar\"></span>\n" +
"      </button>\n" +
"      <a class=\"navbar-brand\" href=\"#\">Brand</a>\n" +
"    </div>\n" +
"\n" +
"    <!-- Collect the nav links, forms, and other content for toggling -->\n" +
"    <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n" +
"      <ul class=\"nav navbar-nav\">\n" +
"           <li class=\"active\"><a href=\"./Catalogue\">Catalogue</a></li>\n" +

"        <li class=\"dropdown\">\n" +
"          <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Dropdown <span class=\"caret\"></span></a>\n" +
"          <ul class=\"dropdown-menu\" role=\"menu\">\n" +
"            <li><a href=\"#\">Action</a></li>\n" +
"            <li><a href=\"#\">Another action</a></li>\n" +
"            <li><a href=\"#\">Something else here</a></li>\n" +
"            <li class=\"divider\"></li>\n" +
"            <li><a href=\"#\">Separated link</a></li>\n" +
"            <li class=\"divider\"></li>\n" +
"            <li><a href=\"#\">One more separated link</a></li>\n" +
"          </ul>\n" +
"        </li>\n" +
"      </ul>\n" +
"      <ul class=\"nav navbar-nav navbar-right\">\n" +
"        <li><a href=\"./Login\">Login</a></li>\n" +
"        <li><a href=\"./Registration\">Register</a></li>\n" +
"        \n" +
"      </ul>"+
"    </div>"+
"  </div>\n" +
"</nav>";      
    }
}
