Feature: Channel Follow->FollowedChannel->UnFollow - fmds/api/{$tenant_id}/{$app_id}/users/channels/<channelId>/follow

 Scenario: Post UsersChannelsFollow API
    Given method: POST channels/channelId/follow Follow Channel API  
    Then Verify response as 204 No Content
    Then channel is followed 
    
Scenario: Check if User Followed a Channel
    Given method: GET channels/channelId/follow - FollowAPI 
    Then status should be 204 No Content
  

  Scenario: User's all followed channels API
    Given method: GET users/channels/follow - FollowAPI 
    Then response code is 200 OK
    Then verify followed Channels for the user
    Then followed channel is available here
    Then totalItems is greater than zero
    Then links has its self url
    Then items array has channel
    Then items array has id
    Then items has title
    Then verify numOfVideos is greater than zero 

  Scenario: User Unfollow's Channel API
    Given method: DELETE channels/channlID/follow UnFollowAPI  
    Then UnFollowAPI and status code as 204

  
    

