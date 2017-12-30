Feature: Get CuratedListsAPIs - fmds/api/{$tenant_id}/{$app_id}/curatedlists

  Scenario: GetCuratedLists API
    Given method: GET CuratedListsAPI and validate status as 200 OK
    Then validate curatedlists has items
    Then validate curatedItems has ID
    Then genre of curatedlists and curatedlists/ID is same
    Then validate totalVideos attribute is not ZERO and it contains some videos
    Then validate totalVideoDuration attribute is not ZERO
    Then CacheControl Header is set to 120 seconds
