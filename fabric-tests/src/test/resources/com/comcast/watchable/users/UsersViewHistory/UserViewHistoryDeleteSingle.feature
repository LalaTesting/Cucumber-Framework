Feature: ProgressEvent&ViewHistorySingleDelete - fmds/api/{$tenant_id}/{$app_id}/users/viewhistory/videos/<videoId>


Scenario: PUT users video progress API - PUT http://fabric.xidio.com/fmds/api/watchable/iptv/users/videos/74877/20
    Given method: videoProgress API 
    Then verify the status code as 204
 


 Scenario: DELETE users ViewHistory API - DELETE http://fabric.xidio.com/fmds/api/watchable/iptv/users/viewhistory/videos
    Given method: DELETE single video from User's view history api 
    Then verify the status code as 204
    
    
  Scenario: GET users ViewHistory API - GET http://fabric.xidio.com/fmds/api/watchable/iptv/users/viewhistory/videos
    Given method: GET user's viewHistory api 
    Then verify the status code 
    
    
    
    