# Readme for Family Class
#### Important Lists
listofpeople, list of all people, even is name odd is gender of the previous name
  example at position 0 have "Harry", their gender will be in position 1 with something like "Gender"
parentassignments, list of all parent assignments, even is parent child is odd,
  example at position - have "Harry", their child will be in position 1 with name "Harrys Child"
ancestorlist, placeholder for a list of all ancestors for a given name, used to store the list of ancestors then check that list for a name then to reset it.

#### male
Method returns boolean, checks listofpeople for gender of given name, and sets it to male and returns true if genderless or returns false if female. Creates a name with gender male if name does not exist, returning true.

#### female
Method returns boolean, checks listofpeople for gender of given name, and sets it to female and returns true if genderless or returns false if male. Creates a name with gender female if name does not exist, returning true.

#### isMale
Method returns boolean, checks listofpeople for gender of given name and returns true if male and false if genderless or female. If the name does not exist creates it with an unassigned gender.

#### isFemale
Method returns boolean, checks listofpeople for gender of given name and returns true if female and false if genderless or male. If the name does not exist creates it with an unassigned gender.

#### setParent
Method returns boolean, checks if names of child and parent exists and creates them if they do not exist in listofpeople. Then checks if the parent name is the same as children name, to prevent setting a name as the parent of itself. Then uses checkAncestor to turn the ancestorlist into a list of all ancestors and checks the child name in that list, to prevent name from becoming its own ancestor. Then does gender checks to see if the parent assignment is valid. Finally after all these checks then adds the child to parentassignments list and the adult to parentassignments list.


#### checkAncestor

The only method I added which is not within the assignment brief was the checkAncestor method located in the class Family.
The method runs two streams, one to add the current parents of the name put into the function and the second stream runs the
same method on the parents to check those parents.This generates the entire ancestory of a name so it can be checked against the name of
the child to see if they are their own ancestor.
