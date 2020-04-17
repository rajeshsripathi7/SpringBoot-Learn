package com.raj.springweb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hazelcast.config.Config;
import com.hazelcast.config.EvictionPolicy;
import com.hazelcast.config.MapConfig;
import com.hazelcast.config.MaxSizeConfig;
import com.hazelcast.config.MaxSizeConfig.MaxSizePolicy;

@Configuration
public class ProductCacheConfig {
	
	@Bean
	public Config cacheConfig () {
		return new Config ().setInstanceName("hazle-instance")
					.addMapConfig(new MapConfig()
							.setName("product-cache")
							.setTimeToLiveSeconds(3000)
							.setMaxSizeConfig(new MaxSizeConfig(200, MaxSizePolicy.FREE_HEAP_SIZE))
							.setEvictionPolicy(EvictionPolicy.LRU)
							);
		
	}

}
