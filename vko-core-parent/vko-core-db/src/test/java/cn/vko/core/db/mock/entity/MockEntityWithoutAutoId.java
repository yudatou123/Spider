/**
 * DbInsertMockEntity.java
 * cn.vko.core.db.mock.entity
 * Copyright (c) 2013, 北京微课创景教育科技有限公司版权所有.
 */

package cn.vko.core.db.mock.entity;

import lombok.Data;

import org.nutz.dao.entity.annotation.ColDefine;
import org.nutz.dao.entity.annotation.ColType;
import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Comment;
import org.nutz.dao.entity.annotation.Id;
import org.nutz.dao.entity.annotation.Table;

/**
 * 数据库mock实体
 * 
 * @author 庄君祥
 * @Date 2013-12-9
 */
@Table("mock_entity_without_auto_id")
@Comment("数据库mock实体")
@Data
public class MockEntityWithoutAutoId {
	@Column
	@ColDefine(type = ColType.INT, width = 20, notNull = true)
	@Comment("主键")
	@Id(auto = false)
	private long id;
	@Column
	@ColDefine(type = ColType.VARCHAR, width = 50, notNull = true)
	@Comment("名称")
	private String name;

	public MockEntityWithoutAutoId() {
	}

	public MockEntityWithoutAutoId(final String name) {
		this.name = name;
	}

}
