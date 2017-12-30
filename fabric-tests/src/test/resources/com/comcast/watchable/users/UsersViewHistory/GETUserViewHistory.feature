Feature: GET User'sViewHistory API - fmds/api/{$tenant_id}/{$app_id}/users/viewhistory/videos

 Scenario: GET users ViewHistory API 
    Given method: GET UsersViewHistory api 
    When Put Viewhistory api gets executed
    Then GET viewhistory status code should be 200 OK
 