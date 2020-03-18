package com.example.user_profile2

import android.net.Uri
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * @author Omar Mulla Ibrahim
 * Student Nr 500766035
 */

/**
 * data class for the user info
 */
@Parcelize
data class Profile(
    val firstName: String,
    val lastName: String,
    val description: String,
    //Questionmark is added after Uri which indicates that this variable is nullable (foto is optinal)
    val imageUri: Uri?
) : Parcelable
