/**
 * 状态模式：用类表示状态
 * <p>
 *     角色：
 *     <ul>
 *         <li>状态，定义了根据不同状态处理内容的接口</li>
 *         <li>具体的状态，实现状态接口，根据状态的不同进行各自的实现</li>
 *         <li>Context，持有当前状态，提供外部调用接口</li>
 *     </ul>
 * </p>
 * <p>
 *     使用：
 *     <ul>
 *         <ol>分而治之，利用状态的不同来进行不同的逻辑处理</ol>
 *         <ol>定义接口，定义抽象方法；实现接口定义多个类，实现具体方法</ol>
 *         <ol></ol>
 *     </ul>
 * </p>
 */
package com.design.state;