conenct(town1, town2).
connect(town2, town3).
connect(town3, town4).
connect(town4, town5).
connect(town5, town6).

can_get(X,Y):- connect(X,Y).
can_get(X,Y):- connect(X,Z), can_get(Z,Y).