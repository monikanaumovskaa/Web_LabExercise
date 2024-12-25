package mk.ukim.finki.wp.lab.repository.inMemory;
import mk.ukim.finki.wp.lab.model.Artist;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class InMemoryArtistRepository {
    List<Artist> artistList = new ArrayList<>();

    public InMemoryArtistRepository() {
        artistList.add(new Artist( "Jelena", "Rozga", "Croatian singer and performer"));
        artistList.add(new Artist("Elvis", "Presley", "king of rock and roll"));
        artistList.add(new Artist("Aleksandra", "Prijovic", "Serbian pop singer"));
        artistList.add(new Artist("Michael", "Jackson", "king of pop"));
        artistList.add(new Artist("Beyoncé", "Knowles", "singer, dancer, and actress"));
    }

    public List<Artist> findAll() {
        return artistList;
    }

    public Optional<Artist> findById(Long id){
        return artistList.stream()
                .filter(artist -> artist.getId()==id)
                .findFirst();
    }
}
