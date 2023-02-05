*** Settings ***
Library    RPA.Browser.Selenium
Library    RPA.SAP
*** Keywords ***
Frames_test
    Select Frame    packageListFrame
    Click Link    org.openqa.selenium
    Unselect Frame 
    Select Frame    packageFrame
    Click Link    HasAuthentication
    Unselect Frame
    Select Frame    classFrame
    Click Link    Default Methods
