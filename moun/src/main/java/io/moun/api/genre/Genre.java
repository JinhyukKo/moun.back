package io.moun.api.genre;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import org.hibernate.annotations.Immutable;

@Entity
@Getter
@Immutable
public class Genre {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        @Enumerated(EnumType.STRING)
        private GenreType genreType;
}
