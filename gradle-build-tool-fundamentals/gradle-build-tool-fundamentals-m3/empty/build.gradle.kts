task hello {
    doFirst {
        print 'Hello'
    }

    doLast {
        println(', Wold!')
    }
}