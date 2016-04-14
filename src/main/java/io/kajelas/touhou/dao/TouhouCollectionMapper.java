package io.kajelas.touhou.dao;

import io.kajelas.touhou.model.TouhouCollection;
import io.kajelas.touhou.model.TouhouCollectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface TouhouCollectionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table touhou_collection
     *
     * @mbggenerated Thu Apr 14 17:10:01 CST 2016
     */
    @SelectProvider(type=TouhouCollectionSqlProvider.class, method="countByExample")
    int countByExample(TouhouCollectionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table touhou_collection
     *
     * @mbggenerated Thu Apr 14 17:10:01 CST 2016
     */
    @DeleteProvider(type=TouhouCollectionSqlProvider.class, method="deleteByExample")
    int deleteByExample(TouhouCollectionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table touhou_collection
     *
     * @mbggenerated Thu Apr 14 17:10:01 CST 2016
     */
    @Delete({
        "delete from touhou_collection",
        "where collection_id = #{collectionId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer collectionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table touhou_collection
     *
     * @mbggenerated Thu Apr 14 17:10:01 CST 2016
     */
    @Insert({
        "insert into touhou_collection (collection_id, collection_name, ",
        "collection_author, collection_event, ",
        "update_time, create_time, ",
        "add_time, wiki_url, ",
        "collection_type)",
        "values (#{collectionId,jdbcType=INTEGER}, #{collectionName,jdbcType=VARCHAR}, ",
        "#{collectionAuthor,jdbcType=VARCHAR}, #{collectionEvent,jdbcType=VARCHAR}, ",
        "#{updateTime,jdbcType=TIMESTAMP}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{addTime,jdbcType=TIMESTAMP}, #{wikiUrl,jdbcType=VARCHAR}, ",
        "#{collectionType,jdbcType=VARCHAR})"
    })
    int insert(TouhouCollection record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table touhou_collection
     *
     * @mbggenerated Thu Apr 14 17:10:01 CST 2016
     */
    @InsertProvider(type=TouhouCollectionSqlProvider.class, method="insertSelective")
    int insertSelective(TouhouCollection record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table touhou_collection
     *
     * @mbggenerated Thu Apr 14 17:10:01 CST 2016
     */
    @SelectProvider(type=TouhouCollectionSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="collection_id", property="collectionId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="collection_name", property="collectionName", jdbcType=JdbcType.VARCHAR),
        @Result(column="collection_author", property="collectionAuthor", jdbcType=JdbcType.VARCHAR),
        @Result(column="collection_event", property="collectionEvent", jdbcType=JdbcType.VARCHAR),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="add_time", property="addTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="wiki_url", property="wikiUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="collection_type", property="collectionType", jdbcType=JdbcType.VARCHAR)
    })
    List<TouhouCollection> selectByExample(TouhouCollectionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table touhou_collection
     *
     * @mbggenerated Thu Apr 14 17:10:01 CST 2016
     */
    @Select({
        "select",
        "collection_id, collection_name, collection_author, collection_event, update_time, ",
        "create_time, add_time, wiki_url, collection_type",
        "from touhou_collection",
        "where collection_id = #{collectionId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="collection_id", property="collectionId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="collection_name", property="collectionName", jdbcType=JdbcType.VARCHAR),
        @Result(column="collection_author", property="collectionAuthor", jdbcType=JdbcType.VARCHAR),
        @Result(column="collection_event", property="collectionEvent", jdbcType=JdbcType.VARCHAR),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="add_time", property="addTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="wiki_url", property="wikiUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="collection_type", property="collectionType", jdbcType=JdbcType.VARCHAR)
    })
    TouhouCollection selectByPrimaryKey(Integer collectionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table touhou_collection
     *
     * @mbggenerated Thu Apr 14 17:10:01 CST 2016
     */
    @UpdateProvider(type=TouhouCollectionSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TouhouCollection record, @Param("example") TouhouCollectionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table touhou_collection
     *
     * @mbggenerated Thu Apr 14 17:10:01 CST 2016
     */
    @UpdateProvider(type=TouhouCollectionSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TouhouCollection record, @Param("example") TouhouCollectionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table touhou_collection
     *
     * @mbggenerated Thu Apr 14 17:10:01 CST 2016
     */
    @UpdateProvider(type=TouhouCollectionSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TouhouCollection record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table touhou_collection
     *
     * @mbggenerated Thu Apr 14 17:10:01 CST 2016
     */
    @Update({
        "update touhou_collection",
        "set collection_name = #{collectionName,jdbcType=VARCHAR},",
          "collection_author = #{collectionAuthor,jdbcType=VARCHAR},",
          "collection_event = #{collectionEvent,jdbcType=VARCHAR},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "add_time = #{addTime,jdbcType=TIMESTAMP},",
          "wiki_url = #{wikiUrl,jdbcType=VARCHAR},",
          "collection_type = #{collectionType,jdbcType=VARCHAR}",
        "where collection_id = #{collectionId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(TouhouCollection record);
}