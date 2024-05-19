WinWaitActive("","Authentication Required","10")
WinFlash("", "Authentication Required",4,500)
If WinExists("","Authentication Required") Then
  Send("ikram.gharsalla{TAB}")
  Send("Msdos@1234567890{Enter}")
ElseIf WinExists("","Chrome Legacy Window")Then
  Send("ikram.gharsalla{TAB}")
  Send("Msdos@1234567890{Enter}")
ElseIf WinExists("","Windows Security") Then
  Send("ikram.gharsalla{TAB}")
  Send("Msdos@1234567890{Enter}")
EndIf