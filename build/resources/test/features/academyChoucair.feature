# Autor: Edison Lozada
@stories
Feature: Academy Choucair
  As a user, i want to learn how to automate in screamplay at the choucair academy with the automation course
  @scenario1
  Scenario: Search for a automation course
    Given than brandon wants to learn automation at the academy choucair.
      | strUser    | strPassword   |
      | 1016072415 | Choucair2021* |
    When he search for the course on the choucair academy platform.
      | strCourse                          |
      | Patrones de Automatización|
    Then he finds the course called
      | strCourse                  |
      | Patrones de Automatización |


