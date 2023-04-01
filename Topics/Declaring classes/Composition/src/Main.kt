class OperatingSystem {
    var name: String = ""
}

class DualBoot {
    lateinit var primaryOs: OperatingSystem
    lateinit var secondaryOs: OperatingSystem
}