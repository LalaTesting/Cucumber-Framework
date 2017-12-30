Feature: CuratedFeatured API - fmds/api/{$tenant_id}/{$app_id}/curated/featured

  Scenario:
    Given method: fmds/api/watchable/<platform>/curated/fetaured
    And SessionToken
    Then Featured should be the value for attribute curatedListType 
    Then validate the curatedFeatured API has returned more than one item
    Then totalItems and totalVideos has same value
    Then verify Genre attribute is present
    Then curatedItems attribute is present
    Then curatedItems type is CuratedVideo
    Then Title attribute is there and its value is "$title"
    Then verify Video has ChannelId and ChannelTitle
    And verify cache control 120 seconds
