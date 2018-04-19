package bj

import kotlinext.js.js
import kotlinx.html.style
import react.RBuilder
import react.dom.b
import react.dom.div

fun RBuilder.handUI() {
    div {

        attrs.style = js {
            with = "10rem"
            height = "10rem"
            padding = "1rem"
            marginTop = "1rem"
            marginRight = "1rem"
            background = "cyan"
        }

        div { b { +"Player hand" } }
        div { +"cards goes here" }
        div { b { +"12 Points" } }
    }
}
