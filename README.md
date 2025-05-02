The basic idea of this program is to help do the math required for recovery of rockets.


The basic structure of the program consists of an abstract parachute class to allow for the easy creation of different parachute types. 
The only one I have added so far is the elliptical parachute, but each parachute will have a unique drag coefficient. 
The abstract parachute class implements drag equation and area interfaces so that all parachutes can access methods to return their area and calculate what needs to be calculated. 
There is also a rocket class. I don’t really feel the need to add abstraction here because there doesn’t need to be different types of rockets. 
The goal in the future is to allow the gui to create multiple “rockets” and input known variables into text boxes, then click a button to run the calculate button for that rocket, 
which will run the calculate method for the parachute that must be passed into the rocket object.
