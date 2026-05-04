%====================================================================================
% conway26demoqak description   
%====================================================================================
mqttBroker("localhost", "1883", "lifegameIn").
event( start, start(X) ).
%====================================================================================
context(ctxgame, "localhost",  "TCP", "8010").
 qactor( lifegame, ctxgame, "it.unibo.lifegame.Lifegame").
 static(lifegame).
