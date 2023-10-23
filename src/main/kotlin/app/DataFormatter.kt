package app

class DataFormatter : IDataFormattingReceiver {
    override fun reformatDataToFormat1() = println("reformatting data to a new format")
    override fun reformatDataToFormat2() = println("reformatting data to a previous format")
}