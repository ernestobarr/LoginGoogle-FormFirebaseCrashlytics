package com.bc100520.logingoogle.authgoogle.login

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun CrashButton() {
    Button(onClick = {
        // Force a crash
        throw RuntimeException("Test Crash")
    }) {
        // Label for the button
        Text("Test Crashhh")
    }
}