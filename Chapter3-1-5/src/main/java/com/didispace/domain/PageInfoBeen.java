package com.didispace.domain;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;

public class PageInfoBeen {
	@ApiParam(value = "当前页", required = true)
    private Integer nowPage;
    @ApiModelProperty(value = "每页大小", required = true)
    private Integer pageSize;
	
	public Integer getNowPage() {
		return nowPage;
	}
	public void setNowPage(Integer nowPage) {
		this.nowPage = nowPage;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
    
	@Override
	public String toString() {
		return "PageInfoBeen [nowPage=" + nowPage + ", pageSize=" + pageSize + "]";
	}
}
