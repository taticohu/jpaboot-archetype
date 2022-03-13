package indi.huhy.archetypes.jpaboot.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "`config`")
public class Config {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "`group`")
    private String group;

    @Column(name = "`key`")
    private String key;

    @Column(name = "title")
    private String title;

    @Column(name = "`order`")
    private Integer order;

    @Column(name = "int_value")
    private Integer intValue;

    @Column(name = "double_value")
    private Double doubleValue;

    @Column(name = "string_value")
    private String stringValue;

    @Column(name = "json_value")
    private String jsonValue;

    @Column(name = "description")
    private String description;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    @Column(name = "`status`")
    private Integer status;

    @Column(name = "logic_delete")
    private Integer logicDelete;

    @Column(name = "operator")
    private String operator;
}
