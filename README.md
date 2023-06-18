# Kbuddy

# Welcome to Kbuddy
Hi! This is **Kbuddy**!
<br>An open source collaborative Android project.
<br>It aims at providing a convenient self-contained way to preserve past memories in a minimalist gallery-like way. Former vacations, hangouts, visits diary with everything that's worth to be remembered.
<br>Just the moments that worth to be remembered!

# Features
- Login system.
- Home screen
	- Preview former vacations.
	- Navigation to preferences.
	- Add new vacation.
- Preferences screen
	- Application theme.
	- Notifications.
	- Overall configuration

## Showcase
<span>
    <img src="./media/LoginScreen.png" width="300" height="600"> &nbsp; 
    <img src="./media/HomeScreen.png" width="300" height="600"> &nbsp; 
</span>


## Install
As of now that app hasn't been published to either the Playstore, but initially would be published on Github [Releases](https://github.com/KDiaryApp/kbuddy/releases) section.
> Before starting to publish, you must link an account in the **Publish** sub-menu.
> The app is still under development, and by no means is considered to be usable.

# Synchronization
There should be multiple viable options that the user should be able to choose from, depending on its current status, and overall preferences.

 There are multiple possible solutions, namely
 - [ ] Save User data & settings locally.
- [ ] Sync former vacations across user devices
	- [ ] Sync the data using a remote cloud storage.
	- [ ] Sync to user-controlled cloud environment.
	- [ ] Migrate the data easily for remote cloud or backup solution.

## Current authentication Flow

```mermaid
sequenceDiagram
User ->> Server: Send email & password to authenticate
Server-->> Database: Check the user is registered.
Server --x User: Inform the user it's not registered/wrong credentials
Server ->> User: Send back an OTP code to his phone number (if registered)
User --> Server: The user sends back the OTP code to resume authentication.
Server ->> User: Authenticate the user
User -> Database: Terminate the session

Note left of User: The user can <br/>have multiple<br/> ways to authenticate.
```

## Initial login process

```mermaid
graph LR
A[Login screen] --> B(login attempt) --> C(authenticate credentials) -- successful authentication --> D{Home screen}
C -- Authentication failure --> B
A --> F((skip now)) --> D
```

## Social media platforms

|				|Kbuddy						   |Social media	   |
|---------------|------------------------------|-------------------|
|Focus			|`focused on former memories`  |Assortment of everything|
|Aim			|`preserving worthy moments`   |Revenue making machine	|
|Privacy		|`Completely respecting privacy`|Data aggregation for marketing|
