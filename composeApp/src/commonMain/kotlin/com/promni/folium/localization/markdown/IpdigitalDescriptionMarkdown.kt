package com.promni.folium.localization.markdown

const val ipdigitalEnMarkdown = """
### **IPDigital: Android Digital Signage Player**

###
### *Project Summary*

**IPDigital** was a commercial-grade, native Android **player application** for a cloud-based (SaaS) digital signage platform. Written in 2015, this app was designed for 24/7, long-running operation on dedicated, low-resource Android hardware (like early TV-boxes and pre-Chromecast cast devices).

The app's core purpose was to remotely receive complex layout configurations and content schedules from a web backend and dynamically render them on-screen. This involved a heavy focus on **custom View development** for a widget-based UI and **aggressive memory management** to ensure stability and prevent OutOfMemoryError exceptions during continuous operation.

*(Note: This project was completed in 2015, and the original source code was not retained. This description is based on the core functionality and key technical challenges from memory.)*

###
### *Core Functionality*

* **Dynamic Layout & Content Engine:** The app would parse a remote configuration (likely JSON or XML) and dynamically build the entire UI at runtime, without requiring an app update.
* **Widget-Based UI:** Rendered a wide variety of pre-built content widgets, which the user could arrange remotely. This included:
    * Video Players (for ads and content)
    * Image Sliders / Galleries
    * Running Text Tickers (for news or custom text)
    * Live Weather Widgets
    * Clocks and Web Page Views
* **Advanced Content Scheduling:** The app managed a client-side schedule to execute complex ad campaigns, switching between different layouts and content playlists at precise, pre-programmed times.
* **24/7 Stability & Offline Caching:** Engineered for continuous, unattended operation. The app cached content to ensure playback continued even if the device's internet connection was temporarily lost.

###
### *Technical Architecture*

* **Language:** **Java**
* **UI Toolkit:** **Android XML** (Used for base layouts, with most of the UI being custom-built, dynamically-inflated views).
* **Networking:** **Android Volley** (Used to efficiently communicate with the backend for schedule updates and content fetching).
* **Core Architecture:** A service-based architecture where a background Service would periodically poll the backend for updates, download/cache media, and instruct the main Activity to re-render its custom view hierarchy.

###
### *Key Technical Challenges & Responsibilities*

* **Heavy Custom View Development:** The entire widget-based system was built on custom View components. This involved creating views from scratch for elements like the running text ticker, image/video sliders, and the grid-based layout manager that pieced them all together based on the remote configuration.
* **Aggressive Memory Management (OOM Prevention):** This was the primary technical challenge. Ensuring a 2015-era app could run 24/7 on low-memory hardware while looping videos and high-resolution images required meticulous memory management. This involved:
    * Careful bitmap handling, caching, and recycling.
    * Managing the lifecycle of VideoView and ImageView components to prevent memory leaks.
    * Implementing strategies to gracefully handle and recover from potential memory pressure without crashing.
* **Robust Video & Media Rendering:** Developed the client-side logic for seamless, looped playback of video and image-based campaigns, ensuring smooth transitions and no performance degradation over days of continuous operation.
* **Client-Side Scheduling Logic:** Wrote the core scheduling Service that acted as the app's "brain," managing the content lifecycle, parsing campaign timelines, and triggering UI/content updates at the exact scheduled intervals.
"""

const val ipdigitalDeMarkdown = """
### **IPDigital: Android Digital Signage Player**

###
### *Projektübersicht*

**IPDigital** war eine kommerzielle, native Android-**Player-Anwendung** für eine cloudbasierte (SaaS) Digital Signage-Plattform. Die 2015 geschriebene App wurde für den Dauerbetrieb rund um die Uhr auf dedizierter, ressourcenarmer Android-Hardware (wie frühen TV-Boxen und Geräten vor Chromecast) entwickelt.

Der Hauptzweck der App bestand darin, komplexe Layout-Konfigurationen und Inhaltspläne von einem Web-Backend remote zu empfangen und sie dynamisch auf dem Bildschirm darzustellen. Dies erforderte einen starken Fokus auf die **Entwicklung benutzerdefinierter Ansichten** für eine Widget-basierte Benutzeroberfläche und ein **aggressives Speichermanagement**, um die Stabilität zu gewährleisten und OutOfMemoryError-Ausnahmen während des Dauerbetriebs zu vermeiden.

*(Hinweis: Dieses Projekt wurde 2015 abgeschlossen, und der ursprüngliche Quellcode wurde nicht aufbewahrt. Diese Beschreibung basiert auf der Kernfunktionalität und den wichtigsten technischen Herausforderungen aus dem Gedächtnis.)*

###
### *Kernfunktionalität*

* **Dynamische Layout- und Inhalts-Engine:** Die App analysierte eine Remote-Konfiguration (wahrscheinlich JSON oder XML) und erstellte die gesamte Benutzeroberfläche zur Laufzeit dynamisch, ohne dass ein App-Update erforderlich war.
* **Widget-basierte Benutzeroberfläche:** Rendert eine Vielzahl vorgefertigter Inhalts-Widgets, die der Benutzer remote anordnen konnte. Dazu gehörten:
    * Videoplayer (für Anzeigen und Inhalte)
    * Bild-Slider / Galerien
    * Lauftext-Ticker (für Nachrichten oder benutzerdefinierten Text)
    * Live-Wetter-Widgets
    * Uhren und Webseitenansichten
* **Erweiterte Inhaltsplanung:** Die App verwaltete einen clientseitigen Zeitplan zur Ausführung komplexer Werbekampagnen, bei dem zu präzisen, vorprogrammierten Zeiten zwischen verschiedenen Layouts und Inhalts-Playlists gewechselt wurde.
* **Stabilität rund um die Uhr und Offline-Caching:** Entwickelt für den kontinuierlichen, unbeaufsichtigten Betrieb. Die App zwischengespeicherte Inhalte, um die Wiedergabe auch bei vorübergehendem Verlust der Internetverbindung des Geräts fortzusetzen.

###
### *Technische Architektur*

* **Sprache:** **Java**
* **UI-Toolkit:** **Android XML** (Wird für Basis-Layouts verwendet, wobei der größte Teil der Benutzeroberfläche aus benutzerdefinierten, dynamisch aufgeblähten Ansichten besteht).
* **Netzwerk:** **Android Volley** (Wird verwendet, um effizient mit dem Backend für Zeitplanaktualisierungen und das Abrufen von Inhalten zu kommunizieren).
* **Kernarchitektur:** Eine dienstbasierte Architektur, bei der ein Hintergrunddienst regelmäßig das Backend nach Aktualisierungen abfragte, Medien herunterlud/zwischenspeicherte und die Hauptaktivität anwies, ihre benutzerdefinierte Ansichtshierarchie neu zu rendern.

###
### *Wichtige technische Herausforderungen und Verantwortlichkeiten*

* **Umfangreiche Entwicklung benutzerdefinierter Ansichten:** Das gesamte Widget-basierte System basierte auf benutzerdefinierten Ansichtskomponenten. Dies umfasste die Erstellung von Ansichten von Grund auf für Elemente wie den Lauftext-Ticker, Bild-/Video-Slider und den gitterbasierten Layout-Manager, der sie alle basierend auf der Remote-Konfiguration zusammensetzte.
* **Aggressives Speichermanagement (OOM-Prävention):** Dies war die größte technische Herausforderung. Um sicherzustellen, dass eine App aus der Ära 2015 rund um die Uhr auf Hardware mit wenig Arbeitsspeicher laufen konnte, während Videos und hochauflösende Bilder in Schleifen abgespielt wurden, war ein sorgfältiges Speichermanagement erforderlich. Dies umfasste:
    * Sorgfältiger Umgang mit Bitmaps, Zwischenspeicherung und Wiederverwendung.
    * Verwaltung des Lebenszyklus von VideoView- und ImageView-Komponenten, um Speicherlecks zu vermeiden.
    * Implementierung von Strategien zur ordnungsgemäßen Handhabung und Wiederherstellung von potenziellem Speicherdruck ohne Absturz.
* **Robustes Rendern von Videos und Medien:** Entwicklung der clientseitigen Logik für eine nahtlose, wiederholte Wiedergabe von video- und bildbasierten Kampagnen, um reibungslose Übergänge und keine Leistungsverschlechterung über Tage des Dauerbetriebs zu gewährleisten.
* **Clientseitige Planungslogik:** Schreiben des zentralen Planungsdienstes, der als „Gehirn“ der App fungierte, den Lebenszyklus von Inhalten verwaltete, Kampagnenzeitpläne analysierte und UI-/Inhaltsaktualisierungen zu den exakt geplanten Intervallen auslöste.
"""
