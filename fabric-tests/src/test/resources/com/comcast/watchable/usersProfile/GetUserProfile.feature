Feature: GET UsersProfile API - fmds/api/{$tenant_id}/{$app_id}/users/profile

 Scenario: One- GET usersProfile api 
    Given method: GET users/profile
    Then status should be 200 OK
    Then userId attribute shoul dnot be null
    Then validate userName
    Then validate email
    Then validate emailStatus
    Then validate mobileStatus
    Then validate registrationDate 