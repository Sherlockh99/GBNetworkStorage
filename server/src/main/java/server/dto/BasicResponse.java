package server.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
@Getter
@RequiredArgsConstructor
public class BasicResponse implements Serializable {

    private final String response;

}
