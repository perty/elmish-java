# Elmish Java

If I would do TEA in Java, what would it be like?

The idea is a service that can get messages from outside.

The messages are taken to the update method which spits out a command
and a new version of the state. A command will be a function, I guess. 
Learning about TEA by doing this.

To see the state, one must query the view which will return the state.

For efficiency reasons, the view can return a subset of the state. Maybe we 
shall use graphql here.

Messages are queued. 