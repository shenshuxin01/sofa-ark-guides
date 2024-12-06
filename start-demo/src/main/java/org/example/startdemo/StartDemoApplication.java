package org.example.startdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StartDemoApplication {

	/**
	 * 项目启动的时候，mina的包只导入了mina-core-1.1.5.jar 另一个版本的被忽略了
	 * @param args
	 */
	public static void main(String[] args) {
		System.setProperty("sofa.ark.embed.enable","true");
		SpringApplication.run(StartDemoApplication.class, args);
	}

	@RequestMapping("/")
	public String home() {
		return "Hello World!";
	}
	@RequestMapping("/v1")
	public String v1() {
		org.example.v1.Main.main(null);
		return "v1";
	}
	@RequestMapping("/v2")
	public String v2() {
		org.example.v2.Main.main(null);
		return "v2";
	}

}
