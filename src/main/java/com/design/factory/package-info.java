/**
 * <p>
 *     工厂方法模式：
 *     在父类中规定实例生成的框架，在子类中负责实现具体生成实例步骤，在流程定义中使用了模板方法模式
 * </p>
 * <p>
 *     关于框架中的实例生成方法的定义，
 *     <ul>
 *         <li>抽象方法，子类必须实现</li>
 *         <li>默认实现，子类可以不实现</li>
 *         <li>抛异常</li>
 *     </ul>
 * </p>
 */
package com.design.factory;