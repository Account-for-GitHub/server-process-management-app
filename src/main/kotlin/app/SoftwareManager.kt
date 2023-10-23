package app

class SoftwareManager : ISoftwareReceiver {
    override fun softwareInstall() = println("installing software")
    override fun softwareRemove() = println("software installation failed, removing software")
}