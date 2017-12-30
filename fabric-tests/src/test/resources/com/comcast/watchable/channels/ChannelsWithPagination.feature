Feature: GET ChannelsWithPagination - fmds/api/{$tenant_id}/{$app_id}/channels?pageNum=1&pageSize=2

  Scenario: One- GET Channels based on Pagination parameter
    Given method: GET ChannelsWithPagination api
    Then verify totalItems attribute
    Then verify items attribute