class SeatConsumer {
    int count
    String description
    int category

    @Override
    String toString()
    {
        if(count>1) return "$description ($count persons)"
        return "$description"
    }
}
