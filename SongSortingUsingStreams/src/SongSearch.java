import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class SongSearch {
    
    private final List<Song> songs = SongList.getSongs();

    void printTopFive(){
        List<String> topFive = songs.stream()
                                    .sorted(Comparator.comparingInt(Song::getTimesPlayed))
                                    .limit(5)
                                    .map(s -> s.getTitle())    
                                    .collect(Collectors.toList()); 
        System.out.println(topFive);
        }

    void search(String artist){
            Optional<Song> result = songs.stream()
                                         .filter(a -> a.getArtist().equals(artist))
                                         .findFirst();
            if (result.isPresent()){
                System.out.println(result.get().getTitle());
            } else {
                System.out.println("No songs found by: " + artist);
            }
        }
        
        
    }

