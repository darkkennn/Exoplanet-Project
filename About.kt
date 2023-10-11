package com.example.exoplanetapp.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.navigation.Link
import com.example.exoplanetapp.components.layouts.PageLayout
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Page
@Composable
fun AboutPage() {
    PageLayout("ABOUT") {
        Text("This page will tell you more about what exoplanets are! " +
                " An exoplanet, short for \"extrasolar planet,\" is a celestial body that orbits a star outside of our solar system. These distant worlds have captivated the imagination of scientists and space enthusiasts alike, as they hold the potential to unlock some of the universe's greatest mysteries. Exoplanets come in a vast array of sizes, compositions, and environments, ranging from scorching hot gas giants to frigid, rocky planets. Their discovery has reshaped our understanding of the cosmos and fueled the search for habitable worlds beyond Earth, bringing us one step closer to answering the profound question: are we alone in the universe? " +
                " So today our machines have developed enough to search for a habitable exoplanet!")
        P()
        Link("https://exoplanets.nasa.gov/", "NASA's blog on Exoplanets\n")
        P()

        Text("\n Above is the Link to a blog by NASA on Exoplanets! We humbly ask you to check it out if you want to know" +
                "\nmore about what an exoplanet is! Now on to our exoplanet, if you wish to know more about our exoplanet, " +
                "\n click on the link below ")
        P()
        Link("/markdown", "Our Exoplanet")
    }
}
