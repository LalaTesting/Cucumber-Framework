Feature: Get ChannelsByPublisherAPI - fmds/api/{$tenant_id}/{$app_id}/publishers/<publisherId>/channels

  Scenario: First- ChannelsByPublisherAPI
    Given method: GET /fmds/api/watchable/web/publishers/<publisherId>/channels
    When response is 200 OK
    Then validate totalItems shouldn't be zero
    Then verify publishers_genre_channels_all attribute under links
    Then validate items
    Then verify that type should be channel
    Then validate that id shouldn't be null
    Then title shouldnot be null
    Then validate for description
    Then video count should not be null and greater than zero
    Then verify for last Update Time stamp
    Then verify for parentalGuidance is present
    Then validate items.links presence
    Then validate items.links.logoImage
    Then validate items.links.paginateShowsAll
    Then validate items.links.templateImage
    Then validate items.links.sharelink
    Then validate items.links.channels-videos
    Then validate items.links.subscription-status
    Then validate items.links.paginateShowsTemplate
    Then validate items.links.channels-allvideos
    Then validate items.links.genre
    Then validate items.links.self
    Then validate items.links.publisher
    Then validate items.links.defaultImage
    Then validate items.links.paginateShowsAndVideos
    Then validate items.links.cell-image
    Then validate items.links.paginateShowsAndVideosTemplate
