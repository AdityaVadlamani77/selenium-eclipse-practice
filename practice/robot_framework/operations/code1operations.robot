*** Settings ***
Library    XML
Library    RPA.Browser.Selenium    auto_close=${False}
Library    RPA.Dialogs
*** Keywords ***
drop_down_practice
    ${roundtrip_radio}    Set Variable    XPath://label[@for='ctl00_mainContent_rbtnl_Trip_1']
    ${currency_dropdown}    Set Variable    XPath://select[@id='ctl00_mainContent_DropDownListCurrency']
    ${USD}    Set Variable    XPath://*[@value="USD"]
    ${family_friends}    Set Variable    XPath://label[normalize-space()='Family and Friends']
    Sleep    2
    Click Element    ${roundtrip_radio}
    Sleep    1
    Click Element    ${currency_dropdown}
    Sleep    1
    Click Element    ${USD}
    Sleep    1
    Click Element    ${family_friends}
Login_to_OrangeHRM
    Title Should Be    OrangeHRM
    Sleep    2
    ${username}    Set Variable    XPath://*[@name="username"]
    ${password}    Set Variable    XPath://*[@name="password"]
    Input Text    ${username}    Admin
    Input Text    ${password}    admin123
    Sleep    0.5
    Click Button    XPath://*[@class="oxd-button oxd-button--medium oxd-button--main orangehrm-login-button"]
    Sleep    2
    Click Element    XPath://i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']
    Click Element    XPath://a[normalize-space()='Logout']
    Sleep    5
    
Login_to_Application
    Click Link    XPath://a[contains(text(),'Log in')]
    Input Text    XPath://input[@id='Email']    kathleenleo081@gmail.com
    Input Text    XPath://input[@id='Password']    alicia47
    Click Button    XPath://button[contains(text(),'Log in')]
    Click Link    XPath://a[contains(text(),'Log out')]