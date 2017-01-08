package com.interview.pattern.filter;

import java.util.Arrays;
import java.util.List;

/**
 * description :
 * author : wenbo.chen@boldseas.com
 * Created time : 2017/01/08 23:06.
 */
public class AndCriteria implements Criteria {

    private final List<Criteria> criteriaList;

    public AndCriteria(Criteria... criterias) {
        criteriaList = Arrays.asList(criterias);
    }

    @Override
    public boolean match(Person person) {
        for (Criteria criteria : criteriaList) {
            if (!criteria.match(person)) {
                return false;
            }
        }
        return true;
    }
}
