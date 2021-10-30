package me.ermicioia.simpleapp.control;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

@MappedSuperclass
@ToString(callSuper = true)
@Getter
@Setter
abstract public class VersionedEntity extends AbstractEntity {

    @Version
    private long version = 0;

}
