Feature: Get CuratedVideosAPI's - fmds/api/{$tenant_id}/{$app_id}/curated/videos

  Scenario: GetCuratedVideos API
    Given method: GET /fds/api/watchable/web/curated/videos and Verify response as 200 OK
    Then verify 120 seconds for cache-control header
    Then validate curatedVideos api has returned more than zero item
    Then verify totalItems and totalVideos has same count
    Then verify CuratedListType argument's key value is FeaturedVideos
    Then verify for the presence of GENRE attribute
    Then verify curatedItems's TYPE is CuratedVideo
    Then verify VideoList has Type as video
    Then verify VideoList has id
    Then verify VideoList has channelTitle
    Then verify videoList has ChannelId
    Then verify video's duration is not zero
    #Then curatedItem's title and Video's title is same