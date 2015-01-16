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



![NavigationDrawer](https://raw.githubusercontent.com/kanytu/android-material-drawer-template/master/screenshots/screenshot1.gif)


**Note**
=

There are three example XML's for you activities. All them with diferent approaches on the navigation drawer pattern:


**activity_main.xml** *Navigation drawer bellow the toolbar. (Google Inbox style)*

![NavigationDrawer](https://raw.githubusercontent.com/kanytu/android-material-drawer-template/master/screenshots/drawer_bellow.gif)


**activity_main_blacktoolbar** *Navigation drawer bellow the toolbar, toolbar transition to black (Google Play Store style)*

![NavigationDrawer](https://raw.githubusercontent.com/kanytu/android-material-drawer-template/master/screenshots/playstore_style.gif)


**activity_main_topdrawer** *Navigation drawer on top of the toolbar (Gmail style)*

![NavigationDrawer](https://raw.githubusercontent.com/kanytu/android-material-drawer-template/master/screenshots/drawer_over_toolbar.gif)



[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-android--material--drawer--template-brightgreen.svg?style=flat)](https://android-arsenal.com/details/3/1096)


## License
Copyright (c) 2014 Pedro Oliveira

Licensed under the [Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)
