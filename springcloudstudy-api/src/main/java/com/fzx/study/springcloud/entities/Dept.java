package com.fzx.study.springcloud.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept  implements Serializable {
    private Long deptno;  //主键
    private String dname;  //部门名称
    private String db_source;//来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库

    public static void main(String[] args) {
        Dept dept=new Dept();

        dept.setDname("研发部").setDeptno(0001L).setDb_source("2019");

        System.out.println(dept);
    }

}
