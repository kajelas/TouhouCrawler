package io.kajelas.touhou.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TouhouCollectionExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table touhou_collection
     *
     * @mbggenerated Thu Apr 14 17:10:01 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table touhou_collection
     *
     * @mbggenerated Thu Apr 14 17:10:01 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table touhou_collection
     *
     * @mbggenerated Thu Apr 14 17:10:01 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table touhou_collection
     *
     * @mbggenerated Thu Apr 14 17:10:01 CST 2016
     */
    public TouhouCollectionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table touhou_collection
     *
     * @mbggenerated Thu Apr 14 17:10:01 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table touhou_collection
     *
     * @mbggenerated Thu Apr 14 17:10:01 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table touhou_collection
     *
     * @mbggenerated Thu Apr 14 17:10:01 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table touhou_collection
     *
     * @mbggenerated Thu Apr 14 17:10:01 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table touhou_collection
     *
     * @mbggenerated Thu Apr 14 17:10:01 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table touhou_collection
     *
     * @mbggenerated Thu Apr 14 17:10:01 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table touhou_collection
     *
     * @mbggenerated Thu Apr 14 17:10:01 CST 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table touhou_collection
     *
     * @mbggenerated Thu Apr 14 17:10:01 CST 2016
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table touhou_collection
     *
     * @mbggenerated Thu Apr 14 17:10:01 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table touhou_collection
     *
     * @mbggenerated Thu Apr 14 17:10:01 CST 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table touhou_collection
     *
     * @mbggenerated Thu Apr 14 17:10:01 CST 2016
     */
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

        public Criteria andCollectionIdIsNull() {
            addCriterion("collection_id is null");
            return (Criteria) this;
        }

        public Criteria andCollectionIdIsNotNull() {
            addCriterion("collection_id is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionIdEqualTo(Integer value) {
            addCriterion("collection_id =", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdNotEqualTo(Integer value) {
            addCriterion("collection_id <>", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdGreaterThan(Integer value) {
            addCriterion("collection_id >", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("collection_id >=", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdLessThan(Integer value) {
            addCriterion("collection_id <", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdLessThanOrEqualTo(Integer value) {
            addCriterion("collection_id <=", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdIn(List<Integer> values) {
            addCriterion("collection_id in", values, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdNotIn(List<Integer> values) {
            addCriterion("collection_id not in", values, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdBetween(Integer value1, Integer value2) {
            addCriterion("collection_id between", value1, value2, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("collection_id not between", value1, value2, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionNameIsNull() {
            addCriterion("collection_name is null");
            return (Criteria) this;
        }

        public Criteria andCollectionNameIsNotNull() {
            addCriterion("collection_name is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionNameEqualTo(String value) {
            addCriterion("collection_name =", value, "collectionName");
            return (Criteria) this;
        }

        public Criteria andCollectionNameNotEqualTo(String value) {
            addCriterion("collection_name <>", value, "collectionName");
            return (Criteria) this;
        }

        public Criteria andCollectionNameGreaterThan(String value) {
            addCriterion("collection_name >", value, "collectionName");
            return (Criteria) this;
        }

        public Criteria andCollectionNameGreaterThanOrEqualTo(String value) {
            addCriterion("collection_name >=", value, "collectionName");
            return (Criteria) this;
        }

        public Criteria andCollectionNameLessThan(String value) {
            addCriterion("collection_name <", value, "collectionName");
            return (Criteria) this;
        }

        public Criteria andCollectionNameLessThanOrEqualTo(String value) {
            addCriterion("collection_name <=", value, "collectionName");
            return (Criteria) this;
        }

        public Criteria andCollectionNameLike(String value) {
            addCriterion("collection_name like", value, "collectionName");
            return (Criteria) this;
        }

        public Criteria andCollectionNameNotLike(String value) {
            addCriterion("collection_name not like", value, "collectionName");
            return (Criteria) this;
        }

        public Criteria andCollectionNameIn(List<String> values) {
            addCriterion("collection_name in", values, "collectionName");
            return (Criteria) this;
        }

        public Criteria andCollectionNameNotIn(List<String> values) {
            addCriterion("collection_name not in", values, "collectionName");
            return (Criteria) this;
        }

        public Criteria andCollectionNameBetween(String value1, String value2) {
            addCriterion("collection_name between", value1, value2, "collectionName");
            return (Criteria) this;
        }

        public Criteria andCollectionNameNotBetween(String value1, String value2) {
            addCriterion("collection_name not between", value1, value2, "collectionName");
            return (Criteria) this;
        }

        public Criteria andCollectionAuthorIsNull() {
            addCriterion("collection_author is null");
            return (Criteria) this;
        }

        public Criteria andCollectionAuthorIsNotNull() {
            addCriterion("collection_author is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionAuthorEqualTo(String value) {
            addCriterion("collection_author =", value, "collectionAuthor");
            return (Criteria) this;
        }

        public Criteria andCollectionAuthorNotEqualTo(String value) {
            addCriterion("collection_author <>", value, "collectionAuthor");
            return (Criteria) this;
        }

        public Criteria andCollectionAuthorGreaterThan(String value) {
            addCriterion("collection_author >", value, "collectionAuthor");
            return (Criteria) this;
        }

        public Criteria andCollectionAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("collection_author >=", value, "collectionAuthor");
            return (Criteria) this;
        }

        public Criteria andCollectionAuthorLessThan(String value) {
            addCriterion("collection_author <", value, "collectionAuthor");
            return (Criteria) this;
        }

        public Criteria andCollectionAuthorLessThanOrEqualTo(String value) {
            addCriterion("collection_author <=", value, "collectionAuthor");
            return (Criteria) this;
        }

        public Criteria andCollectionAuthorLike(String value) {
            addCriterion("collection_author like", value, "collectionAuthor");
            return (Criteria) this;
        }

        public Criteria andCollectionAuthorNotLike(String value) {
            addCriterion("collection_author not like", value, "collectionAuthor");
            return (Criteria) this;
        }

        public Criteria andCollectionAuthorIn(List<String> values) {
            addCriterion("collection_author in", values, "collectionAuthor");
            return (Criteria) this;
        }

        public Criteria andCollectionAuthorNotIn(List<String> values) {
            addCriterion("collection_author not in", values, "collectionAuthor");
            return (Criteria) this;
        }

        public Criteria andCollectionAuthorBetween(String value1, String value2) {
            addCriterion("collection_author between", value1, value2, "collectionAuthor");
            return (Criteria) this;
        }

        public Criteria andCollectionAuthorNotBetween(String value1, String value2) {
            addCriterion("collection_author not between", value1, value2, "collectionAuthor");
            return (Criteria) this;
        }

        public Criteria andCollectionEventIsNull() {
            addCriterion("collection_event is null");
            return (Criteria) this;
        }

        public Criteria andCollectionEventIsNotNull() {
            addCriterion("collection_event is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionEventEqualTo(String value) {
            addCriterion("collection_event =", value, "collectionEvent");
            return (Criteria) this;
        }

        public Criteria andCollectionEventNotEqualTo(String value) {
            addCriterion("collection_event <>", value, "collectionEvent");
            return (Criteria) this;
        }

        public Criteria andCollectionEventGreaterThan(String value) {
            addCriterion("collection_event >", value, "collectionEvent");
            return (Criteria) this;
        }

        public Criteria andCollectionEventGreaterThanOrEqualTo(String value) {
            addCriterion("collection_event >=", value, "collectionEvent");
            return (Criteria) this;
        }

        public Criteria andCollectionEventLessThan(String value) {
            addCriterion("collection_event <", value, "collectionEvent");
            return (Criteria) this;
        }

        public Criteria andCollectionEventLessThanOrEqualTo(String value) {
            addCriterion("collection_event <=", value, "collectionEvent");
            return (Criteria) this;
        }

        public Criteria andCollectionEventLike(String value) {
            addCriterion("collection_event like", value, "collectionEvent");
            return (Criteria) this;
        }

        public Criteria andCollectionEventNotLike(String value) {
            addCriterion("collection_event not like", value, "collectionEvent");
            return (Criteria) this;
        }

        public Criteria andCollectionEventIn(List<String> values) {
            addCriterion("collection_event in", values, "collectionEvent");
            return (Criteria) this;
        }

        public Criteria andCollectionEventNotIn(List<String> values) {
            addCriterion("collection_event not in", values, "collectionEvent");
            return (Criteria) this;
        }

        public Criteria andCollectionEventBetween(String value1, String value2) {
            addCriterion("collection_event between", value1, value2, "collectionEvent");
            return (Criteria) this;
        }

        public Criteria andCollectionEventNotBetween(String value1, String value2) {
            addCriterion("collection_event not between", value1, value2, "collectionEvent");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andWikiUrlIsNull() {
            addCriterion("wiki_url is null");
            return (Criteria) this;
        }

        public Criteria andWikiUrlIsNotNull() {
            addCriterion("wiki_url is not null");
            return (Criteria) this;
        }

        public Criteria andWikiUrlEqualTo(String value) {
            addCriterion("wiki_url =", value, "wikiUrl");
            return (Criteria) this;
        }

        public Criteria andWikiUrlNotEqualTo(String value) {
            addCriterion("wiki_url <>", value, "wikiUrl");
            return (Criteria) this;
        }

        public Criteria andWikiUrlGreaterThan(String value) {
            addCriterion("wiki_url >", value, "wikiUrl");
            return (Criteria) this;
        }

        public Criteria andWikiUrlGreaterThanOrEqualTo(String value) {
            addCriterion("wiki_url >=", value, "wikiUrl");
            return (Criteria) this;
        }

        public Criteria andWikiUrlLessThan(String value) {
            addCriterion("wiki_url <", value, "wikiUrl");
            return (Criteria) this;
        }

        public Criteria andWikiUrlLessThanOrEqualTo(String value) {
            addCriterion("wiki_url <=", value, "wikiUrl");
            return (Criteria) this;
        }

        public Criteria andWikiUrlLike(String value) {
            addCriterion("wiki_url like", value, "wikiUrl");
            return (Criteria) this;
        }

        public Criteria andWikiUrlNotLike(String value) {
            addCriterion("wiki_url not like", value, "wikiUrl");
            return (Criteria) this;
        }

        public Criteria andWikiUrlIn(List<String> values) {
            addCriterion("wiki_url in", values, "wikiUrl");
            return (Criteria) this;
        }

        public Criteria andWikiUrlNotIn(List<String> values) {
            addCriterion("wiki_url not in", values, "wikiUrl");
            return (Criteria) this;
        }

        public Criteria andWikiUrlBetween(String value1, String value2) {
            addCriterion("wiki_url between", value1, value2, "wikiUrl");
            return (Criteria) this;
        }

        public Criteria andWikiUrlNotBetween(String value1, String value2) {
            addCriterion("wiki_url not between", value1, value2, "wikiUrl");
            return (Criteria) this;
        }

        public Criteria andCollectionTypeIsNull() {
            addCriterion("collection_type is null");
            return (Criteria) this;
        }

        public Criteria andCollectionTypeIsNotNull() {
            addCriterion("collection_type is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionTypeEqualTo(String value) {
            addCriterion("collection_type =", value, "collectionType");
            return (Criteria) this;
        }

        public Criteria andCollectionTypeNotEqualTo(String value) {
            addCriterion("collection_type <>", value, "collectionType");
            return (Criteria) this;
        }

        public Criteria andCollectionTypeGreaterThan(String value) {
            addCriterion("collection_type >", value, "collectionType");
            return (Criteria) this;
        }

        public Criteria andCollectionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("collection_type >=", value, "collectionType");
            return (Criteria) this;
        }

        public Criteria andCollectionTypeLessThan(String value) {
            addCriterion("collection_type <", value, "collectionType");
            return (Criteria) this;
        }

        public Criteria andCollectionTypeLessThanOrEqualTo(String value) {
            addCriterion("collection_type <=", value, "collectionType");
            return (Criteria) this;
        }

        public Criteria andCollectionTypeLike(String value) {
            addCriterion("collection_type like", value, "collectionType");
            return (Criteria) this;
        }

        public Criteria andCollectionTypeNotLike(String value) {
            addCriterion("collection_type not like", value, "collectionType");
            return (Criteria) this;
        }

        public Criteria andCollectionTypeIn(List<String> values) {
            addCriterion("collection_type in", values, "collectionType");
            return (Criteria) this;
        }

        public Criteria andCollectionTypeNotIn(List<String> values) {
            addCriterion("collection_type not in", values, "collectionType");
            return (Criteria) this;
        }

        public Criteria andCollectionTypeBetween(String value1, String value2) {
            addCriterion("collection_type between", value1, value2, "collectionType");
            return (Criteria) this;
        }

        public Criteria andCollectionTypeNotBetween(String value1, String value2) {
            addCriterion("collection_type not between", value1, value2, "collectionType");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table touhou_collection
     *
     * @mbggenerated do_not_delete_during_merge Thu Apr 14 17:10:01 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table touhou_collection
     *
     * @mbggenerated Thu Apr 14 17:10:01 CST 2016
     */
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