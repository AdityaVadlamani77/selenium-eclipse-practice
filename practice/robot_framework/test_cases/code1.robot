*** Settings ***
Resource    ../operations/code1operations.robot
Library    XML
Library    RPA.Browser.Selenium    auto_close=${False}
Library    RPA.Dialogs
*** Variables ***
${url}    https://demo.nopcommerce.com/
${url1}    https://opensource-demo.orangehrmlive.com/
${url2}    https://rahulshettyacademy.com/dropdownsPractise/
${browser}    chrome
*** Test Cases ***
Login_Test
    Open Browser    ${url2}    ${browser}
    Maximize Browser Window
    drop_down_practice


