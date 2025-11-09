package com.promni.folium.localization.markdown

const val coviEnMarkdown = """
### **COVI: A White-Label Android Platform**

###
### *Project Summary*

**COVI** is a native Android application that serves as the central hub for vehicle owners to manage their warranties, service appointments, and important documents.

This is a complex, long-term project developed as a **white-label platform**. The single codebase uses a **multi-flavor build system** to produce and manage **5+ distinct branded applications**, each with unique branding, resources, and API configurations.

The project went through significant modernizations, migrating from a legacy **MVP / RxJava / Dagger2 / XML** application to a modern, **MVVM / Coroutines & Flow / Hilt / Jetpack Compose** architecture. This evolution was focused on improving performance, enhancing code quality, and ensuring long-term scalability.

###
### *Core Functionality*

* **Vehicle & Warranty Management:** A digital glovebox for users to access vehicle health data, warranty details, contracts, and protection product information.
* **Service & Claims:** Allows users to schedule service appointments, initiate/submit claims, and receive real-time status updates.
* **Document Hub:** Secure storage for users to upload and manage important paperwork.
* **Third-Party Integrations:** Connects with third-party services, including live GPS tracking for requested tow services.

###
### *Technical Architecture*

* **Language:** **Kotlin**.
* **UI Toolkit:** **Jetpack Compose** & **Material 3** (migrated from Android Views & XML).
* **Architecture:** **MVVM (Model-View-ViewModel)** (migrated from MVP).
* **Async:** **Kotlin Coroutines** & **Flow** (migrated from RxJava).
* **Dependency Injection:** **Hilt** (migrated from Dagger 2).
* **Database:** **Room** for local persistence.
* **Networking:** **Retrofit**, **OkHttp** (with Moshi for JSON parsing).
* **Authentication:** Custom OAuth and token management system.
* **Navigation:** A hybrid of **FragNav** (legacy) and **Jetpack Navigation** (for new Compose screens).
* **Image Loading:** **Picasso**.

###
### *Quality & Performance*

* **Multi-Flavor Build System:** Manages **5+ white-label apps** and 4 environments (Dev, Test, Staging, Prod) from one codebase.
* **CI/CD Pipeline:** Established a robust CI/CD pipeline using **GitHub Actions** and **Fastlane** for automated builds, testing, and deployment to **Firebase App Distribution** and the Google Play Store.
* **Static Code Analysis:** Enforced high code quality and consistency across the team by integrating **Ktlint** and **Detekt** into the CI pipeline.
* **Comprehensive Test Suite:**
    * **Unit Tests:** **JUnit**, **Robolectric**, and **MockK**.
    * **UI Tests:** **Espresso** (for Views) and **Compose UI Tests** (for Compose).
    * **Screenshot Testing:** Visual regression testing using **AndroidX Screenshot Testing**.
* **Stability & Performance:**
    * Monitored using **Firebase Crashlytics / Posthog Analytics**.
    * Identifying and resolving performance issues using **Memory Profiling**, **Layout Inspection**, **Database Optimization**, and **Baseline Profiles**.
    * Integrated **LeakCanary** and **Chuck** (in debug/QA builds) for runtime debugging.

###
### *Key Libraries & Dependencies*

#### **UI & Graphics**

* Jetpack Compose (Material 3, Tooling)
* AndroidX (Core, AppCompat, ConstraintLayout, SwipeRefreshLayout)
* Picasso (Image Loading)
* CameraX (In-app camera features)
* Android PDF Viewer
* **Legacy:** Android XML Layouts & ViewBinding

#### **Architecture & Lifecycle**

* AndroidX Lifecycle (ViewModel, Runtime)
* Jetpack Navigation
* Hilt (Dependency Injection)
* Room (Database)
* FragNav (Navigation)
* **Legacy:** Dagger 2, MVP Architecture

#### **Data & Networking**

* Kotlin Coroutines & Flow
* Retrofit & OkHttp (Networking)
* Moshi (JSON parsing)
* JWTDecode
* **Legacy:** RxJava 2 & RxKotlin

#### **Firebase Ecosystem**

* Firebase Analytics
* Firebase Crashlytics
* Firebase Cloud Messaging (FCM)

#### **Google Play Services**

* Google Play Services (Location, Maps)
* Google Play In-App Review

#### **Analytics & Tooling**

* LeakCanary (Memory Leak Detection)
* Chuck (HTTP Inspection)

#### **Code Quality & Testing**

* Ktlint & Detekt (Static Analysis)
* JUnit & MockK (Unit Tests)
* Robolectric (Unit Tests)
* Espresso & Compose UI (UI Tests)
* AndroidX Screenshot Test
* AndroidX Benchmark (Baseline Profiles)
"""

const val coviDeMarkdown = """
### **COVI: Eine White-Label-Android-Plattform**

###
### *Projektübersicht*

**COVI** ist eine native Android-Anwendung, die als zentraler Hub für Fahrzeughalter dient, um ihre Garantien, Servicetermine und wichtigen Dokumente zu verwalten.

Dies ist ein komplexes, langfristiges Projekt, das als **White-Label-Plattform** entwickelt wurde. Die einzige Codebasis verwendet ein **Multi-Flavor-Build-System**, um **mehr als 5 verschiedene Markenanwendungen** zu erstellen und zu verwalten, jede mit einzigartigem Branding, Ressourcen und API-Konfigurationen.

Das Projekt durchlief bedeutende Modernisierungen und migrierte von einer veralteten **MVP / RxJava / Dagger2 / XML**-Anwendung zu einer modernen **MVVM / Coroutines & Flow / Hilt / Jetpack Compose**-Architektur. Diese Entwicklung zielte darauf ab, die Leistung zu verbessern, die Codequalität zu erhöhen und die langfristige Skalierbarkeit sicherzustellen.

###
### *Kernfunktionalität*

* **Fahrzeug- und Garantieverwaltung:** Ein digitales Handschuhfach, in dem Benutzer auf Fahrzeugzustandsdaten, Garantiedetails, Verträge und Informationen zu Schutzprodukten zugreifen können.
* **Service und Ansprüche:** Ermöglicht Benutzern, Servicetermine zu planen, Ansprüche zu initiieren/einzureichen und Echtzeit-Statusaktualisierungen zu erhalten.
* **Dokumenten-Hub:** Sicherer Speicher für Benutzer zum Hochladen und Verwalten wichtiger Unterlagen.
* **Integrationen von Drittanbietern:** Verbindet sich mit Diensten von Drittanbietern, einschließlich Live-GPS-Tracking für angeforderte Abschleppdienste.

###
### *Technische Architektur*

* **Sprache:** **Kotlin**.
* **UI-Toolkit:** **Jetpack Compose** und **Material 3** (migriert von Android Views und XML).
* **Architektur:** **MVVM (Model-View-ViewModel)** (migriert von MVP).
* **Asynchron:** **Kotlin Coroutines** und **Flow** (migriert von RxJava).
* **Dependency Injection:** **Hilt** (migriert von Dagger 2).
* **Datenbank:** **Room** für die lokale Persistenz.
* **Netzwerk:** **Retrofit**, **OkHttp** (mit Moshi für das JSON-Parsing).
* **Authentifizierung:** Benutzerdefiniertes OAuth- und Token-Verwaltungssystem.
* **Navigation:** Eine Mischung aus **FragNav** (veraltet) und **Jetpack Navigation** (für neue Compose-Bildschirme).
* **Bildladen:** **Picasso**.

###
### *Qualität und Leistung*

* **Multi-Flavor-Build-System:** Verwaltet **mehr als 5 White-Label-Apps** und 4 Umgebungen (Dev, Test, Staging, Prod) aus einer Codebasis.
* **CI/CD-Pipeline:** Eine robuste CI/CD-Pipeline mit **GitHub Actions** und **Fastlane** für automatisierte Builds, Tests und die Bereitstellung in **Firebase App Distribution** und im Google Play Store wurde eingerichtet.
* **Statische Code-Analyse:** Hohe Codequalität und Konsistenz im gesamten Team durch die Integration von **Ktlint** und **Detekt** in die CI-Pipeline.
* **Umfassende Testsuite:**
    * **Unit-Tests:** **JUnit**, **Robolectric** und **MockK**.
    * **UI-Tests:** **Espresso** (für Views) und **Compose-UI-Tests** (für Compose).
    * **Screenshot-Tests:** Visuelle Regressionstests mit **AndroidX Screenshot Testing**.
* **Stabilität und Leistung:**
    * Überwacht mit **Firebase Crashlytics / Posthog Analytics**.
    * Identifizierung und Behebung von Leistungsproblemen mit **Memory Profiling**, **Layout Inspection**, **Datenbankoptimierung** und **Baseline Profiles**.
    * Integration von **LeakCanary** und **Chuck** (in Debug-/QA-Builds) für das Laufzeit-Debugging.

###
### *Wichtige Bibliotheken und Abhängigkeiten*

#### **UI und Grafik**

* Jetpack Compose (Material 3, Tooling)
* AndroidX (Core, AppCompat, ConstraintLayout, SwipeRefreshLayout)
* Picasso (Bildladen)
* CameraX (In-App-Kamerafunktionen)
* Android PDF Viewer
* **Veraltet:** Android-XML-Layouts und ViewBinding

#### **Architektur und Lebenszyklus**

* AndroidX Lifecycle (ViewModel, Runtime)
* Jetpack Navigation
* Hilt (Dependency Injection)
* Room (Datenbank)
* FragNav (Navigation)
* **Veraltet:** Dagger 2, MVP-Architektur

#### **Daten und Netzwerk**

* Kotlin Coroutines und Flow
* Retrofit und OkHttp (Netzwerk)
* Moshi (JSON-Parsing)
* JWTDecode
* **Veraltet:** RxJava 2 und RxKotlin

#### **Firebase-Ökosystem**

* Firebase Analytics
* Firebase Crashlytics
* Firebase Cloud Messaging (FCM)

#### **Google Play-Dienste**

* Google Play-Dienste (Standort, Karten)
* Google Play In-App Review

#### **Analyse und Tooling**

* LeakCanary (Speicherleckerkennung)
* Chuck (HTTP-Inspektion)

#### **Codequalität und Tests**

* Ktlint und Detekt (statische Analyse)
* JUnit und MockK (Unit-Tests)
* Robolectric (Unit-Tests)
* Espresso und Compose UI (UI-Tests)
* AndroidX Screenshot Test
* AndroidX Benchmark (Baseline-Profile)
"""
