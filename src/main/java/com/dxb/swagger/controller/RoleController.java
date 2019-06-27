package com.dxb.swagger.controller;

import com.dxb.swagger.model.Role;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/role")
@Api(value = "角色服务", tags = "角色服务接口")
public class RoleController {
    @RequestMapping(value = "/{roleId}", method = {RequestMethod.GET})
    @ApiOperation(value = "通过角色ID获取角色信息")
    public Role getById(@ApiParam(value = "角色ID") @PathVariable Integer roleId) {
        if (roleId > 0) {
            return new Role(roleId, "角色ID大于0");
        } else {
            return new Role(roleId, "角色ID小于0");
        }
    }

}
