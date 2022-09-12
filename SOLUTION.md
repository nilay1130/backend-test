# MY SOLUTION
I wanted to implement two design pattern for my solution and I wrote unit test by using JUnit and  included a Test Suite class.I used Command and State design pattern.
I wanted to use State pattern to represent the different directions.Because the behaviour of the rover is dependent on which state
it was in and also if new directions wanted to be added (Northwest Direction etc) it would be easier.My code is proper for SOLID principles.It is open for extension but closed for modification and also classes have one responsibility.

And I used command pattern to send and execute commands needed to be executed.When we use command pattern we can do an undo operation too.I thought this would be useful if there is an obstacle to return back previous state and we can improve this part by using stack implemantation.
