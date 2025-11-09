# Portare Folium - KMP Portfolio

This is my personal portfolio, reimagined as a fully-native Kotlin Multiplatform application. It's designed to showcase my projects and skills in a modern, responsive, and cross-platform way.

The app is built entirely with **Compose Multiplatform** and runs on **Android, iOS, Desktop, and Web**.

[Live Demo (GitHub Pages)](https://formakidov.github.io/Folium)

## Features

This project serves as a practical demonstration of modern KMP development, incorporating a wide range of best practices and libraries:

* **100% Kotlin Multiplatform:** A single shared codebase for all business logic and UI.
* **Highly Responsive UI:** A single, adaptable UI built with Compose that looks great on any screen size, from a phone to a desktop monitor. (Go ahead, try to break the UI!)
* **Material 3 Design:** Implements the latest Material Design 3 principles, components, and icons.
* **Custom Theming:** Uses a full custom color palette generated with the [Material Theme Builder](https://material-foundation.github.io/material-theme-builder/) for a unique, consistent look.
* **Custom Internationalization (i18n):** Features a custom-built, type-safe solution for app localization.
* **Multiplatform Data Persistence:** Uses **KStore** for simple, type-safe key-value storage, persisting user preferences (like the selected language) across all platforms.
* **Custom Composable Components:** Features a variety of custom-built UI elements to create a unique user experience..
* **Modern Architecture:** Built with a clean MVVM architecture using **Jetpack/Compose ViewModel** for state management.
* **Dependency Injection:** Uses **Koin** for dependency injection across all shared source sets (common, android, jvm, etc.).
* **Type-Safe Navigation:** Leverages **Jetpack/Compose Navigation** for screen transitions.
* **Fast Development Cycle:** Integrates the **Compose Hot Reload** plugin for near-instant UI updates during development.
* **Dynamic Project Descriptions:** Leverages the [Multiplatform-Markdown-Renderer](https://github.com/mikepenz/multiplatform-markdown-renderer) to parse and display detailed project information from local.

## Tech Stack & Libraries

This project uses a modern, multiplatform-first tech stack:

* **Core:**
    * [Kotlin Multiplatform](https://kotlinlang.org/docs/multiplatform.html)
    * [Kotlinx Coroutines](https://github.com/Kotlin/kotlinx.coroutines)
    * [Kotlinx Serialization](https://github.com/Kotlin/kotlinx.serialization)
* **UI (commonMain):**
    * [Compose Multiplatform](https://github.com/JetBrains/compose-multiplatform)
    * [Compose Material 3](https://developer.android.com/jetpack/compose/design-systems/material3)
    * [Compose Material Icons Extended](https://developer.android.com/jetpack/compose/icons#icons-extended)
    * [Multiplatform-Markdown-Renderer](https://github.com/mikepenz/multiplatform-markdown-renderer)
* **Architecture & State (commonMain):**
    * [Jetpack/Compose ViewModel](https://developer.android.com/jetpack/androidx/releases/lifecycle)
    * [Jetpack Navigation for Compose](https://developer.android.com/jetpack/compose/navigation)
    * [Material 3 Window Size Class](https://developer.android.com/reference/kotlin/androidx/compose/material3/windowsizeclass/package-summary)
* **Dependency Injection (commonMain):**
    * [Koin (Core, Compose, ViewModel)](https://insert-koin.io/)
* **Data & Storage:**
    * [KStore](https://github.com/xxfast/KStore) (commonMain)
    * `KStore-file` (Android, iOS, JVM)
    * `KStore-storage` (Web)
* **Utilities:**
    * [Multiplatform-Paths](https://github.com/jClapL/multiplatform-paths) (for KStore file access)

## Supported Platforms

* **Android** (Min SDK 26)
* **iOS** (arm64 & simulator)
* **Desktop (JVM)** (Windows, macOS, Linux)
* **Web** (JS & WasmJS)
