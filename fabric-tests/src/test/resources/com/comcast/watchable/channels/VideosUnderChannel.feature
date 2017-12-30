Feature: [/channels/{channelId}/videos] As a User, view the videos under channel

Scenario: channel's videos validation
Given method: GET 
Given path: /api/web/channels/<channelId>/videos
Given request headers and SessionToken
When HttpRequest gets executed
Then validate status code as 200 OK
Then response has totalItems and it has atleast one item in it
Then response has link.self
And validate response attributes are returned as not null
And validate for video duration where it should not be zero
And channelTitle and channelId should not be empty



