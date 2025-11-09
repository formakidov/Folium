package com.promni.folium.localization.markdown

const val mftEnMarkdown = """
### Muscle Fatigue Tracker

###
### *Overview*

**Muscle Fatigue Tracker** is a Kotlin Multiplatform (KMP) application designed to help users **monitor and track muscle fatigue levels and recovery times**. This project demonstrates modern development best practices, including **MVVM, Clean Architecture, and Jetpack/JetBrains Compose**, and **GitHub Actions** for continuous integration. The app targets **Android, iOS, and Desktop**.

###
### *Key Features*

- **Fatigue & Recovery Tracking:** Log fatigue levels for different muscles after workouts.
- **Dynamic Sorting & Filtering:** Users can sort the muscle list based on fatigue, recovery time, or name, and filter by muscle groups to quickly find what they're looking for.
- **Adaptive UI:** The application features dynamic styling and is fully adaptable to any form factor, providing a seamless experience on phones, foldables, tablets, and desktops.

###
### *Core Technologies*

- **Kotlin** – Primary programming language
- **Jetpack/JetBrains Compose** – Modern UI toolkit for building declarative, reactive UIs across multiple platforms.

###
### *Architecture*

- **Clean Architecture** – Organizes the application into distinct layers:
    - **Presentation Layer (UI):** Built with Compose, responsible for UI state management and user interactions.
    - **Domain Layer:** Houses business logic and use cases, ensuring testability and separation of concerns.
    - **Data Layer:** Manages local data persistence via **Room** and **DataStore**.
- **MVVM (Model-View-ViewModel):**
    - **ViewModel** – Fetches data from the domain layer and exposes it to the UI.
    - **View** – Composable UI components observe data from ViewModel.
- **Dependency Injection (Koin):** Lightweight DI framework for easy dependency management and testability.

###
### *Architectural Highlights*

- **Platform-Agnostic Domain Layer:** The Clean Architecture approach ensures that all business logic (how fatigue is calculated, how data is sorted) is written in pure Kotlin in the `commonMain` source set. This is the core benefit of KMP—this critical code is written once and shared across Android, iOS, and Desktop without modification.
- **Shared ViewModels:** Thanks to Koin and lifecycle libraries, the `ViewModels` are also located in `commonMain`, allowing you to share the UI state management and presentation logic across all platforms.
- **Multiplatform Data Persistence:** You're using the KMP-compatible versions of **Room** and **DataStore**, which is a modern and robust way to handle local data storage in a shared codebase.

###
### *Developer Experience & Code Quality*

- **Automated Code Quality Checks:** The project uses pre-commit hooks to automatically format code and run static analysis. This enforces a consistent style and catches potential bugs before they are even committed to the repository.
- **Compose Hot Reload:** The project is configured with Compose Hot Reload, which allows for near-instantaneous UI updates during development without needing to restart the application, significantly speeding up the development workflow.

###
### *Libraries Used*

#### **UI**

- **Jetpack/JetBrains Compose** – Declarative UI framework for Android, iOS, and Desktop.
- **Koalaplot** \- A Compose multiplatform library for creating charts.

#### **Data**

- **Room** – Local database management.
- **DataStore** \- For storing simple key-value pairs.
- **SQLite** \- Bundled for local storage.

#### **Concurrency**

- **Kotlin Coroutines** – For efficient background tasks.
- **Flow** – Handles real-time data streams asynchronously.

#### **Other**

- **Kotlinx DateTime** \- For handling dates and times in a multiplatform way.

#### **Testing**

- **JUnit 5** – Core testing framework.
- **Kotlin Coroutines Test** – For testing coroutine-based code.
- **Koin Test** – Dependency injection testing utilities.
- **Mokkery** \- A mocking library for Kotlin Multiplatform.

###
### *Continuous Integration (CI)*

#### **GitHub Actions Workflow**

The project is integrated with **GitHub Actions** for automated testing and builds.
"""

const val mftDeMarkdown = """
### Muskelermüdungs-Tracker

###
### *Überblick*

**Muskelermüdungs-Tracker** ist eine Kotlin Multiplattform (KMP)-Anwendung, die Benutzern helfen soll, **Muskelermüdungsgrade und Erholungszeiten zu überwachen und zu verfolgen**. Dieses Projekt demonstriert moderne Entwicklungspraktiken, einschließlich **MVVM, Clean Architecture und Jetpack/JetBrains Compose**, sowie **GitHub Actions** für die kontinuierliche Integration. Die App zielt auf **Android, iOS und Desktop**.

###
### *Hauptmerkmale*

- **Ermüdungs- und Erholungsverfolgung:** Protokollieren Sie die Ermüdungsgrade für verschiedene Muskeln nach dem Training.
- **Dynamisches Sortieren und Filtern:** Benutzer können die Muskelliste nach Ermüdung, Erholungszeit oder Name sortieren und nach Muskelgruppen filtern, um schnell zu finden, was sie suchen.
- **Anpassungsfähige Benutzeroberfläche:** Die Anwendung verfügt über ein dynamisches Design und ist vollständig an jeden Formfaktor anpassbar, was ein nahtloses Erlebnis auf Telefonen, faltbaren Geräten, Tablets und Desktops bietet.

###
### *Kerntechnologien*

- **Kotlin** – Hauptprogrammiersprache
- **Jetpack/JetBrains Compose** – Modernes UI-Toolkit zum Erstellen deklarativer, reaktiver Benutzeroberflächen auf mehreren Plattformen.

###
### *Architektur*

- **Clean Architecture** – Organisiert die Anwendung in verschiedene Schichten:
    - **Präsentationsschicht (UI):** Mit Compose erstellt, verantwortlich für die Verwaltung des UI-Zustands und die Benutzerinteraktionen.
    - **Domänenschicht:** Beherbergt die Geschäftslogik und Anwendungsfälle und gewährleistet Testbarkeit und Trennung der Belange.
    - **Datenschicht:** Verwaltet die lokale Datenpersistenz über **Room** und **DataStore**.
- **MVVM (Model-View-ViewModel):**
    - **ViewModel** – Ruft Daten aus der Domänenschicht ab und stellt sie der Benutzeroberfläche zur Verfügung.
    - **View** – Zusammensetzbare UI-Komponenten beobachten Daten aus dem ViewModel.
- **Dependency Injection (Koin):** Leichtgewichtiges DI-Framework für eine einfache Abhängigkeitsverwaltung und Testbarkeit.

###
### *Architektonische Highlights*

- **Plattformunabhängige Domänenschicht:** Der Clean-Architecture-Ansatz stellt sicher, dass die gesamte Geschäftslogik (wie die Ermüdung berechnet wird, wie Daten sortiert werden) in reinem Kotlin im `commonMain`-Quellsatz geschrieben wird. Dies ist der Hauptvorteil von KMP – dieser kritische Code wird einmal geschrieben und ohne Änderungen auf Android, iOS und Desktop gemeinsam genutzt.
- **Geteilte ViewModels:** Dank Koin und Lebenszyklus-Bibliotheken befinden sich die `ViewModels` ebenfalls in `commonMain`, sodass Sie die Verwaltung des UI-Zustands und die Präsentationslogik auf allen Plattformen gemeinsam nutzen können.
- **Plattformübergreifende Datenpersistenz:** Sie verwenden die KMP-kompatiblen Versionen von **Room** und **DataStore**, eine moderne und robuste Methode zur Handhabung der lokalen Datenspeicherung in einer gemeinsamen Codebasis.

###
### *Entwicklererfahrung und Codequalität*

- **Automatisierte Codequalitätsprüfungen:** Das Projekt verwendet Pre-Commit-Hooks, um den Code automatisch zu formatieren und eine statische Analyse durchzuführen. Dies erzwingt einen konsistenten Stil und fängt potenzielle Fehler ab, bevor sie überhaupt in das Repository übernommen werden.
- **Compose Hot Reload:** Das Projekt ist mit Compose Hot Reload konfiguriert, das nahezu sofortige UI-Aktualisierungen während der Entwicklung ermöglicht, ohne die Anwendung neu starten zu müssen, was den Entwicklungsworkflow erheblich beschleunigt.

###
### *Verwendete Bibliotheken*

#### **UI**

- **Jetpack/JetBrains Compose** – Deklaratives UI-Framework für Android, iOS und Desktop.
- **Koalaplot** – Eine Compose-Multiplattform-Bibliothek zum Erstellen von Diagrammen.

#### **Daten**

- **Room** – Lokale Datenbankverwaltung.
- **DataStore** – Zum Speichern einfacher Schlüssel-Wert-Paare.
- **SQLite** – Für die lokale Speicherung gebündelt.

#### **Gleichzeitigkeit**

- **Kotlin Coroutines** – Für effiziente Hintergrundaufgaben.
- **Flow** – Verarbeitet Echtzeit-Datenströme asynchron.

#### **Sonstiges**

- **Kotlinx DateTime** – Zur plattformübergreifenden Handhabung von Daten und Zeiten.

#### **Testen**

- **JUnit 5** – Kern-Testframework.
- **Kotlin Coroutines Test** – Zum Testen von Coroutine-basiertem Code.
- **Koin Test** – Dienstprogramme zum Testen der Dependency Injection.
- **Mokkery** – Eine Mocking-Bibliothek für Kotlin Multiplattform.

###
### *Kontinuierliche Integration (CI)*

#### **GitHub Actions Workflow**

Das Projekt ist mit **GitHub Actions** für automatisierte Tests und Builds integriert.
"""
