import SwiftUI
import ComposeApp

@main
struct iOSApp: App {

    init() {
        KoinKt.doInitKoinIos()
    }

    var body: some Scene {
        WindowGroup {
            ContentView()
                .onOpenURL { url in
                    ExternalUriHandler.shared.onNewUri(uri: url.absoluteString)
                }
        }
    }
    
    func application(
        _ application: UIApplication,
        open uri: URL,
        options: [UIApplication.OpenURLOptionsKey: Any] = [:]
    ) -> Bool {
        // Sends the full URI on to the singleton
        ExternalUriHandler.shared.onNewUri(uri: uri.absoluteString)
            return true
        }
}
