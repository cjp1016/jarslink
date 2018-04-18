/*
 * Copyright 2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alipay.jarslink.api;

/**
 * 模块生命周期监听，用于监听模块加载完成后、注册完成后，移除注册后以及销毁前进行相应的业务处理
 * 
 * @author liangruisen
 */
public interface ModuleListener {
	
	/**
	 * 模块加载完成后调用
	 * 
	 * @param module
	 */
	void onLoaded(Module module);
	
	/**
	 * 模块注册完成后调用
	 * @param module
	 */
	void onRegistered(Module module);
	
	/**
	 * 模块移除注册后调用
	 * @param module
	 */
	void onDeregistered(Module module);

	/**
	 * 模块销毁前调用
	 * 
	 * @param module
	 */
	void onPreDestroy(Module module);
}