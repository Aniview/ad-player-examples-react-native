# AdPlayer React Native Example

This project contains a minimal example application to start displaying Ads with Aniview's AdPlayer library in React Native.

## Step 1: Preparations

Running this example requires `publisher` and `tag` ids.

### Android

They can be configures in the root `local.properties` file like this:

```properties
sdk.dir=...

av_pub_id={published id goes here}
av_tag_id={tag id goes here}
```

### iOS

Update ios/Constants.swift with your data
```
enum Constants {
    static let publisherId = ...
    static let tagId = ...
    static let storeURL = ...
}
```

After this project can simply be run as any other React Native project.

## Step 2: Start the Metro Server

First, you will need to start **Metro**, the JavaScript _bundler_ that ships _with_ React Native.

To start Metro, run the following command from the _root_ of your React Native project:

```shell
# using npm
npm start

# OR using Yarn
yarn start
```

## Step 3: Start your Application

Let Metro Bundler run in its _own_ terminal. Open a _new_ terminal from the _root_ of your React Native project. Run the following command to start your _Android_ or _iOS_ app:

### For Android

```bash
# using npm
npm run android

# OR using Yarn
yarn android
```

### For iOS

```bash
cd ios
pod install
# make sure 'pod install' succeeded

# using XCode:
# open and run: "ad_player_react_native.xcworkspace"

# using npm
npm run ios

# OR using Yarn
yarn ios

# OR using XCode
yarn ios
```


If everything is set up _correctly_, you should see your new app running in your _Android Emulator_ or _iOS Simulator_ shortly provided you have set up your emulator/simulator correctly.

This is one way to run your app — you can also run it directly from within Android Studio and Xcode respectively.

## Step 4: Modifying your App

Now that you have successfully run the app, let's modify it.

1. Open `App.tsx` in your text editor of choice and edit some lines.
2. For **Android**: Press the <kbd>R</kbd> key twice or select **"Reload"** from the **Developer Menu** (<kbd>Ctrl</kbd> + <kbd>M</kbd> (on Window and Linux) or <kbd>Cmd ⌘</kbd> + <kbd>M</kbd> (on macOS)) to see your changes!

   For **iOS**: Hit <kbd>Cmd ⌘</kbd> + <kbd>R</kbd> in your iOS Simulator to reload the app and see your changes!
