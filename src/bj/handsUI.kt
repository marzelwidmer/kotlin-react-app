package bj

import kotlinext.js.js
import kotlinx.html.style
import react.RBuilder
import react.dom.b
import react.dom.div

fun RBuilder.handUI(hand: Hand) {
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
        div {
            hand.cards.forEach {
                div {
                    +it.name
                }
            }
        }
        div { b { +"12 Points" } }
    }
}
