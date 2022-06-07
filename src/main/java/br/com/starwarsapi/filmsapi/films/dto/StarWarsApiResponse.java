package br.com.starwarsapi.filmsapi.films.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class StarWarsApiResponse {

    private List<FilmResponse> results;
}
