android-material-drawer-template
================================

An Android template with navigation drawer for material design

**Customization**

 - Change your drawer item on: `drawer_row.xml`
 - Make sure you change `NavigationDrawerAdapter` to populate the `ViewHolder` with the new xml layout.
 - If you want to set a different layout for the selected item refer to `onBindViewHolder` method on the `NavigationDrawerAdapter`
 - If you want to display more information on each row, like an image for example, change the `NavigationItem` and add what you need. Make sure you change it's constructor and edit also the `getMenu()` method on the fragment.


**Reminders**

 - Your activity must implement `NavigationDrawerCallbacks`
 - You must call `NavigationDrawerFragment.setup()` to setup the drawer.
 - You must `<include/>` the `toolbar_default.xml` in all your activities's XML and set it to the supportActionBar with `setSupportActionBar()`. Remember to extend the activity to `ActionBarActivity`



![ParallaxListView](https://raw.githubusercontent.com/kanytu/android-material-drawer-template/master/screenshots/screenshot1.gif)

[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-android--material--drawer--template-brightgreen.svg?style=flat)](https://android-arsenal.com/details/3/1096)



## License
Copyright (c) 2011 Pedro Oliveira

Licensed under the [Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)
