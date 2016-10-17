package com.devops.backend.persistence.converters;

import com.sun.tools.corba.se.idl.constExpr.Times;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import javax.swing.text.AbstractDocument;
import java.sql.Timestamp;
import java.time.LocalDateTime;

/**
 * Created by marciodasilva on 10/16/16.
 */

@Converter
public class LocalDateTimeAttributeConverter implements AttributeConverter<LocalDateTime, Timestamp> {


    @Override
    public Timestamp convertToDatabaseColumn(LocalDateTime localDateTime) {
        return (localDateTime == null ? null : Timestamp.valueOf(localDateTime));
    }

    @Override
    public LocalDateTime convertToEntityAttribute(Timestamp sqlTimestamp) {
        return (sqlTimestamp == null ? null : sqlTimestamp.toLocalDateTime());
    }
}
