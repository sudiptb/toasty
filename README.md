Step 1. Add the JitPack repository to your build file 
----
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  -----
  
  Step 2. Add the dependency
  ----in gradle
  	dependencies {
	        implementation 'com.github.sudiptb:toasty:Tag'
	}
  
  ------
