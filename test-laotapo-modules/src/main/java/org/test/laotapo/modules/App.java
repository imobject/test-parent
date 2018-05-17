package org.test.laotapo.modules;

import java.util.List;

import org.test.laotapo.modules.bean.Contributor;
import org.test.laotapo.modules.service.GitHub;

import feign.Feign;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// https://api.github.com/repos/OpenFeign/feign/contributors
		GitHub github = Feign.builder()
		                     .encoder(new GsonEncoder())
		                     .decoder(new GsonDecoder())
		                     .target(GitHub.class, "https://api.github.com");
		
		List<Contributor> contributors = github.contributors("OpenFeign", "feign");
		for (Contributor contributor : contributors) {
		  System.out.println(contributor.getLogin() + " (" + contributor.getContributions() + ")");
		}
		
	}
}
