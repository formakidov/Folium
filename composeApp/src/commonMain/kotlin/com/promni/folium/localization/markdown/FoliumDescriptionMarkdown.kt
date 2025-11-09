package com.promni.folium.localization.markdown

const val foliumEnMarkdown = """
### **Portare Folium - KMP Portfolio**

This is my personal portfolio, reimagined as a fully-native Kotlin Multiplatform application. It's designed to showcase my projects and skills in a modern, responsive, and cross-platform way.

The app is built entirely with **Compose Multiplatform** and runs on **Android, iOS, Desktop, and Web**.

###
### *Features*

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
* **Dynamic Project Descriptions:** Leverages the Multiplatform-Markdown-Renderer to parse and display detailed project information from local Markdown files.

###
### *Key Libraries & Integrations*

#### **Core**

* **Kotlin Multiplatform**
* **Kotlinx Coroutines**
* **Kotlinx Serialization**

#### **UI**

* **Compose Multiplatform**
* **Compose Material 3**
* **Compose Material Icons Extended**
* **Multiplatform-Markdown-Renderer**

#### **Architecture & State**

* **Jetpack/Compose ViewModel**
* **Jetpack Navigation for Compose**
* **Material 3 Window Size Class**

#### **Dependency Injection**

* **Koin (Core, Compose, ViewModel)**

#### **Data & Storage**

* **KStore (commonMain)**
* **KStore-file (Android, iOS, JVM)**
* **KStore-storage (Web)**

#### **Utilities**

* **Multiplatform-Paths (for KStore file access)**
"""

const val foliumDeMarkdown = """
### **Portare Folium - KMP-Portfolio**

Dies ist mein persönliches Portfolio, neu konzipiert als eine vollständig native Kotlin Multiplattform-Anwendung. Es wurde entwickelt, um meine Projekte und Fähigkeiten auf moderne, ansprechende und plattformübergreifende Weise zu präsentieren.

Die App wurde vollständig mit **Compose Multiplatform** erstellt und läuft auf **Android, iOS, Desktop und Web**.

###
### *Funktionen*

Dieses Projekt dient als praktische Demonstration der modernen KMP-Entwicklung und umfasst eine Vielzahl von Best Practices und Bibliotheken:

* **100 % Kotlin Multiplattform:** Eine einzige gemeinsame Codebasis für die gesamte Geschäftslogik und Benutzeroberfläche.
* **Hochgradig ansprechendes UI:** Eine einzige, anpassungsfähige Benutzeroberfläche, die mit Compose erstellt wurde und auf jeder Bildschirmgröße, vom Smartphone bis zum Desktop-Monitor, großartig aussieht. (Probieren Sie ruhig, die Benutzeroberfläche zu „zerbrechen“!)
* **Material 3 Design:** Implementiert die neuesten Prinzipien, Komponenten und Symbole von Material Design 3.
* **Benutzerdefiniertes Theming:** Verwendet eine vollständig benutzerdefinierte Farbpalette, die mit dem [Material Theme Builder](https://material-foundation.github.io/material-theme-builder/) für ein einzigartiges, einheitliches Erscheinungsbild generiert wurde.
* **Benutzerdefinierte Internationalisierung (i18n):** Bietet eine maßgeschneiderte, typsichere Lösung für die App-Lokalisierung.
* **Plattformübergreifende Datenpersistenz:** Verwendet **KStore** für eine einfache, typsichere Schlüssel-Wert-Speicherung, mit der Benutzereinstellungen (wie die ausgewählte Sprache) auf allen Plattformen gespeichert werden.
* **Benutzerdefinierte zusammensetzbare Komponenten:** Bietet eine Vielzahl von maßgeschneiderten UI-Elementen, um ein einzigartiges Benutzererlebnis zu schaffen.
* **Moderne Architektur:** Basiert auf einer sauberen MVVM-Architektur mit **Jetpack/Compose ViewModel** für die Zustandsverwaltung.
* **Dependency Injection:** Verwendet **Koin** für die Dependency Injection in allen gemeinsamen Quellsätzen (common, android, jvm usw.).
* **Typsichere Navigation:** Nutzt **Jetpack/Compose Navigation** für Bildschirmübergänge.
* **Schneller Entwicklungszyklus:** Integriert das **Compose Hot Reload**-Plugin für nahezu sofortige UI-Aktualisierungen während der Entwicklung.
* **Dynamische Projektbeschreibungen:** Nutzt den Multiplatform-Markdown-Renderer, um detaillierte Projektinformationen aus lokalen Markdown-Dateien zu parsen und anzuzeigen.

###
### *Wichtige Bibliotheken und Integrationen*

#### **Kern**

* **Kotlin Multiplattform**
* **Kotlinx Coroutines**
* **Kotlinx Serialization**

#### **UI**

* **Compose Multiplattform**
* **Compose Material 3**
* **Compose Material Icons Extended**
* **Multiplatform-Markdown-Renderer**

#### **Architektur und Zustand**

* **Jetpack/Compose ViewModel**
* **Jetpack Navigation für Compose**
* **Material 3 Window Size Class**

#### **Dependency Injection**

* **Koin (Core, Compose, ViewModel)**

#### **Daten und Speicherung**

* **KStore (commonMain)**
* **KStore-file (Android, iOS, JVM)**
* **KStore-storage (Web)**

#### **Dienstprogramme**

* **Multiplatform-Paths (für den Dateizugriff von KStore)**
"""
