package me.ermicioia.simpleapp.border;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class GeneralErrorDto {

    private final String errorMessage;

    @Builder
    private static GeneralErrorDto create(@NonNull final String errorMessage) {
        return new GeneralErrorDto(errorMessage);
    }

}
