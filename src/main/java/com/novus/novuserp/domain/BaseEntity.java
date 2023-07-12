package com.novus.novuserp.domain;
import org.springframework.data.annotation.Id;

import javax.annotation.processing.Generated;
import java.sql.Timestamp;
import java.util.UUID;

public class BaseEntity {
    @Id
    private UUID id;

    private Timestamp created;

    private Timestamp updated;
}
