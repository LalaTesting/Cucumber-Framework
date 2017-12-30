Feature: DELETE User'sViewHistory API - fmds/api/{$tenant_id}/{$app_id}/users/viewhistory/videos

 Scenario: DELETE users ViewHistory API 
    Given method: DELETE UsersViewHistory api 
    Then verify the status code as 204
    