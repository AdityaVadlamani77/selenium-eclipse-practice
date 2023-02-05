*** Settings ***
Resource    ../operations/frames_test_operations.robot
Library    RPA.Browser.Selenium    auto_close=${False}
*** Variables ***
${url}    https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html
${browser}    chrome
*** Test Cases ***
Frames_Handling
    Open Browser   ${url}    ${browser}
    Maximize Browser Window
    #Set Selenium Speed    3seconds
    Frames_test