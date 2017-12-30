Feature: Get VideoPlaylistAPI - fmds/api/{$tenant_id}/{$app_id}/videos/<videoId>/playlist
  
  Scenario: One- GET videoPlaylist api 
    Given method: GET videoPlaylist api and verify the status code as 200 OK
    Then validate cache-control header
    Then verify pageNum is present
    Then check for pageSize
    Then verify for the attribute totalItems
    Then verify for links
    Then verify for items
    Then verify items has type as Video
    Then verify items has id 
    Then verify items has title and its value
    Then verify items has shortDescription
    Then verify items has longDescription
    Then verify items has liveBroadcastTime
    Then verify items has createTime
    Then verify items has channelTitle
    Then verify items has episode
    Then verify items has duration
    Then verify videos have proper duration and its not zero seconds
    Then verify items has parentalGuidance field
    Then verify items has channelId
    Then verify items has externalId
    Then verify items has publishTime
    Then verify items has onDemandTimeBegin
    Then verify items has onDemandTimeEnd
    Then verify items has links
    Then verify items has logo-image
    Then verify items has userVideoDetails
    Then verify items has template-mage
    Then verify items has shareLink
    Then verify items has channel
    Then verify items has self
    Then verify items has publisher
    Then verify items has default-image
    Then verify items has cell-image
    Then verify items has channel-subscription-status
   
    
    