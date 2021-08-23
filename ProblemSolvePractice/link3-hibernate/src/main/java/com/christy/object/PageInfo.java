package com.christy.object;

public class PageInfo {
	private String name;
	private String email;
	private String gender;
	private String country;
	
	private String top = "<!doctype html>\r\n"
			+ "<html lang=\"en\">\r\n"
			+ "  <head>\r\n"
			+ "    <!-- Required meta tags -->\r\n"
			+ "    <meta charset=\"utf-8\">\r\n"
			+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n"
			+ "\r\n"
			+ "    <!-- Bootstrap CSS -->\r\n"
			+ "    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css\" integrity=\"sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l\" crossorigin=\"anonymous\">\r\n"
			+ "    <!-- Heading Font -->";
	public String getTop() {
		return top;
	}
	
	private String addNav = "<style>\r\n"
			+ "    @import url('https://fonts.googleapis.com/css2?family=Playfair+Display:ital@1&display=swap');\r\n"
			+ "    \r\n"
			+ "        body{\r\n"
			+ "            \r\n"
			+ "            font-family: 'Times New Roman', Times, serif;\r\n"
			+ "            color: white;\r\n"
			+ "            \r\n"
			+ "        }\r\n"
			+ "        h1{\r\n"
			+ "            font-family: 'Playfair Display', serif, bold;\r\n"
			+ "                font-size: 72pt;\r\n"
			+ "                color: white;\r\n"
			+ "                text-align: center;\r\n"
			+ "                padding-bottom: 10px;\r\n"
			+ "    \r\n"
			+ "        }\r\n"
			+ "        h2{\r\n"
			+ "            font-family: 'Playfair Display', serif, bold;\r\n"
			+ "                font-size: 55pt;\r\n"
			+ "                color: white;\r\n"
			+ "                text-align: center;\r\n"
			+ "                padding-bottom: 10px;\r\n"
			+ "    \r\n"
			+ "        }\r\n"
			+ "        p{\r\n"
			+ "            text-align: center;\r\n"
			+ "        }\r\n"
			+ "        \r\n"
			+ "        </style>\r\n"
			+ "      </head>\r\n"
			+ "      <body>\r\n"
			+ "          <div style=\"background-color: rgb(141, 207, 207); min-height: 800px;\">\r\n"
			+ "          \r\n"
			+ "        <nav class=\"navbar navbar-expand-lg navbar-dark bg-info\" style=\"font-weight: bold;\">\r\n"
			+ "            \r\n"
			+ "            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n"
			+ "              <span class=\"navbar-toggler-icon\"></span>\r\n"
			+ "            </button>\r\n"
			+ "            <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\r\n"
			+ "              <ul class=\"navbar-nav\">\r\n"
			+ "                <li class=\"nav-item\">\r\n"
			+ "                  <a class=\"nav-link\" href=\"home.html\">Home</a>\r\n"
			+ "                </li>\r\n"
			+ "                <li class=\"nav-item\">\r\n"
			+ "                  <a class=\"nav-link\" href=\"addEmployee.html\">Add</a>\r\n"
			+ "                </li>\r\n"
			+ "             \r\n"
			+ "                \r\n"
			+ "              </ul>\r\n"
			+ "            </div>\r\n"
			+ "          </nav>";
	public String getAddNav() {
		return addNav;
	}

	private String viewNav = "<style>\r\n"
			+ "    @import url('https://fonts.googleapis.com/css2?family=Playfair+Display:ital@1&display=swap');\r\n"
			+ "    \r\n"
			+ "        body{\r\n"
			+ "            \r\n"
			+ "            font-family: 'Times New Roman', Times, serif;\r\n"
			+ "            color: white;\r\n"
			+ "            \r\n"
			+ "        }\r\n"
			+ "        h1{\r\n"
			+ "            font-family: 'Playfair Display', serif, bold;\r\n"
			+ "                font-size: 72pt;\r\n"
			+ "                color: white;\r\n"
			+ "                text-align: center;\r\n"
			+ "                padding-bottom: 10px;\r\n"
			+ "    \r\n"
			+ "        }\r\n"
			+ "        h2{\r\n"
			+ "            font-family: 'Playfair Display', serif, bold;\r\n"
			+ "                font-size: 55pt;\r\n"
			+ "                color: white;\r\n"
			+ "                text-align: center;\r\n"
			+ "                padding-bottom: 10px;\r\n"
			+ "    \r\n"
			+ "        }\r\n"
			+ "        p{\r\n"
			+ "            text-align: center;\r\n"
			+ "        }\r\n"
			+ "        \r\n"
			+ "        </style>\r\n"
			+ "      </head>\r\n"
			+ "      <body>\r\n"
			+ "          <div style=\"background-color: rgb(141, 207, 207); min-height: 800px;\">\r\n"
			+ "          \r\n"
			+ "        <nav class=\"navbar navbar-expand-lg navbar-dark bg-info\" style=\"font-weight: bold;\">\r\n"
			+ "            \r\n"
			+ "            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n"
			+ "              <span class=\"navbar-toggler-icon\"></span>\r\n"
			+ "            </button>\r\n"
			+ "            <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\r\n"
			+ "              <ul class=\"navbar-nav\">\r\n"
			+ "                <li class=\"nav-item\">\r\n"
			+ "                  <a class=\"nav-link\" href=\"home.html\">Home</a>\r\n"
			+ "                </li>\r\n"
			+ "                <li class=\"nav-item\">\r\n"
			+ "                  <a class=\"nav-link\" href=\"View\">View</a>\r\n"
			+ "                </li>\r\n"
			+ "             \r\n"
			+ "                \r\n"
			+ "              </ul>\r\n"
			+ "            </div>\r\n"
			+ "          </nav>";
	public String getViewNav () {
		return viewNav;
	}
	
	private String viewTableTop = "<section>\r\n"
			+ "    <br>\r\n"
			+ "   <br>\r\n"
			+ "   <div style=\"margin: 0 auto; width: 600px;\" class=\"border border-white\">\r\n"
			+ "    <form method=\"post\">\r\n"
			+ "   <table class=\"table table-striped \">\r\n"
			+ "      <thead class= \" table-dark bg-info\">\r\n"
			+ "        <tr>\r\n"
			+ "          <th scope=\"col\">ID</th>\r\n"
			+ "          <th scope=\"col\">Name</th>\r\n"
			+ "          <th scope=\"col\">Email</th>\r\n"
			+ "          <th scope=\"col\">Gender</th>\r\n"
			+ "          <th scope=\"col\">Country</th>\r\n"
			+ "          <th scope=\"col\">Select</th>\r\n"
			+ "        </tr>\r\n"
			+ "      </thead>\r\n"
			+ "      <tbody>";
	public String getViewTableTop() {
		return viewTableTop;
	}
	
	private String viewTableBottom = "<div>\r\n"
			+ "    <button type=\"submit\" formaction=\"Update\">Update</button>\r\n"
			+ "    <button type=\"submit\" formaction=\"Delete\">Delete</button>\r\n"
			+ "</div>\r\n"
			+ "</tbody>\r\n"
			+ "</table>\r\n"
			+ "</div>\r\n"
			+ "</section>";
	public String getViewTableBottom() {
		return viewTableBottom;
	}
	
	private String updateBottom = "<div>\r\n"
			+ "    <button type=\"submit\" formaction=\"UpdateConfirm\">Update</button>\r\n"
			+ "</div>\r\n"
			+ "</tbody>\r\n"
			+ "</table>\r\n"
			+ "</div>\r\n"
			+ "</section>";
	public String getUpdateBottom() {
		return updateBottom;
	}

	private String deleteBottom = "<div>\r\n"
			+ "    <button type=\"submit\" formaction=\"DeleteConfirm\">Delete</button>\r\n"
			+ "</div>\r\n"
			+ "</tbody>\r\n"
			+ "</table>\r\n"
			+ "</div>\r\n"
			+ "</s";
	public String getDeleteBottom() {
		return deleteBottom;
	}

	private String bottom = "</div>\r\n"
			+ "\r\n"
			+ "<!-- Optional JavaScript; choose one of the two! -->\r\n"
			+ "\r\n"
			+ "<!-- Option 1: jQuery and Bootstrap Bundle (includes Popper) -->\r\n"
			+ "<script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\r\n"
			+ "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns\" crossorigin=\"anonymous\"></script>\r\n"
			+ "\r\n"
			+ "<!-- Option 2: Separate Popper and Bootstrap JS -->\r\n"
			+ "<!--\r\n"
			+ "<script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\r\n"
			+ "<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\" integrity=\"sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN\" crossorigin=\"anonymous\"></script>\r\n"
			+ "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.min.js\" integrity=\"sha384-+YQ4JLhjyBLPDQt//I+STsc9iw4uQqACwlvpslubQzn4u2UU2UFM80nGisd026JF\" crossorigin=\"anonymous\"></script>\r\n"
			+ "-->\r\n"
			+ "</bo";
	public String getBottom() {
		return bottom;
	}

	private String updateConfirmBottom = "<div>\r\n"
			+ "    <button type=\"submit\" formaction=\"UpdateConfirm\">Update</button>\r\n"
			+ "</div>\r\n"
			+ "</tbody>\r\n"
			+ "</table>\r\n"
			+ "</div>\r\n"
			+ "</section>";
	public String getUpdateConfirmBottom () {
		return updateConfirmBottom;
	}

	private String deleteConfirmBottom = "<div>\r\n"
			+ "    <button type=\"submit\" formaction=\"DeleteConfirm\">Delete</button>\r\n"
			+ "</div>\r\n"
			+ "</tbody>\r\n"
			+ "</table>\r\n"
			+ "</div>\r\n"
			+ "</section>";
	public String getDeleteConfirmButtom () {
		return deleteConfirmBottom;
	}
	private String updateTable = "<div style=\"margin: 0 auto; width: 600px;\">\r\n"
			+ "    <form action=\"UpdateConfirm\" method=\"post\">\r\n"
			+ "        <div class=\"form-group\">\r\n"
			+ "            <label>Name</label>\r\n"
			+ "            <input type=\"text\" class=\"form-control\" name=\"name\" value="+name+">\r\n"
			+ "          </div>\r\n"
			+ "          <div class=\"form-group\">\r\n"
			+ "            <label>Email address</label>\r\n"
			+ "            <input type=\"email\" class=\"form-control\" name=\"email\" value="+email+">\r\n"
			+ "          </div>\r\n"
			+ "          <div class=\"form-group\">\r\n"
			+ "            <label>Gender</label>\r\n"
			+ "            <input type=\"text\" class=\"form-control\" name=\"gender\" value="+gender+">\r\n"
			+ "          </div>\r\n"
			+ "          <div class=\"form-group\">\r\n"
			+ "            <label>Country</label>\r\n"
			+ "            <input type=\"text\" class=\"form-control\" name=\"country\" value="+country+">\r\n"
			+ "          </div>\r\n"
			+ "        \r\n"
			+ "\r\n"
			+ "    </form>\r\n"
			+ "\r\n"
			+ "  </div>";
	public String getUpdateTable(String name, String email, String gender, String country) {
		return updateTable;
	}
}
