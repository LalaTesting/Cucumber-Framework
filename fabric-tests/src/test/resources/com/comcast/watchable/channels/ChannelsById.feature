Feature: Get ChannelByIdAPI - fmds/api/{$tenant_id}/{$app_id}/channels/<channelId>

  Scenario: GetChannelsId API
    Given method: GET /fmds/api/watchable/web/channels/<channelId> and Verify response as 200 OK
    Then validate the channelsId API has type
    Then verify for channelId
    Then verify for channel title
    Then verify for the description
    Then verify for the numOfShows parameter
    Then verify for numOfVideos attribute is present and has equal to or more than one item
    Then verify the attribute lastUpdateTimestamp
    Then verify for the parentalGuidance attribute
    Then verify for Links presence
    Then validate Links has logo-image
    Then validate Links has paginateShowsAll attribute
    Then validate Links has template-image
    Then validate Links has sharelink
    Then validate Links has channels-videos atribute
    Then validate Links has subscription-status
    Then validate Links has paginateShowsTemplate
    Then validate Links has channels-allvideos
    Then validate Links has genre
    Then validate Links has publisher
    Then validate Links has default-image
    Then validate Links has pagnateShowsAndVideos
    Then validate Links has cell-image
    Then validate Links has paginateShowsAndVideosTemplate

  Scenario: Two- Invalid channelId like 10
    Given methog GET channels/10
    Then verify the status code

  Scenario: Three - NonNumeric ChannelId like ABCDE@
    Given method: GET channels/ABCDE@ API
    Then validate the status code for alphanumeric channel id
