package com.promni.folium.localization.markdown

const val tarotEnMarkdown = """
### **Aesthetic Tarot: An Android Showcase** 

###
### *Project Summary*

**Aesthetic Tarot** is a mature, native Android application focused on delivering a high-quality, immersive user experience. It features a unique and fluid UI built with **Jetpack Compose**, with many animations and a strong attention to detail.

The app is engineered for performance and stability, achieving **99.9% crash-free and ANR-free** sessions. Key optimizations include the elimination of unnecessary recompositions in Compose and the implementation of **Baseline Profiles** for a fast, reliable startup.

Originally built with XML, the app was migrated to **Jetpack Compose** to adhere to modern development practices. With full **localization for 7 languages** and integrated monetization (Google Play Billing & AdMob), it represents a complete, production-ready, and polished application.

###
### *Core Functionality*

* **AI-Powered Readings:** Integrates AI for generating personalized and dynamic tarot interpretations.
* **Stunning, Animated UI:** A custom-designed, fully animated interface built for an engaging user experience.
* **Monetization:** Implements both a subscription model via **Google Play Billing** and advertisements via **Google AdMob** (with UMP for consent).
* **Localization:** Fully translated and adapted for **7 languages**.
* **Dynamic Content:** Uses **Firebase Remote Config** and **Realtime Database** for A/B testing and updating content without an app release.
* **Push Notifications:** Leverages **Firebase Cloud Messaging (FCM)** for user engagement.
* **Adaptive Design:** UI optimized for a wide range of Android screen densities and sizes.

###
### *Technical Architecture*

* **Language:** **Kotlin**.
* **UI Toolkit:** **Jetpack Compose** (migrated from XML).
* **Architecture:** **MVVM (Model-View-ViewModel)**.
* **Async:** **Kotlin Coroutines** and **Flow** for all async operations.
* **Dependency Injection:** **Hilt** for managing dependencies.
* **Database:** **Room** for local persistence.
* **Networking:** **Retrofit** & **OkHttp** for API communication.
* **Image Loading:** **Coil** for optimized image loading in Compose.
* **Background Tasks:** **WorkManager** for deferrable background operations.

###
### *Quality & Performance*

* **UI Performance:** The Compose UI is highly optimized, **eliminating unnecessary recompositions** for a smooth, jank-free experience.
* **App Start:** **Baseline Profiles** are generated and benchmarked.
* **Stability:** Actively monitored with **Firebase Crashlysics** to maintain **99.9% crash-free and ANR-free** sessions.
* **Performance Monitoring:** **Firebase Performance Monitoring** is integrated to track startup time, network requests, and custom traces.
* **Security:** Implements the **Google Play Integrity API** (via Firebase App Check) to protect against tampering and abuse.

###
### *Key Libraries & Dependencies*

#### **UI & Graphics**

* Jetpack Compose (UI, Material 3, Tooling, Activity)
* Coil (Image Loading)
* Core SplashScreen

#### **Architecture & Lifecycle**

* AndroidX Lifecycle (ViewModel, Runtime)
* Hilt (Dependency Injection)
* AndroidX WorkManager (Background Tasks)

#### **Data & Networking**

* Room (Database)
* Retrofit & OkHttp (Networking)
* DataStore (Key-value storage)
* Timber (Logging)

#### **Firebase Ecosystem**

* Firebase BOM
* Analytics
* Crashlytics
* Performance
* Cloud Messaging (FCM)
* Remote Config
* Realtime Database
* App Check

#### **Google Play Services**

* Google Play Billing
* Google Mobile Ads (AdMob)
* User Messaging Platform (UMP)
* Google Play Integrity
* Google Play In-App Review

#### **Build & Performance**

* AndroidX Benchmark (Baseline Profile)
* AndroidX ProfileInstaller
"""

const val tarotDeMarkdown = """
### **Ästhetisches Tarot: Ein Android-Showcase**

###
### *Projektübersicht*

**Ästhetisches Tarot** ist eine ausgereifte, native Android-Anwendung, die sich darauf konzentriert, ein hochwertiges, immersives Benutzererlebnis zu bieten. Sie verfügt über eine einzigartige und flüssige Benutzeroberfläche, die mit **Jetpack Compose** erstellt wurde, mit vielen Animationen und viel Liebe zum Detail.

Die App ist auf Leistung und Stabilität ausgelegt und erreicht **99,9 % absturz- und ANR-freie** Sitzungen. Zu den wichtigsten Optimierungen gehören die Eliminierung unnötiger Neuzusammensetzungen in Compose und die Implementierung von **Baseline-Profilen** für einen schnellen, zuverlässigen Start.

Ursprünglich mit XML erstellt, wurde die App auf **Jetpack Compose** migriert, um modernen Entwicklungspraktiken zu entsprechen. Mit vollständiger **Lokalisierung für 7 Sprachen** und integrierter Monetarisierung (Google Play Billing & AdMob) stellt sie eine vollständige, produktionsreife und ausgefeilte Anwendung dar.

###
### *Kernfunktionalität*

* **KI-gestützte Lesungen:** Integriert KI zur Erstellung personalisierter und dynamischer Tarot-Interpretationen.
* **Atemberaubende, animierte Benutzeroberfläche:** Eine maßgeschneiderte, vollständig animierte Benutzeroberfläche für ein ansprechendes Benutzererlebnis.
* **Monetarisierung:** Implementiert sowohl ein Abonnementmodell über **Google Play Billing** als auch Werbung über **Google AdMob** (mit UMP zur Einwilligung).
* **Lokalisierung:** Vollständig übersetzt und für **7 Sprachen** angepasst.
* **Dynamischer Inhalt:** Verwendet **Firebase Remote Config** und **Echtzeitdatenbank** für A/B-Tests und die Aktualisierung von Inhalten ohne App-Veröffentlichung.
* **Push-Benachrichtigungen:** Nutzt **Firebase Cloud Messaging (FCM)** zur Benutzerbindung.
* **Adaptives Design:** Benutzeroberfläche optimiert für eine Vielzahl von Android-Bildschirmdichten und -größen.

###
### *Technische Architektur*

* **Sprache:** **Kotlin**.
* **UI-Toolkit:** **Jetpack Compose** (migriert von XML).
* **Architektur:** **MVVM (Model-View-ViewModel)**.
* **Asynchron:** **Kotlin Coroutines** und **Flow** für alle asynchronen Operationen.
* **Dependency Injection:** **Hilt** zur Verwaltung von Abhängigkeiten.
* **Datenbank:** **Room** für die lokale Persistenz.
* **Netzwerk:** **Retrofit** & **OkHttp** für die API-Kommunikation.
* **Bildladen:** **Coil** für optimiertes Bildladen in Compose.
* **Hintergrundaufgaben:** **WorkManager** für aufschiebbare Hintergrundoperationen.

###
### *Qualität und Leistung*

* **UI-Leistung:** Die Compose-Benutzeroberfläche ist hoch optimiert und **eliminiert unnötige Neuzusammensetzungen** für ein reibungsloses, ruckelfreies Erlebnis.
* **App-Start:** **Baseline-Profile** werden generiert und gebenchmarkt.
* **Stabilität:** Wird aktiv mit **Firebase Crashlysics** überwacht, um **99,9 % absturz- und ANR-freie** Sitzungen aufrechtzuerhalten.
* **Leistungsüberwachung:** **Firebase Performance Monitoring** ist integriert, um die Startzeit, Netzwerkanfragen und benutzerdefinierte Traces zu verfolgen.
* **Sicherheit:** Implementiert die **Google Play Integrity API** (über Firebase App Check), um vor Manipulation und Missbrauch zu schützen.

###
### *Wichtige Bibliotheken und Abhängigkeiten*

#### **UI und Grafik**

* Jetpack Compose (UI, Material 3, Tooling, Activity)
* Coil (Bildladen)
* Core SplashScreen

#### **Architektur und Lebenszyklus**

* AndroidX Lifecycle (ViewModel, Runtime)
* Hilt (Dependency Injection)
* AndroidX WorkManager (Hintergrundaufgaben)

#### **Daten und Netzwerk**

* Room (Datenbank)
* Retrofit & OkHttp (Netzwerk)
* DataStore (Schlüssel-Wert-Speicher)
* Timber (Protokollierung)

#### **Firebase-Ökosystem**

* Firebase BOM
* Analytics
* Crashlytics
* Performance
* Cloud Messaging (FCM)
* Remote Config
* Echtzeitdatenbank
* App Check

#### **Google Play-Dienste**

* Google Play Billing
* Google Mobile Ads (AdMob)
* User Messaging Platform (UMP)
* Google Play Integrity
* Google Play In-App Review

#### **Build und Leistung**

* AndroidX Benchmark (Baseline-Profil)
* AndroidX ProfileInstaller
"""
