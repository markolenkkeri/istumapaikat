
class Room {
    int id
    int seats
    String description
    int category
    List<SeatConsumer> seatUsageList = new ArrayList<>()

    def addConsumer(SeatConsumer consumer)
    {
        seatUsageList.add(consumer)
        seats -=consumer.count
    }

    @Override
    String toString()
    {
        return "Room $id, $description : $seatUsageList"
    }
}
