public class StreamPuzzle {
    public static void main(String[] args){
        SongSearch songSearch = new SongSearch();
        songSearch.printTopFive();

        songSearch.search("The Beatles");
        songSearch.search("The Beach Boys");
    }
    
}
