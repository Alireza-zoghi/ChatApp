# ChatApp
If it doesn't work, use a vpn😩
I have deleted google-services.json. Add yours
<br><b> Change Authorization:key with your key from firebase project</b>

<br>Implementation Guide 
<br>1 - Project
<br>1 - Open the Project in your android studio;
<br>2 - *IMPORTANT* Change the Package Name.

<br>2 - Firebase Panel
<br>- Create Firebase Project (https://console.firebase.google.com/);
<br>- Import the file google-service.json into your project
<br>- Connect to firebase console authentication and database from your IDE (video 2)
<br>- in firebase Storage Rules, change value of "allow read, write:" from "if request.auth != null" to "if true;"
<br>- For sending notification, paste your Firebase project key into your project APIService.java
<br>- When you change database settings, you likely will need to uninstall and reinstall apps to avoid app crashes due to app caches.
