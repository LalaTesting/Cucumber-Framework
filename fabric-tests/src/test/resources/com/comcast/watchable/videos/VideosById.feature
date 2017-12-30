Feature: Get VideoById API - fmds/api/{$tenant_id}/{$app_id}/videos/<videoID>
 
  
  Scenario: One- GET videoId api 
    Given method: GET videosbyId api
    Then verify the status code as 200 OK
    Then validate cache-control header is 3600 seconds
    Then validate type is Video
    Then verify for id and its value
    Then verify shortDescription
    Then verify longDescription
    Then verify liveBroadcastTime and its value
    Then verify createTime attribute is present
    Then verify the ChannelTitle
    Then verify episode attribute is there
    Then verify for the presence of duration
    Then verify the parental guidance
    Then verify the channelId
    Then check the publishTime
    Then verify links
    Then verify links has userVideoDetails
    Then verify links has templateImage
    Then verify links has sharelink
    Then verify links has channel
    Then verify links has self
    Then verify links has publisher
    Then verify links has defaultImage
    Then verify links has cellImage
    Then verify links has channelSubscriptionStatus link
    Then verify for the presence of playbackItems
    Then verify links has logoImage
    
    Scenario: Two - Video Id with non-integer variable
    Given method: GET Videos API 
   # Then verify status code as BADREQUEST
    
    Scenario: Three- Invalid videoId like 10
    Given methog GET videos/10
    Then verify the status code as 404 Not Found
