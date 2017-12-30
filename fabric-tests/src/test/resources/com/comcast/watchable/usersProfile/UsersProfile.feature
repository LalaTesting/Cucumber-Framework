Feature: POST UsersProfile API - fmds/api/{$tenant_id}/{$app_id}/users/profile

 Scenario: One- POST usersProfile api 
    Given method: POST UsersProfile api and verify the status code as 200 OK
    Then validate cache-control header