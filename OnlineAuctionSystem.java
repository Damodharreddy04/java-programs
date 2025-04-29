import java.util.*;

class AuctionItem {
    String name;
    int bidAmount;

    AuctionItem(String name, int bidAmount) {
        this.name = name;
        this.bidAmount = bidAmount;
    }
}

class OnlineAuctionSystem {
    public static void main(String[] args) {
        Queue<AuctionItem> auctionQueue = new PriorityQueue<>(Comparator.comparingInt(a -> -a.bidAmount));
        auctionQueue.add(new AuctionItem("Painting", 1000));
        auctionQueue.add(new AuctionItem("Sculpture", 500));
        System.out.println("Auction Items: " + auctionQueue);
    }
}