/*
 * Copyright (C) 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.android.wallpaper.picker;

import android.app.Application;

import com.android.wallpaper.module.InjectorProvider;
import com.android.wallpaper.module.WallpaperPicker2Injector;

/**
 * Application subclass that initializes the injector.
 */
public class WallpapersApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Initialize the injector.
        InjectorProvider.setInjector(new WallpaperPicker2Injector());
    }
}
