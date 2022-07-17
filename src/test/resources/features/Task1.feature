
#  ---------------------------------------TEST1 Hinzufügen einer Aufgabe ------------------------------------------------
#  Plus Button klicken      Add here control of "Lets add mew Task!" Dialog is oppened or not!!!!!!!!
#
#  TEST1 Hinzufügen einer Aufgabe
#  Schritt   Aktion                          Erwartetes Ergebnis
#  1         Plus Button klicken            "Lets add mew Task!" Dialog öffnet sich
#  2         "Test" in Textfeld schreiben
#  3         done klicken                    Neuer Task "Test" wurde erstellt und ist in der Liste sichtbar

Feature: Task 1 Features
  Scenario Outline:Create a new Task
    Given User clicks plus button
    Then The Dialog window must be oppened
    And User writes "<Text>" in to the Text field
    Then user clicks done button
    Then new Task must be created and "<Text>" task must be seen on the task list

    Examples:
      | Text |
      | Test |