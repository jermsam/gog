import SwiftUI

struct ContentView: View {
    @EnvironmentObject var appState: AppState

    var body: some View {
        VStack(spacing: 16) {
            Text("Hello, World!")
                .font(.title)
                .fontWeight(.semibold)
                .multilineTextAlignment(.center)
                .padding(.horizontal)

            Button("Refresh") {
             
            }
            .buttonStyle(.borderedProminent)
        }
        .padding()
    }
}

#Preview {
    ContentView()
        .environmentObject(AppState())
}
