package com.nocotom.dm.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.validation.constraints.Min;
import java.util.Collection;
import java.util.Collections;

@Data
@EqualsAndHashCode
@ToString
public class Filter {

    private Collection<FilterItem> filters = Collections.emptyList();

    private FilteringLogic logic = FilteringLogic.ALL;

    @Min(value = 0)
    private Integer limit;

    @Min(value = 0)
    private Integer offset;
}
