package com.interview.pattern.filter;

/**
 * description :
 * author : wenbo.chen@boldseas.com
 * Created time : 2017/01/08 23:06.
 */
public class CriteriaMarried implements Criteria {

    @Override
    public boolean match(Person person) {
        return person.getMaritalStatus().equals("married");
    }
}
