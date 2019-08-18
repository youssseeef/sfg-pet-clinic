package com.ysalama.sfgpetclinic.services;

import com.ysalama.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
