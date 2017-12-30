Feature: fmds/api/{$tenant_id}/{$app_id}/publishers/<publisherId>
  
  Scenario: one- GetPublisherId API  
  Given method: GET /fmds/api/watchable/web/publishers/<publisherId> and Verify response as 200 OK
  Then  verify publisher id and its value 
  Then  validate for publisher's name  
  Then  check for the description 
  Then  validate for the count of channels 
  Then  validate for count of shows
  Then  verify for number of videos from that publisher 
  Then  validate last Updated Time stamp
  Then  verify the busniess ID
  Then  verify the links presence 
  Then  verify  link has channel Page Template
  Then  validate link for the image Uri
  Then  validate link forchannel Page
  Then  verify for link for self
  Then  verify links for genre channels