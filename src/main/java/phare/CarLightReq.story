Sample story

Scenario: REQ_001
Given a car light system
When the switch mode is ON
Then the light should be ON

Scenario: REQ_002
Given a car light system
When the switch mode is OFF
Then the light should be OFF

Scenario: REQ_003.1
Given a car light system
When the switch mode is AUTO
And the light intensity is 65%
Then the light should be ON

Scenario: REQ_003.2
Given a car light system
When the switch mode is AUTO 003.2
And the light intensity is 75%
Then the light should be OFF 003.2
When the light intensity is 65% 003.2
Then the light should be ON 003.2

Scenario: REQ_003.3
Given a car light system
When the switch mode is AUTO 003.3 
And the light intensity is 75% 003.3
Then the light is OFF 003.3
When light intensity is 55% 003.3
And last for 2s 003.3
Then the light should be ON 003.3

Scenario: REQ_003.4
Given a car light system
When the switch mode is AUTO 003.4
And the light intensity is 65% 003.4
Then the light should be ON 003.4
When the light intensity is 75% 003.4
And last for 3s 003.4
Then the light should be OFF 003.4
