Feature: GET Genres API - fmds/api/{$tenant_id}/{$app_id}/genres

 Scenario: GET Genres
    Given method: GET /genres API 
    Then Status code as 200 OK
    Then validate totalItems attribute and its value is more than zero
    Then validate Links attribute
    Then validate Links has self attribute
    Then validate Items attribute
    Then validate Items.totalChannels
    Then validate Items.totalShows
    Then validate Items.totalVideos
    Then validate Items.totalItems
    Then validate Items.type
    Then validate Items.title
    Then validate Items.id
    Then validate Items.links
    Then validate Items.links has self
    
    
    
    