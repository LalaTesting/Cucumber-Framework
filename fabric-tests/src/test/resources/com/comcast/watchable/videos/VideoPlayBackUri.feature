  Feature: Get PlayBackUri
  
  Background: Given videoPlayBackUri GET url
  Given HTTP request headers
  | Accept | Conteny-Type  |
  |application/json | text/plain |
  When HTTP GET method is executed
  Then status code should be 200 OK
  

  Scenario: 
  And type attribute is video
  | type | video |
  And attribute logData should not be null
  And links attribute should be there
  And playbackItems is present 
  And playbackItems had uri attribute
  And playbackItems has mediaFormat as mp4
  | mediaFormat| mp4 |
  And playbackItems has bitrate
  | bitrate | mp4 |
  And playbackItems has logUri
  
  
  
  