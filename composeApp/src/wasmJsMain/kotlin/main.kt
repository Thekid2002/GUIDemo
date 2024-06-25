import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.ComposeViewport
import kotlinx.browser.document

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    ComposeViewport(document.body!!) {
        var showHome by remember { mutableStateOf(false) }
        var page2 by remember { mutableStateOf(false) }
        var page3 by remember { mutableStateOf(false) }
        var page4 by remember { mutableStateOf(false) }

        Column {
            Row (Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
                Button(onClick = { showHome = !showHome }) {
                    Text("Home")
                }
                Button(onClick = { page2 = !page2 }) {
                    Text("Go to next page")
                }
                Button(onClick = { page3 = !page3 }) {
                    Text("Go to next page")
                }
                Button(onClick = { page4 = !page4 }) {
                    Text("Go to next page")
                }
            }
            if (showHome) {
                App()
            }
        }
    }
}