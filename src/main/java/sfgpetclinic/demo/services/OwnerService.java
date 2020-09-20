package sfgpetclinic.demo.services;

import sfgpetclinic.demo.model.Owner;


public interface OwnerService extends CrudService<Owner,Long> {
    Owner findByLastName(String lastName);



}
