package com.zmzhou.server.server;

import lombok.Data;

/**
 * @author zmzhou
 * @title Sys
 * @Description 系统相关信息
 * @Date 2020/08/29 14:59
 */
@Data
public class Sys {
    /**
     * 服务器名称
     */
    private String computerName;

    /**
     * 服务器Ip
     */
    private String computerIp;

    /**
     * 项目路径
     */
    private String userDir;

    /**
     * 操作系统
     */
    private String osName;

    /**
     * 系统架构
     */
    private String osArch;
}
