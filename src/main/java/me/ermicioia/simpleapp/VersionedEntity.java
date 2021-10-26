package me.ermicioia.simpleapp;

import lombok.ToString;

import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

@MappedSuperclass
@ToString(callSuper = true)
abstract public class VersionedEntity extends AbstractEntity {

    @Version
    private long version;

}
