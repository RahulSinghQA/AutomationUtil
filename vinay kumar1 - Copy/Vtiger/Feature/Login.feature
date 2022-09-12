   Feature: Login

   Scenario: Verify valid username and password
         Given launch chrome browser
          When  launch url "http://localhost:8888"
          And   enter username "admin"and password "admin"
          And   click on login Button
          Then  home page should be visible "admin - My Home Page - Home - vtiger CRM 5 - Commercial Open Source CRM"
          When  click on signout Button
          Then  login page should be visible
          And   login page Close