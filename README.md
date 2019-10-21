# Music App Lab 

The objective of the lab was to create a spotify like clone backend with APIs using Spring framework. We created
and tested the following endpoints: 

* Signup
* Login
* Create role 
* List users 
* Create user profile 
* Add song 
* Add song to the user once
* Delete song by user
* List songs by user

## Design decisions 

* We have one-to-one relationship with profile to a user because only one profile can exist per user and vice-versa. A user cannot have multiple profiles. A profile cannot have multiple users. 
* We have a many-to-one relationship with role to user functionality because the application will have hierarchical roles (they will go from basic viewer to admin and all the way up to dba) and a user can only can one role. However, a role can be assigned to many users. This is a bi-directional relationship so it is easy for developers to obtain the users by roles and the role of a user.
* We have a many-to-many relationship with user to song because a user can have many songs and a song can have many users. 

## What went right

It was actually pretty easy to follow lessons and start typing out the solution while the lessons were open. We were able to divide work fairly and work together as well and communication was open. 

## What went wrong 

Create tests and understanding tests was still a struggle, so we did follow along the lessons and created the tests similar to the lessons. If we have more time, that is what we would focus more time practicing. 

## Enjoyed the most 

It was pure joy when things actually worked and stacktrace finally made sense after so much struggle. 
