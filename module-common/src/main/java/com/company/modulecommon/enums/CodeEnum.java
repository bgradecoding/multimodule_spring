package com.company.modulecommon.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CodeEnum {
    SUCCESS("0000", "Success"),
    UNKNOWN_ERROR("9999", "Unknown error");

    private String code;
    private String message;
}
