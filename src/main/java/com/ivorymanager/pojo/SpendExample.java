package com.ivorymanager.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SpendExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpendExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andSpendNameIsNull() {
            addCriterion("spend_name is null");
            return (Criteria) this;
        }

        public Criteria andSpendNameIsNotNull() {
            addCriterion("spend_name is not null");
            return (Criteria) this;
        }

        public Criteria andSpendNameEqualTo(String value) {
            addCriterion("spend_name =", value, "spendName");
            return (Criteria) this;
        }

        public Criteria andSpendNameNotEqualTo(String value) {
            addCriterion("spend_name <>", value, "spendName");
            return (Criteria) this;
        }

        public Criteria andSpendNameGreaterThan(String value) {
            addCriterion("spend_name >", value, "spendName");
            return (Criteria) this;
        }

        public Criteria andSpendNameGreaterThanOrEqualTo(String value) {
            addCriterion("spend_name >=", value, "spendName");
            return (Criteria) this;
        }

        public Criteria andSpendNameLessThan(String value) {
            addCriterion("spend_name <", value, "spendName");
            return (Criteria) this;
        }

        public Criteria andSpendNameLessThanOrEqualTo(String value) {
            addCriterion("spend_name <=", value, "spendName");
            return (Criteria) this;
        }

        public Criteria andSpendNameLike(String value) {
            addCriterion("spend_name like", value, "spendName");
            return (Criteria) this;
        }

        public Criteria andSpendNameNotLike(String value) {
            addCriterion("spend_name not like", value, "spendName");
            return (Criteria) this;
        }

        public Criteria andSpendNameIn(List<String> values) {
            addCriterion("spend_name in", values, "spendName");
            return (Criteria) this;
        }

        public Criteria andSpendNameNotIn(List<String> values) {
            addCriterion("spend_name not in", values, "spendName");
            return (Criteria) this;
        }

        public Criteria andSpendNameBetween(String value1, String value2) {
            addCriterion("spend_name between", value1, value2, "spendName");
            return (Criteria) this;
        }

        public Criteria andSpendNameNotBetween(String value1, String value2) {
            addCriterion("spend_name not between", value1, value2, "spendName");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andSpendPeopleIsNull() {
            addCriterion("spend_people is null");
            return (Criteria) this;
        }

        public Criteria andSpendPeopleIsNotNull() {
            addCriterion("spend_people is not null");
            return (Criteria) this;
        }

        public Criteria andSpendPeopleEqualTo(String value) {
            addCriterion("spend_people =", value, "spendPeople");
            return (Criteria) this;
        }

        public Criteria andSpendPeopleNotEqualTo(String value) {
            addCriterion("spend_people <>", value, "spendPeople");
            return (Criteria) this;
        }

        public Criteria andSpendPeopleGreaterThan(String value) {
            addCriterion("spend_people >", value, "spendPeople");
            return (Criteria) this;
        }

        public Criteria andSpendPeopleGreaterThanOrEqualTo(String value) {
            addCriterion("spend_people >=", value, "spendPeople");
            return (Criteria) this;
        }

        public Criteria andSpendPeopleLessThan(String value) {
            addCriterion("spend_people <", value, "spendPeople");
            return (Criteria) this;
        }

        public Criteria andSpendPeopleLessThanOrEqualTo(String value) {
            addCriterion("spend_people <=", value, "spendPeople");
            return (Criteria) this;
        }

        public Criteria andSpendPeopleLike(String value) {
            addCriterion("spend_people like", value, "spendPeople");
            return (Criteria) this;
        }

        public Criteria andSpendPeopleNotLike(String value) {
            addCriterion("spend_people not like", value, "spendPeople");
            return (Criteria) this;
        }

        public Criteria andSpendPeopleIn(List<String> values) {
            addCriterion("spend_people in", values, "spendPeople");
            return (Criteria) this;
        }

        public Criteria andSpendPeopleNotIn(List<String> values) {
            addCriterion("spend_people not in", values, "spendPeople");
            return (Criteria) this;
        }

        public Criteria andSpendPeopleBetween(String value1, String value2) {
            addCriterion("spend_people between", value1, value2, "spendPeople");
            return (Criteria) this;
        }

        public Criteria andSpendPeopleNotBetween(String value1, String value2) {
            addCriterion("spend_people not between", value1, value2, "spendPeople");
            return (Criteria) this;
        }

        public Criteria andSpendMethodIsNull() {
            addCriterion("spend_method is null");
            return (Criteria) this;
        }

        public Criteria andSpendMethodIsNotNull() {
            addCriterion("spend_method is not null");
            return (Criteria) this;
        }

        public Criteria andSpendMethodEqualTo(String value) {
            addCriterion("spend_method =", value, "spendMethod");
            return (Criteria) this;
        }

        public Criteria andSpendMethodNotEqualTo(String value) {
            addCriterion("spend_method <>", value, "spendMethod");
            return (Criteria) this;
        }

        public Criteria andSpendMethodGreaterThan(String value) {
            addCriterion("spend_method >", value, "spendMethod");
            return (Criteria) this;
        }

        public Criteria andSpendMethodGreaterThanOrEqualTo(String value) {
            addCriterion("spend_method >=", value, "spendMethod");
            return (Criteria) this;
        }

        public Criteria andSpendMethodLessThan(String value) {
            addCriterion("spend_method <", value, "spendMethod");
            return (Criteria) this;
        }

        public Criteria andSpendMethodLessThanOrEqualTo(String value) {
            addCriterion("spend_method <=", value, "spendMethod");
            return (Criteria) this;
        }

        public Criteria andSpendMethodLike(String value) {
            addCriterion("spend_method like", value, "spendMethod");
            return (Criteria) this;
        }

        public Criteria andSpendMethodNotLike(String value) {
            addCriterion("spend_method not like", value, "spendMethod");
            return (Criteria) this;
        }

        public Criteria andSpendMethodIn(List<String> values) {
            addCriterion("spend_method in", values, "spendMethod");
            return (Criteria) this;
        }

        public Criteria andSpendMethodNotIn(List<String> values) {
            addCriterion("spend_method not in", values, "spendMethod");
            return (Criteria) this;
        }

        public Criteria andSpendMethodBetween(String value1, String value2) {
            addCriterion("spend_method between", value1, value2, "spendMethod");
            return (Criteria) this;
        }

        public Criteria andSpendMethodNotBetween(String value1, String value2) {
            addCriterion("spend_method not between", value1, value2, "spendMethod");
            return (Criteria) this;
        }

        public Criteria andSpendAmountIsNull() {
            addCriterion("spend_amount is null");
            return (Criteria) this;
        }

        public Criteria andSpendAmountIsNotNull() {
            addCriterion("spend_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSpendAmountEqualTo(Integer value) {
            addCriterion("spend_amount =", value, "spendAmount");
            return (Criteria) this;
        }

        public Criteria andSpendAmountNotEqualTo(Integer value) {
            addCriterion("spend_amount <>", value, "spendAmount");
            return (Criteria) this;
        }

        public Criteria andSpendAmountGreaterThan(Integer value) {
            addCriterion("spend_amount >", value, "spendAmount");
            return (Criteria) this;
        }

        public Criteria andSpendAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("spend_amount >=", value, "spendAmount");
            return (Criteria) this;
        }

        public Criteria andSpendAmountLessThan(Integer value) {
            addCriterion("spend_amount <", value, "spendAmount");
            return (Criteria) this;
        }

        public Criteria andSpendAmountLessThanOrEqualTo(Integer value) {
            addCriterion("spend_amount <=", value, "spendAmount");
            return (Criteria) this;
        }

        public Criteria andSpendAmountIn(List<Integer> values) {
            addCriterion("spend_amount in", values, "spendAmount");
            return (Criteria) this;
        }

        public Criteria andSpendAmountNotIn(List<Integer> values) {
            addCriterion("spend_amount not in", values, "spendAmount");
            return (Criteria) this;
        }

        public Criteria andSpendAmountBetween(Integer value1, Integer value2) {
            addCriterion("spend_amount between", value1, value2, "spendAmount");
            return (Criteria) this;
        }

        public Criteria andSpendAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("spend_amount not between", value1, value2, "spendAmount");
            return (Criteria) this;
        }

        public Criteria andSpendTargetAccountIsNull() {
            addCriterion("spend_target_account is null");
            return (Criteria) this;
        }

        public Criteria andSpendTargetAccountIsNotNull() {
            addCriterion("spend_target_account is not null");
            return (Criteria) this;
        }

        public Criteria andSpendTargetAccountEqualTo(String value) {
            addCriterion("spend_target_account =", value, "spendTargetAccount");
            return (Criteria) this;
        }

        public Criteria andSpendTargetAccountNotEqualTo(String value) {
            addCriterion("spend_target_account <>", value, "spendTargetAccount");
            return (Criteria) this;
        }

        public Criteria andSpendTargetAccountGreaterThan(String value) {
            addCriterion("spend_target_account >", value, "spendTargetAccount");
            return (Criteria) this;
        }

        public Criteria andSpendTargetAccountGreaterThanOrEqualTo(String value) {
            addCriterion("spend_target_account >=", value, "spendTargetAccount");
            return (Criteria) this;
        }

        public Criteria andSpendTargetAccountLessThan(String value) {
            addCriterion("spend_target_account <", value, "spendTargetAccount");
            return (Criteria) this;
        }

        public Criteria andSpendTargetAccountLessThanOrEqualTo(String value) {
            addCriterion("spend_target_account <=", value, "spendTargetAccount");
            return (Criteria) this;
        }

        public Criteria andSpendTargetAccountLike(String value) {
            addCriterion("spend_target_account like", value, "spendTargetAccount");
            return (Criteria) this;
        }

        public Criteria andSpendTargetAccountNotLike(String value) {
            addCriterion("spend_target_account not like", value, "spendTargetAccount");
            return (Criteria) this;
        }

        public Criteria andSpendTargetAccountIn(List<String> values) {
            addCriterion("spend_target_account in", values, "spendTargetAccount");
            return (Criteria) this;
        }

        public Criteria andSpendTargetAccountNotIn(List<String> values) {
            addCriterion("spend_target_account not in", values, "spendTargetAccount");
            return (Criteria) this;
        }

        public Criteria andSpendTargetAccountBetween(String value1, String value2) {
            addCriterion("spend_target_account between", value1, value2, "spendTargetAccount");
            return (Criteria) this;
        }

        public Criteria andSpendTargetAccountNotBetween(String value1, String value2) {
            addCriterion("spend_target_account not between", value1, value2, "spendTargetAccount");
            return (Criteria) this;
        }

        public Criteria andSpendTargetAccountNumberIsNull() {
            addCriterion("spend_target_account_number is null");
            return (Criteria) this;
        }

        public Criteria andSpendTargetAccountNumberIsNotNull() {
            addCriterion("spend_target_account_number is not null");
            return (Criteria) this;
        }

        public Criteria andSpendTargetAccountNumberEqualTo(String value) {
            addCriterion("spend_target_account_number =", value, "spendTargetAccountNumber");
            return (Criteria) this;
        }

        public Criteria andSpendTargetAccountNumberNotEqualTo(String value) {
            addCriterion("spend_target_account_number <>", value, "spendTargetAccountNumber");
            return (Criteria) this;
        }

        public Criteria andSpendTargetAccountNumberGreaterThan(String value) {
            addCriterion("spend_target_account_number >", value, "spendTargetAccountNumber");
            return (Criteria) this;
        }

        public Criteria andSpendTargetAccountNumberGreaterThanOrEqualTo(String value) {
            addCriterion("spend_target_account_number >=", value, "spendTargetAccountNumber");
            return (Criteria) this;
        }

        public Criteria andSpendTargetAccountNumberLessThan(String value) {
            addCriterion("spend_target_account_number <", value, "spendTargetAccountNumber");
            return (Criteria) this;
        }

        public Criteria andSpendTargetAccountNumberLessThanOrEqualTo(String value) {
            addCriterion("spend_target_account_number <=", value, "spendTargetAccountNumber");
            return (Criteria) this;
        }

        public Criteria andSpendTargetAccountNumberLike(String value) {
            addCriterion("spend_target_account_number like", value, "spendTargetAccountNumber");
            return (Criteria) this;
        }

        public Criteria andSpendTargetAccountNumberNotLike(String value) {
            addCriterion("spend_target_account_number not like", value, "spendTargetAccountNumber");
            return (Criteria) this;
        }

        public Criteria andSpendTargetAccountNumberIn(List<String> values) {
            addCriterion("spend_target_account_number in", values, "spendTargetAccountNumber");
            return (Criteria) this;
        }

        public Criteria andSpendTargetAccountNumberNotIn(List<String> values) {
            addCriterion("spend_target_account_number not in", values, "spendTargetAccountNumber");
            return (Criteria) this;
        }

        public Criteria andSpendTargetAccountNumberBetween(String value1, String value2) {
            addCriterion("spend_target_account_number between", value1, value2, "spendTargetAccountNumber");
            return (Criteria) this;
        }

        public Criteria andSpendTargetAccountNumberNotBetween(String value1, String value2) {
            addCriterion("spend_target_account_number not between", value1, value2, "spendTargetAccountNumber");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}