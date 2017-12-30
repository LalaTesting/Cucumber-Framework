Feature: Get CuratedChannelsAPI's - fmds/api/{$tenant_id}/{$app_id}/curated/channels


 Background: Given CuratedChannel GET url - fmds/api/{$tenant_id}/{$app_id}/curated/channels
  Given HTTP request headers
  | Accept | Conteny-Type  |
  |application/json | text/plain |
  When HTTP GET method is executed
  Then status code should be 200 OK
  Then cachecontrol header is having 120 seconds

  Scenario: Validate CuratedChannel API response 
    Then validate CuratedListType is PopularChannels
    Then verify genre is present    
    Then totalItems and totalChannels has same value
    Then Verify the curatedItem's type is curatedChannel
    Then Verify the curatedItem's title and curatedChannel title is same
    And Verify the curatedChannel has some videos
