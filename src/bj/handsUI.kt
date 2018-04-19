package bj

import react.RBuilder
import react.dom.b
import react.dom.div

fun RBuilder.handUI() {
    div {
        div { b { +"Player hand" } }
        div { +"cards goes here" }
        div { b { +"12 Points" } }
    }
}
