## LifeCycle Of Activity

onCreate() <br />
onStart() <br />
onResume() <br />
onPause()  <br />
onStop()  <br />
onDestroy()  <br />


#### MainActivity navigates to SecondActivity

MainActivity onPause()  <br />
SecondActivity onCreate()  <br />
SecondActivity onStart() <br />
SecondActivity onResume() <br />
MainActivity onStop() <br />

#### When back button presses (return to MainActivity)

SecondActivity onPause() <br />
MainActivity onRestart() <br />
MainActivity onStart() <br />
MainActivity onResume() <br />
SecondActivity onStop() <br />
SecondActivity onDestroy() <br />
