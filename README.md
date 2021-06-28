# OpeningHours

//This project was developed in java programming language using spring boot framework, IDE used is eclipse.

To import the project into your IDE, E.g Eclipse, kindly follow the following steps
Please Note: I will be using Eclipse as case study.

1. Go to file on your menu option
2. click import
3. a dialog will pop up, Dropdown the 'git' option, select 'projects from git' and click next
4. another window will pop-up select 'clone url' and click next
5. in the next window, enter the url path to the git repository (https://github.com/Latunji/OpeningHours). Host is 'github.com' and click next
6. project will be imported.

To run kindly right click on the project and select 'run as', from the dropdown select spring boot starter.
In case you dont have the spring boot plugin in your IDE, kindly download spring boot starter plugin from eclipse market place in your IDE.


API TEST

To test the api, you can POST your request to this url
http://localhost:8080/OpeningHours/Api/getOpeningHours

Please note: output are sent back to your API request in JSON.

If there are any issues with running the code or setting it up, please do let me know, I will be available to assist. 

# To question number 2.

The json data structure is okay but I believe it can be better.

{
  "dayOfWeek":{
             "monday": [
                    {
                     "type": "close",
                     "value": 74800
                     },       
                    {
                     "type": "open",
                     "value": 64800
                     },
                     {
                     "type": "close",
                     "value": 74800
                     }
                     ],
                     "tuesday": [
                     {
                     "type": "open",
                     "value": 36000
                     },
                     {
                     "type": "close",
                     "value": 64800
                     },
                      {
                     "type": "open",
                     "value": 64800
                     },
                     {
                     "type": "close",
                     "value": 74800
                     }
                     ],
                     "wednesday": [

                     ],
                     "thursday": [
                     {
                     "type": "open",
                     "value": 36000
                     },
                     {
                     "type": "close",
                     "value": 64800
                     }
                     ],
                     "friday": [
                     {
                     "type": "open",
                     "value": 36000
                     }
                     ],
                     "saturday": [
                     {
                     "type": "close",
                     "value": 3600
                     },
                    {
                     "type": "open",
                     "value": 36000
                     }
                     ],
                     "sunday": [
                     {
                     "type": "close",
                     "value": 3600
                     },
                     {
                     "type": "open",
                     "value": 43200
                     },
                     {
                     "type": "close",
                     "value": 75600
                     },
                     {
                     "type": "open",
                     "value": 43200
                     }
                     ]
          }
          }


Warm regards.
