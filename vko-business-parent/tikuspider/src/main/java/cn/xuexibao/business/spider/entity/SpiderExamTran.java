package cn.xuexibao.business.spider.entity;

import java.sql.Timestamp;
import java.util.Map;

import lombok.Data;

import org.nutz.dao.entity.annotation.ColDefine;
import org.nutz.dao.entity.annotation.ColType;
import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Comment;
import org.nutz.dao.entity.annotation.Id;
import org.nutz.dao.entity.annotation.Table;

import cn.vko.core.common.util.JsonUtil;
import cn.vko.core.common.util.Util;

@Table("spider_exam_tran_chemistry_auto")
@Comment("转换后菁优数学")
@Data
public class SpiderExamTran {
	@Id
	@ColDefine(type = ColType.INT, width = 20, notNull = true)
	@Comment("主键")
	private long id;
	@Column
	@ColDefine(type = ColType.TEXT)
	@Comment("试题内容")
	private String content;
	@Column
	@ColDefine(type = ColType.VARCHAR, width = 200)
	@Comment("题型")
	private String type;
	@Column
	@ColDefine(type = ColType.VARCHAR, width = 200)
	@Comment("学段")
	private String learnPhase;
	@Column
	@ColDefine(type = ColType.VARCHAR, width = 200)
	@Comment("科目")
	private String subject;
	@Column
	@ColDefine(type = ColType.VARCHAR, width = 200)
	@Comment("难易度")
	private String diff;
	@Column
	@ColDefine(type = ColType.VARCHAR, width = 200)
	@Comment("知识点")
	private String knowledge;
	@Column
	@ColDefine(type = ColType.VARCHAR, width = 200)
	@Comment("知识点")
	private String source;
	@Column
	@ColDefine(type = ColType.VARCHAR, width = 200)
	@Comment("知识点")
	private String url;
	@Column
	@ColDefine(type = ColType.TEXT)
	@Comment("试题答案")
	private String answer;
	@Column
	@ColDefine(type = ColType.TEXT)
	@Comment("试题解析")
	private String solution;
	@Column
	@ColDefine(type = ColType.TEXT)
	@Comment("试题备注")
	private String remark;
	@Column
	@ColDefine(type = ColType.VARCHAR, width = 200)
	@Comment("域名")
	private String domain;
	private Map<String, String> extra;
	@Column
	@ColDefine(type = ColType.TEXT)
	@Comment("试题latex")
	private String latex;
	@Column
	@Comment("创建时间")
	@ColDefine(type = ColType.DATETIME, notNull = true)
	private Timestamp crTime;

	public void setExtra(Map<String, String> ex) {
		extra = ex;
		if (Util.isEmpty(extra)) {
			return;
		}
		remark = JsonUtil.toJson(extra);
	}
}
