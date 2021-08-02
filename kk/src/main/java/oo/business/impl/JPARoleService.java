package oo.business.impl;

import org.springframework.stereotype.Service;

import oo.business.RoleService;
import oo.business.model.Role;

@Service
public class JPARoleService extends JPACRUDService<Long, Role> implements RoleService {

}
