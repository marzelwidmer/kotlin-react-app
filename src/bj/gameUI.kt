package bj

import kotlinx.html.style
import kotlinx.html.title
import react.RBuilder
import react.dom.div
import react.dom.h1

fun RBuilder.gameUI() {
    div {
        h1 { +"Blackjack" }
        div {

            attrs.title = "Foo"
            attrs.style = kotlinext.js.js {
                display = "flex"
            }

            // UI component
            handUI()
            handUI()
        }
    }
}