package com.promni.folium.localization.markdown

const val bevrageEnMarkdown = """
### **bevRAGE: A Native Android Cashback App**

###
### *Project Summary*

**bevRAGE** was a mature, native Android FinTech application focused on providing cash-back rebates for alcohol purchases at bars, restaurants, and retail stores. As a production-level app, it handled a large user base, API interactions, and the processing of user-submitted receipts.

A cornerstone feature was its **on-device receipt scanner**, which utilized the **Google Mobile Vision API** for Optical Character Recognition (OCR), allowing users to automatically capture and submit purchases.

The app was engineered with a robust and testable architecture, leveraging **Dagger 2** for dependency injection and **RxJava** to manage all asynchronous data streams and UI events, creating a fully reactive application.

###
### *Core Functionality*

* **Cash-Back Rebates:** Users could browse and redeem offers for beer, wine, and liquor from any bar, restaurant, or store.
* **On-Device Receipt Scanning:** Utilized the **Google Mobile Vision (OCR) API** to scan and automatically parse text from user-uploaded receipts, dramatically simplifying the submission process.
* **Location-Based Discovery:** Integrated **Google Maps** and **Location Services** to help users discover nearby offers and participating locations.
* **Ride-Hailing Integration:** Featured an **Uber API** integration, allowing users to "get a ride" directly from the app, promoting responsible consumption.
* **Social Authentication:** Implemented the **Facebook SDK** for streamlined user login and registration.
* **Advanced Analytics:** Leveraged **Localytics** and **AppsFlyer** for detailed user behavior analytics and marketing attribution.
* **Push Notifications:** Used **Firebase Cloud Messaging (FCM)** to engage users with new offers and account updates.

###
### *Technical Architecture*

* **Language:** **Java 8** (with Retrolambda for lambda support).
* **UI Toolkit:** **Android XML** (with Design Support Library & Material Design principles).
* **View Binding:** **Butter Knife** for efficient view injection.
* **Architecture:** **MVP (Reactive)**, using **RxJava** to manage state and data flow.
* **Async:** **RxJava 1** & **RxAndroid** for all asynchronous operations, from API calls to permission handling.
* **Dependency Injection:** **Dagger 2** for managing dependencies across the application.
* **Database:** **Realm** for on-device object-oriented data persistence.
* **Networking:** **Retrofit 2** with **OkHttp**, **Gson**, and **RxJava** adapters.
* **Image Loading:** **Glide** for optimized image loading and caching.
* **Permissions:** **RxPermissions** for handling runtime permissions in a reactive stream.

###
### *Key Libraries & Integrations*

#### **Google Play Services & Firebase**

* **Mobile Vision (OCR):** Core of the receipt scanning feature.
* **Maps & Location:** For location-based offer discovery.
* **Firebase Cloud Messaging (FCM):** For push notifications.
* **Firebase Crashlytics (Fabric):** For crash and stability monitoring.

#### **Architecture & Data**

* **Dagger 2:** Dependency Injection
* **RxJava 1 / RxAndroid:** Reactive programming framework.
* **Realm:** Local database.
* **Retrofit 2 / OkHttp:** Networking.
* **Gson:** JSON serialization.

#### **Third-Party APIs & SDKs**

* **Uber API:** Ride-hailing integration.
* **Facebook SDK:** Social login.
* **Localytics:** Analytics.
* **AppsFlyer:** Marketing attribution.

#### **UI & Utilities**

* **Glide:** Image loading.
* **Butter Knife:** View binding.
* **RxPermissions:** Runtime permissions.
* **MultiStateView:** Handling loading/empty/error UI states.
* **MagicIndicator:** ViewPager indicator.
"""

const val bevrageDeMarkdown = """
### **bevRAGE: Eine native Android-Cashback-App**

###
### *Projektübersicht*

**bevRAGE** war eine ausgereifte, native Android-FinTech-Anwendung, die sich darauf konzentrierte, Cashback-Rabatte für Alkoholkäufe in Bars, Restaurants und Einzelhandelsgeschäften anzubieten. Als produktionsreife App bewältigte sie eine große Nutzerbasis, API-Interaktionen und die Verarbeitung von von Nutzern eingereichten Belegen.

Ein Hauptmerkmal war der **geräteinterne Belegscanner**, der die **Google Mobile Vision API** für die optische Zeichenerkennung (OCR) nutzte, sodass Benutzer Käufe automatisch erfassen und einreichen konnten.

Die App wurde mit einer robusten und testbaren Architektur entwickelt, die **Dagger 2** für die Dependency Injection und **RxJava** zur Verwaltung aller asynchronen Datenströme und UI-Ereignisse nutzte, um eine vollständig reaktive Anwendung zu schaffen.

###
### *Kernfunktionalität*

* **Cashback-Rabatte:** Benutzer konnten Angebote für Bier, Wein und Spirituosen in jeder Bar, jedem Restaurant oder Geschäft durchsuchen und einlösen.
* **Geräteinternes Belegscannen:** Nutzte die **Google Mobile Vision (OCR) API** zum Scannen und automatischen Analysieren von Text aus von Benutzern hochgeladenen Belegen, was den Einreichungsprozess erheblich vereinfachte.
* **Standortbezogene Entdeckung:** Integrierte **Google Maps** und **Standortdienste**, um Benutzern zu helfen, Angebote in der Nähe und teilnehmende Standorte zu entdecken.
* **Fahrdienst-Integration:** Verfügte über eine **Uber-API**-Integration, mit der Benutzer direkt aus der App eine Fahrt bestellen konnten, um einen verantwortungsvollen Konsum zu fördern.
* **Soziale Authentifizierung:** Implementierte das **Facebook SDK** für eine optimierte Benutzeranmeldung und -registrierung.
* **Erweiterte Analysen:** Nutzte **Localytics** und **AppsFlyer** für detaillierte Analysen des Nutzerverhaltens und die Zuordnung von Marketingmaßnahmen.
* **Push-Benachrichtigungen:** Verwendete **Firebase Cloud Messaging (FCM)**, um Benutzer über neue Angebote und Kontoaktualisierungen zu informieren.

###
### *Technische Architektur*

* **Sprache:** **Java 8** (mit Retrolambda für Lambda-Unterstützung).
* **UI-Toolkit:** **Android XML** (mit Design Support Library und Material Design-Prinzipien).
* **View Binding:** **Butter Knife** für eine effiziente View-Injektion.
* **Architektur:** **MVP (reaktiv)**, unter Verwendung von **RxJava** zur Verwaltung von Zustand und Datenfluss.
* **Asynchron:** **RxJava 1** und **RxAndroid** für alle asynchronen Operationen, von API-Aufrufen bis zur Berechtigungsbehandlung.
* **Dependency Injection:** **Dagger 2** zur Verwaltung von Abhängigkeiten in der gesamten Anwendung.
* **Datenbank:** **Realm** für die geräteinterne objektorientierte Datenpersistenz.
* **Netzwerk:** **Retrofit 2** mit **OkHttp**-, **Gson**- und **RxJava**-Adaptern.
* **Bildladen:** **Glide** für optimiertes Laden und Zwischenspeichern von Bildern.
* **Berechtigungen:** **RxPermissions** zur Handhabung von Laufzeitberechtigungen in einem reaktiven Stream.

###
### *Wichtige Bibliotheken und Integrationen*

#### **Google Play-Dienste und Firebase**

* **Mobile Vision (OCR):** Kernfunktion des Belegscannens.
* **Karten und Standort:** Für die standortbezogene Angebotssuche.
* **Firebase Cloud Messaging (FCM):** Für Push-Benachrichtigungen.
* **Firebase Crashlytics (Fabric):** Zur Überwachung von Abstürzen und Stabilität.

#### **Architektur und Daten**

* **Dagger 2:** Dependency Injection
* **RxJava 1 / RxAndroid:** Reaktives Programmier-Framework.
* **Realm:** Lokale Datenbank.
* **Retrofit 2 / OkHttp:** Netzwerk.
* **Gson:** JSON-Serialisierung.

#### **APIs und SDKs von Drittanbietern**

* **Uber-API:** Fahrdienst-Integration.
* **Facebook SDK:** Soziale Anmeldung.
* **Localytics:** Analysen.
* **AppsFlyer:** Marketing-Attribution.

#### **UI und Dienstprogramme**

* **Glide:** Bildladen.
* **Butter Knife:** View Binding.
* **RxPermissions:** Laufzeitberechtigungen.
* **MultiStateView:** Handhabung von Lade-/Leer-/Fehler-UI-Zuständen.
* **MagicIndicator:** ViewPager-Indikator.
"""
