Feature: GET EmailLookUp API - fmds/api/{$tenant_id}/{$app_id}/users/profile/emails/<email>

 Scenario: GET EmailLookUp api 
    Given method: GET users/profiles/email/<email>
    When Http Get Method is executed
    Then 204 No Content status should come