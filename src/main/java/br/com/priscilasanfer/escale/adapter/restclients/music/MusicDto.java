package br.com.priscilasanfer.escale.adapter.restclients.music;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MusicDto {
    private String id;
    private String name;
    private String artist;
    private String genre;
}
