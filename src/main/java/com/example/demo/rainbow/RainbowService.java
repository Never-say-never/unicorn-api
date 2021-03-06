package com.example.demo.rainbow;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
class RainbowService {

    private static final Long DEFAULT_ID = 999991L;

    Optional<Long> getRainbowIdByName(final String rainbowName) {
        return Optional.of(DEFAULT_ID);
    }
}
