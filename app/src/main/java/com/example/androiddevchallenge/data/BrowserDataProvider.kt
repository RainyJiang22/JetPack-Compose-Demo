package com.example.androiddevchallenge.data

import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.bean.Browser

/**
 * @author jacky
 * @date 2021/3/15
 *
 * the provider of browser data
 */
object BrowserDataProvider {


    val DesertChic = Browser(
        id = 1,
        name = "Desert Chic",
        describe = "",
        images = listOf(
            R.drawable.desert_chic
        )
    )

    val TinyTerrariums = Browser(
        id = 2,
        name = "Tiny terrariums",
        describe = "",
        images = listOf(
            R.drawable.tiny_terrariums
        )
    )

    val JungleVibes = Browser(
        id = 3,
        name = "Jungle vibes",
        describe = "",
        images = listOf(
            R.drawable.jungle_vibes
        )
    )

    val EasyCare = Browser(
        id = 4,
        name = "Easy care",
        describe = "",
        images = listOf(
            R.drawable.easy_care
        )
    )

    val Statements = Browser(
        id = 5,
        name = "Statements",
        describe = "",
        images = listOf(
            R.drawable.statements
        )
    )

    val Monstera = Browser(
        id = 6,
        name = "Monstera",
        describe = "This is a description",
        images = listOf(
            R.drawable.monstera
        )
    )


    val Aglaonema = Browser(
        id = 7,
        name = "Aglaonema",
        describe = "This is a description",
        images = listOf(
            R.drawable.aglaonema
        )
    )
    val PeaceLily = Browser(
        id = 8,
        name = "PeaceLily",
        describe = "This is a description",
        images = listOf(
            R.drawable.peace_lily
        )
    )
    val FiddleLeafTree = Browser(
        id = 9,
        name = "Fiddle leaf tree",
        describe = "This is a description",
        images = listOf(
            R.drawable.fiddle_leaf
        )
    )

    val SnakePlant = Browser(
        id = 10,
        name = "Snake plant",
        describe = "This is a description",
        images = listOf(
            R.drawable.snake_plant
        )
    )

    val Pothos = Browser(
        id = 11,
        name = "Pothos",
        describe = "This is a description",
        images = listOf(
            R.drawable.pothos
        )
    )


    val banner = listOf(
        DesertChic, TinyTerrariums, JungleVibes, EasyCare, Statements
    )

    val browserList = listOf(
        Monstera, Aglaonema, PeaceLily, FiddleLeafTree, SnakePlant, Pothos
    )

}