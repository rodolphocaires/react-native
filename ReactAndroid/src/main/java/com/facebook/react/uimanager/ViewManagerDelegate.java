/*
 * Copyright (c) Facebook, Inc. and its affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package com.facebook.react.uimanager;

import android.view.View;
import androidx.annotation.Nullable;

/**
 * This is an interface that must be implemented by classes that wish to take over the
 * responsibility of setting properties of all views managed by the view manager.
 *
 * @param <T> the type of the view supported by this delegate
 */
public interface ViewManagerDelegate<T extends View> {
  void setProperty(T view, String propName, @Nullable Object value);
}
