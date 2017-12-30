Feature: GET VideoWithPagination - fmds/api/{$tenant_id}/{$app_id}/videos?pageNum=1&pageSize=2

  Scenario: One- GET some videos based on Pagination parameter
    Given method: GET VideosWithPagination api
    Then Validate for totalItems attribute
    Then validate Items and its attributes
