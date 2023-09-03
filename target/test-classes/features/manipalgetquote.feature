Feature: To test the manipal sigma API

  Scenario Outline: Verify the manipalGetquote API with the combination of two adault and three children
    Given Add payload with "<productId>" "<PolicyType>" "<productPlanOptionCd>" <noOfAdults> <noOfKids>
    When Users call "getQuoteRes" with http request "POST"
    Then The API call is success with status code 200

    Examples: 
    | productId | PolicyType | productPlanOptionCd | noOfAdults | noOfKids |
    | SPLS03SBSF | INDIVIDUAL | IN-PLS5-HD5 | 1 | 0 |
    | SPLS03SBSF | FAMILYFLOATER | FL-PLS5-HD5 | 2 | 0 |
    | SPLS03SBSF | FAMILYFLOATER | FL-PLS5-HD5 | 2 | 1 |
    | SPLS03SBSF | FAMILYFLOATER | FL-PLS5-HD5 | 2 | 2 |
    | SPLS03SBSF | FAMILYFLOATER | FL-PLS5-HD5 | 2 | 3 |
    | SPLS03SBSF | FAMILYFLOATER | FL-PLS5-HD5 | 1 | 1 |
    | SPLS03SBSF | FAMILYFLOATER | FL-PLS5-HD5 | 1 | 2 |
    
    
   