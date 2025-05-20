package com.korit.springboot.dto.param;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SearchStudyDto {
    // @RequestParam 부분이 너무 많아지면 더러워지기 때문에 생성된 파일
    private String searchValue;
    private Integer page = 1;
    private Integer count = 10;
}
