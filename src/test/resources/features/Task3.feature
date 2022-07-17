#------------------------------------------------Test3 Hinzufügen einer Aufgabe ohne Titel----------------------------
#3. Hinzufügen einer Aufgabe ohne Titel
#Schritt   Aktion                          Erwartetes Ergebnis
#1         Plus Button klicken            "Lets add mew Task!" Dialog öffnet sich
#2         done klicken                   Fehlermeldung "Oops, Cannot set an empty ToDo!!!" erscheint
  #Test Case was wrong writed

Feature: Task 3 Features

  Scenario:Adding new Task without titel
    Given User clicks plus button
    Then The Dialog window must be oppened
    Then user clicks done button
    Then "Oops, Cannot set an empty ToDo!!!" message must be seen on the screen