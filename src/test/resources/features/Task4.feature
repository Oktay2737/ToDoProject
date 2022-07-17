#---------------------------------------------TEST4 Hinzugefügte Aufgabe löschen----------------------------------
#TEST4 Hinzugefügte Aufgabe löschen
#Schritt   Aktion                          Erwartetes Ergebnis
#1         Plus Button klicken            "Lets add mew Task!" Dialog öffnet sich
#2         "Test" in Textfeld schreiben
#3         done klicken                    Neuer Task "Test" wurde erstellt und ist in der Liste sichtbar
#4         Mülltonnen Icon klicken         "Deleted successfully" erscheint Aufgabe wurde aus der Liste entfernt

Feature: Task 4 Features

  Scenario Outline:delete an added task
    Given User clicks plus button
    Then The Dialog window must be oppened
    And User writes "<Text>" in to the Text field
    Then user clicks done button
    Then new Task must be created and "<Text>" task must be seen on the task list
    And user clicks trash icon
    Then "Deleted Successfully!" text should be seen on the screen
    Then new Task must be deleted and "<Text>" task must not be able to seen on the list

    Examples:
      | Text |
      | Test |