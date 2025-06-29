tasks.register("hello") {
    doFirst {
        print("Hel")
    }

    doLast {
        println("lo, ")
    }

}

tasks.register("world") {

    dependsOn("hello")

    doFirst {
        print("Wo")
    }

    doLast {
        println("rld")
    }
}



