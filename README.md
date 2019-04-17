# DaggerAndroidInjectorsExample
Dagger Injection using dagger-android libraries. An application level component is used to provide some base services like the ApiService. This service is passed on to the MainActivity's Module where it is passed to the MainViewModel using ViewModelFactory to load data. 


### There are two branches in this repository.
* method-1 works it out using Sub-components and inheriting it with dagger android classes
* method-2 works without a subComponent and uses ContributesAndroidInjector instead of a sub-component


All of this can be achieved without using dagger-android helper classes by simply using sub-components or dependencies using only the standard java dagger library.


[Demo without android-dagger classes](https://github.com/10XMairing/DaggerSubComponentsExample)




References
[OFFICIAL DOCS](https://google.github.io/dagger/android)

