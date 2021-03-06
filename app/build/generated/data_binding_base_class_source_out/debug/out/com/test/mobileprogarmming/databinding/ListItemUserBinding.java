// Generated by view binder compiler. Do not edit!
package com.test.mobileprogarmming.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.test.mobileprogarmming.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ListItemUserBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView ivPoster;

  @NonNull
  public final TextView tvEmail;

  @NonNull
  public final TextView tvName;

  private ListItemUserBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView ivPoster,
      @NonNull TextView tvEmail, @NonNull TextView tvName) {
    this.rootView = rootView;
    this.ivPoster = ivPoster;
    this.tvEmail = tvEmail;
    this.tvName = tvName;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ListItemUserBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ListItemUserBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.list_item_user, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ListItemUserBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ivPoster;
      ImageView ivPoster = rootView.findViewById(id);
      if (ivPoster == null) {
        break missingId;
      }

      id = R.id.tvEmail;
      TextView tvEmail = rootView.findViewById(id);
      if (tvEmail == null) {
        break missingId;
      }

      id = R.id.tvName;
      TextView tvName = rootView.findViewById(id);
      if (tvName == null) {
        break missingId;
      }

      return new ListItemUserBinding((ConstraintLayout) rootView, ivPoster, tvEmail, tvName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
