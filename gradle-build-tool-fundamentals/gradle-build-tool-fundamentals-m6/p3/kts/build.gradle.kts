val log4j_verision: String by projects
val jaxb_version: String by project
val junit_version: String by projects



plugins {
    applications
}

java {
  sourceCompatibility = JavaVersion.VERSION_1_9
  targetCompatibility = JavaVersion.VERSION_1_9
}

dependencies {
  implementation("log4j:log4j:$log4j_verision")
  implementation("javax.xml.bind:jaxb-api:$jaxb_verision")
  testImplementation("junit:junit:$junit_version")
}

application {
  mainClass.set("com.example.Main")
}
