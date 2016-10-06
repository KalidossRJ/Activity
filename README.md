## LifeCycle Of Activity

onCreate()

onStart()

onResume()

onPause()
onStop()
onDestroy()

MainActivity navigates to SecondActivity

MainActivity onPause()

SecondActivity onCreate()
SecondActivity onStart()
SecondActivity onResume()

MainActivity onStop()

When back button presses (return to MainActivity)

SecondActivity onPause()
MainActivity onRestart()
MainActivity onStart()
MainActivity onResume()
SecondActivity onStop()
SecondActivity onDestroy()
