package index

import bj.Game
import bj.gameUI
import kotlinext.js.require
import kotlinext.js.requireAll
import react.dom.render
import kotlin.browser.document


val game = Game()

fun main(args: Array<String>) {
    requireAll(require.context("src", true, js("/\\.css$/")))

    val rootDiv = document.getElementById("root")
    render(rootDiv) {

        gameUI(game )

    }
}


