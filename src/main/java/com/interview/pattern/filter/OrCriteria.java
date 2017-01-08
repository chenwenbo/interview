package com.interview.pattern.filter;

import java.util.Arrays;
import java.util.List;

/**
 * description :
 * author : wenbo.chen@boldseas.com
 * Created time : 2017/01/08 23:06.
 */
public class OrCriteria implements Criteria {
    private List<Criteria> criterias;

    public OrCriteria(Criteria... criterias) {
        this.criterias = Arrays.asList(criterias);
    }

    @Override
    public boolean match(Person person) {
        for (Criteria criteria : criterias) {
            if (criteria.match(person)) {
                return true;
            }
        }
        return false;
    }
}
