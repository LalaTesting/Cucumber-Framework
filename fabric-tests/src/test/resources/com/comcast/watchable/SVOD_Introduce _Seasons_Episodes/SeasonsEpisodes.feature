Feature: Get SeasionsforALLVIdeos -  http://fabricdemo.xidio.com/fmds/api/:tenantId/:platform/seasons/:seasonId/videos

 Scenario: First- seasonsunderasset
  Given method: GET http://fabricdemo.xidio.com/fmds/api/watchable/web/seasons/13253/videos
    When response is 200 OK