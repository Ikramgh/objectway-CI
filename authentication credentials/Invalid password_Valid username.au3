WinWaitActive("","Authentication Required","10")
WinFlash("", "Authentication Required",4,500)
If WinExists("","Authentication Required") Then
  Send("ikram.gharsallah{TAB}")
  Send("xxx{Enter}")
ElseIf WinExists("","Chrome Legacy Window")Then
  Send("ikram.gharsallah{TAB}")
  Send("xxx{Enter}")
ElseIf WinExists("","Windows Security") Then
  Send("ikram.gharsallah{TAB}")
  Send("xxx{Enter}")
EndIf