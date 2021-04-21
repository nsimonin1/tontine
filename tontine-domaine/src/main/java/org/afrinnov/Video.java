package org.afrinnov;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder(setterPrefix = "with")
@ToString
public class Video {
    private String id;
}
