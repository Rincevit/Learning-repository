#Learning Spring bean scopes:

##Request scope
Spring creates an instance of the bean class for every HTTP request.
The instance exists only for that specific HTTP request.

##Session scope
Spring creates an instance and keeps the instance in the server’s
memory for the full HTTP session. Spring links the instance in the context with the
client’s session.

##Application scope
The instance is unique in the app’s context, and it’s available while
the app is running.

**Step 1**
implement the login logic. Use request-scoped bean to make sure that credentials 
in app's memory are not stored for more than it takes the login request to finish.

**Step 2**
Use session-scoped bean to keep user logged in for a period of time.

**Step 3**
Use application-scoped bean to count the login requests from all the users.