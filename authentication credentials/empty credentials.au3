WinWaitActive("","Authentication Required","10")
WinFlash("", "Authentication Required",4,500)
If WinExists("","Authentication Required") Then
  Send("{TAB}")
  Send("{Enter}")
ElseIf WinExists("","Chrome Legacy Window")Then
  Send("{TAB}")
  Send("{Enter}")
ElseIf WinExists("","Windows Security") Then
  Send("{TAB}")
  Send("{Enter}")
EndIf