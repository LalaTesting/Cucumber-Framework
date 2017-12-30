Feature: GET UserNameLookUp API - fmds/api/{$tenant_id}/{$app_id}/users/profile/usernames/<username>

 Scenario: GET userNameLookUp api 
    Given method: GET users/profile/usernames/<username>
    When Http method gets exected
    Then status code should be 204 No Content