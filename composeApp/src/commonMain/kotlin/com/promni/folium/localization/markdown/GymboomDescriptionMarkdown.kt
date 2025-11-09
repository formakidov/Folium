package com.promni.folium.localization.markdown

const val gymboomEnMarkdown = """
### **Gymboom: A Native Android Fitness Tracker**

###
### *Project Summary*

**Gymboom** was a comprehensive, native Android fitness tracker and workout logger designed for simplicity and powerful data visualization. The app provided users with a complete toolkit to log workouts, track body measurements, and visualize their progress over time, all synced to a cloud backend.

The app's core strength was its robust data handling, built on a classic **Parse Platform (BaaS)** backend for cloud sync and user management, combined with a local **ORMLite** SQL database for fast, offline-first data access.

Key user-facing features included a detailed workout calendar, a "Program Store" for in-app monetization, advanced progress statistics using **MPAndroidChart**, and extensive social integrations with **Facebook, Twitter, and VK**.

###
### *Core Functionality*

* **Detailed Workout Logger:** (As seen in screenshots) Allowed users to log exercises, sets, reps, and weight, complete with a rest timer.
* **Progress Statistics & Charting:** Integrated **MPAndroidChart** to provide users with dynamic line graphs of their strength and measurement progress over time.
* **Body Measurement Tracker:** A dedicated module for logging various body measurements, such as weight, body fat %, and biceps/chest size.
* **Workout Calendar:** Utilized the **Caldroid** library to display a visual calendar of past and future planned workout days.
* **Exercise Reference Guide:** A built-in "Reference book" with exercise diagrams, muscle group information, and step-by-step technique instructions.
* **Cloud Sync & Backend:** Leveraged the **Parse Platform (BaaS)** for all user authentication, cloud data storage, and data synchronization.
* **Monetization (Store & Ads):** Featured a "Program Store" for selling pre-built workout plans and integrated **Google AdMob** for ad revenue.
* **Social Logins:** Implemented **Facebook, Twitter, and VK SDKs** for streamlined user registration and social sharing.
* **Data Backup & Export:** Integrated with the **Google Drive API** and **OpenCSV** to allow users to back up, restore, and export their workout data.

###
### *Technical Architecture*

* **Language:** **Java 7**.
* **UI Toolkit:** **Android XML** (with Design Support Library, CardView, RecyclerView).
* **Architecture:** **MVP/MVC** (Model-View-Controller), with a clear separation between UI, local data (ORMLite), and cloud data (Parse).
* **Backend-as-a-Service (BaaS):** **Parse Platform** for auth, sync, and cloud database.
* **Local Database:** **ORMLite** for relational (SQL) on-device data persistence and offline-first capabilities.
* **Analytics:** **Google Analytics** for tracking user behavior and feature adoption.
* **Image Loading:** **Glide** for optimized image loading and caching.
* **Permissions:** **Nammu** library for handling Android 6.0 (Marshmallow) runtime permissions.

###
### *Key Libraries & Integrations*

#### **Backend & Data**

* **Parse Platform:** Cloud sync, auth, and backend.
* **ORMLite:** Local SQL database.
* **Google Drive API:** For user-controlled data backup and restore.
* **OpenCSV:** For exporting user data.

#### **UI & Graphics**

* **MPAndroidChart:** Core of the "Statistics" feature for progress graphs.
* **Caldroid:** For the workout calendar view.
* **MaterialDateTimePicker:** Used for logging dates of workouts and measurements.
* **Glide:** Image loading.

#### **Social SDKs & Monetization**

* **Facebook SDK:** Social login.
* **Twitter SDK:** Social login.
* **VK SDK:** Social login.
* **Google AdMob:** Monetization via ads.

#### **Google Play Services**

* **Ads:** For AdMob.
* **Analytics:** For Google Analytics.
* **Drive:** For backup/restore functionality.
"""

const val gymboomDeMarkdown = """
### **Gymboom: Ein nativer Android-Fitness-Tracker**

###
### *Projektübersicht*

**Gymboom** war ein umfassender, nativer Android-Fitness-Tracker und Workout-Logger, der auf Einfachheit und leistungsstarke Datenvisualisierung ausgelegt war. Die App bot den Nutzern ein komplettes Toolkit zum Protokollieren von Trainingseinheiten, zum Verfolgen von Körpermaßen und zur Visualisierung ihres Fortschritts im Laufe der Zeit, alles synchronisiert mit einem Cloud-Backend.

Die Kernstärke der App lag in ihrer robusten Datenverarbeitung, die auf einem klassischen **Parse Platform (BaaS)**-Backend für die Cloud-Synchronisierung und Benutzerverwaltung basierte, kombiniert mit einer lokalen **ORMLite**-SQL-Datenbank für einen schnellen, offline-fähigen Datenzugriff.

Zu den wichtigsten benutzerorientierten Funktionen gehörten ein detaillierter Trainingskalender, ein „Programm-Store“ für die In-App-Monetarisierung, erweiterte Fortschrittsstatistiken mit **MPAndroidChart** und umfangreiche soziale Integrationen mit **Facebook, Twitter und VK**.

###
### *Kernfunktionalität*

* **Detaillierter Workout-Logger:** (Wie in den Screenshots zu sehen) Ermöglichte es den Nutzern, Übungen, Sätze, Wiederholungen und Gewicht zu protokollieren, komplett mit einem Pausentimer.
* **Fortschrittsstatistiken und Diagramme:** Integrierte **MPAndroidChart**, um den Nutzern dynamische Liniendiagramme ihres Kraft- und Messfortschritts im Laufe der Zeit zu liefern.
* **Körpermaß-Tracker:** Ein spezielles Modul zum Protokollieren verschiedener Körpermaße wie Gewicht, Körperfettanteil und Bizeps-/Brustumfang.
* **Trainingskalender:** Nutzte die **Caldroid**-Bibliothek, um einen visuellen Kalender der vergangenen und zukünftig geplanten Trainingstage anzuzeigen.
* **Übungs-Nachschlagewerk:** Ein integriertes „Nachschlagewerk“ mit Übungsdiagrammen, Informationen zu Muskelgruppen und schrittweisen Technikanleitungen.
* **Cloud-Synchronisierung und Backend:** Nutzte die **Parse Platform (BaaS)** für die gesamte Benutzerauthentifizierung, die Cloud-Datenspeicherung und die Datensynchronisierung.
* **Monetarisierung (Store und Anzeigen):** Verfügte über einen „Programm-Store“ zum Verkauf vorgefertigter Trainingspläne und integrierte **Google AdMob** für Werbeeinnahmen.
* **Soziale Anmeldungen:** Implementierte **Facebook-, Twitter- und VK-SDKs** für eine optimierte Benutzerregistrierung und das Teilen in sozialen Netzwerken.
* **Datensicherung und -export:** Integriert mit der **Google Drive API** und **OpenCSV**, damit Benutzer ihre Trainingsdaten sichern, wiederherstellen und exportieren können.

###
### *Technische Architektur*

* **Sprache:** **Java 7**.
* **UI-Toolkit:** **Android XML** (mit Design Support Library, CardView, RecyclerView).
* **Architektur:** **MVP/MVC** (Model-View-Controller), mit einer klaren Trennung zwischen Benutzeroberfläche, lokalen Daten (ORMLite) und Cloud-Daten (Parse).
* **Backend-as-a-Service (BaaS):** **Parse Platform** für Authentifizierung, Synchronisierung und Cloud-Datenbank.
* **Lokale Datenbank:** **ORMLite** für die relationale (SQL) geräteinterne Datenpersistenz und Offline-First-Fähigkeiten.
* **Analysen:** **Google Analytics** zur Verfolgung des Nutzerverhaltens und der Funktionsakzeptanz.
* **Bildladen:** **Glide** für optimiertes Laden und Zwischenspeichern von Bildern.
* **Berechtigungen:** **Nammu**-Bibliothek zur Handhabung von Laufzeitberechtigungen für Android 6.0 (Marshmallow).

###
### *Wichtige Bibliotheken und Integrationen*

#### **Backend und Daten**

* **Parse Platform:** Cloud-Synchronisierung, Authentifizierung und Backend.
* **ORMLite:** Lokale SQL-Datenbank.
* **Google Drive API:** Für die benutzergesteuerte Datensicherung und -wiederherstellung.
* **OpenCSV:** Für den Export von Benutzerdaten.

#### **UI und Grafik**

* **MPAndroidChart:** Kern der „Statistik“-Funktion für Fortschrittsdiagramme.
* **Caldroid:** Für die Trainingskalenderansicht.
* **MaterialDateTimePicker:** Wird zum Protokollieren von Trainings- und Messdaten verwendet.
* **Glide:** Bildladen.

#### **Soziale SDKs und Monetarisierung**

* **Facebook SDK:** Soziale Anmeldung.
* **Twitter SDK:** Soziale Anmeldung.
* **VK SDK:** Soziale Anmeldung.
* **Google AdMob:** Monetarisierung durch Anzeigen.

#### **Google Play-Dienste**

* **Anzeigen:** Für AdMob.
* **Analysen:** Für Google Analytics.
* **Drive:** Für die Sicherungs-/Wiederherstellungsfunktion.
"""
