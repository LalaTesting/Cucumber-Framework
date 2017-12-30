Feature: GET User's Specific video Id details API - fmds/api/{$tenant_id}/{$app_id}/users/videos/<videoId>

 Scenario: GET Users VideoId Details API 
    Given method: GET users videos id api 
    Then validate type 
    Then validate the videoId 
    Then validate the video position 
    Then verify the positionSeconds 
    Then validate the duration 
    Then verify for links and playbackItems
    Then validate links has flagAsset like attributes
    
    
    