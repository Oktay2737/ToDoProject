#----------------------------------------------TEST5 Tag-/Nachtmodus wechseln------------------------------------------
#TEST5  Tag-/Nachtmodus wechseln
#Schritt   Aktion                          Erwartetes Ergebnis
#1         Sonne/Mond Icon klicken         Hintergrund ist dunken
#2         Sonne/Mond Icon klicken         Hintergrund ist hell

Feature: Task 5 Features
  Scenario: Change Day and Night mode
    Given User clicks DayNight mode
    Then the background should be dark
    And User clicks DayNight mode again
    Then the background should be light
