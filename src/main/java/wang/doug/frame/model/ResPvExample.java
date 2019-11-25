package wang.doug.frame.model;

import java.util.ArrayList;
import java.util.List;

public class ResPvExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResPvExample() {
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

        public Criteria andResIdIsNull() {
            addCriterion("res_id is null");
            return (Criteria) this;
        }

        public Criteria andResIdIsNotNull() {
            addCriterion("res_id is not null");
            return (Criteria) this;
        }

        public Criteria andResIdEqualTo(Integer value) {
            addCriterion("res_id =", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdNotEqualTo(Integer value) {
            addCriterion("res_id <>", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdGreaterThan(Integer value) {
            addCriterion("res_id >", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("res_id >=", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdLessThan(Integer value) {
            addCriterion("res_id <", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdLessThanOrEqualTo(Integer value) {
            addCriterion("res_id <=", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdIn(List<Integer> values) {
            addCriterion("res_id in", values, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdNotIn(List<Integer> values) {
            addCriterion("res_id not in", values, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdBetween(Integer value1, Integer value2) {
            addCriterion("res_id between", value1, value2, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdNotBetween(Integer value1, Integer value2) {
            addCriterion("res_id not between", value1, value2, "resId");
            return (Criteria) this;
        }

        public Criteria andTdMonthIsNull() {
            addCriterion("td_month is null");
            return (Criteria) this;
        }

        public Criteria andTdMonthIsNotNull() {
            addCriterion("td_month is not null");
            return (Criteria) this;
        }

        public Criteria andTdMonthEqualTo(Short value) {
            addCriterion("td_month =", value, "tdMonth");
            return (Criteria) this;
        }

        public Criteria andTdMonthNotEqualTo(Short value) {
            addCriterion("td_month <>", value, "tdMonth");
            return (Criteria) this;
        }

        public Criteria andTdMonthGreaterThan(Short value) {
            addCriterion("td_month >", value, "tdMonth");
            return (Criteria) this;
        }

        public Criteria andTdMonthGreaterThanOrEqualTo(Short value) {
            addCriterion("td_month >=", value, "tdMonth");
            return (Criteria) this;
        }

        public Criteria andTdMonthLessThan(Short value) {
            addCriterion("td_month <", value, "tdMonth");
            return (Criteria) this;
        }

        public Criteria andTdMonthLessThanOrEqualTo(Short value) {
            addCriterion("td_month <=", value, "tdMonth");
            return (Criteria) this;
        }

        public Criteria andTdMonthIn(List<Short> values) {
            addCriterion("td_month in", values, "tdMonth");
            return (Criteria) this;
        }

        public Criteria andTdMonthNotIn(List<Short> values) {
            addCriterion("td_month not in", values, "tdMonth");
            return (Criteria) this;
        }

        public Criteria andTdMonthBetween(Short value1, Short value2) {
            addCriterion("td_month between", value1, value2, "tdMonth");
            return (Criteria) this;
        }

        public Criteria andTdMonthNotBetween(Short value1, Short value2) {
            addCriterion("td_month not between", value1, value2, "tdMonth");
            return (Criteria) this;
        }

        public Criteria andTdYearIsNull() {
            addCriterion("td_year is null");
            return (Criteria) this;
        }

        public Criteria andTdYearIsNotNull() {
            addCriterion("td_year is not null");
            return (Criteria) this;
        }

        public Criteria andTdYearEqualTo(Short value) {
            addCriterion("td_year =", value, "tdYear");
            return (Criteria) this;
        }

        public Criteria andTdYearNotEqualTo(Short value) {
            addCriterion("td_year <>", value, "tdYear");
            return (Criteria) this;
        }

        public Criteria andTdYearGreaterThan(Short value) {
            addCriterion("td_year >", value, "tdYear");
            return (Criteria) this;
        }

        public Criteria andTdYearGreaterThanOrEqualTo(Short value) {
            addCriterion("td_year >=", value, "tdYear");
            return (Criteria) this;
        }

        public Criteria andTdYearLessThan(Short value) {
            addCriterion("td_year <", value, "tdYear");
            return (Criteria) this;
        }

        public Criteria andTdYearLessThanOrEqualTo(Short value) {
            addCriterion("td_year <=", value, "tdYear");
            return (Criteria) this;
        }

        public Criteria andTdYearIn(List<Short> values) {
            addCriterion("td_year in", values, "tdYear");
            return (Criteria) this;
        }

        public Criteria andTdYearNotIn(List<Short> values) {
            addCriterion("td_year not in", values, "tdYear");
            return (Criteria) this;
        }

        public Criteria andTdYearBetween(Short value1, Short value2) {
            addCriterion("td_year between", value1, value2, "tdYear");
            return (Criteria) this;
        }

        public Criteria andTdYearNotBetween(Short value1, Short value2) {
            addCriterion("td_year not between", value1, value2, "tdYear");
            return (Criteria) this;
        }

        public Criteria andRcsNameIsNull() {
            addCriterion("rcs_name is null");
            return (Criteria) this;
        }

        public Criteria andRcsNameIsNotNull() {
            addCriterion("rcs_name is not null");
            return (Criteria) this;
        }

        public Criteria andRcsNameEqualTo(String value) {
            addCriterion("rcs_name =", value, "rcsName");
            return (Criteria) this;
        }

        public Criteria andRcsNameNotEqualTo(String value) {
            addCriterion("rcs_name <>", value, "rcsName");
            return (Criteria) this;
        }

        public Criteria andRcsNameGreaterThan(String value) {
            addCriterion("rcs_name >", value, "rcsName");
            return (Criteria) this;
        }

        public Criteria andRcsNameGreaterThanOrEqualTo(String value) {
            addCriterion("rcs_name >=", value, "rcsName");
            return (Criteria) this;
        }

        public Criteria andRcsNameLessThan(String value) {
            addCriterion("rcs_name <", value, "rcsName");
            return (Criteria) this;
        }

        public Criteria andRcsNameLessThanOrEqualTo(String value) {
            addCriterion("rcs_name <=", value, "rcsName");
            return (Criteria) this;
        }

        public Criteria andRcsNameLike(String value) {
            addCriterion("rcs_name like", value, "rcsName");
            return (Criteria) this;
        }

        public Criteria andRcsNameNotLike(String value) {
            addCriterion("rcs_name not like", value, "rcsName");
            return (Criteria) this;
        }

        public Criteria andRcsNameIn(List<String> values) {
            addCriterion("rcs_name in", values, "rcsName");
            return (Criteria) this;
        }

        public Criteria andRcsNameNotIn(List<String> values) {
            addCriterion("rcs_name not in", values, "rcsName");
            return (Criteria) this;
        }

        public Criteria andRcsNameBetween(String value1, String value2) {
            addCriterion("rcs_name between", value1, value2, "rcsName");
            return (Criteria) this;
        }

        public Criteria andRcsNameNotBetween(String value1, String value2) {
            addCriterion("rcs_name not between", value1, value2, "rcsName");
            return (Criteria) this;
        }

        public Criteria andPvIsNull() {
            addCriterion("pv is null");
            return (Criteria) this;
        }

        public Criteria andPvIsNotNull() {
            addCriterion("pv is not null");
            return (Criteria) this;
        }

        public Criteria andPvEqualTo(String value) {
            addCriterion("pv =", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvNotEqualTo(String value) {
            addCriterion("pv <>", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvGreaterThan(String value) {
            addCriterion("pv >", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvGreaterThanOrEqualTo(String value) {
            addCriterion("pv >=", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvLessThan(String value) {
            addCriterion("pv <", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvLessThanOrEqualTo(String value) {
            addCriterion("pv <=", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvLike(String value) {
            addCriterion("pv like", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvNotLike(String value) {
            addCriterion("pv not like", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvIn(List<String> values) {
            addCriterion("pv in", values, "pv");
            return (Criteria) this;
        }

        public Criteria andPvNotIn(List<String> values) {
            addCriterion("pv not in", values, "pv");
            return (Criteria) this;
        }

        public Criteria andPvBetween(String value1, String value2) {
            addCriterion("pv between", value1, value2, "pv");
            return (Criteria) this;
        }

        public Criteria andPvNotBetween(String value1, String value2) {
            addCriterion("pv not between", value1, value2, "pv");
            return (Criteria) this;
        }

        public Criteria andSysIdIsNull() {
            addCriterion("sys_id is null");
            return (Criteria) this;
        }

        public Criteria andSysIdIsNotNull() {
            addCriterion("sys_id is not null");
            return (Criteria) this;
        }

        public Criteria andSysIdEqualTo(Integer value) {
            addCriterion("sys_id =", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdNotEqualTo(Integer value) {
            addCriterion("sys_id <>", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdGreaterThan(Integer value) {
            addCriterion("sys_id >", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sys_id >=", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdLessThan(Integer value) {
            addCriterion("sys_id <", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdLessThanOrEqualTo(Integer value) {
            addCriterion("sys_id <=", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdIn(List<Integer> values) {
            addCriterion("sys_id in", values, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdNotIn(List<Integer> values) {
            addCriterion("sys_id not in", values, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdBetween(Integer value1, Integer value2) {
            addCriterion("sys_id between", value1, value2, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sys_id not between", value1, value2, "sysId");
            return (Criteria) this;
        }

        public Criteria andColIdIsNull() {
            addCriterion("col_id is null");
            return (Criteria) this;
        }

        public Criteria andColIdIsNotNull() {
            addCriterion("col_id is not null");
            return (Criteria) this;
        }

        public Criteria andColIdEqualTo(Integer value) {
            addCriterion("col_id =", value, "colId");
            return (Criteria) this;
        }

        public Criteria andColIdNotEqualTo(Integer value) {
            addCriterion("col_id <>", value, "colId");
            return (Criteria) this;
        }

        public Criteria andColIdGreaterThan(Integer value) {
            addCriterion("col_id >", value, "colId");
            return (Criteria) this;
        }

        public Criteria andColIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("col_id >=", value, "colId");
            return (Criteria) this;
        }

        public Criteria andColIdLessThan(Integer value) {
            addCriterion("col_id <", value, "colId");
            return (Criteria) this;
        }

        public Criteria andColIdLessThanOrEqualTo(Integer value) {
            addCriterion("col_id <=", value, "colId");
            return (Criteria) this;
        }

        public Criteria andColIdIn(List<Integer> values) {
            addCriterion("col_id in", values, "colId");
            return (Criteria) this;
        }

        public Criteria andColIdNotIn(List<Integer> values) {
            addCriterion("col_id not in", values, "colId");
            return (Criteria) this;
        }

        public Criteria andColIdBetween(Integer value1, Integer value2) {
            addCriterion("col_id between", value1, value2, "colId");
            return (Criteria) this;
        }

        public Criteria andColIdNotBetween(Integer value1, Integer value2) {
            addCriterion("col_id not between", value1, value2, "colId");
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