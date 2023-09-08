Feature: Retail Home Page

  Background: 
    Given User is on retail website homepage

  @verifySideBar
  Scenario: Verify shop by Department sidebar
    When Uder click  on all section
    Then below options are present in shop by Department sidebar
      | Electronics | Computers | Smart Home | Sports | Automotive |

  @sidebarOption
  Scenario Outline: Verify department sidebar options
    And User on <department>
    Then below options are present in department
      | <department> | <option2> |

    Examples: 
      | department    | option1                        | option2                 |
      | 'Electionics' | TV & Video                     | Video Games             |
      | 'Computers'   | Accessories                    | Nerworking              |
      | 'Smart home'  | Smart Home Lightning           | Plugs and Outlets       |
      | 'Sports'      | Athletic Clothing              | Exercise & Fitness      |
      | 'Automotive'  | Automotive parts & Accessories | Motorcycle & poersports |
