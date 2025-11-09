package com.promni.folium.localization.markdown

const val litepdfEnMarkdown = """
### **Lite PDF Reader: A Native Android Utility**

###
### **Project Summary**

**Lite PDF Reader** was a native Android utility built in 2014, designed to be an extremely fast and lightweight PDF viewer for a wide range of devices, including those with limited memory.

The app's engineering was heavily focused on **performance and memory optimization**. It utilized the **Android NDK (C/C++)** to interface with a native PDF rendering library, enabling fast page loading and a complex "Text Search" feature.

Key technical challenges included building a custom, memory-efficient **page thumbnail preview list** (as seen in the screenshots), implementing a real-time **blur effect** for the UI (a difficult task in 2014), and developing a background service to automatically scan and discover all PDF files on a user's device.

*(Note: This project was completed in 2014, and the original source code was not retained. This description is based on the core functionality and key technical challenges from memory.)*

###
### *Core Functionality*

* **High-Performance PDF Rendering:** Leveraged a native (C/C++) library via the **Android NDK** to render PDF pages quickly and efficiently.
* **Page Thumbnail Preview:** Displayed a horizontal, scrollable list of page thumbnails at the bottom of the reader, allowing for quick navigation (as seen in screenshot 3).
* **Automatic Library Scanning:** A background service automatically scanned the device's storage to find all PDF documents and build a visual library for the user (as seen in screenshot 2).
* **Native Text-in-PDF Search:** Implemented a "search" feature that used the NDK to find text directly within the PDF document.
* **Modern UI (for 2014):**
    * **"Recent Documents" Grid:** A custom GridView with animations to display the 9 most recently opened files (as seen in screenshot 1).
    * **Blur Effect UI:** Used a blur effect to create a "glassmorphism" style when showing the thumbnail preview (as seen in screenshot 3).
* **File Management:** Allowed users to delete files directly from the app's library.

###
### *Technical Architecture*

* **Language:** **Java** and **C/C++ (via NDK)**.
* **UI Toolkit:** **Android XML**, with significant development of **custom View components** and GridView customizations.
* **Core Engine:** **Android NDK** to bridge Java code with a native C/C++ library for all core PDF operations (rendering, search).
* **Asynchronous Operations:** **AsyncTask** (standard for 2014) for background tasks like loading pages and generating thumbnails.
* **Background Tasks:** A persistent **Service** was used for the file system scanner.

###
### *Key Technical Challenges & Responsibilities*

* **NDK Integration & PDF Core:** My primary responsibility was integrating and managing the native PDF rendering library. This involved writing the JNI (Java Native Interface) bridge code to pass data between the Java UI and the C/C++ backend for rendering pages and processing text searches.
* **Advanced Memory Management (Thumbnail Rail):** The horizontal page preview list was the most complex feature. It required rendering multiple small bitmaps (thumbnails) of PDF pages in real-time. This demanded meticulous memory management, including:
    * Implementing a bitmap caching and recycling strategy to prevent OutOfMemoryError exceptions.
    * Efficiently loading and unloading thumbnails as the user scrolled.
* **Performant Blur Effect (2014):** Implementing a real-time blur effect was a major UI challenge on 2014-era hardware. This involved writing a highly optimized function (likely using RenderScript or a custom algorithm) to blur the main PDF view without causing UI lag or excessive memory consumption.
* **Custom GridView & Animations:** Built the custom, animated GridView for the "Recent" and "Library" screens, which required custom adapters and view logic to handle the book-cover-like appearance.
* **Background File System Scanner:** Developed the efficient background Service that could scan the user's storage for PDF files without draining the battery or impacting device performance.
"""

const val litepdfDeMarkdown = """
### **Lite PDF Reader: Ein natives Android-Dienstprogramm**

###
### **Projektübersicht**

**Lite PDF Reader** war ein 2014 entwickeltes natives Android-Dienstprogramm, das als extrem schneller und leichtgewichtiger PDF-Viewer für eine Vielzahl von Geräten, einschließlich solcher mit begrenztem Speicher, konzipiert war.

Die Entwicklung der App konzentrierte sich stark auf **Leistungs- und Speicheroptimierung**. Sie nutzte das **Android NDK (C/C++)**, um eine Schnittstelle zu einer nativen PDF-Rendering-Bibliothek zu schaffen, was ein schnelles Laden von Seiten und eine komplexe „Textsuche“-Funktion ermöglichte.

Zu den wichtigsten technischen Herausforderungen gehörten die Erstellung einer benutzerdefinierten, speichereffizienten **Seiten-Miniaturansichtsliste** (wie in den Screenshots zu sehen), die Implementierung eines Echtzeit-**Unschärfeeffekts** für die Benutzeroberfläche (eine schwierige Aufgabe im Jahr 2014) und die Entwicklung eines Hintergrunddienstes zum automatischen Scannen und Erkennen aller PDF-Dateien auf dem Gerät eines Benutzers.

*(Hinweis: Dieses Projekt wurde 2014 abgeschlossen, und der ursprüngliche Quellcode wurde nicht aufbewahrt. Diese Beschreibung basiert auf der Kernfunktionalität und den wichtigsten technischen Herausforderungen aus dem Gedächtnis.)*

###
### *Kernfunktionalität*

* **Hochleistungs-PDF-Rendering:** Nutzte eine native (C/C++) Bibliothek über das **Android NDK**, um PDF-Seiten schnell und effizient zu rendern.
* **Seiten-Miniaturansicht:** Zeigte eine horizontale, scrollbare Liste von Seiten-Miniaturansichten am unteren Rand des Lesegeräts an, die eine schnelle Navigation ermöglichte (wie in Screenshot 3 zu sehen).
* **Automatisches Scannen der Bibliothek:** Ein Hintergrunddienst scannte automatisch den Speicher des Geräts, um alle PDF-Dokumente zu finden und eine visuelle Bibliothek für den Benutzer zu erstellen (wie in Screenshot 2 zu sehen).
* **Native Text-in-PDF-Suche:** Implementierte eine „Suchen“-Funktion, die das NDK verwendete, um Text direkt im PDF-Dokument zu finden.
* **Moderne Benutzeroberfläche (für 2014):**
    * **Raster „Zuletzt geöffnete Dokumente“:** Ein benutzerdefiniertes GridView mit Animationen zur Anzeige der 9 zuletzt geöffneten Dateien (wie in Screenshot 1 zu sehen).
    * **Benutzeroberfläche mit Unschärfeeffekt:** Verwendete einen Unschärfeeffekt, um einen „Glassmorphismus“-Stil zu erzeugen, wenn die Miniaturansicht angezeigt wurde (wie in Screenshot 3 zu sehen).
* **Dateiverwaltung:** Ermöglichte es den Benutzern, Dateien direkt aus der Bibliothek der App zu löschen.

###
### *Technische Architektur*

* **Sprache:** **Java** und **C/C++ (über NDK)**.
* **UI-Toolkit:** **Android XML**, mit bedeutender Entwicklung von **benutzerdefinierten Ansichtskomponenten** und GridView-Anpassungen.
* **Kern-Engine:** **Android NDK** zur Überbrückung von Java-Code mit einer nativen C/C++-Bibliothek für alle Kern-PDF-Operationen (Rendern, Suchen).
* **Asynchrone Operationen:** **AsyncTask** (Standard für 2014) für Hintergrundaufgaben wie das Laden von Seiten und das Erstellen von Miniaturansichten.
* **Hintergrundaufgaben:** Ein persistenter **Dienst** wurde für den Dateisystem-Scanner verwendet.

###
### *Wichtige technische Herausforderungen und Verantwortlichkeiten*

* **NDK-Integration und PDF-Kern:** Meine Hauptverantwortung lag in der Integration und Verwaltung der nativen PDF-Rendering-Bibliothek. Dies umfasste das Schreiben des JNI (Java Native Interface)-Brückencodes, um Daten zwischen der Java-Benutzeroberfläche und dem C/C++-Backend zum Rendern von Seiten und Verarbeiten von Textsuchen zu übergeben.
* **Erweitertes Speichermanagement (Miniaturansichtsleiste):** Die horizontale Seiten-Vorschau-Liste war die komplexeste Funktion. Sie erforderte das Rendern mehrerer kleiner Bitmaps (Miniaturansichten) von PDF-Seiten in Echtzeit. Dies erforderte ein sorgfältiges Speichermanagement, einschließlich:
    * Implementierung einer Bitmap-Caching- und Recycling-Strategie zur Vermeidung von OutOfMemoryError-Ausnahmen.
    * Effizientes Laden und Entladen von Miniaturansichten, während der Benutzer scrollte.
* **Leistungsstarker Unschärfeeffekt (2014):** Die Implementierung eines Echtzeit-Unschärfeeffekts war eine große Herausforderung für die Benutzeroberfläche auf der Hardware von 2014. Dies erforderte das Schreiben einer hoch optimierten Funktion (wahrscheinlich mit RenderScript oder einem benutzerdefinierten Algorithmus), um die Haupt-PDF-Ansicht ohne UI-Verzögerung oder übermäßigen Speicherverbrauch unscharf zu machen.
* **Benutzerdefiniertes GridView und Animationen:** Erstellung des benutzerdefinierten, animierten GridView für die Bildschirme „Zuletzt“ und „Bibliothek“, was benutzerdefinierte Adapter und Ansichtslogik erforderte, um das buchähnliche Erscheinungsbild zu handhaben.
* **Hintergrund-Dateisystem-Scanner:** Entwicklung des effizienten Hintergrunddienstes, der den Speicher des Benutzers nach PDF-Dateien durchsuchen konnte, ohne den Akku zu belasten oder die Geräteleistung zu beeinträchtigen.
"""
