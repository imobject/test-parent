package org.test.laotapo.modules.service;

import java.util.List;

import org.test.laotapo.modules.bean.Contributor;

import feign.Param;
import feign.RequestLine;

public interface GitHub {

	// RequestLine注解声明请求方法和请求地址,可以允许有查询参数
	// https://api.github.com/repos/OpenFeign/feign/contributors
	@RequestLine("GET /repos/{owner}/{repo}/contributors")
	List<Contributor> contributors(@Param("owner") String owner, @Param("repo") String repo);

}


