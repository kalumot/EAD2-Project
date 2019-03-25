# EAD2-Project
Niall Moone, Kalum O'Toole


Got a bit done over the weekend. I was working towards a page that lists all teams and when you click one it will give you their latest results. Feel free to change this direction though. I just wanted to get something started.The two folders i uploaded are for the API and for filling managing the database. Not sure if they should be integrated together in the same project bur seemed cleaner to do seperate. If you like you could host both on Azure too for testing or whenever you make changes to the api project you could just upload here and ill update it on my azure account. Theres not much work left to do on that though anyway. Just need to add a few more fields and maybe another function if you think of anything. Main chunk to do is the android app

API hosted at: https://ead2ca2api.azurewebsites.net

 - /api/team/all  for all teams
 - /api/{id} for all matches of specific team
 
DB hosted too. Details: 
Server=tcp:footballca2.database.windows.net,1433;Initial Catalog=FootballCa2;Persist Security Info=False;User ID=kalum;Password=Tallaght1;MultipleActiveResultSets=False;Encrypt=True;TrustServerCertificate=False;Connection Timeout=30;


### Bugs: 
 - Other teams show as NULL in matches. Dont know why.
 
### Updates:
  - I have an android app working thats connected to the api. Thats all though. Doesnt do anything or a layout. Ill upload it once I get on my PC at home
