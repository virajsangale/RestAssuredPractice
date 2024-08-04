
Feature: Validating Place APIs

  Scenario Outline: Verify if place is being successfully addedusing AddPlaceAPIs 
    Given Add Place Payload with "<name>" "<language>" "<address>"
    When User calls "AddPlaceAPI" with "post" http request
    Then The Api call is success with status code 200
    And "status" in response body is "OK"

    Examples:
			| name			| language	| address						|
			| AJ House  | English		| World Trade Center|
			| VS House	| Spanish		|	Jio World center									|